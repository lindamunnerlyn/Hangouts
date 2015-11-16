// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jvg extends Enum
    implements com.google.common.collect.MapMakerInternalMap.ReferenceEntry
{

    public static final jvg a;
    private static final jvg b[];

    private jvg(String s)
    {
        super(s, 0);
    }

    public static jvg valueOf(String s)
    {
        return (jvg)Enum.valueOf(jvg, s);
    }

    public static jvg[] values()
    {
        return (jvg[])b.clone();
    }

    public long getExpirationTime()
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

    public com.google.common.collect.MapMakerInternalMap.ReferenceEntry getNext()
    {
        return null;
    }

    public com.google.common.collect.MapMakerInternalMap.ReferenceEntry getNextEvictable()
    {
        return this;
    }

    public com.google.common.collect.MapMakerInternalMap.ReferenceEntry getNextExpirable()
    {
        return this;
    }

    public com.google.common.collect.MapMakerInternalMap.ReferenceEntry getPreviousEvictable()
    {
        return this;
    }

    public com.google.common.collect.MapMakerInternalMap.ReferenceEntry getPreviousExpirable()
    {
        return this;
    }

    public jvv getValueReference()
    {
        return null;
    }

    public void setExpirationTime(long l)
    {
    }

    public void setNextEvictable(com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry)
    {
    }

    public void setNextExpirable(com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry)
    {
    }

    public void setPreviousEvictable(com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry)
    {
    }

    public void setPreviousExpirable(com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry)
    {
    }

    public void setValueReference(jvv jvv)
    {
    }

    static 
    {
        a = new jvg("INSTANCE");
        b = (new jvg[] {
            a
        });
    }
}
