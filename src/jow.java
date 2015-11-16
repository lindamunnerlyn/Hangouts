// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jow extends jos
{

    jow(String s)
    {
        super(s, 3);
    }

    com.google.common.cache.LocalCache.ReferenceEntry a(jpj jpj, com.google.common.cache.LocalCache.ReferenceEntry referenceentry, com.google.common.cache.LocalCache.ReferenceEntry referenceentry1)
    {
        jpj = super.a(jpj, referenceentry, referenceentry1);
        a(referenceentry, ((com.google.common.cache.LocalCache.ReferenceEntry) (jpj)));
        b(referenceentry, jpj);
        return jpj;
    }

    com.google.common.cache.LocalCache.ReferenceEntry a(jpj jpj, Object obj, int i, com.google.common.cache.LocalCache.ReferenceEntry referenceentry)
    {
        return new jpr(obj, i, referenceentry);
    }
}
