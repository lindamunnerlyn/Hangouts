// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.common.cache.LocalCache;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentMap;

public final class jpx extends AbstractCollection
{

    final LocalCache a;
    private final ConcurrentMap b;

    public jpx(LocalCache localcache, ConcurrentMap concurrentmap)
    {
        a = localcache;
        super();
        b = concurrentmap;
    }

    public void clear()
    {
        b.clear();
    }

    public boolean contains(Object obj)
    {
        return b.containsValue(obj);
    }

    public boolean isEmpty()
    {
        return b.isEmpty();
    }

    public Iterator iterator()
    {
        return new jpv(a);
    }

    public int size()
    {
        return b.size();
    }

    public Object[] toArray()
    {
        return LocalCache.a(this).toArray();
    }

    public Object[] toArray(Object aobj[])
    {
        return LocalCache.a(this).toArray(aobj);
    }
}
