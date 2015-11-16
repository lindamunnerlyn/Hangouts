// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;

public abstract class lcz
    implements Serializable
{

    static final lcz a = new lda("era", (byte)1, ldi.l(), null);
    static final lcz b = new lda("yearOfEra", (byte)2, ldi.j(), ldi.l());
    static final lcz c = new lda("centuryOfEra", (byte)3, ldi.k(), ldi.l());
    static final lcz d = new lda("yearOfCentury", (byte)4, ldi.j(), ldi.k());
    static final lcz e = new lda("year", (byte)5, ldi.j(), null);
    static final lcz f = new lda("dayOfYear", (byte)6, ldi.f(), ldi.j());
    static final lcz g = new lda("monthOfYear", (byte)7, ldi.i(), ldi.j());
    static final lcz h = new lda("dayOfMonth", (byte)8, ldi.f(), ldi.i());
    static final lcz i = new lda("weekyearOfCentury", (byte)9, ldi.h(), ldi.k());
    static final lcz j = new lda("weekyear", (byte)10, ldi.h(), null);
    static final lcz k = new lda("weekOfWeekyear", (byte)11, ldi.g(), ldi.h());
    static final lcz l = new lda("dayOfWeek", (byte)12, ldi.f(), ldi.g());
    static final lcz m = new lda("halfdayOfDay", (byte)13, ldi.e(), ldi.f());
    static final lcz n = new lda("hourOfHalfday", (byte)14, ldi.d(), ldi.e());
    static final lcz o = new lda("clockhourOfHalfday", (byte)15, ldi.d(), ldi.e());
    static final lcz p = new lda("clockhourOfDay", (byte)16, ldi.d(), ldi.f());
    static final lcz q = new lda("hourOfDay", (byte)17, ldi.d(), ldi.f());
    static final lcz r = new lda("minuteOfDay", (byte)18, ldi.c(), ldi.f());
    static final lcz s = new lda("minuteOfHour", (byte)19, ldi.c(), ldi.d());
    private static final long serialVersionUID = 0xffffd93ddb047c1aL;
    static final lcz t = new lda("secondOfDay", (byte)20, ldi.b(), ldi.f());
    static final lcz u = new lda("secondOfMinute", (byte)21, ldi.b(), ldi.c());
    static final lcz v = new lda("millisOfDay", (byte)22, ldi.a(), ldi.f());
    static final lcz w = new lda("millisOfSecond", (byte)23, ldi.a(), ldi.b());
    private final String x;

    protected lcz(String s1)
    {
        x = s1;
    }

    public static lcz a()
    {
        return w;
    }

    public static lcz b()
    {
        return v;
    }

    public static lcz c()
    {
        return u;
    }

    public static lcz d()
    {
        return t;
    }

    public static lcz e()
    {
        return s;
    }

    public static lcz f()
    {
        return r;
    }

    public static lcz g()
    {
        return q;
    }

    public static lcz h()
    {
        return p;
    }

    public static lcz i()
    {
        return n;
    }

    public static lcz j()
    {
        return o;
    }

    public static lcz k()
    {
        return m;
    }

    public static lcz l()
    {
        return l;
    }

    public static lcz m()
    {
        return h;
    }

    public static lcz n()
    {
        return f;
    }

    public static lcz o()
    {
        return k;
    }

    public static lcz p()
    {
        return j;
    }

    public static lcz q()
    {
        return i;
    }

    public static lcz r()
    {
        return g;
    }

    public static lcz s()
    {
        return e;
    }

    public static lcz t()
    {
        return b;
    }

    public static lcz u()
    {
        return d;
    }

    public static lcz v()
    {
        return c;
    }

    public static lcz w()
    {
        return a;
    }

    public abstract lcy a(lcw lcw);

    public String toString()
    {
        return x();
    }

    public String x()
    {
        return x;
    }

    public abstract ldi y();

    public abstract ldi z();

}
