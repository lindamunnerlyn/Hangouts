// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gkq extends Enum
{

    public static final gkq a;
    public static final gkq b;
    public static final gkq c;
    public static final gkq d;
    public static final gkq e;
    private static final gkq f[];

    private gkq(String s, int i)
    {
        super(s, i);
    }

    public static gkq valueOf(String s)
    {
        return (gkq)Enum.valueOf(gkq, s);
    }

    public static gkq[] values()
    {
        return (gkq[])f.clone();
    }

    static 
    {
        a = new gkq("INVALID_COUNTRY_CODE", 0);
        b = new gkq("NOT_A_NUMBER", 1);
        c = new gkq("TOO_SHORT_AFTER_IDD", 2);
        d = new gkq("TOO_SHORT_NSN", 3);
        e = new gkq("TOO_LONG", 4);
        f = (new gkq[] {
            a, b, c, d, e
        });
    }
}
