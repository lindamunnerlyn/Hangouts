// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Comparator;

final class jrn extends jrm
{

    jrn()
    {
        super((byte)0);
    }

    private static jrm a(int i)
    {
        if (i < 0)
        {
            return jrm.b;
        }
        if (i > 0)
        {
            return jrm.c;
        } else
        {
            return jrm.a;
        }
    }

    public jrm a(Object obj, Object obj1, Comparator comparator)
    {
        return a(comparator.compare(obj, obj1));
    }

    public jrm a(boolean flag, boolean flag1)
    {
        return a(g.b(flag1, flag));
    }

    public int b()
    {
        return 0;
    }

    public jrm b(boolean flag, boolean flag1)
    {
        return a(g.b(flag, flag1));
    }
}
