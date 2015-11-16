// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.common.collect.MapMakerInternalMap;
import java.util.Iterator;

public final class juw extends jvh
{

    final MapMakerInternalMap a;

    public juw(MapMakerInternalMap mapmakerinternalmap)
    {
        a = mapmakerinternalmap;
        super();
    }

    public void clear()
    {
        a.clear();
    }

    public boolean contains(Object obj)
    {
        if (obj instanceof java.util.Map.Entry)
        {
            obj = (java.util.Map.Entry)obj;
            Object obj1 = ((java.util.Map.Entry) (obj)).getKey();
            if (obj1 != null)
            {
                obj1 = a.get(obj1);
                if (obj1 != null && a.f.a(((java.util.Map.Entry) (obj)).getValue(), obj1))
                {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isEmpty()
    {
        return a.isEmpty();
    }

    public Iterator iterator()
    {
        return new juv(a);
    }

    public boolean remove(Object obj)
    {
        if (obj instanceof java.util.Map.Entry)
        {
            obj = (java.util.Map.Entry)obj;
            Object obj1 = ((java.util.Map.Entry) (obj)).getKey();
            if (obj1 != null && a.remove(obj1, ((java.util.Map.Entry) (obj)).getValue()))
            {
                return true;
            }
        }
        return false;
    }

    public int size()
    {
        return a.size();
    }
}
