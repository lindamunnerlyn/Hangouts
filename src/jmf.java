// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class jmf
{

    jpl a;
    Comparator b;
    Comparator c;

    public jmf()
    {
        a = new jmg();
    }

    public jme a()
    {
        if (c != null)
        {
            for (Iterator iterator = a.i().values().iterator(); iterator.hasNext(); Collections.sort((List)(Collection)iterator.next(), c)) { }
        }
        if (b != null)
        {
            jmg jmg1 = new jmg();
            Object obj = h.a(a.i().entrySet());
            Collections.sort(((List) (obj)), jpp.a(b).c());
            java.util.Map.Entry entry;
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); jmg1.a(entry.getKey(), (Iterable)entry.getValue()))
            {
                entry = (java.util.Map.Entry)((Iterator) (obj)).next();
            }

            a = jmg1;
        }
        return jme.a(a);
    }

    public jmf a(Object obj, Object obj1)
    {
        g.d(obj, obj1);
        a.a(obj, obj1);
        return this;
    }
}
