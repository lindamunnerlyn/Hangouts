// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

final class dsd
    implements hjv
{

    final dup a;
    final dsc b;

    dsd(dsc dsc1, dup dup1)
    {
        b = dsc1;
        a = dup1;
        super();
    }

    public boolean a(hjr hjr, Object obj)
    {
        boolean flag = g.a((Boolean)obj, false);
        char c;
        if (flag)
        {
            RealTimeChatService.e();
        } else
        {
            RealTimeChatService.f();
        }
        a.a(flag);
        hjr = dsc.a(b);
        if (flag)
        {
            c = '\u0AFE';
        } else
        {
            c = '\u0AFF';
        }
        hjr.a(c).d();
        return true;
    }
}
