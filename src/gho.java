// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

final class gho
    implements Runnable
{

    final ghn a;

    gho(ghn ghn1)
    {
        a = ghn1;
        super();
    }

    public void run()
    {
label0:
        {
            synchronized (a.e)
            {
                if (a.f && !a.p)
                {
                    break label0;
                }
            }
            return;
        }
        Object obj1;
        Object obj3;
        boolean flag;
        a.f = false;
        obj3 = new LinkedHashSet(a.h);
        obj1 = new LinkedHashSet(a.i);
        obj = new LinkedHashSet(a.j);
        a.h.clear();
        a.i.clear();
        a.j.clear();
        flag = a.o;
        a.o = false;
        obj2;
        JVM INSTR monitorexit ;
        ((Set) (obj1)).removeAll(((java.util.Collection) (obj3)));
        ((Set) (obj1)).removeAll(((java.util.Collection) (obj)));
        for (obj2 = ((Set) (obj3)).iterator(); ((Iterator) (obj2)).hasNext(); a.a.a(((ghm) (obj3)).b()))
        {
            obj3 = (ghm)((Iterator) (obj2)).next();
        }

        break MISSING_BLOCK_LABEL_210;
        obj;
        obj2;
        JVM INSTR monitorexit ;
        throw obj;
        obj1 = ((Set) (obj1)).iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break;
            }
            ghm ghm2 = (ghm)((Iterator) (obj1)).next();
            if (a.g.containsKey(ghm2.a()))
            {
                a.a.c(ghm2.b());
            }
        } while (true);
        ghm ghm1;
        for (Iterator iterator = ((Set) (obj)).iterator(); iterator.hasNext(); a.a.b(ghm1.b()))
        {
            ghm1 = (ghm)iterator.next();
        }

        if (flag)
        {
            gdv.b("Expected non-null", a.n);
            a.a.d(a.n.b());
        }
        return;
    }
}
