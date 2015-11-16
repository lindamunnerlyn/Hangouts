// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.common.cache.LocalCache;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public class jje extends WeakReference
    implements com.google.common.cache.LocalCache.ReferenceEntry
{

    final int g;
    final com.google.common.cache.LocalCache.ReferenceEntry h;
    volatile jja i;

    jje(ReferenceQueue referencequeue, Object obj, int j, com.google.common.cache.LocalCache.ReferenceEntry referenceentry)
    {
        super(obj, referencequeue);
        i = LocalCache.i();
        g = j;
        h = referenceentry;
    }

    public long getAccessTime()
    {
        throw new UnsupportedOperationException();
    }

    public int getHash()
    {
        return g;
    }

    public Object getKey()
    {
        return get();
    }

    public com.google.common.cache.LocalCache.ReferenceEntry getNext()
    {
        return h;
    }

    public com.google.common.cache.LocalCache.ReferenceEntry getNextInAccessQueue()
    {
        throw new UnsupportedOperationException();
    }

    public com.google.common.cache.LocalCache.ReferenceEntry getNextInWriteQueue()
    {
        throw new UnsupportedOperationException();
    }

    public com.google.common.cache.LocalCache.ReferenceEntry getPreviousInAccessQueue()
    {
        throw new UnsupportedOperationException();
    }

    public com.google.common.cache.LocalCache.ReferenceEntry getPreviousInWriteQueue()
    {
        throw new UnsupportedOperationException();
    }

    public jja getValueReference()
    {
        return i;
    }

    public long getWriteTime()
    {
        throw new UnsupportedOperationException();
    }

    public void setAccessTime(long l)
    {
        throw new UnsupportedOperationException();
    }

    public void setNextInAccessQueue(com.google.common.cache.LocalCache.ReferenceEntry referenceentry)
    {
        throw new UnsupportedOperationException();
    }

    public void setNextInWriteQueue(com.google.common.cache.LocalCache.ReferenceEntry referenceentry)
    {
        throw new UnsupportedOperationException();
    }

    public void setPreviousInAccessQueue(com.google.common.cache.LocalCache.ReferenceEntry referenceentry)
    {
        throw new UnsupportedOperationException();
    }

    public void setPreviousInWriteQueue(com.google.common.cache.LocalCache.ReferenceEntry referenceentry)
    {
        throw new UnsupportedOperationException();
    }

    public void setValueReference(jja jja)
    {
        i = jja;
    }

    public void setWriteTime(long l)
    {
        throw new UnsupportedOperationException();
    }
}
