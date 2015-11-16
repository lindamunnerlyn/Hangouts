// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

final class jkr extends jmi
{

    static final jkr a = new jkr();
    private static final long serialVersionUID = 0L;

    private jkr()
    {
    }

    boolean H_()
    {
        return true;
    }

    int a(Object aobj[], int i)
    {
        return i;
    }

    public jqy a()
    {
        return jmr.a();
    }

    public jlk b()
    {
        return jlk.d();
    }

    public boolean contains(Object obj)
    {
        return false;
    }

    public boolean containsAll(Collection collection)
    {
        return collection.isEmpty();
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

    public final int hashCode()
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

    Object readResolve()
    {
        return a;
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
