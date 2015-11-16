// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class llp
    implements Iterable
{

    public final List a = new ArrayList();
    int b;
    boolean c;
    private int d;

    public llp()
    {
        b = 0;
        d = 0;
        c = false;
    }

    static Object a(llp llp1, int i)
    {
        return llp1.a.get(i);
    }

    public boolean a(Object obj)
    {
        if (obj == null || a.contains(obj))
        {
            return false;
        } else
        {
            a.add(obj);
            d = d + 1;
            return true;
        }
    }

    public boolean b(Object obj)
    {
        int i;
        if (obj != null)
        {
            if ((i = a.indexOf(obj)) != -1)
            {
                if (b == 0)
                {
                    a.remove(i);
                } else
                {
                    c = true;
                    a.set(i, null);
                }
                d = d - 1;
                return true;
            }
        }
        return false;
    }

    public Iterator iterator()
    {
        return new llq(this);
    }
}
