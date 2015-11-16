// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dhd extends dfa
{

    private final String a;
    private final int d;
    private final int e[];

    public dhd(ani ani1, String s, boolean flag, boolean flag1, boolean flag2)
    {
        super(ani1);
        a = s;
        int i;
        int j;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 2;
        }
        d = i;
        if (flag2)
        {
            i = 2;
        } else
        {
            i = 0;
        }
        if (flag1)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        e = (new int[] {
            i, j
        });
    }

    public void a()
    {
        aoe aoe1 = new aoe(g.nS, b.h());
        if (d == 1)
        {
            aoe1.ae(a);
        } else
        {
            any.a(aoe1, a);
        }
        c.a(new cuq(a, d, e));
    }
}
