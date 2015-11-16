// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;

final class kmu
    implements Iterator
{

    private Iterator a;

    public kmu(Iterator iterator)
    {
        a = iterator;
    }

    public boolean hasNext()
    {
        return a.hasNext();
    }

    public Object next()
    {
        java.util.Map.Entry entry = (java.util.Map.Entry)a.next();
        Object obj = entry;
        if (entry.getValue() instanceof kms)
        {
            obj = new kmt(entry);
        }
        return obj;
    }

    public void remove()
    {
        a.remove();
    }
}
