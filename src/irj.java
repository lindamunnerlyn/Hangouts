// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class irj extends Enum
{

    public static final irj a;
    private static final irj b[];

    private irj(String s)
    {
        super(s, 0);
    }

    public static irj valueOf(String s)
    {
        return (irj)Enum.valueOf(irj, s);
    }

    public static irj[] values()
    {
        return (irj[])b.clone();
    }

    static 
    {
        a = new irj("I_AM_THE_FRAMEWORK");
        b = (new irj[] {
            a
        });
    }
}
