// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jpa extends jos
{

    jpa(String s)
    {
        super(s, 7);
    }

    com.google.common.cache.LocalCache.ReferenceEntry a(jpj jpj1, com.google.common.cache.LocalCache.ReferenceEntry referenceentry, com.google.common.cache.LocalCache.ReferenceEntry referenceentry1)
    {
        jpj1 = super.a(jpj1, referenceentry, referenceentry1);
        a(referenceentry, ((com.google.common.cache.LocalCache.ReferenceEntry) (jpj1)));
        b(referenceentry, jpj1);
        return jpj1;
    }

    com.google.common.cache.LocalCache.ReferenceEntry a(jpj jpj1, Object obj, int i, com.google.common.cache.LocalCache.ReferenceEntry referenceentry)
    {
        return new jpz(jpj1.h, obj, i, referenceentry);
    }
}
