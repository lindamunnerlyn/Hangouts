// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class hkp extends Enum
{

    public static final hkp a;
    public static final hkp b;
    public static final hkp c;
    public static final hkp d;
    public static final hkp e;
    private static final hkp g[];
    long f;

    hkp(String s, int i, long l)
    {
        super(s, i);
        f = l;
    }

    public static hkp valueOf(String s)
    {
        return (hkp)Enum.valueOf(hkp, s);
    }

    public static hkp[] values()
    {
        return (hkp[])g.clone();
    }

    public long a(long l)
    {
        return f * l;
    }

    static 
    {
        a = new hkq("TERABYTES");
        b = new hkr("GIGABYTES");
        c = new hks("MEGABYTES");
        d = new hkt("KILOBYTES");
        e = new hku("BYTES");
        g = (new hkp[] {
            a, b, c, d, e
        });
    }
}
