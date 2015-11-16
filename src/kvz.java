// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class kvz extends Enum
{

    public static final kvz a;
    public static final kvz b;
    public static final kvz c;
    public static final kvz d;
    public static final kvz e;
    public static final kvz f;
    public static final kvz g;
    public static final kvz h;
    public static final kvz i;
    public static final kvz j;
    public static final kvz k;
    public static final kvz l;
    public static final kvz m;
    public static final kvz n;
    public static final kvz o;
    public static final kvz p;
    public static final kvz q;
    public static final kvz r;
    private static final kvz u[];
    private final kwe s;
    private final int t;

    private kvz(String s1, int i1, kwe kwe1, int j1)
    {
        super(s1, i1);
        s = kwe1;
        t = j1;
    }

    kvz(String s1, int i1, kwe kwe1, int j1, byte byte0)
    {
        this(s1, i1, kwe1, j1);
    }

    public static kvz valueOf(String s1)
    {
        return (kvz)Enum.valueOf(kvz, s1);
    }

    public static kvz[] values()
    {
        return (kvz[])u.clone();
    }

    public kwe a()
    {
        return s;
    }

    public int b()
    {
        return t;
    }

    public boolean c()
    {
        return true;
    }

    static 
    {
        a = new kvz("DOUBLE", 0, kwe.d, 1);
        b = new kvz("FLOAT", 1, kwe.c, 5);
        c = new kvz("INT64", 2, kwe.b, 0);
        d = new kvz("UINT64", 3, kwe.b, 0);
        e = new kvz("INT32", 4, kwe.a, 0);
        f = new kvz("FIXED64", 5, kwe.b, 1);
        g = new kvz("FIXED32", 6, kwe.a, 5);
        h = new kvz("BOOL", 7, kwe.e, 0);
        i = new kwa("STRING", kwe.f);
        j = new kwb("GROUP", kwe.i);
        k = new kwc("MESSAGE", kwe.i);
        l = new kwd("BYTES", kwe.g);
        m = new kvz("UINT32", 12, kwe.a, 0);
        n = new kvz("ENUM", 13, kwe.h, 0);
        o = new kvz("SFIXED32", 14, kwe.a, 5);
        p = new kvz("SFIXED64", 15, kwe.b, 1);
        q = new kvz("SINT32", 16, kwe.a, 0);
        r = new kvz("SINT64", 17, kwe.b, 0);
        u = (new kvz[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r
        });
    }
}
