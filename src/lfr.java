// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

final class lfr
    implements lge, lgi
{

    private final lgi a[];
    private final lge b[];
    private final int c;
    private final int d;

    lfr(List list)
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
            a = new lgi[i1];
            int i = 0;
            int k = 0;
            for (; i < i1; i++)
            {
                list = (lgi)arraylist1.get(i);
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
        b = new lge[j1];
        int l = 0;
        for (int j = ((flag) ? 1 : 0); j < j1; j++)
        {
            list = (lge)arraylist.get(j);
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
            if (obj instanceof lfr)
            {
                a(list1, ((Object []) (((lfr)obj).a)));
            } else
            {
                list1.add(obj);
            }
            obj = list.get(i + 1);
            if (obj instanceof lfr)
            {
                a(list2, ((Object []) (((lfr)obj).b)));
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

    public int a(lgf lgf, String s, int i)
    {
        lge alge[] = b;
        if (alge == null)
        {
            throw new UnsupportedOperationException();
        }
        int k = alge.length;
        boolean flag = false;
        int j = i;
        for (i = ((flag) ? 1 : 0); i < k && j >= 0; i++)
        {
            j = alge[i].a(lgf, s, j);
        }

        return j;
    }

    public void a(StringBuffer stringbuffer, long l, lcw lcw, int i, ldd ldd, Locale locale)
    {
        lgi algi[] = a;
        if (algi == null)
        {
            throw new UnsupportedOperationException();
        }
        if (locale == null)
        {
            locale = Locale.getDefault();
        }
        int k = algi.length;
        for (int j = 0; j < k; j++)
        {
            algi[j].a(stringbuffer, l, lcw, i, ldd, locale);
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
