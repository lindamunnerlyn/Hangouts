// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.common.cache.LocalCache;
import java.util.AbstractSet;
import java.util.concurrent.ConcurrentMap;

public abstract class jhu extends AbstractSet
{

    final ConcurrentMap a;
    final LocalCache b;

    jhu(LocalCache localcache, ConcurrentMap concurrentmap)
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
}
