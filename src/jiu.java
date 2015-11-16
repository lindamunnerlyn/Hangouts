// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.common.cache.LocalCache;

public final class jiu extends jiw
{

    volatile long a;
    com.google.common.cache.LocalCache.ReferenceEntry b;
    com.google.common.cache.LocalCache.ReferenceEntry c;

    jiu(Object obj, int i, com.google.common.cache.LocalCache.ReferenceEntry referenceentry)
    {
        super(obj, i, referenceentry);
        a = 0x7fffffffffffffffL;
        b = LocalCache.j();
        c = LocalCache.j();
    }

    public long getAccessTime()
    {
        return a;
    }

    public com.google.common.cache.LocalCache.ReferenceEntry getNextInAccessQueue()
    {
        return b;
    }

    public com.google.common.cache.LocalCache.ReferenceEntry getPreviousInAccessQueue()
    {
        return c;
    }

    public void setAccessTime(long l)
    {
        a = l;
    }

    public void setNextInAccessQueue(com.google.common.cache.LocalCache.ReferenceEntry referenceentry)
    {
        b = referenceentry;
    }

    public void setPreviousInAccessQueue(com.google.common.cache.LocalCache.ReferenceEntry referenceentry)
    {
        c = referenceentry;
    }
}
