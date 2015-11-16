// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class csi extends ctp
{

    private final int a;

    public csi(ani ani1, int i, cuk cuk1, String s)
    {
        super(hdx.newBuilder().a(ani1.a()).b(ani1.ae()).a().b(), cuk1, cuk1.g(), "hangouts", (ivp)cuk1.a(s, i, ani1.h()), new ivq());
        a = ani1.h();
    }

    protected cvn a(kop kop)
    {
        return cxc.parseFrom((ivq)kop);
    }

    public void a(int i, Exception exception)
    {
        exception = e();
        if (exception != null)
        {
            RealTimeChatService.a(a, exception);
        }
    }
}
