// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

final class jua extends AbstractMap
    implements Serializable, ConcurrentMap
{

    private static final long serialVersionUID = 0L;
    private final fuu a;
    private final jub b;

    jua(jtz jtz1)
    {
        a = jtz1.a();
        b = jtz1.j;
    }

    public boolean containsKey(Object obj)
    {
        return false;
    }

    public boolean containsValue(Object obj)
    {
        return false;
    }

    public Set entrySet()
    {
        return Collections.emptySet();
    }

    public Object get(Object obj)
    {
        return null;
    }

    public Object put(Object obj, Object obj1)
    {
        n.b(obj);
        n.b(obj1);
        new juh(obj, obj1, b);
        return null;
    }

    public Object putIfAbsent(Object obj, Object obj1)
    {
        return put(obj, obj1);
    }

    public Object remove(Object obj)
    {
        return null;
    }

    public boolean remove(Object obj, Object obj1)
    {
        return false;
    }

    public Object replace(Object obj, Object obj1)
    {
        n.b(obj);
        n.b(obj1);
        return null;
    }

    public boolean replace(Object obj, Object obj1, Object obj2)
    {
        n.b(obj);
        n.b(obj2);
        return false;
    }
}
