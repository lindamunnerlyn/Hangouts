// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.Iterator;
import java.util.List;

public final class ehv extends ay
{

    private final int a;
    private final int b = 2;
    private final Context c;
    private final List d;

    public ehv(ap ap, Context context, int i, List list)
    {
        super(ap);
        c = context;
        d = list;
        a = i;
    }

    public int a(ehu ehu1)
    {
        return d.indexOf(ehu1);
    }

    public int a(String s)
    {
        for (int i = d.size() - 1; i >= 0; i--)
        {
            if (((ehu)d.get(i)).d.equals(s))
            {
                return i;
            }
        }

        return -1;
    }

    public ad a(int i)
    {
        ehu ehu1 = d(i);
        return ad.instantiate(c, ehu1.e.getName());
    }

    public boolean a(Class class1)
    {
        for (Iterator iterator = d.iterator(); iterator.hasNext();)
        {
            if (class1.equals(((ehu)iterator.next()).e))
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
        ehu ehu1 = d(i);
        return c.getString(ehu1.a);
    }

    public ehu d(int i)
    {
        return (ehu)d.get(i);
    }
}
