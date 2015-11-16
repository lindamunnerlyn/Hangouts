// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bvq
    implements brb
{

    final bra a;
    final bvp b;

    bvq(bvp bvp, bra bra1)
    {
        b = bvp;
        a = bra1;
        super();
    }

    public void a(gjr gjr1)
    {
        int i = 0;
        boolean flag;
        if (a.getVisibility() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (gjr1.d() != flag)
        {
            bra bra1 = a;
            if (!gjr1.d())
            {
                i = 8;
            }
            bra1.setVisibility(i);
        }
    }
}
