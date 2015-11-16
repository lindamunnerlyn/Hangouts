// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gvq extends Enum
{

    public static final gvq a;
    public static final gvq b;
    private static final gvq c[];

    private gvq(String s, int i)
    {
        super(s, i);
    }

    public static gvq valueOf(String s)
    {
        return (gvq)Enum.valueOf(gvq, s);
    }

    public static gvq[] values()
    {
        return (gvq[])c.clone();
    }

    static 
    {
        a = new gvq("EXACT", 0);
        b = new gvq("APPROXIMATE", 1);
        c = (new gvq[] {
            a, b
        });
    }
}
