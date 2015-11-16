// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;

public final class glq
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
    private glr n;
    private boolean o;
    private String p;

    public glq()
    {
        b = 0;
        d = 0L;
        f = "";
        h = false;
        j = 1;
        l = "";
        p = "";
        n = glr.a;
    }

    public int a()
    {
        return b;
    }

    public glq a(int i1)
    {
        a = true;
        b = i1;
        return this;
    }

    public glq a(long l1)
    {
        c = true;
        d = l1;
        return this;
    }

    public glq a(glq glq1)
    {
        if (glq1.a)
        {
            a(glq1.a());
        }
        if (glq1.c)
        {
            a(glq1.b());
        }
        if (glq1.c())
        {
            a(glq1.d());
        }
        if (glq1.g)
        {
            a(glq1.f());
        }
        if (glq1.i)
        {
            b(glq1.g());
        }
        if (glq1.h())
        {
            b(glq1.i());
        }
        if (glq1.m)
        {
            a(glq1.k());
        }
        if (glq1.o)
        {
            c(glq1.p);
        }
        return this;
    }

    public glq a(glr glr1)
    {
        if (glr1 == null)
        {
            throw new NullPointerException();
        } else
        {
            m = true;
            n = glr1;
            return this;
        }
    }

    public glq a(String s)
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

    public glq a(boolean flag)
    {
        g = true;
        h = flag;
        return this;
    }

    public long b()
    {
        return d;
    }

    public glq b(int i1)
    {
        i = true;
        j = i1;
        return this;
    }

    public glq b(String s)
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

    public boolean b(glq glq1)
    {
        if (glq1 != null)
        {
            if (this == glq1)
            {
                return true;
            }
            if (b == glq1.b && d == glq1.d && f.equals(glq1.f) && h == glq1.h && j == glq1.j && l.equals(glq1.l) && n == glq1.n && p.equals(glq1.p) && o == glq1.o)
            {
                return true;
            }
        }
        return false;
    }

    public glq c(String s)
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

    public glq e()
    {
        e = false;
        f = "";
        return this;
    }

    public boolean equals(Object obj)
    {
        return (obj instanceof glq) && b((glq)obj);
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

    public glq j()
    {
        k = false;
        l = "";
        return this;
    }

    public glr k()
    {
        return n;
    }

    public glq l()
    {
        m = false;
        n = glr.a;
        return this;
    }

    public glq m()
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
