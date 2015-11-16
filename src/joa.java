// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.common.collect.MapMakerInternalMap;
import java.util.AbstractQueue;
import java.util.Iterator;

public final class joa extends AbstractQueue
{

    final com.google.common.collect.MapMakerInternalMap.ReferenceEntry a = new job(this);

    joa()
    {
    }

    private com.google.common.collect.MapMakerInternalMap.ReferenceEntry a()
    {
        com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry1 = a.getNextExpirable();
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
        for (com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry = a.getNextExpirable(); referenceentry != a; referenceentry = referenceentry1)
        {
            referenceentry1 = referenceentry.getNextExpirable();
            MapMakerInternalMap.d(referenceentry);
        }

        a.setNextExpirable(a);
        a.setPreviousExpirable(a);
    }

    public boolean contains(Object obj)
    {
        return ((com.google.common.collect.MapMakerInternalMap.ReferenceEntry)obj).getNextExpirable() != jog.a;
    }

    public boolean isEmpty()
    {
        return a.getNextExpirable() == a;
    }

    public Iterator iterator()
    {
        return new joc(this, a());
    }

    public boolean offer(Object obj)
    {
        obj = (com.google.common.collect.MapMakerInternalMap.ReferenceEntry)obj;
        MapMakerInternalMap.a(((com.google.common.collect.MapMakerInternalMap.ReferenceEntry) (obj)).getPreviousExpirable(), ((com.google.common.collect.MapMakerInternalMap.ReferenceEntry) (obj)).getNextExpirable());
        MapMakerInternalMap.a(a.getPreviousExpirable(), ((com.google.common.collect.MapMakerInternalMap.ReferenceEntry) (obj)));
        MapMakerInternalMap.a(((com.google.common.collect.MapMakerInternalMap.ReferenceEntry) (obj)), a);
        return true;
    }

    public Object peek()
    {
        return a();
    }

    public Object poll()
    {
        com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry = a.getNextExpirable();
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
        com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry = ((com.google.common.collect.MapMakerInternalMap.ReferenceEntry) (obj)).getPreviousExpirable();
        com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry1 = ((com.google.common.collect.MapMakerInternalMap.ReferenceEntry) (obj)).getNextExpirable();
        MapMakerInternalMap.a(referenceentry, referenceentry1);
        MapMakerInternalMap.d(((com.google.common.collect.MapMakerInternalMap.ReferenceEntry) (obj)));
        return referenceentry1 != jog.a;
    }

    public int size()
    {
        int i = 0;
        for (com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry = a.getNextExpirable(); referenceentry != a; referenceentry = referenceentry.getNextExpirable())
        {
            i++;
        }

        return i;
    }
}
