// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ObserverList
    implements Iterable
{

    public final List a = new ArrayList();
    private int b;
    private int c;
    private boolean d;

    public ObserverList()
    {
        b = 0;
        c = 0;
        d = false;
    }

    static Object a(ObserverList observerlist, int i)
    {
        return observerlist.a.get(i);
    }

    static void a(ObserverList observerlist)
    {
        observerlist.b = observerlist.b + 1;
    }

    static int b(ObserverList observerlist)
    {
        return observerlist.a.size();
    }

    static void c(ObserverList observerlist)
    {
        observerlist.b = observerlist.b - 1;
        if (observerlist.b <= 0 && observerlist.d)
        {
            observerlist.d = false;
            for (int i = observerlist.a.size() - 1; i >= 0; i--)
            {
                if (observerlist.a.get(i) == null)
                {
                    observerlist.a.remove(i);
                }
            }

        }
    }

    public boolean a(Object obj)
    {
        if (obj == null || a.contains(obj))
        {
            return false;
        } else
        {
            a.add(obj);
            c = c + 1;
            return true;
        }
    }

    public Iterator iterator()
    {
        return new ObserverListIterator();
    }

    private class ObserverListIterator
        implements RewindableIterator
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

        ObserverListIterator()
        {
            a = ObserverList.this;
            super();
            c = 0;
            d = false;
            ObserverList.a(ObserverList.this);
            b = ObserverList.b(ObserverList.this);
        }
    }

}
