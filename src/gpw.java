// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;

public final class gpw
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    private boolean a;
    private int b;
    private boolean c;
    private long d;
    private boolean e;
    private String f;
    private boolean g;
    private boolean h;
    private boolean i;
    private int j;
    private boolean k;
    private String l;
    private boolean m;
    private gpx n;
    private boolean o;
    private String p;

    public gpw()
    {
        b = 0;
        d = 0L;
        f = "";
        h = false;
        j = 1;
        l = "";
        p = "";
        n = gpx.a;
    }

    public int a()
    {
        return b;
    }

    public gpw a(int i1)
    {
        a = true;
        b = i1;
        return this;
    }

    public gpw a(long l1)
    {
        c = true;
        d = l1;
        return this;
    }

    public gpw a(gpw gpw1)
    {
        if (gpw1.a)
        {
            a(gpw1.a());
        }
        if (gpw1.c)
        {
            a(gpw1.b());
        }
        if (gpw1.c())
        {
            a(gpw1.d());
        }
        if (gpw1.g)
        {
            a(gpw1.f());
        }
        if (gpw1.i)
        {
            b(gpw1.g());
        }
        if (gpw1.h())
        {
            b(gpw1.i());
        }
        if (gpw1.m)
        {
            a(gpw1.k());
        }
        if (gpw1.o)
        {
            c(gpw1.p);
        }
        return this;
    }

    public gpw a(gpx gpx1)
    {
        if (gpx1 == null)
        {
            throw new NullPointerException();
        } else
        {
            m = true;
            n = gpx1;
            return this;
        }
    }

    public gpw a(String s)
    {
        if (s == null)
        {
            throw new NullPointerException();
        } else
        {
            e = true;
            f = s;
            return this;
        }
    }

    public gpw a(boolean flag)
    {
        g = true;
        h = flag;
        return this;
    }

    public long b()
    {
        return d;
    }

    public gpw b(int i1)
    {
        i = true;
        j = i1;
        return this;
    }

    public gpw b(String s)
    {
        if (s == null)
        {
            throw new NullPointerException();
        } else
        {
            k = true;
            l = s;
            return this;
        }
    }

    public boolean b(gpw gpw1)
    {
        if (gpw1 != null)
        {
            if (this == gpw1)
            {
                return true;
            }
            if (b == gpw1.b && d == gpw1.d && f.equals(gpw1.f) && h == gpw1.h && j == gpw1.j && l.equals(gpw1.l) && n == gpw1.n && p.equals(gpw1.p) && o == gpw1.o)
            {
                return true;
            }
        }
        return false;
    }

    public gpw c(String s)
    {
        if (s == null)
        {
            throw new NullPointerException();
        } else
        {
            o = true;
            p = s;
            return this;
        }
    }

    public boolean c()
    {
        return e;
    }

    public String d()
    {
        return f;
    }

    public gpw e()
    {
        e = false;
        f = "";
        return this;
    }

    public boolean equals(Object obj)
    {
        return (obj instanceof gpw) && b((gpw)obj);
    }

    public boolean f()
    {
        return h;
    }

    public int g()
    {
        return j;
    }

    public boolean h()
    {
        return k;
    }

    public int hashCode()
    {
        char c2 = '\u04CF';
        int i1 = a();
        int j1 = Long.valueOf(b()).hashCode();
        int k1 = d().hashCode();
        char c1;
        int l1;
        int i2;
        int j2;
        int k2;
        if (f())
        {
            c1 = '\u04CF';
        } else
        {
            c1 = '\u04D5';
        }
        l1 = g();
        i2 = i().hashCode();
        j2 = k().hashCode();
        k2 = p.hashCode();
        if (!o)
        {
            c2 = '\u04D5';
        }
        return (((((c1 + (((i1 + 2173) * 53 + j1) * 53 + k1) * 53) * 53 + l1) * 53 + i2) * 53 + j2) * 53 + k2) * 53 + c2;
    }

    public String i()
    {
        return l;
    }

    public gpw j()
    {
        k = false;
        l = "";
        return this;
    }

    public gpx k()
    {
        return n;
    }

    public gpw l()
    {
        m = false;
        n = gpx.a;
        return this;
    }

    public gpw m()
    {
        o = false;
        p = "";
        return this;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("Country Code: ").append(b);
        stringbuilder.append(" National Number: ").append(d);
        if (g && f())
        {
            stringbuilder.append(" Leading Zero(s): true");
        }
        if (i)
        {
            stringbuilder.append(" Number of leading zeros: ").append(j);
        }
        if (c())
        {
            stringbuilder.append(" Extension: ").append(f);
        }
        if (m)
        {
            stringbuilder.append(" Country Code Source: ").append(n);
        }
        if (o)
        {
            stringbuilder.append(" Preferred Domestic Carrier Code: ").append(p);
        }
        return stringbuilder.toString();
    }
}
