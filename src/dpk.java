// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

final class dpk
    implements hfe
{

    final drw a;
    final dpj b;

    dpk(dpj dpj, drw drw1)
    {
        b = dpj;
        a = drw1;
        super();
    }

    public boolean a(hfa hfa, Object obj)
    {
        boolean flag = g.a((Boolean)obj, false);
        if (flag)
        {
            RealTimeChatService.e();
        } else
        {
            RealTimeChatService.f();
        }
        a.a(flag);
        return true;
    }
}
