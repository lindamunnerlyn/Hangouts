// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.List;

final class ccy
{

    int a;
    List b;

    ccy(int i, List list)
    {
        a = i;
        b = list;
        if (cdu.b)
        {
            i = a;
            int j = b.size();
            ebw.f("Babel", (new StringBuilder(80)).append("Notification list with : messageCount=").append(i).append(" conversation count=").append(j).toString());
        }
    }

    static ccy a(int i, boolean flag, boolean flag1, boolean flag2)
    {
        ccy ccy1 = cdr.a(i, flag, flag1, flag2);
        cda cda1 = cdp.b(i);
        if (cda1 != null)
        {
            for (i = 0; i < ccy1.b.size() && cda1.g < ((cda)ccy1.b.get(i)).g; i++) { }
            if (i < ccy1.b.size())
            {
                ccy1.b.add(i, cda1);
            } else
            {
                ccy1.b.add(cda1);
            }
            ccy1.a = ccy1.a + cda1.i;
        }
        return ccy1;
    }

    dzx a()
    {
        dzx dzx1 = new dzx();
        for (Iterator iterator = b.iterator(); iterator.hasNext();)
        {
            Object obj = (cda)iterator.next();
            if (((cda) (obj)).j)
            {
                obj = ((cda) (obj)).h.iterator();
                while (((Iterator) (obj)).hasNext()) 
                {
                    dzx1.add(((cdp)(ceb)((Iterator) (obj)).next()).o.a);
                }
            } else
            {
                dzx1.add(((cda) (obj)).a);
            }
        }

        return dzx1;
    }
}
