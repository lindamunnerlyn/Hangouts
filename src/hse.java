// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class hse
    implements java.util.Map.Entry
{

    final hsd a;
    private Object b;
    private final hsk c;

    hse(hsd hsd1, hsk hsk1, Object obj)
    {
        a = hsd1;
        super();
        c = hsk1;
        b = h.a(obj);
    }

    private String a()
    {
        String s1 = c.b();
        String s = s1;
        if (a.b.a)
        {
            s = s1.toLowerCase();
        }
        return s;
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
            if (!a().equals(((java.util.Map.Entry) (obj)).getKey()) || !getValue().equals(((java.util.Map.Entry) (obj)).getValue()))
            {
                return false;
            }
        }
        return true;
    }

    public Object getKey()
    {
        return a();
    }

    public Object getValue()
    {
        return b;
    }

    public int hashCode()
    {
        return a().hashCode() ^ getValue().hashCode();
    }

    public Object setValue(Object obj)
    {
        Object obj1 = b;
        b = h.a(obj);
        c.a(a.a, obj);
        return obj1;
    }
}
