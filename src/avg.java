// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;

final class avg
{

    final bac a;
    final int b;

    avg(bac bac1, int i)
    {
        g.e(bac1);
        a = bac1;
        b = i;
    }

    String a()
    {
        return a.c().getName();
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj instanceof avg)
            {
                if (!((avg) (obj = (avg)obj)).a.equals(a) || ((avg) (obj)).b != b)
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            a, Integer.valueOf(b)
        });
    }
}
