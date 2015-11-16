// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.NoSuchElementException;

final class jmu extends jqy
{

    boolean a;
    final Object b;

    jmu(Object obj)
    {
        b = obj;
        super();
    }

    public boolean hasNext()
    {
        return !a;
    }

    public Object next()
    {
        if (a)
        {
            throw new NoSuchElementException();
        } else
        {
            a = true;
            return b;
        }
    }
}
