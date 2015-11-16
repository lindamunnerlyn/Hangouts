// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jnz extends jkk
{

    final jnx a;

    jnz(jnx jnx1, com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry)
    {
        a = jnx1;
        super(referenceentry);
    }

    protected Object a(Object obj)
    {
        com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry = ((com.google.common.collect.MapMakerInternalMap.ReferenceEntry)obj).getNextEvictable();
        obj = referenceentry;
        if (referenceentry == a.a)
        {
            obj = null;
        }
        return obj;
    }
}
