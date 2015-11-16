// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;

class jnh extends jmr
{

    private final String o;
    private final char p[];
    private final char q[];

    jnh(String s, char ac[], char ac1[])
    {
        o = s;
        p = ac;
        q = ac1;
        int i;
        boolean flag;
        if (ac.length == ac1.length)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        n.a(flag);
        i = 0;
        while (i < ac.length) 
        {
            if (ac[i] <= ac1[i])
            {
                flag = true;
            } else
            {
                flag = false;
            }
            n.a(flag);
            if (i + 1 < ac.length)
            {
                if (ac1[i] < ac[i + 1])
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                n.a(flag);
            }
            i++;
        }
    }

    public volatile boolean a(Object obj)
    {
        return super.a((Character)obj);
    }

    public boolean b(char c)
    {
        int i = Arrays.binarySearch(p, c);
        if (i < 0)
        {
            if ((i = ~i - 1) < 0 || c > q[i])
            {
                return false;
            }
        }
        return true;
    }

    public String toString()
    {
        return o;
    }
}
