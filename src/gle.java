// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gle extends Enum
{

    public static final gle a;
    public static final gle b;
    public static final gle c;
    public static final gle d;
    public static final gle e;
    private static final gle f[];

    private gle(String s, int i)
    {
        super(s, i);
    }

    public static gle valueOf(String s)
    {
        return (gle)Enum.valueOf(gle, s);
    }

    public static gle[] values()
    {
        return (gle[])f.clone();
    }

    static 
    {
        a = new gle("NOT_A_NUMBER", 0);
        b = new gle("NO_MATCH", 1);
        c = new gle("SHORT_NSN_MATCH", 2);
        d = new gle("NSN_MATCH", 3);
        e = new gle("EXACT_MATCH", 4);
        f = (new gle[] {
            a, b, c, d, e
        });
    }
}
