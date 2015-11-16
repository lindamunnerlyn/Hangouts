// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dgm extends Enum
{

    public static final dgm a;
    public static final dgm b;
    public static final dgm c;
    public static final dgm d;
    public static final dgm e;
    private static final dgm f[];

    private dgm(String s, int i)
    {
        super(s, i);
    }

    public static dgm valueOf(String s)
    {
        return (dgm)Enum.valueOf(dgm, s);
    }

    public static dgm[] values()
    {
        return (dgm[])f.clone();
    }

    static 
    {
        a = new dgm("NONE", 0);
        b = new dgm("DEFERRED", 1);
        c = new dgm("SILENT", 2);
        d = new dgm("DISPLAYONLY", 3);
        e = new dgm("LOUD", 4);
        f = (new dgm[] {
            a, b, c, d, e
        });
    }
}
