// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cqo extends Enum
{

    public static final cqo a;
    public static final cqo b;
    private static final cqo d[];
    public final String c;

    private cqo(String s, int i, String s1)
    {
        super(s, i);
        c = s1;
    }

    public static cqo valueOf(String s)
    {
        return (cqo)Enum.valueOf(cqo, s);
    }

    public static cqo[] values()
    {
        return (cqo[])d.clone();
    }

    static 
    {
        a = new cqo("TRANSPORT_SPINNER", 0, "transport_spinner_promo_shown");
        b = new cqo("AUTOSWITCH_TRANSPORT", 1, "autoswitch_transport_promo_shown");
        d = (new cqo[] {
            a, b
        });
    }
}
