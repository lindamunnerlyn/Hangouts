// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;

public abstract class ldi
    implements Serializable
{

    static final ldi a = new ldj("eras", (byte)1);
    static final ldi b = new ldj("centuries", (byte)2);
    static final ldi c = new ldj("weekyears", (byte)3);
    static final ldi d = new ldj("years", (byte)4);
    static final ldi e = new ldj("months", (byte)5);
    static final ldi f = new ldj("weeks", (byte)6);
    static final ldi g = new ldj("days", (byte)7);
    static final ldi h = new ldj("halfdays", (byte)8);
    static final ldi i = new ldj("hours", (byte)9);
    static final ldi j = new ldj("minutes", (byte)10);
    static final ldi k = new ldj("seconds", (byte)11);
    static final ldi l = new ldj("millis", (byte)12);
    private static final long serialVersionUID = 0x7f8cac4ed77L;
    private final String m;

    protected ldi(String s)
    {
        m = s;
    }

    public static ldi a()
    {
        return l;
    }

    public static ldi b()
    {
        return k;
    }

    public static ldi c()
    {
        return j;
    }

    public static ldi d()
    {
        return i;
    }

    public static ldi e()
    {
        return h;
    }

    public static ldi f()
    {
        return g;
    }

    public static ldi g()
    {
        return f;
    }

    public static ldi h()
    {
        return c;
    }

    public static ldi i()
    {
        return e;
    }

    public static ldi j()
    {
        return d;
    }

    public static ldi k()
    {
        return b;
    }

    public static ldi l()
    {
        return a;
    }

    public abstract ldh a(lcw lcw);

    public String m()
    {
        return m;
    }

    public String toString()
    {
        return m();
    }

}
