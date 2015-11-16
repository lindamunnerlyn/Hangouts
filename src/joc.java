// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class joc extends jkk
{

    final joa a;

    joc(joa joa1, com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry)
    {
        a = joa1;
        super(referenceentry);
    }

    protected Object a(Object obj)
    {
        com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry = ((com.google.common.collect.MapMakerInternalMap.ReferenceEntry)obj).getNextExpirable();
        obj = referenceentry;
        if (referenceentry == a.a)
        {
            obj = null;
        }
        return obj;
    }
}
