// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.common.collect.MapMakerInternalMap;
import java.lang.ref.ReferenceQueue;

public final class jvy extends jvx
    implements com.google.common.collect.MapMakerInternalMap.ReferenceEntry
{

    com.google.common.collect.MapMakerInternalMap.ReferenceEntry d;
    com.google.common.collect.MapMakerInternalMap.ReferenceEntry e;

    jvy(ReferenceQueue referencequeue, Object obj, int i, com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry)
    {
        super(referencequeue, obj, i, referenceentry);
        d = MapMakerInternalMap.h();
        e = MapMakerInternalMap.h();
    }

    public com.google.common.collect.MapMakerInternalMap.ReferenceEntry getNextEvictable()
    {
        return d;
    }

    public com.google.common.collect.MapMakerInternalMap.ReferenceEntry getPreviousEvictable()
    {
        return e;
    }

    public void setNextEvictable(com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry)
    {
        d = referenceentry;
    }

    public void setPreviousEvictable(com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry)
    {
        e = referenceentry;
    }
}
