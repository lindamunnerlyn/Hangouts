// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public final class aev
{

    private String a;
    private List b;
    private Map c;
    private String d;
    private List e;
    private byte f[];

    public aev()
    {
        c = new HashMap();
    }

    public String a()
    {
        return a;
    }

    public void a(String s)
    {
        if (a != null)
        {
            String.format("Property name is re-defined (existing: %s, requested: %s", new Object[] {
                a, s
            });
        }
        a = s;
    }

    public void a(String s, String s1)
    {
        Object obj;
        if (!c.containsKey(s))
        {
            if (s.equals("TYPE"))
            {
                obj = new HashSet();
            } else
            {
                obj = new ArrayList();
            }
            c.put(s, obj);
        } else
        {
            obj = (Collection)c.get(s);
        }
        ((Collection) (obj)).add(s1);
    }

    public void a(List list)
    {
        e = list;
    }

    public void a(byte abyte0[])
    {
        f = abyte0;
    }

    public transient void a(String as[])
    {
        e = Arrays.asList(as);
    }

    public Map b()
    {
        return c;
    }

    public void b(String s)
    {
        if (b == null)
        {
            b = new ArrayList();
        }
        b.add(s);
    }

    public String c()
    {
        return d;
    }

    public void c(String s)
    {
        d = s;
    }

    public Collection d(String s)
    {
        return (Collection)c.get(s);
    }

    public List d()
    {
        return e;
    }

    public byte[] e()
    {
        return f;
    }
}
