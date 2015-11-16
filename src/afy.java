// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class afy extends Enum
{

    public static final afy a;
    public static final afy b;
    public static final afy c;
    public static final afy d;
    private static final afy e[];

    private afy(String s, int i)
    {
        super(s, i);
    }

    public static afy valueOf(String s)
    {
        return (afy)Enum.valueOf(afy, s);
    }

    public static afy[] values()
    {
        return (afy[])e.clone();
    }

    static 
    {
        a = new afy("LOW", 0);
        b = new afy("NORMAL", 1);
        c = new afy("HIGH", 2);
        d = new afy("IMMEDIATE", 3);
        e = (new afy[] {
            a, b, c, d
        });
    }
}
