// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.Account;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class aen
    implements aeq
{

    private static String a = "vCard";
    private final List b;
    private adu c;
    private final int d;
    private final Account e;
    private final List f;

    public aen()
    {
        this(0xc0000000, null);
    }

    public aen(int i)
    {
        this(i, null);
    }

    private aen(int i, Account account)
    {
        b = new ArrayList();
        f = new ArrayList();
        d = i;
        e = null;
    }

    public void a()
    {
        for (Iterator iterator = f.iterator(); iterator.hasNext(); ((aep)iterator.next()).a()) { }
    }

    public void a(aep aep1)
    {
        f.add(aep1);
    }

    public void a(aex aex)
    {
        c.a(aex);
    }

    public void b()
    {
        for (Iterator iterator = f.iterator(); iterator.hasNext(); ((aep)iterator.next()).b()) { }
    }

    public void c()
    {
        c = null;
        b.clear();
    }

    public void d()
    {
        c = new adu(d, e);
        b.add(c);
    }

    public void e()
    {
        c.a();
        for (Iterator iterator = f.iterator(); iterator.hasNext(); ((aep)iterator.next()).a(c)) { }
        int i = b.size();
        if (i > 1)
        {
            adu adu1 = (adu)b.get(i - 2);
            adu1.a(c);
            c = adu1;
        } else
        {
            c = null;
        }
        b.remove(i - 1);
    }

}
