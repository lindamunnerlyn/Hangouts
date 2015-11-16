// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;

final class fxg
    implements Iterator
{

    final int a = 0;
    int b;
    int c;
    boolean d;
    final fxf e;

    fxg(fxf fxf1)
    {
        e = fxf1;
        super();
        d = false;
        b = fxf1.a();
    }

    public boolean hasNext()
    {
        return c < b;
    }

    public Object next()
    {
        Object obj = e.a(c);
        c = c + 1;
        d = true;
        return obj;
    }

    public void remove()
    {
        if (!d)
        {
            throw new IllegalStateException();
        } else
        {
            c = c - 1;
            b = b - 1;
            d = false;
            e.b(c);
            return;
        }
    }
}
