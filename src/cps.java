// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cps extends dfa
{

    private final String a;
    private final String d;
    private final boolean e;

    public cps(ani ani, String s, String s1, boolean flag)
    {
        super(ani);
        a = s;
        d = s1;
        e = flag;
    }

    public void a()
    {
        cub cub1 = new cub(a, d, e);
        c.a(cub1);
    }
}
