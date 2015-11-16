// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class aha
{

    ahc a;
    ExecutorService b;
    LinkedHashMap c;
    BlockingQueue d;
    String e;
    String f;
    String g;
    int h;
    int i;
    int j;
    int k;

    public aha(String s, String s1, String s2, ahc ahc1, int l, int i1, int j1)
    {
        c = new LinkedHashMap();
        i = 1;
        e = s;
        f = s1;
        g = s2;
        a = ahc1;
        h = l;
        j = i1;
        k = j1;
        b();
    }

    private Map a(List list)
    {
        LinkedHashMap linkedhashmap;
        linkedhashmap = new LinkedHashMap();
        LinkedHashMap linkedhashmap1 = new LinkedHashMap();
        for (list = list.iterator(); list.hasNext();)
        {
            ahf ahf1 = (ahf)list.next();
            String s = ahf1.a();
            if (linkedhashmap1.containsKey(s))
            {
                ((List)linkedhashmap1.get(s)).add(ahf1);
            } else
            {
                ArrayList arraylist = new ArrayList();
                arraylist.add(ahf1);
                linkedhashmap1.put(s, arraylist);
            }
        }

        list = linkedhashmap1.entrySet().iterator();
_L2:
        Object obj;
        java.util.Map.Entry entry;
        LinkedHashMap linkedhashmap2;
        if (!list.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        entry = (java.util.Map.Entry)list.next();
        obj = (List)entry.getValue();
        linkedhashmap2 = new LinkedHashMap(c);
        Map map = ahf.a((ahf[])((List) (obj)).toArray(new ahf[0]));
        linkedhashmap2.putAll(map);
        linkedhashmap.put(entry.getKey(), linkedhashmap2);
        continue; /* Loop/switch isn't completed */
        agy agy1;
        agy1;
        obj = String.valueOf(obj);
        (new StringBuilder(String.valueOf(obj).length() + 24)).append("failed to merge tickers:").append(((String) (obj)));
        if (true) goto _L2; else goto _L1
_L1:
        return linkedhashmap;
    }

    private boolean a(Map map)
    {
        int l;
        boolean flag;
        l = j;
        flag = false;
_L2:
        if (flag || l <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        Thread.sleep(k);
        a.a(e, map);
        flag = true;
_L3:
        l--;
        if (true) goto _L2; else goto _L1
        ahd ahd1;
        ahd1;
        (new StringBuilder(34)).append("#").append(l).append(" failed to send report");
        flag = false;
          goto _L3
_L1:
        return flag;
    }

    private List b(int l)
    {
        ArrayList arraylist = new ArrayList();
        for (int i1 = 0; i1 < l; i1++)
        {
            arraylist.add(d.take());
        }

        return arraylist;
    }

    private void b()
    {
        a("v", g);
        a("s", f);
        d = new ArrayBlockingQueue(h);
        b = Executors.newSingleThreadExecutor();
        b.execute(new ahb(this));
    }

    void a()
    {
        try
        {
            do
            {
                Iterator iterator = a(b(i)).values().iterator();
                while (iterator.hasNext()) 
                {
                    a((Map)iterator.next());
                }
            } while (true);
        }
        catch (InterruptedException interruptedexception)
        {
            Thread.currentThread().interrupt();
        }
    }

    public void a(int l)
    {
        int i1 = l;
        if (l <= 0)
        {
            (new StringBuilder(47)).append("too small batch size :").append(l).append(", changed to 1");
            i1 = 1;
        }
        if (i1 > h)
        {
            (new StringBuilder(71)).append("batch size :").append(i1).append(" bigger than buffer size, change to buffer limit");
        }
        i = i1;
    }

    public void a(String s, String s1)
    {
        c.put(s, s1);
    }

    public boolean a(ahf ahf1)
    {
        return d.offer(ahf1);
    }
}
