// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public final class hih
{

    private final gz a = new gz();
    private hii b;
    private long c;
    private long d;
    private long e;
    private long f;

    public hih()
    {
    }

    public void a()
    {
        d = System.currentTimeMillis();
    }

    public void a(hil hil1)
    {
        hii hii1 = b;
        hii1.e = hii1.e + hil1.a();
        hii1 = b;
        hii1.f = hii1.f + hil1.b();
        hii1 = b;
        hii1.d = hii1.d + (long)hil1.e();
        b.i = hil1.c();
        b.g = hil1.f();
        b.h.a(hil1.g());
    }

    public void a(String s)
    {
        Object obj = new ArrayList(a.keySet());
        Collections.sort(((java.util.List) (obj)));
        String s1;
        for (obj = ((ArrayList) (obj)).iterator(); ((Iterator) (obj)).hasNext(); (new StringBuilder(String.valueOf(s).length() + 0 + String.valueOf(s1).length())).append(s).append(s1))
        {
            s1 = (String)((Iterator) (obj)).next();
            s1 = String.valueOf(a.get(s1));
        }

    }

    public void a(String s, String as[])
    {
        b = (hii)a.get(s);
        if (b == null)
        {
            b = new hii();
            b.a = s;
            b.j = as;
            a.put(s, b);
        }
        c = System.currentTimeMillis();
        e = 0L;
    }

    public String[] b()
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = a.values().iterator(); iterator.hasNext(); Collections.addAll(arraylist, ((hii)iterator.next()).j)) { }
        return (String[])arraylist.toArray(new String[arraylist.size()]);
    }

    public void c()
    {
        e = System.currentTimeMillis();
    }

    public void d()
    {
        if (e != 0L)
        {
            hii hii1 = b;
            hii1.c = hii1.c + (System.currentTimeMillis() - e);
            e = 0L;
        }
        f = System.currentTimeMillis();
        hii hii2 = b;
        hii2.b = hii2.b + (System.currentTimeMillis() - c);
    }

    public long e()
    {
        Iterator iterator = (new ArrayList(a.keySet())).iterator();
        String s;
        long l;
        for (l = 0L; iterator.hasNext(); l = ((hii)a.get(s)).e + l)
        {
            s = (String)iterator.next();
        }

        return l;
    }

    public long f()
    {
        return c;
    }

    public long g()
    {
        return f;
    }

    public long h()
    {
        return d;
    }

    public long i()
    {
        Iterator iterator = (new ArrayList(a.keySet())).iterator();
        String s;
        long l;
        for (l = 0L; iterator.hasNext(); l = ((hii)a.get(s)).f + l)
        {
            s = (String)iterator.next();
        }

        return l;
    }

    public long j()
    {
        return b.g;
    }

    public gz k()
    {
        return b.h;
    }
}
