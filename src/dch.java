// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dch extends dfa
{

    private final int a;
    private final String d;
    private final int e;

    public dch(ani ani, int i, String s, int j)
    {
        super(ani);
        a = i;
        d = s;
        e = j;
    }

    public void a()
    {
        cte cte1 = new cte(a, d, e);
        c.a(cte1);
    }
}
