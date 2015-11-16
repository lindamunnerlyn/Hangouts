// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class kuw
    implements java.util.Map.Entry
{

    private java.util.Map.Entry a;

    kuw(java.util.Map.Entry entry)
    {
        a = entry;
    }

    public Object getKey()
    {
        return a.getKey();
    }

    public Object getValue()
    {
        kuv kuv1 = (kuv)a.getValue();
        if (kuv1 == null)
        {
            return null;
        } else
        {
            return kuv1.a();
        }
    }

    public Object setValue(Object obj)
    {
        if (!(obj instanceof kvb))
        {
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        } else
        {
            return ((kuv)a.getValue()).b((kvb)obj);
        }
    }
}
