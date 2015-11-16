// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;

import java.util.NoSuchElementException;

// Referenced classes of package org.chromium.base:
//            ObserverList

class b
    implements b
{

    final ObserverList a;
    private int b;
    private int c;
    private boolean d;

    private void a()
    {
        if (!d)
        {
            d = true;
            ObserverList.c(a);
        }
    }

    public boolean hasNext()
    {
        int i;
        for (i = c; i < b && ObserverList.a(a, i) == null; i++) { }
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
        for (; c < b && ObserverList.a(a, c) == null; c = c + 1) { }
        if (c < b)
        {
            ObserverList observerlist = a;
            int i = c;
            c = i + 1;
            return ObserverList.a(observerlist, i);
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

    _cls9(ObserverList observerlist)
    {
        a = observerlist;
        super();
        c = 0;
        d = false;
        ObserverList.a(observerlist);
        b = ObserverList.b(observerlist);
    }
}
