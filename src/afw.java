// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class afw extends Enum
{

    public static final afw a;
    public static final afw b;
    public static final afw c;
    public static final afw d;
    private static final afw e[];

    private afw(String s, int i)
    {
        super(s, i);
    }

    public static afw valueOf(String s)
    {
        return (afw)Enum.valueOf(afw, s);
    }

    public static afw[] values()
    {
        return (afw[])e.clone();
    }

    static 
    {
        a = new afw("LOW", 0);
        b = new afw("NORMAL", 1);
        c = new afw("HIGH", 2);
        d = new afw("IMMEDIATE", 3);
        e = (new afw[] {
            a, b, c, d
        });
    }
}
