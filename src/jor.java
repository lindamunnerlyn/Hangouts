// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.common.collect.MapMakerInternalMap;

public final class jor extends joo
    implements com.google.common.collect.MapMakerInternalMap.ReferenceEntry
{

    volatile long e;
    com.google.common.collect.MapMakerInternalMap.ReferenceEntry f;
    com.google.common.collect.MapMakerInternalMap.ReferenceEntry g;
    com.google.common.collect.MapMakerInternalMap.ReferenceEntry h;
    com.google.common.collect.MapMakerInternalMap.ReferenceEntry i;

    jor(Object obj, int j, com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry)
    {
        super(obj, j, referenceentry);
        e = 0x7fffffffffffffffL;
        f = MapMakerInternalMap.h();
        g = MapMakerInternalMap.h();
        h = MapMakerInternalMap.h();
        i = MapMakerInternalMap.h();
    }

    public long getExpirationTime()
    {
        return e;
    }

    public com.google.common.collect.MapMakerInternalMap.ReferenceEntry getNextEvictable()
    {
        return h;
    }

    public com.google.common.collect.MapMakerInternalMap.ReferenceEntry getNextExpirable()
    {
        return f;
    }

    public com.google.common.collect.MapMakerInternalMap.ReferenceEntry getPreviousEvictable()
    {
        return i;
    }

    public com.google.common.collect.MapMakerInternalMap.ReferenceEntry getPreviousExpirable()
    {
        return g;
    }

    public void setExpirationTime(long l)
    {
        e = l;
    }

    public void setNextEvictable(com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry)
    {
        h = referenceentry;
    }

    public void setNextExpirable(com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry)
    {
        f = referenceentry;
    }

    public void setPreviousEvictable(com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry)
    {
        i = referenceentry;
    }

    public void setPreviousExpirable(com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry)
    {
        g = referenceentry;
    }
}
