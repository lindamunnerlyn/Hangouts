// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jid extends jhw
{

    jid(String s)
    {
        super(s, 6);
    }

    com.google.common.cache.LocalCache.ReferenceEntry a(jin jin1, com.google.common.cache.LocalCache.ReferenceEntry referenceentry, com.google.common.cache.LocalCache.ReferenceEntry referenceentry1)
    {
        jin1 = super.a(jin1, referenceentry, referenceentry1);
        b(referenceentry, jin1);
        return jin1;
    }

    com.google.common.cache.LocalCache.ReferenceEntry a(jin jin1, Object obj, int i, com.google.common.cache.LocalCache.ReferenceEntry referenceentry)
    {
        return new jjg(jin1.h, obj, i, referenceentry);
    }
}
