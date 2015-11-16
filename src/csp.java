// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.TimeUnit;

public class csp extends csm
{

    private static final long serialVersionUID = 1L;
    private final String a;

    public csp(String s)
    {
        a = s;
    }

    public String a()
    {
        return "ui_queue";
    }

    public kop a(String s, int i, int j)
    {
        s = new hxo();
        s.a = a;
        htc htc1 = new htc();
        htc1.a = s;
        return htc1;
    }

    public long b()
    {
        return TimeUnit.MINUTES.toMillis(5L);
    }

    public String g()
    {
        return "getsimpleprofile";
    }
}
