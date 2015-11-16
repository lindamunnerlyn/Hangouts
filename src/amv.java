// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class amv extends Enum
{

    public static final amv a;
    public static final amv b;
    public static final amv c;
    private static final amv d[];

    private amv(String s, int i)
    {
        super(s, i);
    }

    public static amv valueOf(String s)
    {
        return (amv)Enum.valueOf(amv, s);
    }

    public static amv[] values()
    {
        return (amv[])d.clone();
    }

    static 
    {
        a = new amv("NONE", 0);
        b = new amv("CARRIER", 1);
        c = new amv("GV", 2);
        d = (new amv[] {
            a, b, c
        });
    }
}
