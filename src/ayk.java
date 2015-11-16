// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ayk
    implements Runnable
{

    final ayj a;

    ayk(ayj ayj1)
    {
        a = ayj1;
        super();
    }

    public void run()
    {
        ayj ayj1;
label0:
        {
            if (a.a == ayl.a)
            {
                a.a = ayl.b;
                ayj1 = a;
                if (ayj1.a == ayl.b && !ayj1.c.P() && avv.v(ayj1.c) != 1)
                {
                    break label0;
                }
            }
            return;
        }
        aux aaux[] = avv.w(ayj1.c);
        int j = aaux.length;
        int i = 0;
        while (i < j) 
        {
            aux aux1 = aaux[i];
            boolean flag = aux1.a();
            aux1.a(flag);
            if (aux1 instanceof bll)
            {
                if (flag && !ayj1.b)
                {
                    g.a(avv.h(ayj1.c), 2100);
                    ayj1.b = true;
                } else
                if (ayj1.b && !flag)
                {
                    g.a(avv.h(ayj1.c), 2101);
                    ayj1.b = false;
                }
            }
            i++;
        }
        avv.g(ayj1.c).a(avv.g(ayj1.c).a());
    }
}
