// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class kvr
    implements Iterator
{

    final kvl a;
    private int b;
    private boolean c;
    private Iterator d;

    kvr(kvl kvl1)
    {
        a = kvl1;
        super();
        b = -1;
    }

    private Iterator a()
    {
        if (d == null)
        {
            d = a.b.entrySet().iterator();
        }
        return d;
    }

    public boolean hasNext()
    {
        return b + 1 < a.a.size() || a().hasNext();
    }

    public Object next()
    {
        c = true;
        int i = b + 1;
        b = i;
        if (i < a.a.size())
        {
            return (java.util.Map.Entry)a.a.get(b);
        } else
        {
            return (java.util.Map.Entry)a().next();
        }
    }

    public void remove()
    {
        if (!c)
        {
            throw new IllegalStateException("remove() was called before next()");
        }
        c = false;
        a.e();
        if (b < a.a.size())
        {
            kvl kvl1 = a;
            int i = b;
            b = i - 1;
            kvl1.c(i);
            return;
        } else
        {
            a().remove();
            return;
        }
    }
}
