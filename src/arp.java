// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class arp extends yz
{

    List c;
    int d;
    private final Context e;

    public arp(Context context)
    {
        this(context, (byte)0);
    }

    private arp(Context context, byte byte0)
    {
        d = 0;
        e = context;
        c = new ArrayList(2);
        a(true);
    }

    public int a()
    {
        return d;
    }

    public int a(int i)
    {
        for (Iterator iterator = c.iterator(); iterator.hasNext();)
        {
            arq arq1 = (arq)iterator.next();
            int j = arq1.c();
            if (i < j)
            {
                return arq1.a(i);
            }
            i -= j;
        }

        throw new ArrayIndexOutOfBoundsException(i);
    }

    public arq a(int i, arq arq1)
    {
        arq arq2;
        if (c.contains(arq1))
        {
            arq2 = null;
        } else
        {
            c.add(i, arq1);
            int j = arq1.c();
            arq2 = arq1;
            if (j > 0)
            {
                i = d(i);
                d = d + j;
                b(i, j);
                return arq1;
            }
        }
        return arq2;
    }

    public arq a(arq arq1)
    {
        return a(c.size(), arq1);
    }

    public void a(zs zs, int i)
    {
        for (Iterator iterator = c.iterator(); iterator.hasNext();)
        {
            arq arq1 = (arq)iterator.next();
            int j = arq1.c();
            if (i < j)
            {
                arq1.a(zs, i);
                return;
            }
            i -= j;
        }

        throw new ArrayIndexOutOfBoundsException(i);
    }

    public long b(int i)
    {
        return (long)i;
    }

    public Context b()
    {
        return e;
    }

    public int c()
    {
        return c.size();
    }

    public arq c(int i)
    {
        return (arq)c.get(i);
    }

    public int d(int i)
    {
        int j = 0;
        int k = 0;
        for (; j < i; j++)
        {
            k += ((arq)c.get(j)).c();
        }

        return k;
    }
}
