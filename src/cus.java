// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.TimeUnit;

public class cus extends cup
{

    private static final long serialVersionUID = 1L;
    private final String a;

    public cus(String s)
    {
        a = s;
    }

    public String a()
    {
        return "ui_queue";
    }

    public kws a(String s, int i, int j)
    {
        s = new ics();
        s.a = a;
        hyg hyg1 = new hyg();
        hyg1.a = s;
        return hyg1;
    }

    public long b()
    {
        return TimeUnit.MINUTES.toMillis(5L);
    }

    public String f()
    {
        return "getsimpleprofile";
    }
}
