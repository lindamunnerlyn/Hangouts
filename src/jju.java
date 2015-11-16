// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;
import java.util.Map;
import java.util.Set;

class jju extends jpi
{

    final transient Map a;
    final jjt b;

    jju(jjt jjt1, Map map)
    {
        b = jjt1;
        super();
        a = map;
    }

    public Collection a(Object obj)
    {
        Collection collection = (Collection)jpc.a(a, obj);
        if (collection == null)
        {
            return null;
        } else
        {
            return b.a(obj, collection);
        }
    }

    java.util.Map.Entry a(java.util.Map.Entry entry)
    {
        Object obj = entry.getKey();
        return jpc.a(obj, b.a(obj, (Collection)entry.getValue()));
    }

    protected Set a()
    {
        return new jjv(this);
    }

    public Collection b(Object obj)
    {
        obj = (Collection)a.remove(obj);
        if (obj == null)
        {
            return null;
        } else
        {
            Collection collection = b.a();
            collection.addAll(((Collection) (obj)));
            jjt.b(b, ((Collection) (obj)).size());
            ((Collection) (obj)).clear();
            return collection;
        }
    }

    public void clear()
    {
        if (a == jjt.a(b))
        {
            b.d();
            return;
        } else
        {
            jmr.c(new jjw(this));
            return;
        }
    }

    public boolean containsKey(Object obj)
    {
        return jpc.b(a, obj);
    }

    public boolean equals(Object obj)
    {
        return this == obj || a.equals(obj);
    }

    public Object get(Object obj)
    {
        return a(obj);
    }

    public int hashCode()
    {
        return a.hashCode();
    }

    public Set keySet()
    {
        return b.h();
    }

    public Object remove(Object obj)
    {
        return b(obj);
    }

    public int size()
    {
        return a.size();
    }

    public String toString()
    {
        return a.toString();
    }
}
