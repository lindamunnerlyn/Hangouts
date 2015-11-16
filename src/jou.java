// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jou extends jos
{

    jou(String s)
    {
        super(s, 1);
    }

    com.google.common.cache.LocalCache.ReferenceEntry a(jpj jpj, com.google.common.cache.LocalCache.ReferenceEntry referenceentry, com.google.common.cache.LocalCache.ReferenceEntry referenceentry1)
    {
        jpj = super.a(jpj, referenceentry, referenceentry1);
        a(referenceentry, ((com.google.common.cache.LocalCache.ReferenceEntry) (jpj)));
        return jpj;
    }

    com.google.common.cache.LocalCache.ReferenceEntry a(jpj jpj, Object obj, int i, com.google.common.cache.LocalCache.ReferenceEntry referenceentry)
    {
        return new jpq(obj, i, referenceentry);
    }
}
