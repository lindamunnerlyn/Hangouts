// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.AbstractSet;
import java.util.Iterator;

final class kvs extends AbstractSet
{

    final kvl a;

    kvs(kvl kvl1)
    {
        a = kvl1;
        super();
    }

    public boolean add(Object obj)
    {
        obj = (java.util.Map.Entry)obj;
        if (!contains(obj))
        {
            a.a((Comparable)((java.util.Map.Entry) (obj)).getKey(), ((java.util.Map.Entry) (obj)).getValue());
            return true;
        } else
        {
            return false;
        }
    }

    public void clear()
    {
        a.clear();
    }

    public boolean contains(Object obj)
    {
        Object obj1 = (java.util.Map.Entry)obj;
        obj = a.get(((java.util.Map.Entry) (obj1)).getKey());
        obj1 = ((java.util.Map.Entry) (obj1)).getValue();
        return obj == obj1 || obj != null && obj.equals(obj1);
    }

    public Iterator iterator()
    {
        return new kvr(a);
    }

    public boolean remove(Object obj)
    {
        obj = (java.util.Map.Entry)obj;
        if (contains(obj))
        {
            a.remove(((java.util.Map.Entry) (obj)).getKey());
            return true;
        } else
        {
            return false;
        }
    }

    public int size()
    {
        return a.size();
    }
}
