// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class aqy extends yx
{

    List c;
    int d;
    private final Context e;

    public aqy(Context context)
    {
        this(context, (byte)0);
    }

    private aqy(Context context, byte byte0)
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
            aqz aqz1 = (aqz)iterator.next();
            int j = aqz1.c();
            if (i < j)
            {
                return aqz1.a(i);
            }
            i -= j;
        }

        throw new ArrayIndexOutOfBoundsException(i);
    }

    public aqz a(int i, aqz aqz1)
    {
        aqz aqz2;
        if (c.contains(aqz1))
        {
            aqz2 = null;
        } else
        {
            c.add(i, aqz1);
            int j = aqz1.c();
            aqz2 = aqz1;
            if (j > 0)
            {
                i = d(i);
                d = d + j;
                b(i, j);
                return aqz1;
            }
        }
        return aqz2;
    }

    public aqz a(aqz aqz1)
    {
        return a(c.size(), aqz1);
    }

    public void a(zq zq, int i)
    {
        for (Iterator iterator = c.iterator(); iterator.hasNext();)
        {
            aqz aqz1 = (aqz)iterator.next();
            int j = aqz1.c();
            if (i < j)
            {
                aqz1.a(zq, i);
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

    public aqz c(int i)
    {
        return (aqz)c.get(i);
    }

    public int d(int i)
    {
        int j = 0;
        int k = 0;
        for (; j < i; j++)
        {
            k += ((aqz)c.get(j)).c();
        }

        return k;
    }
}
