// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Comparator;

final class jtn extends jxd
    implements jxu
{

    jtn(jto jto1, jsh jsh)
    {
        super(jto1, jsh);
    }

    jsd b()
    {
        return (jto)super.b();
    }

    jsh b(int i, int j)
    {
        return (new jxm(super.b(i, j), comparator())).f();
    }

    public Comparator comparator()
    {
        return ((jto)super.b()).comparator();
    }

    public boolean contains(Object obj)
    {
        return indexOf(obj) >= 0;
    }

    public int indexOf(Object obj)
    {
        int i = ((jto)super.b()).a(obj);
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
