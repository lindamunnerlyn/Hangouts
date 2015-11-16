// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Comparator;

final class jmm extends jpr
    implements jqm
{

    jmm(jmn jmn1, jlk jlk)
    {
        super(jmn1, jlk);
    }

    jlk b(int i, int j)
    {
        return (new jqe(super.b(i, j), comparator())).b();
    }

    jle c()
    {
        return (jmn)super.c();
    }

    public Comparator comparator()
    {
        return ((jmn)super.c()).comparator();
    }

    public boolean contains(Object obj)
    {
        return indexOf(obj) >= 0;
    }

    public int indexOf(Object obj)
    {
        int i = ((jmn)super.c()).a(obj);
        if (i >= 0 && get(i).equals(obj))
        {
            return i;
        } else
        {
            return -1;
        }
    }

    public int lastIndexOf(Object obj)
    {
        return indexOf(obj);
    }
}
