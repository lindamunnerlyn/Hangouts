// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dnq extends dmy
{

    private static final long serialVersionUID = 1L;
    public final int a;
    public final int b;

    private dnq(String s, int i, cgd cgd, long l)
    {
        super(s, cgd, l);
        a = i;
        b = 10;
    }

    public dnq(jeg jeg1)
    {
        super(jeg1.a.a, g.a(jeg1.b, null), g.a(jeg1.c, 0L));
        a = g.a(jeg1.d, 0);
        b = g.a(jeg1.e, 0);
    }

    public static dnq a(String s, int i, cgd cgd, long l)
    {
        return new dnq(s, i, cgd, l);
    }
}
