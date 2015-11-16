// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jog extends Enum
    implements com.google.common.collect.MapMakerInternalMap.ReferenceEntry
{

    public static final jog a;
    private static final jog b[];

    private jog(String s)
    {
        super(s, 0);
    }

    public static jog valueOf(String s)
    {
        return (jog)Enum.valueOf(jog, s);
    }

    public static jog[] values()
    {
        return (jog[])b.clone();
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

    public jou getValueReference()
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

    public void setValueReference(jou jou)
    {
    }

    static 
    {
        a = new jog("INSTANCE");
        b = (new jog[] {
            a
        });
    }
}
