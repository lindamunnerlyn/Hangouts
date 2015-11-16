// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

class jkd
    implements Iterator
{

    final Iterator a;
    final Collection b;
    final jkc c;

    jkd(jkc jkc1)
    {
        c = jkc1;
        super();
        b = c.c;
        a = jjt.a(jkc1.c);
    }

    jkd(jkc jkc1, Iterator iterator)
    {
        c = jkc1;
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
        jjt.b(c.f);
        c.b();
    }
}
