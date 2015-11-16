// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class cor
    implements Runnable
{

    final cop a;

    cor(cop cop1)
    {
        a = cop1;
        super();
    }

    public void run()
    {
        if (cop.e())
        {
            ebw.b("Babel", "updateAnnouncementsRunnable run");
        }
        if (cop.a(a) != -1)
        {
            cox acox[] = cop.b(a);
            int j = acox.length;
            int i = 0;
            while (i < j) 
            {
                cox cox1 = acox[i];
                boolean flag;
                if (cox1.a() || cop.c(a))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!cox1.b && flag)
                {
                    cox1.c();
                } else
                if (cox1.b && !flag)
                {
                    cox1.d();
                }
                i++;
            }
        }
    }
}
