// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.NoSuchElementException;

abstract class cnp
    implements Iterator
{

    int b;
    Object c;

    cnp()
    {
        b = cnq.b;
    }

    protected abstract Object a();

    boolean b()
    {
        b = cnq.d;
        c = a();
        if (b != cnq.c)
        {
            b = cnq.a;
            return true;
        } else
        {
            return false;
        }
    }

    public final boolean hasNext()
    {
        if (b == cnq.d)
        {
            throw new IllegalStateException();
        }
        switch (cnj.a[b - 1])
        {
        default:
            return b();

        case 1: // '\001'
            return false;

        case 2: // '\002'
            return true;
        }
    }

    public final Object next()
    {
        if (!hasNext())
        {
            throw new NoSuchElementException();
        } else
        {
            b = cnq.b;
            return c;
        }
    }

    public void remove()
    {
        throw new UnsupportedOperationException();
    }
}
