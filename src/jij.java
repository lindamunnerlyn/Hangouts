// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.common.cache.LocalCache;
import java.util.Iterator;
import java.util.concurrent.ConcurrentMap;

public final class jij extends jhu
{

    final LocalCache c;

    public jij(LocalCache localcache, ConcurrentMap concurrentmap)
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
        return new jii(c);
    }

    public boolean remove(Object obj)
    {
        return a.remove(obj) != null;
    }
}
