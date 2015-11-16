// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class bnf extends Enum
{

    public static final bnf a;
    public static final bnf b;
    public static final bnf c;
    public static final bnf d;
    private static final bnf e[];

    private bnf(String s, int i)
    {
        super(s, i);
    }

    public static bnf valueOf(String s)
    {
        return (bnf)Enum.valueOf(bnf, s);
    }

    public static bnf[] values()
    {
        return (bnf[])e.clone();
    }

    static 
    {
        a = new bnf("BATTERY_LOW", 0);
        b = new bnf("BATTERY_OKAY_AFTER_LOW", 1);
        c = new bnf("POWER_SAVE_MODE_ACTIVATED", 2);
        d = new bnf("POWER_SAVE_MODE_DEACTIVATED", 3);
        e = (new bnf[] {
            a, b, c, d
        });
    }
}
