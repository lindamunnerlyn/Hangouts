// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.Iterator;
import java.util.List;

public final class eet extends ay
{

    private final int a;
    private final int b = 2;
    private final Context c;
    private final List d;

    public eet(ap ap, Context context, int i, List list)
    {
        super(ap);
        c = context;
        d = list;
        a = i;
    }

    public int a(ees ees1)
    {
        return d.indexOf(ees1);
    }

    public int a(String s)
    {
        for (int i = d.size() - 1; i >= 0; i--)
        {
            if (((ees)d.get(i)).d.equals(s))
            {
                return i;
            }
        }

        return -1;
    }

    public ad a(int i)
    {
        ees ees1 = d(i);
        return ad.instantiate(c, ees1.e.getName());
    }

    public boolean a(Class class1)
    {
        for (Iterator iterator = d.iterator(); iterator.hasNext();)
        {
            if (class1.equals(((ees)iterator.next()).e))
            {
                return true;
            }
        }

        return false;
    }

    public int b()
    {
        return d.size();
    }

    public long b(int i)
    {
        return (long)(a * b + i);
    }

    public CharSequence c(int i)
    {
        ees ees1 = d(i);
        return c.getString(ees1.a);
    }

    public ees d(int i)
    {
        return (ees)d.get(i);
    }
}
