// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gqv extends Enum
{

    public static final gqv a;
    public static final gqv b;
    public static final gqv c;
    private static final gqv d[];

    private gqv(String s, int i)
    {
        super(s, i);
    }

    public static gqv valueOf(String s)
    {
        return (gqv)Enum.valueOf(gqv, s);
    }

    public static gqv[] values()
    {
        return (gqv[])d.clone();
    }

    static 
    {
        a = new gqv("UNKNOWN", 0);
        b = new gqv("INVALID", 1);
        c = new gqv("VALID", 2);
        d = (new gqv[] {
            a, b, c
        });
    }
}
