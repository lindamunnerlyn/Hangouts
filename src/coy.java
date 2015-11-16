// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class coy extends Enum
{

    public static final coy a;
    public static final coy b;
    private static final coy d[];
    public final String c;

    private coy(String s, int i, String s1)
    {
        super(s, i);
        c = s1;
    }

    public static coy valueOf(String s)
    {
        return (coy)Enum.valueOf(coy, s);
    }

    public static coy[] values()
    {
        return (coy[])d.clone();
    }

    static 
    {
        a = new coy("TRANSPORT_SPINNER", 0, "transport_spinner_promo_shown");
        b = new coy("AUTOSWITCH_TRANSPORT", 1, "autoswitch_transport_promo_shown");
        d = (new coy[] {
            a, b
        });
    }
}
