// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.List;

final class jqk extends jlk
{

    final transient Object b;

    jqk(Object obj)
    {
        b = n.b(obj);
    }

    int a(Object aobj[], int i)
    {
        aobj[i] = b;
        return i + 1;
    }

    public jlk a(int i, int j)
    {
        n.a(i, j, 1);
        Object obj = this;
        if (i == j)
        {
            obj = jlk.a;
        }
        return ((jlk) (obj));
    }

    public jqy a()
    {
        return jmr.a(b);
    }

    public boolean contains(Object obj)
    {
        return b.equals(obj);
    }

    boolean e()
    {
        return false;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj instanceof List)
            {
                if (((List) (obj = (List)obj)).size() != 1 || !b.equals(((List) (obj)).get(0)))
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public Object get(int i)
    {
        n.a(i, 1);
        return b;
    }

    public jlk h()
    {
        return this;
    }

    public int hashCode()
    {
        return b.hashCode() + 31;
    }

    public int indexOf(Object obj)
    {
        return !b.equals(obj) ? -1 : 0;
    }

    public boolean isEmpty()
    {
        return false;
    }

    public Iterator iterator()
    {
        return a();
    }

    public int lastIndexOf(Object obj)
    {
        return indexOf(obj);
    }

    public int size()
    {
        return 1;
    }

    public List subList(int i, int j)
    {
        return a(i, j);
    }

    public String toString()
    {
        String s = b.toString();
        return (new StringBuilder(s.length() + 2)).append('[').append(s).append(']').toString();
    }
}
