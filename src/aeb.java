// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class aeb extends Enum
{

    public static final aeb a;
    public static final aeb b;
    public static final aeb c;
    public static final aeb d;
    public static final aeb e;
    public static final aeb f;
    public static final aeb g;
    public static final aeb h;
    public static final aeb i;
    public static final aeb j;
    public static final aeb k;
    public static final aeb l;
    public static final aeb m;
    public static final aeb n;
    private static final aeb o[];

    private aeb(String s, int i1)
    {
        super(s, i1);
    }

    public static aeb valueOf(String s)
    {
        return (aeb)Enum.valueOf(aeb, s);
    }

    public static aeb[] values()
    {
        return (aeb[])o.clone();
    }

    static 
    {
        a = new aeb("NAME", 0);
        b = new aeb("PHONE", 1);
        c = new aeb("EMAIL", 2);
        d = new aeb("POSTAL_ADDRESS", 3);
        e = new aeb("ORGANIZATION", 4);
        f = new aeb("IM", 5);
        g = new aeb("PHOTO", 6);
        h = new aeb("WEBSITE", 7);
        i = new aeb("SIP", 8);
        j = new aeb("NICKNAME", 9);
        k = new aeb("NOTE", 10);
        l = new aeb("BIRTHDAY", 11);
        m = new aeb("ANNIVERSARY", 12);
        n = new aeb("ANDROID_CUSTOM", 13);
        o = (new aeb[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n
        });
    }
}
