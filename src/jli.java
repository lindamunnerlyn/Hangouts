// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;

final class jli extends jmi
{

    private final transient EnumSet a;
    private transient int b;

    jli(EnumSet enumset)
    {
        a = enumset;
    }

    public jqy a()
    {
        return jmr.a(a.iterator());
    }

    public boolean contains(Object obj)
    {
        return a.contains(obj);
    }

    public boolean containsAll(Collection collection)
    {
        return a.containsAll(collection);
    }

    boolean e()
    {
        return false;
    }

    public boolean equals(Object obj)
    {
        return obj == this || a.equals(obj);
    }

    public int hashCode()
    {
        int j = b;
        int i = j;
        if (j == 0)
        {
            i = a.hashCode();
            b = i;
        }
        return i;
    }

    public boolean isEmpty()
    {
        return a.isEmpty();
    }

    public Iterator iterator()
    {
        return a();
    }

    public int size()
    {
        return a.size();
    }

    public String toString()
    {
        return a.toString();
    }

    Object writeReplace()
    {
        return new jlj(a);
    }
}
