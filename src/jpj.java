// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class jpj extends jqi
{

    final Map c;

    jpj(Map map)
    {
        c = (Map)n.b(map);
    }

    Map a()
    {
        return c;
    }

    public void clear()
    {
        a().clear();
    }

    public boolean contains(Object obj)
    {
        return a().containsKey(obj);
    }

    public boolean isEmpty()
    {
        return a().isEmpty();
    }

    public Iterator iterator()
    {
        return jpc.a(a().entrySet().iterator());
    }

    public boolean remove(Object obj)
    {
        if (contains(obj))
        {
            a().remove(obj);
            return true;
        } else
        {
            return false;
        }
    }

    public int size()
    {
        return a().size();
    }
}
