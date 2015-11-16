// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

final class jlp extends jlk
{

    final transient int b;
    final transient int c;
    final jlk d;

    jlp(jlk jlk1, int i, int j)
    {
        d = jlk1;
        super();
        b = i;
        c = j;
    }

    public jlk a(int i, int j)
    {
        n.a(i, j, c);
        return d.a(b + i, b + j);
    }

    boolean e()
    {
        return true;
    }

    public Object get(int i)
    {
        n.a(i, c);
        return d.get(b + i);
    }

    public Iterator iterator()
    {
        return super.a();
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
        return c;
    }

    public List subList(int i, int j)
    {
        return a(i, j);
    }
}
