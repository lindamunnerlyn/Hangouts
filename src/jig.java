// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.common.cache.LocalCache;
import java.util.Iterator;
import java.util.concurrent.ConcurrentMap;

public final class jig extends jhu
{

    final LocalCache c;

    public jig(LocalCache localcache, ConcurrentMap concurrentmap)
    {
        c = localcache;
        super(localcache, concurrentmap);
    }

    public boolean contains(Object obj)
    {
        if (obj instanceof java.util.Map.Entry)
        {
            obj = (java.util.Map.Entry)obj;
            Object obj1 = ((java.util.Map.Entry) (obj)).getKey();
            if (obj1 != null)
            {
                obj1 = c.get(obj1);
                if (obj1 != null && c.f.a(((java.util.Map.Entry) (obj)).getValue(), obj1))
                {
                    return true;
                }
            }
        }
        return false;
    }

    public Iterator iterator()
    {
        return new jif(c);
    }

    public boolean remove(Object obj)
    {
        if (obj instanceof java.util.Map.Entry)
        {
            obj = (java.util.Map.Entry)obj;
            Object obj1 = ((java.util.Map.Entry) (obj)).getKey();
            if (obj1 != null && c.remove(obj1, ((java.util.Map.Entry) (obj)).getValue()))
            {
                return true;
            }
        }
        return false;
    }
}
