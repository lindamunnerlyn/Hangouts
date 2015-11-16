// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.common.collect.MapMakerInternalMap;

public class jvp
    implements com.google.common.collect.MapMakerInternalMap.ReferenceEntry
{

    final Object a;
    final int b;
    final com.google.common.collect.MapMakerInternalMap.ReferenceEntry c;
    volatile jvv d;

    jvp(Object obj, int i, com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry)
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

    public jvv getValueReference()
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

    public void setValueReference(jvv jvv1)
    {
        jvv jvv2 = d;
        d = jvv1;
        jvv2.b();
    }
}
