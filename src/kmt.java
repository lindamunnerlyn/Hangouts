// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class kmt
    implements java.util.Map.Entry
{

    private java.util.Map.Entry a;

    kmt(java.util.Map.Entry entry)
    {
        a = entry;
    }

    public Object getKey()
    {
        return a.getKey();
    }

    public Object getValue()
    {
        kms kms1 = (kms)a.getValue();
        if (kms1 == null)
        {
            return null;
        } else
        {
            return kms1.a();
        }
    }

    public Object setValue(Object obj)
    {
        if (!(obj instanceof kmy))
        {
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        } else
        {
            return ((kms)a.getValue()).b((kmy)obj);
        }
    }
}
