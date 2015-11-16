// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

final class llq
    implements Iterator
{

    final llp a;
    private int b;
    private int c;
    private boolean d;

    llq(llp llp1)
    {
        a = llp1;
        super();
        c = 0;
        d = false;
        llp1.b = llp1.b + 1;
        b = llp1.a.size();
    }

    private void a()
    {
        if (!d)
        {
            d = true;
            llp llp1 = a;
            llp1.b = llp1.b - 1;
            if (llp1.b <= 0 && llp1.c)
            {
                llp1.c = false;
                for (int i = llp1.a.size() - 1; i >= 0; i--)
                {
                    if (llp1.a.get(i) == null)
                    {
                        llp1.a.remove(i);
                    }
                }

            }
        }
    }

    public boolean hasNext()
    {
        int i;
        for (i = c; i < b && llp.a(a, i) == null; i++) { }
        if (i < b)
        {
            return true;
        } else
        {
            a();
            return false;
        }
    }

    public Object next()
    {
        for (; c < b && llp.a(a, c) == null; c = c + 1) { }
        if (c < b)
        {
            llp llp1 = a;
            int i = c;
            c = i + 1;
            return llp.a(llp1, i);
        } else
        {
            a();
            throw new NoSuchElementException();
        }
    }

    public void remove()
    {
        throw new UnsupportedOperationException();
    }
}
