// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

final class jsm extends jsh
{

    final transient int a;
    final transient int b;
    final jsh c;

    jsm(jsh jsh1, int i, int j)
    {
        c = jsh1;
        super();
        a = i;
        b = j;
    }

    public jsh a(int i, int j)
    {
        n.a(i, j, b);
        return c.a(a + i, a + j);
    }

    boolean e()
    {
        return true;
    }

    public Object get(int i)
    {
        n.a(i, b);
        return c.get(a + i);
    }

    public Iterator iterator()
    {
        return super.a();
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
        return b;
    }

    public List subList(int i, int j)
    {
        return a(i, j);
    }
}
