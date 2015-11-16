// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.webrtc.voiceengine;

import android.content.Context;
import android.media.AudioRecord;
import android.media.audiofx.AcousticEchoCanceler;
import android.util.Log;
import java.nio.ByteBuffer;

// Referenced classes of package org.webrtc.voiceengine:
//            WebRtcAudioUtils, AudioEffectsJB

public class WebRtcAudioRecord
{

    private static final int BITS_PER_SAMPLE = 16;
    private static final int BUFFERS_PER_SECOND = 100;
    private static final int CALLBACK_BUFFER_SIZE_MS = 10;
    private static final boolean DEBUG = false;
    private static final String TAG = "WebRtcAudioRecord";
    private static volatile boolean microphoneMute = false;
    private AcousticEchoCanceler aec;
    private AudioEffectsJB audioEffects;
    private AudioRecord audioRecord;
    private AudioRecordThread audioThread;
    private ByteBuffer byteBuffer;
    private final Context context;
    private byte emptyBytes[];
    private final long nativeAudioRecord;
    private boolean useBuiltInAEC;

    WebRtcAudioRecord(Context context1, long l)
    {
        audioRecord = null;
        audioThread = null;
        audioEffects = null;
        aec = null;
        useBuiltInAEC = false;
        String s = String.valueOf(WebRtcAudioUtils.getThreadInfo());
        if (s.length() != 0)
        {
            s = "ctor".concat(s);
        } else
        {
            s = new String("ctor");
        }
        Logd(s);
        context = context1;
        nativeAudioRecord = l;
    }

    private boolean EnableBuiltInAEC(boolean flag)
    {
        Logd((new StringBuilder(23)).append("EnableBuiltInAEC(").append(flag).append(")").toString());
        assertTrue(WebRtcAudioUtils.isAcousticEchoCancelerApproved());
        useBuiltInAEC = flag;
        if (aec != null)
        {
            if (aec.setEnabled(flag) != 0)
            {
                Loge("AcousticEchoCanceler.setEnabled failed");
                return false;
            }
            flag = aec.getEnabled();
            Logd((new StringBuilder(38)).append("AcousticEchoCanceler.getEnabled: ").append(flag).toString());
        }
        return true;
    }

    private int InitRecording(int i, int j)
    {
        Logd((new StringBuilder(59)).append("InitRecording(sampleRate=").append(i).append(", channels=").append(j).append(")").toString());
        if (!WebRtcAudioUtils.hasPermission(context, "android.permission.RECORD_AUDIO"))
        {
            Loge("RECORD_AUDIO permission is missing");
            return -1;
        }
        int k = i / 100;
        byteBuffer = ByteBuffer.allocateDirect((j << 1) * k);
        j = byteBuffer.capacity();
        Logd((new StringBuilder(32)).append("byteBuffer.capacity: ").append(j).toString());
        emptyBytes = new byte[byteBuffer.capacity()];
        nativeCacheDirectBufferAddress(byteBuffer, nativeAudioRecord);
        j = AudioRecord.getMinBufferSize(i, 16, 2);
        if (j == -2)
        {
            Loge("Received invalid value for buffer size");
            return -1;
        }
        Logd((new StringBuilder(41)).append("AudioRecord.getMinBufferSize: ").append(j).toString());
        j <<= 1;
        Logd((new StringBuilder(30)).append("bufferSizeInBytes: ").append(j).toString());
        if (audioRecord != null)
        {
            audioRecord.release();
            audioRecord = null;
        }
        releaseEffects();
        String s;
        int l;
        int i1;
        try
        {
            audioRecord = new AudioRecord(7, i, 16, 2, j);
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            Logd(illegalargumentexception.getMessage());
            return -1;
        }
        s = String.valueOf("AudioRecord session ID: ");
        i = audioRecord.getAudioSessionId();
        j = audioRecord.getAudioFormat();
        l = audioRecord.getChannelCount();
        i1 = audioRecord.getSampleRate();
        Logd((new StringBuilder(String.valueOf(s).length() + 87)).append(s).append(i).append(", audio format: ").append(j).append(", channels: ").append(l).append(", sample rate: ").append(i1).toString());
        enableEffects();
        return k;
    }

    private static void Logd(String s)
    {
    }

    private static void Loge(String s)
    {
        Log.e("WebRtcAudioRecord", s);
    }

    private boolean StartRecording()
    {
        Logd("StartRecording");
        boolean flag;
        if (audioRecord != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        assertTrue(flag);
        if (audioThread == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        assertTrue(flag);
        try
        {
            audioRecord.startRecording();
        }
        catch (IllegalStateException illegalstateexception)
        {
            String s = String.valueOf(illegalstateexception.getMessage());
            if (s.length() != 0)
            {
                s = "AudioRecord.startRecording failed: ".concat(s);
            } else
            {
                s = new String("AudioRecord.startRecording failed: ");
            }
            Loge(s);
            return false;
        }
        if (audioRecord.getRecordingState() != 3)
        {
            Loge("AudioRecord.startRecording failed");
            return false;
        } else
        {
            audioThread = new AudioRecordThread("AudioRecordJavaThread");
            audioThread.start();
            return true;
        }
    }

    private boolean StopRecording()
    {
        Logd("StopRecording");
        boolean flag;
        if (audioThread != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        assertTrue(flag);
        audioThread.joinThread();
        audioThread = null;
        if (aec != null)
        {
            aec.release();
            aec = null;
        }
        audioRecord.release();
        audioRecord = null;
        releaseEffects();
        return true;
    }

    private static void assertTrue(boolean flag)
    {
        if (!flag)
        {
            throw new AssertionError("Expected condition to be true");
        } else
        {
            return;
        }
    }

    private static boolean builtInAECIsAvailable()
    {
        return WebRtcAudioUtils.isAcousticEchoCancelerSupported();
    }

    private void enableEffects()
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            if (audioEffects == null)
            {
                audioEffects = new AudioEffectsJB();
            }
            audioEffects.enable(audioRecord);
        }
    }

    private native void nativeCacheDirectBufferAddress(ByteBuffer bytebuffer, long l);

    private native void nativeDataIsRecorded(int i, long l);

    private void releaseEffects()
    {
        if (audioEffects != null)
        {
            audioEffects.release();
            audioEffects = null;
        }
    }

    public static void setMicrophoneMute(boolean flag)
    {
        microphoneMute = flag;
    }










    private class AudioRecordThread extends Thread
    {

        private volatile boolean keepAlive;
        final WebRtcAudioRecord this$0;

        public void joinThread()
        {
            keepAlive = false;
            while (isAlive()) 
            {
                try
                {
                    join();
                }
                catch (InterruptedException interruptedexception) { }
            }
        }

        public void run()
        {
            Process.setThreadPriority(-19);
            String s = String.valueOf(WebRtcAudioUtils.getThreadInfo());
            if (s.length() != 0)
            {
                s = "AudioRecordThread".concat(s);
            } else
            {
                s = new String("AudioRecordThread");
            }
            WebRtcAudioRecord.Logd(s);
            System.nanoTime();
            do
            {
                if (!keepAlive)
                {
                    break;
                }
                int i = audioRecord.read(byteBuffer, byteBuffer.capacity());
                if (WebRtcAudioRecord.microphoneMute)
                {
                    byteBuffer.clear();
                    byteBuffer.put(emptyBytes);
                }
                if (i == byteBuffer.capacity())
                {
                    nativeDataIsRecorded(i, nativeAudioRecord);
                } else
                {
                    WebRtcAudioRecord.Loge((new StringBuilder(36)).append("AudioRecord.read failed: ").append(i).toString());
                    if (i == -3)
                    {
                        keepAlive = false;
                    }
                }
            } while (true);
            try
            {
                audioRecord.stop();
                return;
            }
            catch (IllegalStateException illegalstateexception)
            {
                illegalstateexception = String.valueOf(illegalstateexception.getMessage());
            }
            if (illegalstateexception.length() != 0)
            {
                illegalstateexception = "AudioRecord.stop failed: ".concat(illegalstateexception);
            } else
            {
                illegalstateexception = new String("AudioRecord.stop failed: ");
            }
            WebRtcAudioRecord.Loge(illegalstateexception);
        }

        public AudioRecordThread(String s)
        {
            this$0 = WebRtcAudioRecord.this;
            super(s);
            keepAlive = true;
        }
    }

}
