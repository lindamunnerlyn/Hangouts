// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

final class knf
    implements Iterator
{

    private final Stack a = new Stack();
    private kmw b;

    knf(klp klp)
    {
        b = a(klp);
    }

    private kmw a(klp klp)
    {
        for (; klp instanceof kne; klp = kne.a(klp))
        {
            klp = (kne)klp;
            a.push(klp);
        }

        return (kmw)klp;
    }

    private kmw b()
    {
        kmw kmw1;
        do
        {
            if (a.isEmpty())
            {
                return null;
            }
            kmw1 = a(kne.b((kne)a.pop()));
        } while (kmw1.d());
        return kmw1;
    }

    public kmw a()
    {
        if (b == null)
        {
            throw new NoSuchElementException();
        } else
        {
            kmw kmw1 = b;
            b = b();
            return kmw1;
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
