// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class cqh
    implements Runnable
{

    final cqf a;

    cqh(cqf cqf1)
    {
        a = cqf1;
        super();
    }

    public void run()
    {
        if (cqf.e())
        {
            eev.b("Babel", "updateAnnouncementsRunnable run");
        }
        if (cqf.a(a) != -1)
        {
            cqn acqn[] = cqf.b(a);
            int j = acqn.length;
            int i = 0;
            while (i < j) 
            {
                cqn cqn1 = acqn[i];
                boolean flag;
                if (cqn1.a() || cqf.c(a))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!cqn1.b && flag)
                {
                    cqn1.c();
                } else
                if (cqn1.b && !flag)
                {
                    cqn1.d();
                }
                i++;
            }
        }
    }
}
