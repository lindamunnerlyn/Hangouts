// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class cul extends cvt
{

    private final int a;

    public cul(aoa aoa1, int i, cwo cwo1, String s)
    {
        super(hio.newBuilder().a(aoa1.a()).b(aoa1.ab()).a(true).a(), cwo1, cwo1.f(), dmi.a, (jbu)cwo1.a(s, i, aoa1.h()), new jbv());
        a = aoa1.h();
    }

    protected cxr a(kws kws)
    {
        return czg.parseFrom((jbv)kws);
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
