// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.common.cache.LocalCache;

public final class jpu extends jps
{

    volatile long a;
    com.google.common.cache.LocalCache.ReferenceEntry b;
    com.google.common.cache.LocalCache.ReferenceEntry c;

    jpu(Object obj, int i, com.google.common.cache.LocalCache.ReferenceEntry referenceentry)
    {
        super(obj, i, referenceentry);
        a = 0x7fffffffffffffffL;
        b = LocalCache.j();
        c = LocalCache.j();
    }

    public com.google.common.cache.LocalCache.ReferenceEntry getNextInWriteQueue()
    {
        return b;
    }

    public com.google.common.cache.LocalCache.ReferenceEntry getPreviousInWriteQueue()
    {
        return c;
    }

    public long getWriteTime()
    {
        return a;
    }

    public void setNextInWriteQueue(com.google.common.cache.LocalCache.ReferenceEntry referenceentry)
    {
        b = referenceentry;
    }

    public void setPreviousInWriteQueue(com.google.common.cache.LocalCache.ReferenceEntry referenceentry)
    {
        c = referenceentry;
    }

    public void setWriteTime(long l)
    {
        a = l;
    }
}
