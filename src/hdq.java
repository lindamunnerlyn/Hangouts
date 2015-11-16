// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public final class hdq
{

    private final gz a = new gz();
    private hdr b;
    private long c;
    private long d;
    private long e;
    private long f;

    public hdq()
    {
    }

    public void a()
    {
        d = System.currentTimeMillis();
    }

    public void a(hdu hdu1)
    {
        hdr hdr1 = b;
        hdr1.e = hdr1.e + hdu1.a();
        hdr1 = b;
        hdr1.f = hdr1.f + hdu1.b();
        hdr1 = b;
        hdr1.d = hdr1.d + (long)hdu1.e();
        b.i = hdu1.c();
        b.g = hdu1.f();
        b.h.a(hdu1.g());
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
        b = (hdr)a.get(s);
        if (b == null)
        {
            b = new hdr();
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
        for (Iterator iterator = a.values().iterator(); iterator.hasNext(); Collections.addAll(arraylist, ((hdr)iterator.next()).j)) { }
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
            hdr hdr1 = b;
            hdr1.c = hdr1.c + (System.currentTimeMillis() - e);
            e = 0L;
        }
        f = System.currentTimeMillis();
        hdr hdr2 = b;
        hdr2.b = hdr2.b + (System.currentTimeMillis() - c);
    }

    public long e()
    {
        Iterator iterator = (new ArrayList(a.keySet())).iterator();
        String s;
        long l;
        for (l = 0L; iterator.hasNext(); l = ((hdr)a.get(s)).e + l)
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
        for (l = 0L; iterator.hasNext(); l = ((hdr)a.get(s)).f + l)
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
