// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

final class kvi
    implements Iterator
{

    private final Stack a = new Stack();
    private kuz b;

    kvi(kts kts)
    {
        b = a(kts);
    }

    private kuz a(kts kts)
    {
        for (; kts instanceof kvh; kts = kvh.a(kts))
        {
            kts = (kvh)kts;
            a.push(kts);
        }

        return (kuz)kts;
    }

    private kuz b()
    {
        kuz kuz1;
        do
        {
            if (a.isEmpty())
            {
                return null;
            }
            kuz1 = a(kvh.b((kvh)a.pop()));
        } while (kuz1.d());
        return kuz1;
    }

    public kuz a()
    {
        if (b == null)
        {
            throw new NoSuchElementException();
        } else
        {
            kuz kuz1 = b;
            b = b();
            return kuz1;
        }
    }

    public boolean hasNext()
    {
        return b != null;
    }

    public Object next()
    {
        return a();
    }

    public void remove()
    {
        throw new UnsupportedOperationException();
    }
}
