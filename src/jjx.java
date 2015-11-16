// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class jjx extends jpj
{

    final jjt a;

    jjx(jjt jjt1, Map map)
    {
        a = jjt1;
        super(map);
    }

    public void clear()
    {
        jmr.c(iterator());
    }

    public boolean containsAll(Collection collection)
    {
        return a().keySet().containsAll(collection);
    }

    public boolean equals(Object obj)
    {
        return this == obj || a().keySet().equals(obj);
    }

    public int hashCode()
    {
        return a().keySet().hashCode();
    }

    public Iterator iterator()
    {
        return new jjy(this, a().entrySet().iterator());
    }

    public boolean remove(Object obj)
    {
        obj = (Collection)a().remove(obj);
        int i;
        if (obj != null)
        {
            i = ((Collection) (obj)).size();
            ((Collection) (obj)).clear();
            jjt.b(a, i);
        } else
        {
            i = 0;
        }
        return i > 0;
    }
}
