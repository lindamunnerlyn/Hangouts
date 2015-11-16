// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

class jrb extends jqz
    implements List
{

    final jqq g;

    jrb(jqq jqq1, Object obj, List list, jqz jqz1)
    {
        g = jqq1;
        super(jqq1, obj, list, jqz1);
    }

    public void add(int i, Object obj)
    {
        a();
        boolean flag = e().isEmpty();
        g().add(i, obj);
        jqq.b(g);
        if (flag)
        {
            d();
        }
    }

    public boolean addAll(int i, Collection collection)
    {
        boolean flag;
        if (collection.isEmpty())
        {
            flag = false;
        } else
        {
            int j = size();
            boolean flag1 = g().addAll(i, collection);
            flag = flag1;
            if (flag1)
            {
                i = e().size();
                g.b = (i - j) + g.b;
                flag = flag1;
                if (j == 0)
                {
                    d();
                    return flag1;
                }
            }
        }
        return flag;
    }

    List g()
    {
        return (List)e();
    }

    public Object get(int i)
    {
        a();
        return g().get(i);
    }

    public int indexOf(Object obj)
    {
        a();
        return g().indexOf(obj);
    }

    public int lastIndexOf(Object obj)
    {
        a();
        return g().lastIndexOf(obj);
    }

    public ListIterator listIterator()
    {
        a();
        return new jrc(this);
    }

    public ListIterator listIterator(int i)
    {
        a();
        return new jrc(this, i);
    }

    public Object remove(int i)
    {
        a();
        Object obj = g().remove(i);
        jqq.a(g);
        b();
        return obj;
    }

    public Object set(int i, Object obj)
    {
        a();
        return g().set(i, obj);
    }

    public List subList(int i, int j)
    {
        a();
        jqq jqq1 = g;
        Object obj1 = c();
        List list = g().subList(i, j);
        Object obj;
        if (f() == null)
        {
            obj = this;
        } else
        {
            obj = f();
        }
        return jqq1.a(obj1, list, ((jqz) (obj)));
    }
}
