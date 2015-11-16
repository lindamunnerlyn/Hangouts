// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.webrtc.voiceengine;

import android.media.AudioRecord;
import android.os.Process;
import java.nio.ByteBuffer;

// Referenced classes of package org.webrtc.voiceengine:
//            WebRtcAudioUtils, WebRtcAudioRecord

class keepAlive extends Thread
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
        WebRtcAudioRecord.access$000(s);
        System.nanoTime();
        do
        {
            if (!keepAlive)
            {
                break;
            }
            int i = WebRtcAudioRecord.access$200(WebRtcAudioRecord.this).read(WebRtcAudioRecord.access$100(WebRtcAudioRecord.this), WebRtcAudioRecord.access$100(WebRtcAudioRecord.this).capacity());
            if (WebRtcAudioRecord.access$300())
            {
                WebRtcAudioRecord.access$100(WebRtcAudioRecord.this).clear();
                WebRtcAudioRecord.access$100(WebRtcAudioRecord.this).put(WebRtcAudioRecord.access$400(WebRtcAudioRecord.this));
            }
            if (i == WebRtcAudioRecord.access$100(WebRtcAudioRecord.this).capacity())
            {
                WebRtcAudioRecord.access$600(WebRtcAudioRecord.this, i, WebRtcAudioRecord.access$500(WebRtcAudioRecord.this));
            } else
            {
                WebRtcAudioRecord.access$700((new StringBuilder(36)).append("AudioRecord.read failed: ").append(i).toString());
                if (i == -3)
                {
                    keepAlive = false;
                }
            }
        } while (true);
        try
        {
            WebRtcAudioRecord.access$200(WebRtcAudioRecord.this).stop();
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
        WebRtcAudioRecord.access$700(illegalstateexception);
    }

    public (String s)
    {
        this$0 = WebRtcAudioRecord.this;
        super(s);
        keepAlive = true;
    }
}
