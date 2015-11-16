// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class cje extends arq
{

    final cjd d;

    public cje(cjd cjd, int i, int j, boolean flag, boolean flag1)
    {
        d = cjd;
        super(cjd, i, j, flag, flag1);
    }

    public int b(int i)
    {
        if ((anb)e() == null)
        {
            return 0;
        }
        if (i > 0 && a())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        return i;
    }

    public int c(int i)
    {
        while ((anb)e() == null || i <= 0) 
        {
            return 0;
        }
        a();
        return 0;
    }

    public int f()
    {
        anb anb1 = (anb)e();
        if (anb1 != null)
        {
            return anb1.b();
        } else
        {
            return 0;
        }
    }
}
