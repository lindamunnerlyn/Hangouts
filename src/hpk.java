// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class hpk extends Enum
{

    public static final hpk a;
    public static final hpk b;
    public static final hpk c;
    public static final hpk d;
    public static final hpk e;
    private static final hpk g[];
    long f;

    hpk(String s, int i, long l)
    {
        super(s, i);
        f = l;
    }

    public static hpk valueOf(String s)
    {
        return (hpk)Enum.valueOf(hpk, s);
    }

    public static hpk[] values()
    {
        return (hpk[])g.clone();
    }

    public long a(long l)
    {
        return f * l;
    }

    static 
    {
        a = new hpl("TERABYTES");
        b = new hpm("GIGABYTES");
        c = new hpn("MEGABYTES");
        d = new hpo("KILOBYTES");
        e = new hpp("BYTES");
        g = (new hpk[] {
            a, b, c, d, e
        });
    }
}
