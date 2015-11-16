// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ListIterator;

class jpr extends jkz
{

    private final jle b;
    private final jlk c;

    jpr(jle jle, jlk jlk1)
    {
        b = jle;
        c = jlk1;
    }

    jpr(jle jle, Object aobj[])
    {
        this(jle, jlk.b(aobj, aobj.length));
    }

    int a(Object aobj[], int i)
    {
        return c.a(aobj, i);
    }

    public jqz a(int i)
    {
        return c.a(i);
    }

    jle c()
    {
        return b;
    }

    public Object get(int i)
    {
        return c.get(i);
    }

    public ListIterator listIterator(int i)
    {
        return a(i);
    }
}
