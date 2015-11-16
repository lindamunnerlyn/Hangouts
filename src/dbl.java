// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public final class dbl
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    public final String a;
    public final String b;
    public final String c;
    public String d;
    public final String e;
    private List f;

    private dbl(String s, String s1, String s2, String s3, String s4)
    {
        a = s;
        b = s1;
        c = s2;
        d = s3;
        e = s4;
        f = null;
    }

    public dbl(jax jax1)
    {
        a = jax1.a;
        b = jax1.c;
        c = jax1.b;
        e = null;
    }

    public static dbl a(cfz cfz1)
    {
        String s = cfz1.f();
        if (cfz1.b != null)
        {
            return a(cfz1.b, s, cfz1.g);
        }
        if (s != null)
        {
            return new dbl(null, null, null, s, cfz1.g);
        } else
        {
            return null;
        }
    }

    public static dbl a(cgd cgd1, String s, String s1)
    {
        return new dbl(cgd1.a, cgd1.b, null, s, s1);
    }

    public static dbl a(String s)
    {
        return new dbl(null, g.n(s), null, s, null);
    }

    public static dbl a(String s, String s1)
    {
        return new dbl(s, null, null, null, s1);
    }

    public static dbl b(String s, String s1)
    {
        return new dbl(null, null, s, null, s1);
    }

    public void a(dbi dbi1)
    {
        f = new ArrayList();
        f.add(dbi1);
    }

    public boolean a()
    {
        return d != null && b != null && b.equals(g.n(d));
    }

    public cgd b()
    {
        return g.a(a, b, d);
    }

    public List c()
    {
        return f;
    }

    public jax d()
    {
        jax jax1 = new jax();
        if (a == null) goto _L2; else goto _L1
_L1:
        jax1.a = a;
_L4:
        jax1.e = e;
        jax1.f = dbi.a(f);
        return jax1;
_L2:
        if (c != null)
        {
            jax1.b = c;
        } else
        if (d != null)
        {
            jax1.d = new kbm();
            jax1.d.a = eey.k(d);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj != null)
        {
            flag = flag1;
            if (obj instanceof dbl)
            {
                obj = (dbl)obj;
                flag = flag1;
                if (obj instanceof dbl)
                {
                    obj = (dbl)obj;
                    if (b != null && ((dbl) (obj)).b != null)
                    {
                        flag = b.equals(((dbl) (obj)).b);
                    } else
                    {
                        if (a != null && ((dbl) (obj)).a != null)
                        {
                            return a.equals(((dbl) (obj)).a);
                        }
                        if (c != null && ((dbl) (obj)).c != null)
                        {
                            return c.equals(((dbl) (obj)).c);
                        }
                        flag = flag1;
                        if (d != null)
                        {
                            flag = flag1;
                            if (((dbl) (obj)).d != null)
                            {
                                return d.equals(((dbl) (obj)).d);
                            }
                        }
                    }
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return 0;
    }

    public String toString()
    {
        String s = String.valueOf(eev.b(b));
        String s1 = String.valueOf(eev.b(a));
        String s2 = String.valueOf(eev.b(c));
        String s3 = String.valueOf(eev.b(d));
        return (new StringBuilder(String.valueOf(s).length() + 60 + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length())).append("InviteeId {chatId: ").append(s).append(" | gaiaId: ").append(s1).append(" | circleId: ").append(s2).append(" | phoneNumber: ").append(s3).append("}").toString();
    }
}
