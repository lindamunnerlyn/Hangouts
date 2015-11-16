// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class adz extends Enum
{

    public static final adz a;
    public static final adz b;
    public static final adz c;
    public static final adz d;
    public static final adz e;
    public static final adz f;
    public static final adz g;
    public static final adz h;
    public static final adz i;
    public static final adz j;
    public static final adz k;
    public static final adz l;
    public static final adz m;
    public static final adz n;
    private static final adz o[];

    private adz(String s, int i1)
    {
        super(s, i1);
    }

    public static adz valueOf(String s)
    {
        return (adz)Enum.valueOf(adz, s);
    }

    public static adz[] values()
    {
        return (adz[])o.clone();
    }

    static 
    {
        a = new adz("NAME", 0);
        b = new adz("PHONE", 1);
        c = new adz("EMAIL", 2);
        d = new adz("POSTAL_ADDRESS", 3);
        e = new adz("ORGANIZATION", 4);
        f = new adz("IM", 5);
        g = new adz("PHOTO", 6);
        h = new adz("WEBSITE", 7);
        i = new adz("SIP", 8);
        j = new adz("NICKNAME", 9);
        k = new adz("NOTE", 10);
        l = new adz("BIRTHDAY", 11);
        m = new adz("ANNIVERSARY", 12);
        n = new adz("ANDROID_CUSTOM", 13);
        o = (new adz[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n
        });
    }
}
