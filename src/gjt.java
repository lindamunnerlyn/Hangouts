// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gjt extends Enum
{

    public static final gjt a;
    public static final gjt b;
    public static final gjt c;
    private static final gjt d[];

    private gjt(String s, int i)
    {
        super(s, i);
    }

    public static gjt valueOf(String s)
    {
        return (gjt)Enum.valueOf(gjt, s);
    }

    public static gjt[] values()
    {
        return (gjt[])d.clone();
    }

    static 
    {
        a = new gjt("NONE", 0);
        b = new gjt("INSUFFICIENT_BANDWIDTH_FOR_VIDEO", 1);
        c = new gjt("SUFFICIENT_BANDWIDTH_FOR_VIDEO", 2);
        d = (new gjt[] {
            a, b, c
        });
    }
}
