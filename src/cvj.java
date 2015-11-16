// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public class cvj extends cvf
{

    private static final long serialVersionUID = 1L;
    public final String a;

    public cvj(String s)
    {
        a = s;
    }

    public kws a(String s, int i, int j)
    {
        jhb jhb1 = new jhb();
        jhb1.a = "conversation";
        jhb1.b = a;
        jhw jhw1 = new jhw();
        jhw1.requestHeader = cvu.a(s, i, j, h);
        jhw1.a = jhb1;
        return jhw1;
    }

    public void a(aoa aoa, dcx dcx)
    {
        RealTimeChatService.j(aoa, a);
    }

    public long b()
    {
        return 10000L;
    }

    public String f()
    {
        return "hangouts/resolve";
    }
}
