// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.webrtc.voiceengine.WebRtcAudioTrack;

public final class ghz
    implements gjj
{

    private gjk a;
    private boolean b;

    public ghz()
    {
    }

    public void a()
    {
        a = null;
        WebRtcAudioTrack.setAudioMute(true);
    }

    public void a(gjk gjk)
    {
        a = gjk;
        c_(b);
    }

    public void b()
    {
        c_(true);
    }

    public void c_(boolean flag)
    {
        b = flag;
        if (a == null)
        {
            return;
        }
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        WebRtcAudioTrack.setAudioMute(flag);
    }
}
