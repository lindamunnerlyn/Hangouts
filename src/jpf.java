// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.common.cache.LocalCache;
import java.util.Iterator;
import java.util.concurrent.ConcurrentMap;

public final class jpf extends joq
{

    final LocalCache c;

    public jpf(LocalCache localcache, ConcurrentMap concurrentmap)
    {
        c = localcache;
        super(localcache, concurrentmap);
    }

    public boolean contains(Object obj)
    {
        return a.containsKey(obj);
    }

    public Iterator iterator()
    {
        return new jpe(c);
    }

    public boolean remove(Object obj)
    {
        return a.remove(obj) != null;
    }
}
