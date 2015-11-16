// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

class jke extends jkc
    implements List
{

    final jjt g;

    jke(jjt jjt1, Object obj, List list, jkc jkc1)
    {
        g = jjt1;
        super(jjt1, obj, list, jkc1);
    }

    public void add(int i, Object obj)
    {
        a();
        boolean flag = e().isEmpty();
        g().add(i, obj);
        jjt.c(g);
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
                jjt.a(g, i - j);
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
        return new jkf(this);
    }

    public ListIterator listIterator(int i)
    {
        a();
        return new jkf(this, i);
    }

    public Object remove(int i)
    {
        a();
        Object obj = g().remove(i);
        jjt.b(g);
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
        jjt jjt1 = g;
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
        return jjt.a(jjt1, obj1, list, ((jkc) (obj)));
    }
}
