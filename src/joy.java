// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class joy extends jos
{

    joy(String s)
    {
        super(s, 5);
    }

    com.google.common.cache.LocalCache.ReferenceEntry a(jpj jpj1, com.google.common.cache.LocalCache.ReferenceEntry referenceentry, com.google.common.cache.LocalCache.ReferenceEntry referenceentry1)
    {
        jpj1 = super.a(jpj1, referenceentry, referenceentry1);
        a(referenceentry, ((com.google.common.cache.LocalCache.ReferenceEntry) (jpj1)));
        return jpj1;
    }

    com.google.common.cache.LocalCache.ReferenceEntry a(jpj jpj1, Object obj, int i, com.google.common.cache.LocalCache.ReferenceEntry referenceentry)
    {
        return new jpy(jpj1.h, obj, i, referenceentry);
    }
}
