// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dcm extends dfa
{

    private final int a;

    public dcm(ani ani1, int i)
    {
        super(ani1);
        a = i;
    }

    public void a()
    {
        aoe aoe1 = new aoe(g.nS, b.h());
        if (a == 2)
        {
            aoe1.w();
        }
        if (a == 1)
        {
            aoe1.x();
        }
        c.a(new ctw(a));
    }
}
