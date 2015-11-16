// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jnp extends jnm
{

    jnp(String s)
    {
        super(s, 2);
    }

    com.google.common.collect.MapMakerInternalMap.ReferenceEntry a(joh joh, com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry, com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry1)
    {
        joh = super.a(joh, referenceentry, referenceentry1);
        b(referenceentry, joh);
        return joh;
    }

    com.google.common.collect.MapMakerInternalMap.ReferenceEntry a(joh joh, Object obj, int i, com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry)
    {
        return new jop(obj, i, referenceentry);
    }
}
