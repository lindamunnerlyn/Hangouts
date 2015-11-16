// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;
import java.util.ListIterator;

final class jkf extends jkd
    implements ListIterator
{

    final jke d;

    jkf(jke jke1)
    {
        d = jke1;
        super(jke1);
    }

    public jkf(jke jke1, int i)
    {
        d = jke1;
        super(jke1, jke1.g().listIterator(i));
    }

    public void add(Object obj)
    {
        boolean flag = d.isEmpty();
        ((ListIterator)b()).add(obj);
        jjt.c(d.g);
        if (flag)
        {
            d.d();
        }
    }

    public boolean hasPrevious()
    {
        return ((ListIterator)b()).hasPrevious();
    }

    public int nextIndex()
    {
        return ((ListIterator)b()).nextIndex();
    }

    public Object previous()
    {
        return ((ListIterator)b()).previous();
    }

    public int previousIndex()
    {
        return ((ListIterator)b()).previousIndex();
    }

    public void set(Object obj)
    {
        ((ListIterator)b()).set(obj);
    }
}
