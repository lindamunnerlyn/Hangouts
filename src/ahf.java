// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.SystemClock;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

public final class ahf
{

    private final long a;
    private final LinkedList b;
    private final ahg c;
    private String d;
    private LinkedHashMap e;
    private boolean f;

    public ahf(String s)
    {
        this(s, new ahg());
    }

    private ahf(String s, ahg ahg1)
    {
        e = new LinkedHashMap();
        f = false;
        d = s;
        b = new LinkedList();
        c = ahg1;
        a = SystemClock.elapsedRealtime();
    }

    private static Map a(String s, Map map, StringBuilder stringbuilder, StringBuilder stringbuilder1)
    {
        LinkedHashMap linkedhashmap = null;
        if (stringbuilder.length() > 0)
        {
            LinkedHashMap linkedhashmap1 = new LinkedHashMap();
            if (s != null)
            {
                linkedhashmap1.put("action", s);
            }
            if (map != null && !map.isEmpty())
            {
                linkedhashmap1.putAll(map);
            }
            stringbuilder.deleteCharAt(stringbuilder.length() - 1);
            linkedhashmap1.put("it", stringbuilder.toString());
            linkedhashmap = linkedhashmap1;
            if (stringbuilder1.length() > 0)
            {
                stringbuilder1.deleteCharAt(stringbuilder1.length() - 1);
                linkedhashmap1.put("irt", stringbuilder1.toString());
                linkedhashmap = linkedhashmap1;
            }
        }
        return linkedhashmap;
    }

    public static transient Map a(ahf aahf[])
    {
        Object obj1 = null;
        StringBuilder stringbuilder = new StringBuilder();
        StringBuilder stringbuilder1 = new StringBuilder();
        int i = 0;
        boolean flag = false;
        Object obj = null;
        while (i < aahf.length) 
        {
            Object obj2 = aahf[i].b();
            if (obj2 == null)
            {
                throw new agy("The report items get from ticker is null.");
            }
            if (i == 0)
            {
                obj1 = (String)((Map) (obj2)).get("action");
                obj = Collections.unmodifiableMap(aahf[i].e);
                if (((Map) (obj2)).containsKey("irt"))
                {
                    flag = true;
                    stringbuilder1.append((String)((Map) (obj2)).get("irt")).append(",");
                }
                stringbuilder.append((String)((Map) (obj2)).get("it")).append(",");
            } else
            {
                Map map = Collections.unmodifiableMap(aahf[i].e);
                if (!((Map) (obj2)).containsKey("action") && obj != null || ((Map) (obj2)).containsKey("action") && !((String)((Map) (obj2)).get("action")).equals(obj))
                {
                    throw new agy("Can not get merged report items for the tickers with different action names.");
                }
                if (map == null && obj1 != null || map != null && !map.equals(obj1))
                {
                    throw new agy("Can not get merged report items for the tickers with different customized parameter-value pairs.");
                }
                if (((Map) (obj2)).containsKey("irt") != flag)
                {
                    throw new agy("Can not get merged report items for the tickers with different latency variables.");
                }
                stringbuilder.append((String)((Map) (obj2)).get("it")).append(",");
                if (flag)
                {
                    stringbuilder1.append((String)((Map) (obj2)).get("irt")).append(",");
                }
                obj2 = obj;
                obj = obj1;
                obj1 = obj2;
            }
            i++;
            obj2 = obj1;
            obj1 = obj;
            obj = obj2;
        }
        return a(((String) (obj)), ((Map) (obj1)), stringbuilder, stringbuilder1);
    }

    private Map b()
    {
        StringBuilder stringbuilder = new StringBuilder();
        StringBuilder stringbuilder1 = new StringBuilder();
        Iterator iterator = b.iterator();
        do
        {
            if (iterator.hasNext())
            {
                ahe ahe1 = (ahe)iterator.next();
                String s = ahe1.b();
                ahe ahe2 = ahe1.c();
                Long long1 = ahe1.a();
                long l;
                long l1;
                if (ahe2 == null && ahe1.d() != null)
                {
                    l1 = ahe1.d().longValue();
                    l = ahe1.d().longValue();
                } else
                {
                    if (ahe2 == null || long1.longValue() <= 0L)
                    {
                        continue;
                    }
                    l1 = long1.longValue() - ahe2.a().longValue();
                    l = long1.longValue() - a;
                }
                stringbuilder.append(s).append('.').append(l1).append(',');
                if (f)
                {
                    stringbuilder1.append(l).append(',');
                }
                continue;
            }
            return a(d, e, stringbuilder, stringbuilder1);
        } while (true);
    }

    public String a()
    {
        return d;
    }

    public void a(String s, String s1)
    {
        e.put(s, s1);
    }

    public transient boolean a(long l, String as[])
    {
        for (int i = 0; i <= 0; i++)
        {
            ahe ahe1 = new ahe(l, as[0]);
            b.add(ahe1);
        }

        return true;
    }
}
