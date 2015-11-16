// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.common.collect.MapMakerInternalMap;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public class jvx extends WeakReference
    implements com.google.common.collect.MapMakerInternalMap.ReferenceEntry
{

    final int a;
    final com.google.common.collect.MapMakerInternalMap.ReferenceEntry b;
    volatile jvv c;

    jvx(ReferenceQueue referencequeue, Object obj, int i, com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry)
    {
        super(obj, referencequeue);
        c = MapMakerInternalMap.g();
        a = i;
        b = referenceentry;
    }

    public long getExpirationTime()
    {
        throw new UnsupportedOperationException();
    }

    public int getHash()
    {
        return a;
    }

    public Object getKey()
    {
        return get();
    }

    public com.google.common.collect.MapMakerInternalMap.ReferenceEntry getNext()
    {
        return b;
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
        return c;
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
        jvv jvv2 = c;
        c = jvv1;
        jvv2.b();
    }
}
