// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;

final class jxt extends jth
{

    final transient Object a;
    private transient int b;

    jxt(Object obj)
    {
        a = n.b(obj);
    }

    jxt(Object obj, int i)
    {
        a = obj;
        b = i;
    }

    boolean I_()
    {
        return b != 0;
    }

    int a(Object aobj[], int i)
    {
        aobj[i] = a;
        return i + 1;
    }

    public jyh a()
    {
        return jts.a(a);
    }

    public boolean contains(Object obj)
    {
        return a.equals(obj);
    }

    boolean e()
    {
        return false;
    }

    public final int hashCode()
    {
        int j = b;
        int i = j;
        if (j == 0)
        {
            i = a.hashCode();
            b = i;
        }
        return i;
    }

    public Iterator iterator()
    {
        return a();
    }

    public int size()
    {
        return 1;
    }

    public String toString()
    {
        String s = a.toString();
        return (new StringBuilder(s.length() + 2)).append('[').append(s).append(']').toString();
    }
}
