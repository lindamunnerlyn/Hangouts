// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class emk
    implements Iterator
{

    public final eme a;
    public int b;

    public emk(eme eme1)
    {
        a = (eme)h.a(eme1);
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
            eme eme1 = a;
            int i = b + 1;
            b = i;
            return eme1.a(i);
        }
    }

    public void remove()
    {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
