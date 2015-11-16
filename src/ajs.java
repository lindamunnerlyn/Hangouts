// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class ajs
{

    final Map a = new gz();

    ajs()
    {
    }

    public void a(int i, ajo ajo1)
    {
        if (ajq.c.containsKey(Integer.valueOf(i)))
        {
            for (Iterator iterator = ((Set)ajq.c.get(Integer.valueOf(i))).iterator(); iterator.hasNext(); ((ajr)iterator.next()).a(ajo1)) { }
        }
        if (ajo1 == null)
        {
            a.remove(Integer.valueOf(i));
            return;
        } else
        {
            a.put(Integer.valueOf(i), ajo1);
            return;
        }
    }

    public boolean a(int i)
    {
        return a.containsKey(Integer.valueOf(i));
    }

    public ajo b(int i)
    {
        return (ajo)a.get(Integer.valueOf(i));
    }
}
