// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class ami
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

    public ami()
    {
        c = new ArrayList();
        k = new ArrayList();
        l = new ArrayList();
    }

    public ami a()
    {
        h = false;
        return this;
    }

    public ami a(ame ame)
    {
        c.add(ame);
        return this;
    }

    public ami a(String s)
    {
        a = s;
        return this;
    }

    public ami a(Collection collection)
    {
        if (collection != null)
        {
            c.addAll(collection);
        }
        return this;
    }

    public ami a(boolean flag)
    {
        f = flag;
        return this;
    }

    public amh b()
    {
        return new amh(a, b, c, d, e, f, g, h, i, j, k, l);
    }

    public ami b(String s)
    {
        b = s;
        return this;
    }

    public ami b(Collection collection)
    {
        k.addAll(collection);
        return this;
    }

    public ami b(boolean flag)
    {
        g = flag;
        return this;
    }

    public ami c(String s)
    {
        d = s;
        return this;
    }

    public ami c(Collection collection)
    {
        l.addAll(collection);
        return this;
    }

    public ami c(boolean flag)
    {
        j = flag;
        return this;
    }

    public ami d(String s)
    {
        e = s;
        return this;
    }

    public ami e(String s)
    {
        if (s != null)
        {
            k.add(new amd(s));
        }
        return this;
    }

    public ami f(String s)
    {
        if (s != null)
        {
            l.add(new aml(s));
        }
        return this;
    }
}
