// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class ana
{

    private String a;
    private String b;
    private List c;
    private String d;
    private String e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private ArrayList k;
    private ArrayList l;

    public ana()
    {
        c = new ArrayList();
        k = new ArrayList();
        l = new ArrayList();
    }

    public ana a()
    {
        h = false;
        return this;
    }

    public ana a(amw amw)
    {
        c.add(amw);
        return this;
    }

    public ana a(String s)
    {
        a = s;
        return this;
    }

    public ana a(Collection collection)
    {
        if (collection != null)
        {
            c.addAll(collection);
        }
        return this;
    }

    public ana a(boolean flag)
    {
        f = flag;
        return this;
    }

    public amz b()
    {
        return new amz(a, b, c, d, e, f, g, h, i, j, k, l);
    }

    public ana b(String s)
    {
        b = s;
        return this;
    }

    public ana b(Collection collection)
    {
        k.addAll(collection);
        return this;
    }

    public ana b(boolean flag)
    {
        g = flag;
        return this;
    }

    public ana c(String s)
    {
        d = s;
        return this;
    }

    public ana c(Collection collection)
    {
        l.addAll(collection);
        return this;
    }

    public ana c(boolean flag)
    {
        j = flag;
        return this;
    }

    public ana d(String s)
    {
        e = s;
        return this;
    }

    public ana e(String s)
    {
        if (s != null)
        {
            k.add(new amv(s));
        }
        return this;
    }

    public ana f(String s)
    {
        if (s != null)
        {
            l.add(new and(s));
        }
        return this;
    }
}
