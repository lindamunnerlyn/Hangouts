// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

final class gub
{

    private static final int d[] = {
        0, 1, 2, 3, 4
    };
    private final int a;
    private final Map b = new HashMap();
    private int c;

    gub(int i)
    {
        c = 0;
        a = i;
    }

    protected static int[] a()
    {
        return d;
    }

    protected gua a(gua gua1)
    {
        gua1.b(a);
        return (gua)b.put(Short.valueOf(gua1.b()), gua1);
    }

    protected gua a(short word0)
    {
        return (gua)b.get(Short.valueOf(word0));
    }

    protected void a(int i)
    {
        c = i;
    }

    protected void b(short word0)
    {
        b.remove(Short.valueOf(word0));
    }

    protected gua[] b()
    {
        return (gua[])b.values().toArray(new gua[b.size()]);
    }

    protected int c()
    {
        return a;
    }

    protected int d()
    {
        return b.size();
    }

    protected int e()
    {
        return c;
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null)
        {
            return false;
        }
        if (obj instanceof gub)
        {
            obj = (gub)obj;
            if (((gub) (obj)).c() == a && ((gub) (obj)).d() == d())
            {
                obj = ((gub) (obj)).b();
                int j = obj.length;
                for (int i = 0; i < j; i++)
                {
                    gua gua1 = obj[i];
                    if (!gtp.a(gua1.b()) && !gua1.equals((gua)b.get(Short.valueOf(gua1.b()))))
                    {
                        return false;
                    }
                }

                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        return (a + 527) * 31 + b.hashCode();
    }

}
