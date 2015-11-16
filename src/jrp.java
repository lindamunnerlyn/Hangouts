// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.NavigableSet;

final class jrp extends jto
{

    private final jto c;

    jrp(jto jto1)
    {
        super(jxb.a(jto1.comparator()).c());
        c = jto1;
    }

    int a(Object obj)
    {
        int i = c.a(obj);
        if (i == -1)
        {
            return i;
        } else
        {
            return size() - 1 - i;
        }
    }

    jto a(Object obj, boolean flag)
    {
        return c.d(obj, flag).b();
    }

    jto a(Object obj, boolean flag, Object obj1, boolean flag1)
    {
        return c.b(obj1, flag1, obj, flag).b();
    }

    public jyh a()
    {
        return c.c();
    }

    public jto b()
    {
        return c;
    }

    jto b(Object obj, boolean flag)
    {
        return c.c(obj, flag).b();
    }

    public jyh c()
    {
        return c.a();
    }

    public Object ceiling(Object obj)
    {
        return c.floor(obj);
    }

    public boolean contains(Object obj)
    {
        return c.contains(obj);
    }

    jto d()
    {
        throw new AssertionError("should never be called");
    }

    public Iterator descendingIterator()
    {
        return c();
    }

    public NavigableSet descendingSet()
    {
        return b();
    }

    boolean e()
    {
        return c.e();
    }

    public Object floor(Object obj)
    {
        return c.ceiling(obj);
    }

    public Object higher(Object obj)
    {
        return c.lower(obj);
    }

    public Iterator iterator()
    {
        return a();
    }

    public Object lower(Object obj)
    {
        return c.higher(obj);
    }

    public int size()
    {
        return c.size();
    }
}
