// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;
import java.util.Iterator;

final class jqv
    implements Iterator
{

    java.util.Map.Entry a;
    final Iterator b;
    final jqu c;

    jqv(jqu jqu1, Iterator iterator)
    {
        c = jqu1;
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
        n.b(flag, "no calls to next() since the last call to remove()");
        collection = (Collection)a.getValue();
        b.remove();
        c.a.b = c.a.b - collection.size();
        collection.clear();
    }
}
