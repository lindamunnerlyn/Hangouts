// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

final class gyn
{

    private static final int d[] = {
        0, 1, 2, 3, 4
    };
    private final int a;
    private final Map b = new HashMap();
    private int c;

    gyn(int i)
    {
        c = 0;
        a = i;
    }

    protected static int[] a()
    {
        return d;
    }

    protected gym a(gym gym1)
    {
        gym1.b(a);
        return (gym)b.put(Short.valueOf(gym1.b()), gym1);
    }

    protected gym a(short word0)
    {
        return (gym)b.get(Short.valueOf(word0));
    }

    protected void a(int i)
    {
        c = i;
    }

    protected void b(short word0)
    {
        b.remove(Short.valueOf(word0));
    }

    protected gym[] b()
    {
        return (gym[])b.values().toArray(new gym[b.size()]);
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
        if (obj instanceof gyn)
        {
            obj = (gyn)obj;
            if (((gyn) (obj)).c() == a && ((gyn) (obj)).d() == d())
            {
                obj = ((gyn) (obj)).b();
                int j = obj.length;
                for (int i = 0; i < j; i++)
                {
                    gym gym1 = obj[i];
                    if (!gyb.a(gym1.b()) && !gym1.equals((gym)b.get(Short.valueOf(gym1.b()))))
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
