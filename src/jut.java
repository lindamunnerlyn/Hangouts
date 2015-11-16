// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jut extends jum
{

    jut(String s)
    {
        super(s, 6);
    }

    com.google.common.collect.MapMakerInternalMap.ReferenceEntry a(jvi jvi1, com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry, com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry1)
    {
        jvi1 = super.a(jvi1, referenceentry, referenceentry1);
        b(referenceentry, jvi1);
        return jvi1;
    }

    com.google.common.collect.MapMakerInternalMap.ReferenceEntry a(jvi jvi1, Object obj, int i, com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry)
    {
        return new jvy(jvi1.g, obj, i, referenceentry);
    }
}
