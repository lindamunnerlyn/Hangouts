// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gow extends Enum
{

    public static final gow a;
    public static final gow b;
    public static final gow c;
    public static final gow d;
    public static final gow e;
    private static final gow f[];

    private gow(String s, int i)
    {
        super(s, i);
    }

    public static gow valueOf(String s)
    {
        return (gow)Enum.valueOf(gow, s);
    }

    public static gow[] values()
    {
        return (gow[])f.clone();
    }

    static 
    {
        a = new gow("INVALID_COUNTRY_CODE", 0);
        b = new gow("NOT_A_NUMBER", 1);
        c = new gow("TOO_SHORT_AFTER_IDD", 2);
        d = new gow("TOO_SHORT_NSN", 3);
        e = new gow("TOO_LONG", 4);
        f = (new gow[] {
            a, b, c, d, e
        });
    }
}
