// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.List;

final class jxs extends jsh
{

    final transient Object a;

    jxs(Object obj)
    {
        a = n.b(obj);
    }

    public jsh a(int i, int j)
    {
        n.a(i, j, 1);
        Object obj = this;
        if (i == j)
        {
            obj = jxj.a;
        }
        return ((jsh) (obj));
    }

    public jyh a()
    {
        return jts.a(a);
    }

    boolean e()
    {
        return false;
    }

    public Object get(int i)
    {
        n.a(i, 1);
        return a;
    }

    public Iterator iterator()
    {
        return a();
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
        String s = a.toString();
        return (new StringBuilder(s.length() + 2)).append('[').append(s).append(']').toString();
    }
}
