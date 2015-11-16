// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jim extends Enum
    implements com.google.common.cache.LocalCache.ReferenceEntry
{

    public static final jim a;
    private static final jim b[];

    private jim(String s)
    {
        super(s, 0);
    }

    public static jim valueOf(String s)
    {
        return (jim)Enum.valueOf(jim, s);
    }

    public static jim[] values()
    {
        return (jim[])b.clone();
    }

    public long getAccessTime()
    {
        return 0L;
    }

    public int getHash()
    {
        return 0;
    }

    public Object getKey()
    {
        return null;
    }

    public com.google.common.cache.LocalCache.ReferenceEntry getNext()
    {
        return null;
    }

    public com.google.common.cache.LocalCache.ReferenceEntry getNextInAccessQueue()
    {
        return this;
    }

    public com.google.common.cache.LocalCache.ReferenceEntry getNextInWriteQueue()
    {
        return this;
    }

    public com.google.common.cache.LocalCache.ReferenceEntry getPreviousInAccessQueue()
    {
        return this;
    }

    public com.google.common.cache.LocalCache.ReferenceEntry getPreviousInWriteQueue()
    {
        return this;
    }

    public jja getValueReference()
    {
        return null;
    }

    public long getWriteTime()
    {
        return 0L;
    }

    public void setAccessTime(long l)
    {
    }

    public void setNextInAccessQueue(com.google.common.cache.LocalCache.ReferenceEntry referenceentry)
    {
    }

    public void setNextInWriteQueue(com.google.common.cache.LocalCache.ReferenceEntry referenceentry)
    {
    }

    public void setPreviousInAccessQueue(com.google.common.cache.LocalCache.ReferenceEntry referenceentry)
    {
    }

    public void setPreviousInWriteQueue(com.google.common.cache.LocalCache.ReferenceEntry referenceentry)
    {
    }

    public void setValueReference(jja jja)
    {
    }

    public void setWriteTime(long l)
    {
    }

    static 
    {
        a = new jim("INSTANCE");
        b = (new jim[] {
            a
        });
    }
}
