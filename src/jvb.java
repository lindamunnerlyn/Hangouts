// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jvb extends juk
{

    com.google.common.collect.MapMakerInternalMap.ReferenceEntry a;
    com.google.common.collect.MapMakerInternalMap.ReferenceEntry b;
    final jva c;

    jvb(jva jva)
    {
        c = jva;
        super();
        a = this;
        b = this;
    }

    public long getExpirationTime()
    {
        return 0x7fffffffffffffffL;
    }

    public com.google.common.collect.MapMakerInternalMap.ReferenceEntry getNextExpirable()
    {
        return a;
    }

    public com.google.common.collect.MapMakerInternalMap.ReferenceEntry getPreviousExpirable()
    {
        return b;
    }

    public void setExpirationTime(long l)
    {
    }

    public void setNextExpirable(com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry)
    {
        a = referenceentry;
    }

    public void setPreviousExpirable(com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry)
    {
        b = referenceentry;
    }
}
