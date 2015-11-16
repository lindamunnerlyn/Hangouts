// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public final class jpa extends WeakReference
    implements jou
{

    final com.google.common.collect.MapMakerInternalMap.ReferenceEntry a;

    jpa(ReferenceQueue referencequeue, Object obj, com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry)
    {
        super(obj, referencequeue);
        a = referenceentry;
    }

    public com.google.common.collect.MapMakerInternalMap.ReferenceEntry a()
    {
        return a;
    }

    public jou a(ReferenceQueue referencequeue, Object obj, com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry)
    {
        return new jpa(referencequeue, obj, referenceentry);
    }

    public void b()
    {
        clear();
    }
}
