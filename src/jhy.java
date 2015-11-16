// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jhy extends jhw
{

    jhy(String s)
    {
        super(s, 1);
    }

    com.google.common.cache.LocalCache.ReferenceEntry a(jin jin, com.google.common.cache.LocalCache.ReferenceEntry referenceentry, com.google.common.cache.LocalCache.ReferenceEntry referenceentry1)
    {
        jin = super.a(jin, referenceentry, referenceentry1);
        a(referenceentry, ((com.google.common.cache.LocalCache.ReferenceEntry) (jin)));
        return jin;
    }

    com.google.common.cache.LocalCache.ReferenceEntry a(jin jin, Object obj, int i, com.google.common.cache.LocalCache.ReferenceEntry referenceentry)
    {
        return new jiu(obj, i, referenceentry);
    }
}
