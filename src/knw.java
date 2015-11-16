// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class knw extends Enum
{

    public static final knw a;
    public static final knw b;
    public static final knw c;
    public static final knw d;
    public static final knw e;
    public static final knw f;
    public static final knw g;
    public static final knw h;
    public static final knw i;
    public static final knw j;
    public static final knw k;
    public static final knw l;
    public static final knw m;
    public static final knw n;
    public static final knw o;
    public static final knw p;
    public static final knw q;
    public static final knw r;
    private static final knw u[];
    private final kob s;
    private final int t;

    private knw(String s1, int i1, kob kob1, int j1)
    {
        super(s1, i1);
        s = kob1;
        t = j1;
    }

    knw(String s1, int i1, kob kob1, int j1, byte byte0)
    {
        this(s1, i1, kob1, j1);
    }

    public static knw valueOf(String s1)
    {
        return (knw)Enum.valueOf(knw, s1);
    }

    public static knw[] values()
    {
        return (knw[])u.clone();
    }

    public kob a()
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
        a = new knw("DOUBLE", 0, kob.d, 1);
        b = new knw("FLOAT", 1, kob.c, 5);
        c = new knw("INT64", 2, kob.b, 0);
        d = new knw("UINT64", 3, kob.b, 0);
        e = new knw("INT32", 4, kob.a, 0);
        f = new knw("FIXED64", 5, kob.b, 1);
        g = new knw("FIXED32", 6, kob.a, 5);
        h = new knw("BOOL", 7, kob.e, 0);
        i = new knx("STRING", kob.f);
        j = new kny("GROUP", kob.i);
        k = new knz("MESSAGE", kob.i);
        l = new koa("BYTES", kob.g);
        m = new knw("UINT32", 12, kob.a, 0);
        n = new knw("ENUM", 13, kob.h, 0);
        o = new knw("SFIXED32", 14, kob.a, 5);
        p = new knw("SFIXED64", 15, kob.b, 1);
        q = new knw("SINT32", 16, kob.a, 0);
        r = new knw("SINT64", 17, kob.b, 0);
        u = (new knw[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r
        });
    }
}
