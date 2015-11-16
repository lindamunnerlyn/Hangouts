// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;

public abstract class lnj
    implements Serializable
{

    static final lnj a = new lnk("era", (byte)1, lns.l(), null);
    static final lnj b = new lnk("yearOfEra", (byte)2, lns.j(), lns.l());
    static final lnj c = new lnk("centuryOfEra", (byte)3, lns.k(), lns.l());
    static final lnj d = new lnk("yearOfCentury", (byte)4, lns.j(), lns.k());
    static final lnj e = new lnk("year", (byte)5, lns.j(), null);
    static final lnj f = new lnk("dayOfYear", (byte)6, lns.f(), lns.j());
    static final lnj g = new lnk("monthOfYear", (byte)7, lns.i(), lns.j());
    static final lnj h = new lnk("dayOfMonth", (byte)8, lns.f(), lns.i());
    static final lnj i = new lnk("weekyearOfCentury", (byte)9, lns.h(), lns.k());
    static final lnj j = new lnk("weekyear", (byte)10, lns.h(), null);
    static final lnj k = new lnk("weekOfWeekyear", (byte)11, lns.g(), lns.h());
    static final lnj l = new lnk("dayOfWeek", (byte)12, lns.f(), lns.g());
    static final lnj m = new lnk("halfdayOfDay", (byte)13, lns.e(), lns.f());
    static final lnj n = new lnk("hourOfHalfday", (byte)14, lns.d(), lns.e());
    static final lnj o = new lnk("clockhourOfHalfday", (byte)15, lns.d(), lns.e());
    static final lnj p = new lnk("clockhourOfDay", (byte)16, lns.d(), lns.f());
    static final lnj q = new lnk("hourOfDay", (byte)17, lns.d(), lns.f());
    static final lnj r = new lnk("minuteOfDay", (byte)18, lns.c(), lns.f());
    static final lnj s = new lnk("minuteOfHour", (byte)19, lns.c(), lns.d());
    private static final long serialVersionUID = 0xffffd93ddb047c1aL;
    static final lnj t = new lnk("secondOfDay", (byte)20, lns.b(), lns.f());
    static final lnj u = new lnk("secondOfMinute", (byte)21, lns.b(), lns.c());
    static final lnj v = new lnk("millisOfDay", (byte)22, lns.a(), lns.f());
    static final lnj w = new lnk("millisOfSecond", (byte)23, lns.a(), lns.b());
    private final String x;

    protected lnj(String s1)
    {
        x = s1;
    }

    public static lnj a()
    {
        return w;
    }

    public static lnj b()
    {
        return v;
    }

    public static lnj c()
    {
        return u;
    }

    public static lnj d()
    {
        return t;
    }

    public static lnj e()
    {
        return s;
    }

    public static lnj f()
    {
        return r;
    }

    public static lnj g()
    {
        return q;
    }

    public static lnj h()
    {
        return p;
    }

    public static lnj i()
    {
        return n;
    }

    public static lnj j()
    {
        return o;
    }

    public static lnj k()
    {
        return m;
    }

    public static lnj l()
    {
        return l;
    }

    public static lnj m()
    {
        return h;
    }

    public static lnj n()
    {
        return f;
    }

    public static lnj o()
    {
        return k;
    }

    public static lnj p()
    {
        return j;
    }

    public static lnj q()
    {
        return i;
    }

    public static lnj r()
    {
        return g;
    }

    public static lnj s()
    {
        return e;
    }

    public static lnj t()
    {
        return b;
    }

    public static lnj u()
    {
        return d;
    }

    public static lnj v()
    {
        return c;
    }

    public static lnj w()
    {
        return a;
    }

    public abstract lni a(lng lng);

    public String toString()
    {
        return x();
    }

    public String x()
    {
        return x;
    }

    public abstract lns y();

    public abstract lns z();

}
