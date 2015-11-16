// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.common.collect.MapMakerInternalMap;
import java.lang.ref.ReferenceQueue;

public final class jwa extends jvx
    implements com.google.common.collect.MapMakerInternalMap.ReferenceEntry
{

    volatile long d;
    com.google.common.collect.MapMakerInternalMap.ReferenceEntry e;
    com.google.common.collect.MapMakerInternalMap.ReferenceEntry f;
    com.google.common.collect.MapMakerInternalMap.ReferenceEntry g;
    com.google.common.collect.MapMakerInternalMap.ReferenceEntry h;

    jwa(ReferenceQueue referencequeue, Object obj, int i, com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry)
    {
        super(referencequeue, obj, i, referenceentry);
        d = 0x7fffffffffffffffL;
        e = MapMakerInternalMap.h();
        f = MapMakerInternalMap.h();
        g = MapMakerInternalMap.h();
        h = MapMakerInternalMap.h();
    }

    public long getExpirationTime()
    {
        return d;
    }

    public com.google.common.collect.MapMakerInternalMap.ReferenceEntry getNextEvictable()
    {
        return g;
    }

    public com.google.common.collect.MapMakerInternalMap.ReferenceEntry getNextExpirable()
    {
        return e;
    }

    public com.google.common.collect.MapMakerInternalMap.ReferenceEntry getPreviousEvictable()
    {
        return h;
    }

    public com.google.common.collect.MapMakerInternalMap.ReferenceEntry getPreviousExpirable()
    {
        return f;
    }

    public void setExpirationTime(long l)
    {
        d = l;
    }

    public void setNextEvictable(com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry)
    {
        g = referenceentry;
    }

    public void setNextExpirable(com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry)
    {
        e = referenceentry;
    }

    public void setPreviousEvictable(com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry)
    {
        h = referenceentry;
    }

    public void setPreviousExpirable(com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry)
    {
        f = referenceentry;
    }
}
