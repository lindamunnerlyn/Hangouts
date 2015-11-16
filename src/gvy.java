// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentSkipListMap;

final class gvy
{

    private final NavigableMap a = new ConcurrentSkipListMap(new gvz(this));

    gvy()
    {
    }

    public SortedSet a(gvo gvo1, gvo gvo2)
    {
        return a.navigableKeySet().subSet(gvo1, gvo2);
    }

    public void a(gvo gvo1)
    {
        Integer integer = (Integer)a.get(gvo1);
        NavigableMap navigablemap = a;
        int i;
        if (integer == null)
        {
            i = 1;
        } else
        {
            i = integer.intValue() + 1;
        }
        navigablemap.put(gvo1, Integer.valueOf(i));
    }

    public void b(gvo gvo1)
    {
        Integer integer = (Integer)a.get(gvo1);
        if (integer.intValue() == 1)
        {
            a.remove(gvo1);
            return;
        } else
        {
            a.put(gvo1, Integer.valueOf(integer.intValue() - 1));
            return;
        }
    }

    public String toString()
    {
        String s = "SizeTracker(";
        if (!a.isEmpty())
        {
            Iterator iterator = a.keySet().iterator();
            Object obj;
            String s1;
            for (s = "SizeTracker("; iterator.hasNext(); s = (new StringBuilder(String.valueOf(s).length() + 5 + String.valueOf(s1).length() + String.valueOf(obj).length())).append(s).append("{").append(s1).append(", ").append(((String) (obj))).append("} ").toString())
            {
                obj = (gvo)iterator.next();
                s = String.valueOf(s);
                s1 = String.valueOf(obj);
                obj = String.valueOf(a.get(obj));
            }

            s = s.substring(0, s.length() - 1);
        }
        return String.valueOf(s).concat(")");
    }
}
