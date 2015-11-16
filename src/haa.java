// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class haa extends Enum
{

    public static final haa a;
    public static final haa b;
    private static final haa c[];

    private haa(String s, int i)
    {
        super(s, i);
    }

    public static haa valueOf(String s)
    {
        return (haa)Enum.valueOf(haa, s);
    }

    public static haa[] values()
    {
        return (haa[])c.clone();
    }

    static 
    {
        a = new haa("EXACT", 0);
        b = new haa("APPROXIMATE", 1);
        c = (new haa[] {
            a, b
        });
    }
}
