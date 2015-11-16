// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.webrtc.voiceengine;

import android.media.AudioTrack;
import android.os.Process;
import java.nio.ByteBuffer;

// Referenced classes of package org.webrtc.voiceengine:
//            WebRtcAudioUtils, WebRtcAudioTrack

class keepAlive extends Thread
{

    private volatile boolean keepAlive;
    final WebRtcAudioTrack this$0;

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
        boolean flag1;
        flag1 = true;
        Process.setThreadPriority(-19);
        String s = String.valueOf(WebRtcAudioUtils.getThreadInfo());
        if (s.length() != 0)
        {
            s = "AudioTrackThread".concat(s);
        } else
        {
            s = new String("AudioTrackThread");
        }
        WebRtcAudioTrack.access$000(s);
        WebRtcAudioTrack.access$100(WebRtcAudioTrack.this).play();
        int j;
        boolean flag;
        if (WebRtcAudioTrack.access$100(WebRtcAudioTrack.this).getPlayState() == 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        try
        {
            WebRtcAudioTrack.access$200(flag);
        }
        catch (IllegalStateException illegalstateexception)
        {
            String s1 = String.valueOf(illegalstateexception.getMessage());
            if (s1.length() != 0)
            {
                s1 = "AudioTrack.play failed: ".concat(s1);
            } else
            {
                s1 = new String("AudioTrack.play failed: ");
            }
            WebRtcAudioTrack.access$300(s1);
            return;
        }
        j = WebRtcAudioTrack.access$400(WebRtcAudioTrack.this).capacity();
        do
        {
            if (!keepAlive)
            {
                break;
            }
            if (!WebRtcAudioTrack.access$500())
            {
                WebRtcAudioTrack.access$700(WebRtcAudioTrack.this, j, WebRtcAudioTrack.access$600(WebRtcAudioTrack.this));
                int i;
                if (j <= WebRtcAudioTrack.access$400(WebRtcAudioTrack.this).remaining())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                WebRtcAudioTrack.access$200(flag);
                if (WebRtcAudioUtils.runningOnLollipopOrHigher())
                {
                    i = WebRtcAudioTrack.access$100(WebRtcAudioTrack.this).write(WebRtcAudioTrack.access$400(WebRtcAudioTrack.this), j, 0);
                } else
                {
                    i = WebRtcAudioTrack.access$100(WebRtcAudioTrack.this).write(WebRtcAudioTrack.access$400(WebRtcAudioTrack.this).array(), WebRtcAudioTrack.access$400(WebRtcAudioTrack.this).arrayOffset(), j);
                }
                if (i != j)
                {
                    WebRtcAudioTrack.access$300((new StringBuilder(36)).append("AudioTrack.write failed: ").append(i).toString());
                    if (i == -3)
                    {
                        keepAlive = false;
                    }
                }
                WebRtcAudioTrack.access$400(WebRtcAudioTrack.this).rewind();
            }
        } while (true);
        try
        {
            WebRtcAudioTrack.access$100(WebRtcAudioTrack.this).stop();
        }
        catch (IllegalStateException illegalstateexception1)
        {
            String s2 = String.valueOf(illegalstateexception1.getMessage());
            if (s2.length() != 0)
            {
                s2 = "AudioTrack.stop failed: ".concat(s2);
            } else
            {
                s2 = new String("AudioTrack.stop failed: ");
            }
            WebRtcAudioTrack.access$300(s2);
        }
        if (WebRtcAudioTrack.access$100(WebRtcAudioTrack.this).getPlayState() == 1)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        WebRtcAudioTrack.access$200(flag);
        WebRtcAudioTrack.access$100(WebRtcAudioTrack.this).flush();
        return;
    }

    public (String s)
    {
        this$0 = WebRtcAudioTrack.this;
        super(s);
        keepAlive = true;
    }
}
