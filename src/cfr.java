// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cfr extends Enum
{

    public static final cfr a;
    public static final cfr b;
    public static final cfr c;
    private static final cfr d[];

    private cfr(String s, int i)
    {
        super(s, i);
    }

    public static cfr valueOf(String s)
    {
        return (cfr)Enum.valueOf(cfr, s);
    }

    public static cfr[] values()
    {
        return (cfr[])d.clone();
    }

    static 
    {
        a = new cfr("MESSAGES", 0);
        b = new cfr("HANGOUTS", 1);
        c = new cfr("ERRORS", 2);
        d = (new cfr[] {
            a, b, c
        });
    }
}
