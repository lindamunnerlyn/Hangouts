// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

final class jks extends jmn
{

    jks(Comparator comparator)
    {
        super(comparator);
    }

    int a(Object obj)
    {
        return -1;
    }

    int a(Object aobj[], int i)
    {
        return i;
    }

    jmn a(Object obj, boolean flag)
    {
        return this;
    }

    jmn a(Object obj, boolean flag, Object obj1, boolean flag1)
    {
        return this;
    }

    public jqy a()
    {
        return jmr.a();
    }

    public jlk b()
    {
        return jlk.d();
    }

    jmn b(Object obj, boolean flag)
    {
        return this;
    }

    public jqy c()
    {
        return jmr.a();
    }

    public boolean contains(Object obj)
    {
        return false;
    }

    public boolean containsAll(Collection collection)
    {
        return collection.isEmpty();
    }

    jmn d()
    {
        return new jks(jpp.a(a).a());
    }

    public Iterator descendingIterator()
    {
        return c();
    }

    boolean e()
    {
        return false;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof Set)
        {
            return ((Set)obj).isEmpty();
        } else
        {
            return false;
        }
    }

    public Object first()
    {
        throw new NoSuchElementException();
    }

    public int hashCode()
    {
        return 0;
    }

    public boolean isEmpty()
    {
        return true;
    }

    public Iterator iterator()
    {
        return a();
    }

    public Object last()
    {
        throw new NoSuchElementException();
    }

    public int size()
    {
        return 0;
    }

    public String toString()
    {
        return "[]";
    }
}
