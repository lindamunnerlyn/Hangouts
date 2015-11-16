// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jxr extends jsa
{

    final transient Object b;
    final transient Object c;
    transient jsa d;

    jxr(Object obj, Object obj1)
    {
        g.f(obj, obj1);
        b = obj;
        c = obj1;
    }

    private jxr(Object obj, Object obj1, jsa jsa1)
    {
        b = obj;
        c = obj1;
        d = jsa1;
    }

    public jsa a()
    {
        jsa jsa1 = d;
        Object obj = jsa1;
        if (jsa1 == null)
        {
            obj = new jxr(c, b, this);
            d = ((jsa) (obj));
        }
        return ((jsa) (obj));
    }

    public boolean containsKey(Object obj)
    {
        return b.equals(obj);
    }

    public boolean containsValue(Object obj)
    {
        return c.equals(obj);
    }

    jth e()
    {
        return jth.b(jwd.a(b, c));
    }

    jth g()
    {
        return jth.b(b);
    }

    public Object get(Object obj)
    {
        if (b.equals(obj))
        {
            return c;
        } else
        {
            return null;
        }
    }

    public int size()
    {
        return 1;
    }
}
