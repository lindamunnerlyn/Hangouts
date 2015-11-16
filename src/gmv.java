// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gmv extends Enum
{

    public static final gmv a;
    public static final gmv b;
    public static final gmv c;
    private static final gmv d[];

    private gmv(String s, int i)
    {
        super(s, i);
    }

    public static gmv valueOf(String s)
    {
        return (gmv)Enum.valueOf(gmv, s);
    }

    public static gmv[] values()
    {
        return (gmv[])d.clone();
    }

    static 
    {
        a = new gmv("NONE", 0);
        b = new gmv("INSUFFICIENT_BANDWIDTH_FOR_VIDEO", 1);
        c = new gmv("SUFFICIENT_BANDWIDTH_FOR_VIDEO", 2);
        d = (new gmv[] {
            a, b, c
        });
    }
}
