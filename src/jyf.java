// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;

abstract class jyf
    implements Iterator
{

    final Iterator b;

    jyf(Iterator iterator)
    {
        b = (Iterator)n.b(iterator);
    }

    abstract Object a(Object obj);

    public final boolean hasNext()
    {
        return b.hasNext();
    }

    public final Object next()
    {
        return a(b.next());
    }

    public final void remove()
    {
        b.remove();
    }
}
