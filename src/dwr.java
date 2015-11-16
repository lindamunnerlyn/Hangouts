// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dwr extends Enum
{

    public static final dwr a;
    public static final dwr b;
    public static final dwr c;
    public static final dwr d;
    public static final dwr e;
    private static final dwr f[];

    private dwr(String s, int i)
    {
        super(s, i);
    }

    public static dwr valueOf(String s)
    {
        return (dwr)Enum.valueOf(dwr, s);
    }

    public static dwr[] values()
    {
        return (dwr[])f.clone();
    }

    static 
    {
        a = new dwr("CONTAIN", 0);
        b = new dwr("COVER", 1);
        c = new dwr("DEVICE", 2);
        d = new dwr("HEIGHT", 3);
        e = new dwr("WIDTH", 4);
        f = (new dwr[] {
            a, b, c, d, e
        });
    }
}
