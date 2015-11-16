// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

class jra
    implements Iterator
{

    final Iterator a;
    final Collection b;
    final jqz c;

    jra(jqz jqz1)
    {
        c = jqz1;
        super();
        b = c.c;
        jqz1 = jqz1.c;
        if (jqz1 instanceof List)
        {
            jqz1 = ((List)jqz1).listIterator();
        } else
        {
            jqz1 = jqz1.iterator();
        }
        a = jqz1;
    }

    jra(jqz jqz1, Iterator iterator)
    {
        c = jqz1;
        super();
        b = c.c;
        a = iterator;
    }

    void a()
    {
        c.a();
        if (c.c != b)
        {
            throw new ConcurrentModificationException();
        } else
        {
            return;
        }
    }

    Iterator b()
    {
        a();
        return a;
    }

    public boolean hasNext()
    {
        a();
        return a.hasNext();
    }

    public Object next()
    {
        a();
        return a.next();
    }

    public void remove()
    {
        a.remove();
        jqq.a(c.f);
        c.b();
    }
}
