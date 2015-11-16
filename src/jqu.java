// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class jqu extends jwi
{

    final jqq a;

    jqu(jqq jqq1, Map map)
    {
        a = jqq1;
        super(map);
    }

    public void clear()
    {
        jts.b(iterator());
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
        return new jqv(this, a().entrySet().iterator());
    }

    public boolean remove(Object obj)
    {
        obj = (Collection)a().remove(obj);
        int i;
        if (obj != null)
        {
            i = ((Collection) (obj)).size();
            ((Collection) (obj)).clear();
            a.b = a.b - i;
        } else
        {
            i = 0;
        }
        return i > 0;
    }
}
