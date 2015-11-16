// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class czk extends cys
{

    private static final long serialVersionUID = 1L;
    public final int a;
    public final int b;

    public czk(iyb iyb1)
    {
        super(iyb1.a.a, g.a(iyb1.b, null), g.a(iyb1.c, 0L));
        a = g.a(iyb1.d, 0);
        b = g.a(iyb1.e, 0);
    }

    private czk(String s, int i, cey cey, long l)
    {
        super(s, cey, l);
        a = i;
        b = 10;
    }

    public static czk a(String s, int i, cey cey, long l)
    {
        return new czk(s, i, cey, l);
    }
}
