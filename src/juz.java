// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class juz extends jrh
{

    final jux a;

    juz(jux jux1, com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry)
    {
        a = jux1;
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
