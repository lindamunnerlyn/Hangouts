// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class kno
    implements Iterator
{

    final kni a;
    private int b;
    private boolean c;
    private Iterator d;

    kno(kni kni1)
    {
        a = kni1;
        super();
        b = -1;
    }

    private Iterator a()
    {
        if (d == null)
        {
            d = kni.c(a).entrySet().iterator();
        }
        return d;
    }

    public boolean hasNext()
    {
        return b + 1 < kni.b(a).size() || a().hasNext();
    }

    public Object next()
    {
        c = true;
        int i = b + 1;
        b = i;
        if (i < kni.b(a).size())
        {
            return (java.util.Map.Entry)kni.b(a).get(b);
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
        kni.a(a);
        if (b < kni.b(a).size())
        {
            kni kni1 = a;
            int i = b;
            b = i - 1;
            kni.a(kni1, i);
            return;
        } else
        {
            a().remove();
            return;
        }
    }
}
