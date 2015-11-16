// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class aio extends Enum
{

    public static final aio a;
    public static final aio b;
    public static final aio c;
    public static final aio d;
    public static final aio e;
    public static final aio f;
    public static final aio g;
    public static final aio h;
    public static final aio i;
    public static final aio j;
    public static final aio k;
    private static final aio m[];
    private final int l;

    private aio(String s, int i1, int j1)
    {
        super(s, i1);
        l = j1;
    }

    public static aio valueOf(String s)
    {
        return (aio)Enum.valueOf(aio, s);
    }

    public static aio[] values()
    {
        return (aio[])m.clone();
    }

    static 
    {
        a = new aio("PERSONAL", 0, 1);
        b = new aio("PRIVATE_SHARED", 1, 2);
        c = new aio("PUBLIC_SHARED", 2, 3);
        d = new aio("FOLLOWING", 3, 4);
        e = new aio("MY_CIRCLES", 4, 5);
        f = new aio("VISIBLE_CIRCLE_MEMBERS", 5, 6);
        g = new aio("EXTENDED", 6, 7);
        h = new aio("DOMAIN", 7, 8);
        i = new aio("PUBLIC", 8, 9);
        j = new aio("BLOCKED", 9, 10);
        k = new aio("ALL_CIRCLES", 10, 11);
        m = (new aio[] {
            a, b, c, d, e, f, g, h, i, j, 
            k
        });
    }
}
