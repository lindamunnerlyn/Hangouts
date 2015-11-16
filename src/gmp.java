// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gmp extends Enum
{

    public static final gmp a;
    public static final gmp b;
    public static final gmp c;
    private static final gmp d[];

    private gmp(String s, int i)
    {
        super(s, i);
    }

    public static gmp valueOf(String s)
    {
        return (gmp)Enum.valueOf(gmp, s);
    }

    public static gmp[] values()
    {
        return (gmp[])d.clone();
    }

    static 
    {
        a = new gmp("UNKNOWN", 0);
        b = new gmp("INVALID", 1);
        c = new gmp("VALID", 2);
        d = (new gmp[] {
            a, b, c
        });
    }
}
