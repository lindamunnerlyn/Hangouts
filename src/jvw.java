// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.common.collect.MapMakerInternalMap;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;

public final class jvw extends AbstractCollection
{

    final MapMakerInternalMap a;

    public jvw(MapMakerInternalMap mapmakerinternalmap)
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
        return a.containsValue(obj);
    }

    public boolean isEmpty()
    {
        return a.isEmpty();
    }

    public Iterator iterator()
    {
        return new jvu(a);
    }

    public int size()
    {
        return a.size();
    }

    public Object[] toArray()
    {
        return MapMakerInternalMap.a(this).toArray();
    }

    public Object[] toArray(Object aobj[])
    {
        return MapMakerInternalMap.a(this).toArray(aobj);
    }
}
