// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class juo extends jum
{

    juo(String s)
    {
        super(s, 1);
    }

    com.google.common.collect.MapMakerInternalMap.ReferenceEntry a(jvi jvi, com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry, com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry1)
    {
        jvi = super.a(jvi, referenceentry, referenceentry1);
        a(referenceentry, ((com.google.common.collect.MapMakerInternalMap.ReferenceEntry) (jvi)));
        return jvi;
    }

    com.google.common.collect.MapMakerInternalMap.ReferenceEntry a(jvi jvi, Object obj, int i, com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry)
    {
        return new jvr(obj, i, referenceentry);
    }
}
