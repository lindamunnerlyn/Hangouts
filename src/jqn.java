// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jqn
    implements java.util.Map.Entry
{

    private final Object a;
    private final Object b;
    private final jqh c;

    jqn(Object obj, Object obj1, jqh jqh1)
    {
        a = obj;
        b = obj1;
        c = (jqh)n.b(jqh1);
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof java.util.Map.Entry)
        {
            obj = (java.util.Map.Entry)obj;
            flag = flag1;
            if (n.a(getKey(), ((java.util.Map.Entry) (obj)).getKey()))
            {
                flag = flag1;
                if (n.a(getValue(), ((java.util.Map.Entry) (obj)).getValue()))
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
        int j = 0;
        Object obj = getKey();
        Object obj1 = getValue();
        int i;
        if (obj == null)
        {
            i = 0;
        } else
        {
            i = obj.hashCode();
        }
        if (obj1 != null)
        {
            j = obj1.hashCode();
        }
        return j ^ i;
    }

    public final Object setValue(Object obj)
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
