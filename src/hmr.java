// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class hmr
    implements java.util.Map.Entry
{

    final hmq a;
    private int b;

    hmr(hmq hmq1, int i)
    {
        a = hmq1;
        super();
        b = i;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof java.util.Map.Entry))
            {
                return false;
            }
            obj = (java.util.Map.Entry)obj;
            if (!l.a(getKey(), ((java.util.Map.Entry) (obj)).getKey()) || !l.a(getValue(), ((java.util.Map.Entry) (obj)).getValue()))
            {
                return false;
            }
        }
        return true;
    }

    public Object getKey()
    {
        hmq hmq1 = a;
        int i = b;
        if (i < 0 || i >= hmq1.a)
        {
            return null;
        } else
        {
            return hmq1.b[i << 1];
        }
    }

    public Object getValue()
    {
        return a.a(b);
    }

    public int hashCode()
    {
        return getKey().hashCode() ^ getValue().hashCode();
    }

    public Object setValue(Object obj)
    {
        return a.a(b, obj);
    }
}
