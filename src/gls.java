// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.webrtc.voiceengine.WebRtcAudioRecord;

public final class gls
    implements gmk
{

    private geb a;
    private boolean b;

    public gls()
    {
    }

    public void a()
    {
    }

    public void a(gmm gmm)
    {
        gdv.a("Must use CallClient", gmm instanceof geb);
        a = (geb)gmm;
        a(b);
    }

    public void a(boolean flag)
    {
        boolean flag2 = true;
        b = flag;
        if (a != null)
        {
            geb geb1;
            boolean flag1;
            if (!flag)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            WebRtcAudioRecord.setMicrophoneMute(flag1);
            geb1 = a;
            if (!flag)
            {
                flag = flag2;
            } else
            {
                flag = false;
            }
            geb1.a(flag);
        }
    }
}
