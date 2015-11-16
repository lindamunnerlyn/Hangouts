// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class juy extends juk
{

    com.google.common.collect.MapMakerInternalMap.ReferenceEntry a;
    com.google.common.collect.MapMakerInternalMap.ReferenceEntry b;
    final jux c;

    juy(jux jux)
    {
        c = jux;
        super();
        a = this;
        b = this;
    }

    public com.google.common.collect.MapMakerInternalMap.ReferenceEntry getNextEvictable()
    {
        return a;
    }

    public com.google.common.collect.MapMakerInternalMap.ReferenceEntry getPreviousEvictable()
    {
        return b;
    }

    public void setNextEvictable(com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry)
    {
        a = referenceentry;
    }

    public void setPreviousEvictable(com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry)
    {
        b = referenceentry;
    }
}
