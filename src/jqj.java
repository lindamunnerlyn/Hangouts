// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jqj extends jlb
{

    final transient Object a;
    final transient Object b;
    transient jlb c;

    jqj(Object obj, Object obj1)
    {
        g.d(obj, obj1);
        a = obj;
        b = obj1;
    }

    private jqj(Object obj, Object obj1, jlb jlb1)
    {
        a = obj;
        b = obj1;
        c = jlb1;
    }

    public jlb a()
    {
        jlb jlb1 = c;
        Object obj = jlb1;
        if (jlb1 == null)
        {
            obj = new jqj(b, a, this);
            c = ((jlb) (obj));
        }
        return ((jlb) (obj));
    }

    jmi c()
    {
        return jmi.b(jpc.a(a, b));
    }

    public boolean containsKey(Object obj)
    {
        return a.equals(obj);
    }

    public boolean containsValue(Object obj)
    {
        return b.equals(obj);
    }

    public Object get(Object obj)
    {
        if (a.equals(obj))
        {
            return b;
        } else
        {
            return null;
        }
    }

    jmi j()
    {
        return jmi.b(a);
    }

    public int size()
    {
        return 1;
    }
}
