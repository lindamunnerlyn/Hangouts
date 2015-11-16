// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;

public class jpl extends SoftReference
    implements jpw
{

    final com.google.common.cache.LocalCache.ReferenceEntry a;

    jpl(ReferenceQueue referencequeue, Object obj, com.google.common.cache.LocalCache.ReferenceEntry referenceentry)
    {
        super(obj, referencequeue);
        a = referenceentry;
    }

    public int a()
    {
        return 1;
    }

    public jpw a(ReferenceQueue referencequeue, Object obj, com.google.common.cache.LocalCache.ReferenceEntry referenceentry)
    {
        return new jpl(referencequeue, obj, referenceentry);
    }

    public void a(Object obj)
    {
    }

    public com.google.common.cache.LocalCache.ReferenceEntry b()
    {
        return a;
    }

    public boolean c()
    {
        return false;
    }

    public boolean d()
    {
        return true;
    }
}
