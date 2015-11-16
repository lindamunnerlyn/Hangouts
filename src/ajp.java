// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class ajp
{

    final Map a = new gz();

    ajp()
    {
    }

    public void a(int i, ajl ajl1)
    {
        if (ajn.c.containsKey(Integer.valueOf(i)))
        {
            for (Iterator iterator = ((Set)ajn.c.get(Integer.valueOf(i))).iterator(); iterator.hasNext(); ((ajo)iterator.next()).a(ajl1)) { }
        }
        if (ajl1 == null)
        {
            a.remove(Integer.valueOf(i));
            return;
        } else
        {
            a.put(Integer.valueOf(i), ajl1);
            return;
        }
    }

    public boolean a(int i)
    {
        return a.containsKey(Integer.valueOf(i));
    }

    public ajl b(int i)
    {
        return (ajl)a.get(Integer.valueOf(i));
    }
}
