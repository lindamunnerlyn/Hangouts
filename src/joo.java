// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.common.collect.MapMakerInternalMap;

public class joo
    implements com.google.common.collect.MapMakerInternalMap.ReferenceEntry
{

    final Object a;
    final int b;
    final com.google.common.collect.MapMakerInternalMap.ReferenceEntry c;
    volatile jou d;

    joo(Object obj, int i, com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry)
    {
        d = MapMakerInternalMap.g();
        a = obj;
        b = i;
        c = referenceentry;
    }

    public long getExpirationTime()
    {
        throw new UnsupportedOperationException();
    }

    public int getHash()
    {
        return b;
    }

    public Object getKey()
    {
        return a;
    }

    public com.google.common.collect.MapMakerInternalMap.ReferenceEntry getNext()
    {
        return c;
    }

    public com.google.common.collect.MapMakerInternalMap.ReferenceEntry getNextEvictable()
    {
        throw new UnsupportedOperationException();
    }

    public com.google.common.collect.MapMakerInternalMap.ReferenceEntry getNextExpirable()
    {
        throw new UnsupportedOperationException();
    }

    public com.google.common.collect.MapMakerInternalMap.ReferenceEntry getPreviousEvictable()
    {
        throw new UnsupportedOperationException();
    }

    public com.google.common.collect.MapMakerInternalMap.ReferenceEntry getPreviousExpirable()
    {
        throw new UnsupportedOperationException();
    }

    public jou getValueReference()
    {
        return d;
    }

    public void setExpirationTime(long l)
    {
        throw new UnsupportedOperationException();
    }

    public void setNextEvictable(com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry)
    {
        throw new UnsupportedOperationException();
    }

    public void setNextExpirable(com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry)
    {
        throw new UnsupportedOperationException();
    }

    public void setPreviousEvictable(com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry)
    {
        throw new UnsupportedOperationException();
    }

    public void setPreviousExpirable(com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry)
    {
        throw new UnsupportedOperationException();
    }

    public void setValueReference(jou jou1)
    {
        jou jou2 = d;
        d = jou1;
        jou2.b();
    }
}
