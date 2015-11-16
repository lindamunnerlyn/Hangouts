// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.List;

final class ced
{

    int a;
    List b;

    ced(int i, List list)
    {
        a = i;
        b = list;
        if (cez.b)
        {
            i = a;
            int j = b.size();
            eev.f("Babel", (new StringBuilder(80)).append("Notification list with : messageCount=").append(i).append(" conversation count=").append(j).toString());
        }
    }

    static ced a(int i, boolean flag, boolean flag1, boolean flag2)
    {
        ced ced1 = cew.a(i, flag, flag1, flag2);
        cef cef1 = ceu.b(i);
        if (cef1 != null)
        {
            for (i = 0; i < ced1.b.size() && cef1.g < ((cef)ced1.b.get(i)).g; i++) { }
            if (i < ced1.b.size())
            {
                ced1.b.add(i, cef1);
            } else
            {
                ced1.b.add(cef1);
            }
            ced1.a = ced1.a + cef1.i;
        }
        return ced1;
    }

    edb a()
    {
        edb edb1 = new edb();
        for (Iterator iterator = b.iterator(); iterator.hasNext();)
        {
            Object obj = (cef)iterator.next();
            if (((cef) (obj)).j)
            {
                obj = ((cef) (obj)).h.iterator();
                while (((Iterator) (obj)).hasNext()) 
                {
                    edb1.add(((ceu)(cfg)((Iterator) (obj)).next()).o.a);
                }
            } else
            {
                edb1.add(((cef) (obj)).a);
            }
        }

        return edb1;
    }
}
