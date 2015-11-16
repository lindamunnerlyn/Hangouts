// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class hrn
    implements java.util.Map.Entry
{

    final hrm a;
    private int b;

    hrn(hrm hrm1, int i)
    {
        a = hrm1;
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
        hrm hrm1 = a;
        int i = b;
        if (i < 0 || i >= hrm1.a)
        {
            return null;
        } else
        {
            return hrm1.b[i << 1];
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
