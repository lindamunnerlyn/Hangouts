// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.lang.ref.ReferenceQueue;

public final class jqf extends jqb
{

    final int b;

    jqf(ReferenceQueue referencequeue, Object obj, com.google.common.cache.LocalCache.ReferenceEntry referenceentry, int i)
    {
        super(referencequeue, obj, referenceentry);
        b = i;
    }

    public int a()
    {
        return b;
    }

    public jpw a(ReferenceQueue referencequeue, Object obj, com.google.common.cache.LocalCache.ReferenceEntry referenceentry)
    {
        return new jqf(referencequeue, obj, referenceentry, b);
    }
}
