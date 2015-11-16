// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.webrtc.voiceengine.WebRtcAudioRecord;

public final class giq
    implements gji
{

    private gbn a;
    private boolean b;

    public giq()
    {
    }

    public void a()
    {
    }

    public void a(gjk gjk)
    {
        gbh.a("Must use CallClient", gjk instanceof gbn);
        a = (gbn)gjk;
        a(b);
    }

    public void a(boolean flag)
    {
        boolean flag2 = true;
        b = flag;
        if (a != null)
        {
            gbn gbn1;
            boolean flag1;
            if (!flag)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            WebRtcAudioRecord.setMicrophoneMute(flag1);
            gbn1 = a;
            if (!flag)
            {
                flag = flag2;
            } else
            {
                flag = false;
            }
            gbn1.b(flag);
        }
    }
}
