// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

final class lqb
    implements lqo, lqs
{

    private final lqs a[];
    private final lqo b[];
    private final int c;
    private final int d;

    lqb(List list)
    {
        boolean flag = false;
        super();
        ArrayList arraylist1 = new ArrayList();
        ArrayList arraylist = new ArrayList();
        a(list, arraylist1, arraylist);
        if (arraylist1.contains(null) || arraylist1.isEmpty())
        {
            a = null;
            c = 0;
        } else
        {
            int i1 = arraylist1.size();
            a = new lqs[i1];
            int i = 0;
            int k = 0;
            for (; i < i1; i++)
            {
                list = (lqs)arraylist1.get(i);
                k += list.a();
                a[i] = list;
            }

            c = k;
        }
        if (arraylist.contains(null) || arraylist.isEmpty())
        {
            b = null;
            d = 0;
            return;
        }
        int j1 = arraylist.size();
        b = new lqo[j1];
        int l = 0;
        for (int j = ((flag) ? 1 : 0); j < j1; j++)
        {
            list = (lqo)arraylist.get(j);
            l += list.b();
            b[j] = list;
        }

        d = l;
    }

    private static void a(List list, List list1, List list2)
    {
        int j = list.size();
        int i = 0;
        while (i < j) 
        {
            Object obj = list.get(i);
            if (obj instanceof lqb)
            {
                a(list1, ((Object []) (((lqb)obj).a)));
            } else
            {
                list1.add(obj);
            }
            obj = list.get(i + 1);
            if (obj instanceof lqb)
            {
                a(list2, ((Object []) (((lqb)obj).b)));
            } else
            {
                list2.add(obj);
            }
            i += 2;
        }
    }

    private static void a(List list, Object aobj[])
    {
        if (aobj != null)
        {
            for (int i = 0; i < aobj.length; i++)
            {
                list.add(aobj[i]);
            }

        }
    }

    public int a()
    {
        return c;
    }

    public int a(lqp lqp, String s, int i)
    {
        lqo alqo[] = b;
        if (alqo == null)
        {
            throw new UnsupportedOperationException();
        }
        int k = alqo.length;
        boolean flag = false;
        int j = i;
        for (i = ((flag) ? 1 : 0); i < k && j >= 0; i++)
        {
            j = alqo[i].a(lqp, s, j);
        }

        return j;
    }

    public void a(StringBuffer stringbuffer, long l, lng lng, int i, lnn lnn, Locale locale)
    {
        lqs alqs[] = a;
        if (alqs == null)
        {
            throw new UnsupportedOperationException();
        }
        if (locale == null)
        {
            locale = Locale.getDefault();
        }
        int k = alqs.length;
        for (int j = 0; j < k; j++)
        {
            alqs[j].a(stringbuffer, l, lng, i, lnn, locale);
        }

    }

    public int b()
    {
        return d;
    }

    boolean c()
    {
        return a != null;
    }

    boolean d()
    {
        return b != null;
    }
}
