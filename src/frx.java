// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class frx
    implements Iterable, Iterator
{

    public frx()
    {
    }

    public boolean hasNext()
    {
        return false;
    }

    public Iterator iterator()
    {
        return this;
    }

    public Object next()
    {
        throw new NoSuchElementException();
    }

    public void remove()
    {
        throw new UnsupportedOperationException();
    }
}
