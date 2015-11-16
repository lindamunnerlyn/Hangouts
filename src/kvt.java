// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kvt extends Enum
    implements kmo
{

    public static final kvt a;
    public static final kvt b;
    public static final kvt c;
    public static final kvt d;
    private static final kmp f = new kmp();
    private static final kvt g[];
    final int e;

    private kvt(String s, int i, int j)
    {
        super(s, i);
        e = j;
    }

    public static kvt a(int i)
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

    public static kvt valueOf(String s)
    {
        return (kvt)Enum.valueOf(kvt, s);
    }

    public static kvt[] values()
    {
        return (kvt[])g.clone();
    }

    public final int a()
    {
        return e;
    }

    static 
    {
        a = new kvt("SPAN_UNKNOWN", 0, 0);
        b = new kvt("SPAN_LOCAL", 1, 1);
        c = new kvt("SPAN_CLIENT_HALF", 2, 2);
        d = new kvt("SPAN_SERVER_HALF", 3, 3);
        g = (new kvt[] {
            a, b, c, d
        });
    }
}
