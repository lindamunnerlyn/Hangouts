// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.common.cache.LocalCache;

public final class jqg
    implements java.util.Map.Entry
{

    final Object a;
    Object b;
    final LocalCache c;

    jqg(LocalCache localcache, Object obj, Object obj1)
    {
        c = localcache;
        super();
        a = obj;
        b = obj1;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof java.util.Map.Entry)
        {
            obj = (java.util.Map.Entry)obj;
            flag = flag1;
            if (a.equals(((java.util.Map.Entry) (obj)).getKey()))
            {
                flag = flag1;
                if (b.equals(((java.util.Map.Entry) (obj)).getValue()))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public Object getKey()
    {
        return a;
    }

    public Object getValue()
    {
        return b;
    }

    public int hashCode()
    {
        return a.hashCode() ^ b.hashCode();
    }

    public Object setValue(Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public String toString()
    {
        String s = String.valueOf(getKey());
        String s1 = String.valueOf(getValue());
        return (new StringBuilder(String.valueOf(s).length() + 1 + String.valueOf(s1).length())).append(s).append("=").append(s1).toString();
    }
}
