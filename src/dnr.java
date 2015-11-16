// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dnr extends dmy
{

    private static final long serialVersionUID = 1L;
    public final int a;

    private dnr(String s, cgd cgd, long l, int i)
    {
        super(s, cgd, l);
        a = i;
    }

    public dnr(jep jep1)
    {
        super(jep1.a.a, g.a(jep1.b, null), g.a(jep1.c, 0L));
        a = g.a(jep1.d, 0);
    }

    public static dnr a(String s, cgd cgd, long l, int i)
    {
        return new dnr(s, cgd, l, i);
    }
}
