// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.NoSuchElementException;

final class hms
    implements Iterator
{

    final hmq a;
    private boolean b;
    private int c;

    hms(hmq hmq1)
    {
        a = hmq1;
        super();
    }

    public boolean hasNext()
    {
        return c < a.a;
    }

    public Object next()
    {
        int i = c;
        if (i == a.a)
        {
            throw new NoSuchElementException();
        } else
        {
            c = c + 1;
            return new hmr(a, i);
        }
    }

    public void remove()
    {
        int i = c - 1;
        if (b || i < 0)
        {
            throw new IllegalArgumentException();
        } else
        {
            a.b(i << 1);
            b = true;
            return;
        }
    }
}
