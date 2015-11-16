// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

final class hsf
    implements Iterator
{

    final hsd a;
    private int b;
    private hsk c;
    private Object d;
    private boolean e;
    private boolean f;
    private hsk g;

    hsf(hsd hsd1)
    {
        a = hsd1;
        super();
        b = -1;
    }

    public boolean hasNext()
    {
        if (!f)
        {
            f = true;
            d = null;
            do
            {
                if (d != null)
                {
                    break;
                }
                int i = b + 1;
                b = i;
                if (i >= a.b.b.size())
                {
                    break;
                }
                c = a.b.a((String)a.b.b.get(b));
                d = c.a(a.a);
            } while (true);
        }
        return d != null;
    }

    public Object next()
    {
        if (!hasNext())
        {
            throw new NoSuchElementException();
        } else
        {
            g = c;
            Object obj = d;
            f = false;
            e = false;
            c = null;
            d = null;
            return new hse(a, g, obj);
        }
    }

    public void remove()
    {
        boolean flag;
        if (g != null && !e)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        l.b(flag);
        e = true;
        g.a(a.a, null);
    }
}
