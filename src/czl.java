// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class czl extends cys
{

    private static final long serialVersionUID = 1L;
    public final int a;

    public czl(iyk iyk1)
    {
        super(iyk1.a.a, g.a(iyk1.b, null), g.a(iyk1.c, 0L));
        a = g.a(iyk1.d, 0);
    }

    private czl(String s, cey cey, long l, int i)
    {
        super(s, cey, l);
        a = i;
    }

    public static czl a(String s, cey cey, long l, int i)
    {
        return new czl(s, cey, l, i);
    }
}
