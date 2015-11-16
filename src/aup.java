// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;

final class aup
{

    final azn a;
    final int b;

    aup(azn azn1, int i)
    {
        g.d(azn1);
        a = azn1;
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
            if (obj instanceof aup)
            {
                if (!((aup) (obj = (aup)obj)).a.equals(a) || ((aup) (obj)).b != b)
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
