// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;
import java.util.Iterator;

final class jjy
    implements Iterator
{

    java.util.Map.Entry a;
    final Iterator b;
    final jjx c;

    jjy(jjx jjx1, Iterator iterator)
    {
        c = jjx1;
        b = iterator;
        super();
    }

    public boolean hasNext()
    {
        return b.hasNext();
    }

    public Object next()
    {
        a = (java.util.Map.Entry)b.next();
        return a.getKey();
    }

    public void remove()
    {
        Collection collection;
        boolean flag;
        if (a != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g.c(flag);
        collection = (Collection)a.getValue();
        b.remove();
        jjt.b(c.a, collection.size());
        collection.clear();
    }
}
