// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gzo extends Enum
{

    public static final gzo a;
    public static final gzo b;
    public static final gzo c;
    public static final gzo d;
    private static final gzo f[];
    final int e;

    private gzo(String s, int i, int j)
    {
        super(s, i);
        e = j;
    }

    public static gzo a(int i)
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

    public static gzo valueOf(String s)
    {
        return (gzo)Enum.valueOf(gzo, s);
    }

    public static gzo[] values()
    {
        return (gzo[])f.clone();
    }

    static 
    {
        a = new gzo("IMAGE", 0, 0);
        b = new gzo("VIDEO", 1, 1);
        c = new gzo("PANORAMA", 2, 2);
        d = new gzo("ANIMATION", 3, 3);
        f = (new gzo[] {
            a, b, c, d
        });
    }
}
