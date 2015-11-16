// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

final class jsk extends jsh
{

    private final transient jsh a;

    jsk(jsh jsh1)
    {
        a = jsh1;
    }

    private int b(int i)
    {
        return size() - 1 - i;
    }

    public jsh a(int i, int j)
    {
        n.a(i, j, size());
        return a.a(size() - j, size() - i).d();
    }

    public boolean contains(Object obj)
    {
        return a.contains(obj);
    }

    public jsh d()
    {
        return a;
    }

    boolean e()
    {
        return a.e();
    }

    public Object get(int i)
    {
        n.a(i, size());
        return a.get(b(i));
    }

    public int indexOf(Object obj)
    {
        int i = a.lastIndexOf(obj);
        if (i >= 0)
        {
            return b(i);
        } else
        {
            return -1;
        }
    }

    public Iterator iterator()
    {
        return super.a();
    }

    public int lastIndexOf(Object obj)
    {
        int i = a.indexOf(obj);
        if (i >= 0)
        {
            return b(i);
        } else
        {
            return -1;
        }
    }

    public ListIterator listIterator()
    {
        return super.c();
    }

    public ListIterator listIterator(int i)
    {
        return super.a(i);
    }

    public int size()
    {
        return a.size();
    }

    public List subList(int i, int j)
    {
        return a(i, j);
    }
}
