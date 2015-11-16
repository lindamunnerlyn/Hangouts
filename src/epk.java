// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class epk
    implements Iterator
{

    public final epe a;
    public int b;

    public epk(epe epe1)
    {
        a = (epe)g.d(epe1);
        b = -1;
    }

    public boolean hasNext()
    {
        return b < a.a() - 1;
    }

    public Object next()
    {
        if (!hasNext())
        {
            throw new NoSuchElementException((new StringBuilder("Cannot advance the iterator beyond ")).append(b).toString());
        } else
        {
            epe epe1 = a;
            int i = b + 1;
            b = i;
            return epe1.a(i);
        }
    }

    public void remove()
    {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
