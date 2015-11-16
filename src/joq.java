// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.common.cache.LocalCache;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentMap;

public abstract class joq extends AbstractSet
{

    final ConcurrentMap a;
    final LocalCache b;

    joq(LocalCache localcache, ConcurrentMap concurrentmap)
    {
        b = localcache;
        super();
        a = concurrentmap;
    }

    public void clear()
    {
        a.clear();
    }

    public boolean isEmpty()
    {
        return a.isEmpty();
    }

    public int size()
    {
        return a.size();
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
