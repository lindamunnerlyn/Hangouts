// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.NavigableSet;

final class jko extends jmn
{

    private final jmn c;

    jko(jmn jmn1)
    {
        super(jpp.a(jmn1.comparator()).a());
        c = jmn1;
    }

    public jmn G_()
    {
        return c;
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

    jmn a(Object obj, boolean flag)
    {
        return c.d(obj, flag).G_();
    }

    jmn a(Object obj, boolean flag, Object obj1, boolean flag1)
    {
        return c.b(obj1, flag1, obj, flag).G_();
    }

    public jqy a()
    {
        return c.c();
    }

    jmn b(Object obj, boolean flag)
    {
        return c.c(obj, flag).G_();
    }

    public jqy c()
    {
        return c.a();
    }

    public Object ceiling(Object obj)
    {
        return c.floor(obj);
    }

    jmn d()
    {
        throw new AssertionError("should never be called");
    }

    public Iterator descendingIterator()
    {
        return c();
    }

    public NavigableSet descendingSet()
    {
        return G_();
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
