// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.common.collect.MapMakerInternalMap;
import java.util.AbstractQueue;
import java.util.Iterator;

public final class jux extends AbstractQueue
{

    final com.google.common.collect.MapMakerInternalMap.ReferenceEntry a = new juy(this);

    jux()
    {
    }

    private com.google.common.collect.MapMakerInternalMap.ReferenceEntry a()
    {
        com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry1 = a.getNextEvictable();
        com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry = referenceentry1;
        if (referenceentry1 == a)
        {
            referenceentry = null;
        }
        return referenceentry;
    }

    public void clear()
    {
        com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry1;
        for (com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry = a.getNextEvictable(); referenceentry != a; referenceentry = referenceentry1)
        {
            referenceentry1 = referenceentry.getNextEvictable();
            MapMakerInternalMap.e(referenceentry);
        }

        a.setNextEvictable(a);
        a.setPreviousEvictable(a);
    }

    public boolean contains(Object obj)
    {
        return ((com.google.common.collect.MapMakerInternalMap.ReferenceEntry)obj).getNextEvictable() != jvg.a;
    }

    public boolean isEmpty()
    {
        return a.getNextEvictable() == a;
    }

    public Iterator iterator()
    {
        return new juz(this, a());
    }

    public boolean offer(Object obj)
    {
        obj = (com.google.common.collect.MapMakerInternalMap.ReferenceEntry)obj;
        MapMakerInternalMap.b(((com.google.common.collect.MapMakerInternalMap.ReferenceEntry) (obj)).getPreviousEvictable(), ((com.google.common.collect.MapMakerInternalMap.ReferenceEntry) (obj)).getNextEvictable());
        MapMakerInternalMap.b(a.getPreviousEvictable(), ((com.google.common.collect.MapMakerInternalMap.ReferenceEntry) (obj)));
        MapMakerInternalMap.b(((com.google.common.collect.MapMakerInternalMap.ReferenceEntry) (obj)), a);
        return true;
    }

    public Object peek()
    {
        return a();
    }

    public Object poll()
    {
        com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry = a.getNextEvictable();
        if (referenceentry == a)
        {
            return null;
        } else
        {
            remove(referenceentry);
            return referenceentry;
        }
    }

    public boolean remove(Object obj)
    {
        obj = (com.google.common.collect.MapMakerInternalMap.ReferenceEntry)obj;
        com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry = ((com.google.common.collect.MapMakerInternalMap.ReferenceEntry) (obj)).getPreviousEvictable();
        com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry1 = ((com.google.common.collect.MapMakerInternalMap.ReferenceEntry) (obj)).getNextEvictable();
        MapMakerInternalMap.b(referenceentry, referenceentry1);
        MapMakerInternalMap.e(((com.google.common.collect.MapMakerInternalMap.ReferenceEntry) (obj)));
        return referenceentry1 != jvg.a;
    }

    public int size()
    {
        int i = 0;
        for (com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry = a.getNextEvictable(); referenceentry != a; referenceentry = referenceentry.getNextEvictable())
        {
            i++;
        }

        return i;
    }
}
