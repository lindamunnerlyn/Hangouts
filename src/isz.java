// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class isz extends Enum
    implements joj
{

    public static final isz a;
    private static final isz b[];

    private isz(String s)
    {
        super(s, 0);
    }

    public static joj b()
    {
        return a;
    }

    public static isz valueOf(String s)
    {
        return (isz)Enum.valueOf(isz, s);
    }

    public static isz[] values()
    {
        return (isz[])b.clone();
    }

    public Object a()
    {
        return new itg();
    }

    static 
    {
        a = new isz("INSTANCE");
        b = (new isz[] {
            a
        });
    }
}
