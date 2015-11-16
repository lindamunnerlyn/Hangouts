// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.common.collect.MapMakerInternalMap;

public final class jvq extends jvp
    implements com.google.common.collect.MapMakerInternalMap.ReferenceEntry
{

    com.google.common.collect.MapMakerInternalMap.ReferenceEntry e;
    com.google.common.collect.MapMakerInternalMap.ReferenceEntry f;

    jvq(Object obj, int i, com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry)
    {
        super(obj, i, referenceentry);
        e = MapMakerInternalMap.h();
        f = MapMakerInternalMap.h();
    }

    public com.google.common.collect.MapMakerInternalMap.ReferenceEntry getNextEvictable()
    {
        return e;
    }

    public com.google.common.collect.MapMakerInternalMap.ReferenceEntry getPreviousEvictable()
    {
        return f;
    }

    public void setNextEvictable(com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry)
    {
        e = referenceentry;
    }

    public void setPreviousEvictable(com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry)
    {
        f = referenceentry;
    }
}
