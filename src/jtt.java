// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.NoSuchElementException;

final class jtt extends jyi
{

    jtt()
    {
    }

    public boolean hasNext()
    {
        return false;
    }

    public boolean hasPrevious()
    {
        return false;
    }

    public Object next()
    {
        throw new NoSuchElementException();
    }

    public int nextIndex()
    {
        return 0;
    }

    public Object previous()
    {
        throw new NoSuchElementException();
    }

    public int previousIndex()
    {
        return -1;
    }
}
