// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class chy extends aqz
{

    final chx d;

    public chy(chx chx, int i, int j, boolean flag, boolean flag1)
    {
        d = chx;
        super(chx, i, j, flag, flag1);
    }

    public int b(int i)
    {
        if ((amj)e() == null)
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
        while ((amj)e() == null || i <= 0) 
        {
            return 0;
        }
        a();
        return 0;
    }

    public int f()
    {
        amj amj1 = (amj)e();
        if (amj1 != null)
        {
            return amj1.b();
        } else
        {
            return 0;
        }
    }
}
