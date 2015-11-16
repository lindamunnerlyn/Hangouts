// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.Account;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ael
    implements aeo
{

    private static String a = "vCard";
    private final List b;
    private ads c;
    private final int d;
    private final Account e;
    private final List f;

    public ael()
    {
        this(0xc0000000, null);
    }

    public ael(int i)
    {
        this(i, null);
    }

    private ael(int i, Account account)
    {
        b = new ArrayList();
        f = new ArrayList();
        d = i;
        e = null;
    }

    public void a()
    {
        for (Iterator iterator = f.iterator(); iterator.hasNext(); ((aen)iterator.next()).a()) { }
    }

    public void a(aen aen1)
    {
        f.add(aen1);
    }

    public void a(aev aev)
    {
        c.a(aev);
    }

    public void b()
    {
        for (Iterator iterator = f.iterator(); iterator.hasNext(); ((aen)iterator.next()).b()) { }
    }

    public void c()
    {
        c = null;
        b.clear();
    }

    public void d()
    {
        c = new ads(d, e);
        b.add(c);
    }

    public void e()
    {
        c.a();
        for (Iterator iterator = f.iterator(); iterator.hasNext(); ((aen)iterator.next()).a(c)) { }
        int i = b.size();
        if (i > 1)
        {
            ads ads1 = (ads)b.get(i - 2);
            ads1.a(c);
            c = ads1;
        } else
        {
            c = null;
        }
        b.remove(i - 1);
    }

}
