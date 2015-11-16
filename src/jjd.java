// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.common.cache.LocalCache;
import java.lang.ref.ReferenceQueue;

public final class jjd extends jje
{

    volatile long a;
    com.google.common.cache.LocalCache.ReferenceEntry b;
    com.google.common.cache.LocalCache.ReferenceEntry c;
    volatile long d;
    com.google.common.cache.LocalCache.ReferenceEntry e;
    com.google.common.cache.LocalCache.ReferenceEntry f;

    jjd(ReferenceQueue referencequeue, Object obj, int i, com.google.common.cache.LocalCache.ReferenceEntry referenceentry)
    {
        super(referencequeue, obj, i, referenceentry);
        a = 0x7fffffffffffffffL;
        b = LocalCache.j();
        c = LocalCache.j();
        d = 0x7fffffffffffffffL;
        e = LocalCache.j();
        f = LocalCache.j();
    }

    public long getAccessTime()
    {
        return a;
    }

    public com.google.common.cache.LocalCache.ReferenceEntry getNextInAccessQueue()
    {
        return b;
    }

    public com.google.common.cache.LocalCache.ReferenceEntry getNextInWriteQueue()
    {
        return e;
    }

    public com.google.common.cache.LocalCache.ReferenceEntry getPreviousInAccessQueue()
    {
        return c;
    }

    public com.google.common.cache.LocalCache.ReferenceEntry getPreviousInWriteQueue()
    {
        return f;
    }

    public long getWriteTime()
    {
        return d;
    }

    public void setAccessTime(long l)
    {
        a = l;
    }

    public void setNextInAccessQueue(com.google.common.cache.LocalCache.ReferenceEntry referenceentry)
    {
        b = referenceentry;
    }

    public void setNextInWriteQueue(com.google.common.cache.LocalCache.ReferenceEntry referenceentry)
    {
        e = referenceentry;
    }

    public void setPreviousInAccessQueue(com.google.common.cache.LocalCache.ReferenceEntry referenceentry)
    {
        c = referenceentry;
    }

    public void setPreviousInWriteQueue(com.google.common.cache.LocalCache.ReferenceEntry referenceentry)
    {
        f = referenceentry;
    }

    public void setWriteTime(long l)
    {
        d = l;
    }
}
