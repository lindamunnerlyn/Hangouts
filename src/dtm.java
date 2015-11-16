// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dtm extends Enum
{

    public static final dtm a;
    public static final dtm b;
    public static final dtm c;
    public static final dtm d;
    public static final dtm e;
    private static final dtm f[];

    private dtm(String s, int i)
    {
        super(s, i);
    }

    public static dtm valueOf(String s)
    {
        return (dtm)Enum.valueOf(dtm, s);
    }

    public static dtm[] values()
    {
        return (dtm[])f.clone();
    }

    static 
    {
        a = new dtm("CONTAIN", 0);
        b = new dtm("COVER", 1);
        c = new dtm("DEVICE", 2);
        d = new dtm("HEIGHT", 3);
        e = new dtm("WIDTH", 4);
        f = (new dtm[] {
            a, b, c, d, e
        });
    }
}
