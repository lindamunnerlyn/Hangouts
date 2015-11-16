// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class jqt
    implements Iterator
{

    final Iterator a;
    Collection b;
    final jqr c;

    jqt(jqr jqr1)
    {
        c = jqr1;
        super();
        a = c.a.entrySet().iterator();
    }

    public boolean hasNext()
    {
        return a.hasNext();
    }

    public Object next()
    {
        java.util.Map.Entry entry = (java.util.Map.Entry)a.next();
        b = (Collection)entry.getValue();
        return c.a(entry);
    }

    public void remove()
    {
        a.remove();
        c.b.b = c.b.b - b.size();
        b.clear();
    }
}
