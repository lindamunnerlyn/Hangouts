// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;

public abstract class lns
    implements Serializable
{

    static final lns a = new lnt("eras", (byte)1);
    static final lns b = new lnt("centuries", (byte)2);
    static final lns c = new lnt("weekyears", (byte)3);
    static final lns d = new lnt("years", (byte)4);
    static final lns e = new lnt("months", (byte)5);
    static final lns f = new lnt("weeks", (byte)6);
    static final lns g = new lnt("days", (byte)7);
    static final lns h = new lnt("halfdays", (byte)8);
    static final lns i = new lnt("hours", (byte)9);
    static final lns j = new lnt("minutes", (byte)10);
    static final lns k = new lnt("seconds", (byte)11);
    static final lns l = new lnt("millis", (byte)12);
    private static final long serialVersionUID = 0x7f8cac4ed77L;
    private final String m;

    protected lns(String s)
    {
        m = s;
    }

    public static lns a()
    {
        return l;
    }

    public static lns b()
    {
        return k;
    }

    public static lns c()
    {
        return j;
    }

    public static lns d()
    {
        return i;
    }

    public static lns e()
    {
        return h;
    }

    public static lns f()
    {
        return g;
    }

    public static lns g()
    {
        return f;
    }

    public static lns h()
    {
        return c;
    }

    public static lns i()
    {
        return e;
    }

    public static lns j()
    {
        return d;
    }

    public static lns k()
    {
        return b;
    }

    public static lns l()
    {
        return a;
    }

    public abstract lnr a(lng lng);

    public String m()
    {
        return m;
    }

    public String toString()
    {
        return m();
    }

}
