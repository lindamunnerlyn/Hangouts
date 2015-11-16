// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public final class daf
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    public final String a;
    public final String b;
    public final String c;
    public String d;
    public final String e;
    private List f;

    public daf(ius ius1)
    {
        a = ius1.a;
        b = ius1.c;
        c = ius1.b;
        e = null;
    }

    private daf(String s, String s1, String s2, String s3, String s4)
    {
        a = s;
        b = s1;
        c = s2;
        d = s3;
        e = s4;
        f = null;
    }

    public static daf a(ceu ceu1)
    {
        String s = ceu1.f();
        if (ceu1.b != null)
        {
            return a(ceu1.b, s, ceu1.g);
        }
        if (s != null)
        {
            return new daf(null, null, null, s, ceu1.g);
        } else
        {
            return null;
        }
    }

    public static daf a(cey cey1, String s, String s1)
    {
        return new daf(cey1.a, cey1.b, null, s, s1);
    }

    public static daf a(String s)
    {
        return new daf(null, g.n(s), null, s, null);
    }

    public static daf a(String s, String s1)
    {
        return new daf(s, null, null, null, s1);
    }

    public static daf b(String s, String s1)
    {
        return new daf(null, null, s, null, s1);
    }

    public void a(dac dac1)
    {
        f = new ArrayList();
        f.add(dac1);
    }

    public boolean a()
    {
        return d != null && b != null && b.equals(g.n(d));
    }

    public cey b()
    {
        return g.a(a, b, d);
    }

    public List c()
    {
        return f;
    }

    public ius d()
    {
        ius ius1 = new ius();
        if (a == null) goto _L2; else goto _L1
_L1:
        ius1.a = a;
_L4:
        ius1.e = e;
        ius1.f = dac.a(f);
        return ius1;
_L2:
        if (c != null)
        {
            ius1.b = c;
        } else
        if (d != null)
        {
            ius1.d = new jtj();
            ius1.d.a = ebz.k(d);
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
            if (obj instanceof daf)
            {
                obj = (daf)obj;
                flag = flag1;
                if (obj instanceof daf)
                {
                    obj = (daf)obj;
                    if (b != null && ((daf) (obj)).b != null)
                    {
                        flag = b.equals(((daf) (obj)).b);
                    } else
                    {
                        if (a != null && ((daf) (obj)).a != null)
                        {
                            return a.equals(((daf) (obj)).a);
                        }
                        if (c != null && ((daf) (obj)).c != null)
                        {
                            return c.equals(((daf) (obj)).c);
                        }
                        flag = flag1;
                        if (d != null)
                        {
                            flag = flag1;
                            if (((daf) (obj)).d != null)
                            {
                                return d.equals(((daf) (obj)).d);
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
        String s = String.valueOf(ebw.b(b));
        String s1 = String.valueOf(ebw.b(a));
        String s2 = String.valueOf(ebw.b(c));
        String s3 = String.valueOf(ebw.b(d));
        return (new StringBuilder(String.valueOf(s).length() + 60 + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length())).append("InviteeId {chatId: ").append(s).append(" | gaiaId: ").append(s1).append(" | circleId: ").append(s2).append(" | phoneNumber: ").append(s3).append("}").toString();
    }
}
