// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hee extends Enum
{

    public static final hee a;
    public static final hee b;
    public static final hee c;
    public static final hee d;
    private static final hee f[];
    final int e;

    private hee(String s, int i, int j)
    {
        super(s, i);
        e = j;
    }

    public static hee a(int i)
    {
        switch (i)
        {
        default:
            return null;

        case 0: // '\0'
            return a;

        case 1: // '\001'
            return b;

        case 2: // '\002'
            return c;

        case 3: // '\003'
            return d;
        }
    }

    public static hee valueOf(String s)
    {
        return (hee)Enum.valueOf(hee, s);
    }

    public static hee[] values()
    {
        return (hee[])f.clone();
    }

    static 
    {
        a = new hee("IMAGE", 0, 0);
        b = new hee("VIDEO", 1, 1);
        c = new hee("PANORAMA", 2, 2);
        d = new hee("ANIMATION", 3, 3);
        f = (new hee[] {
            a, b, c, d
        });
    }
}
