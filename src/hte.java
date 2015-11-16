// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class hte
    implements Iterator
{

    final int a;
    int b;
    final htd c;

    hte(htd htd1)
    {
        c = htd1;
        super();
        a = Array.getLength(c.a);
        b = 0;
    }

    public boolean hasNext()
    {
        return b < a;
    }

    public Object next()
    {
        if (!hasNext())
        {
            throw new NoSuchElementException();
        } else
        {
            Object obj = c.a;
            int i = b;
            b = i + 1;
            return Array.get(obj, i);
        }
    }

    public void remove()
    {
        throw new UnsupportedOperationException();
    }
}
