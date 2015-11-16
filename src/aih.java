// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class aih extends Enum
{

    public static final aih a;
    public static final aih b;
    public static final aih c;
    public static final aih d;
    public static final aih e;
    public static final aih f;
    public static final aih g;
    public static final aih h;
    public static final aih i;
    public static final aih j;
    public static final aih k;
    private static final aih m[];
    private final int l;

    private aih(String s, int i1, int j1)
    {
        super(s, i1);
        l = j1;
    }

    public static aih valueOf(String s)
    {
        return (aih)Enum.valueOf(aih, s);
    }

    public static aih[] values()
    {
        return (aih[])m.clone();
    }

    static 
    {
        a = new aih("PERSONAL", 0, 1);
        b = new aih("PRIVATE_SHARED", 1, 2);
        c = new aih("PUBLIC_SHARED", 2, 3);
        d = new aih("FOLLOWING", 3, 4);
        e = new aih("MY_CIRCLES", 4, 5);
        f = new aih("VISIBLE_CIRCLE_MEMBERS", 5, 6);
        g = new aih("EXTENDED", 6, 7);
        h = new aih("DOMAIN", 7, 8);
        i = new aih("PUBLIC", 8, 9);
        j = new aih("BLOCKED", 9, 10);
        k = new aih("ALL_CIRCLES", 10, 11);
        m = (new aih[] {
            a, b, c, d, e, f, g, h, i, j, 
            k
        });
    }
}
