// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

final class jln extends jlk
{

    private final transient jlk b;

    jln(jlk jlk1)
    {
        b = jlk1;
    }

    private int b(int i)
    {
        return size() - 1 - i;
    }

    public jlk a(int i, int j)
    {
        n.a(i, j, size());
        return b.a(size() - j, size() - i).h();
    }

    public boolean contains(Object obj)
    {
        return b.contains(obj);
    }

    boolean e()
    {
        return b.e();
    }

    public Object get(int i)
    {
        n.a(i, size());
        return b.get(b(i));
    }

    public jlk h()
    {
        return b;
    }

    public int indexOf(Object obj)
    {
        int i = b.lastIndexOf(obj);
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
        int i = b.indexOf(obj);
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
        return super.g();
    }

    public ListIterator listIterator(int i)
    {
        return super.a(i);
    }

    public int size()
    {
        return b.size();
    }

    public List subList(int i, int j)
    {
        return a(i, j);
    }
}
