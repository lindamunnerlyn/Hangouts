// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;

public final class jvk extends SoftReference
    implements jvv
{

    final com.google.common.collect.MapMakerInternalMap.ReferenceEntry a;

    jvk(ReferenceQueue referencequeue, Object obj, com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry)
    {
        super(obj, referencequeue);
        a = referenceentry;
    }

    public com.google.common.collect.MapMakerInternalMap.ReferenceEntry a()
    {
        return a;
    }

    public jvv a(ReferenceQueue referencequeue, Object obj, com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry)
    {
        return new jvk(referencequeue, obj, referenceentry);
    }

    public void b()
    {
        clear();
    }
}
