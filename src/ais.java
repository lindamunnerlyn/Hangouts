// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public final class ais
    implements Serializable
{

    private static final long serialVersionUID = 2L;
    private final daf a;
    private String b;
    private final String c;
    private String d;
    private List e;
    private List f;
    private String g;

    public ais(ait ait1)
    {
        gbh.b(ait1.a);
        a = ait1.a;
        b = ait1.b;
        c = ait1.c;
        d = ait1.d;
    }

    public static ais a(daf daf1, String s, String s1)
    {
        ait ait1 = newBuilder();
        ait1.a(daf1);
        ait1.a(s);
        ait1.c(s1);
        return ait1.a();
    }

    public static ait newBuilder()
    {
        return new ait();
    }

    public void a(String s)
    {
        g = s;
    }

    public boolean a()
    {
        return a != null;
    }

    public daf b()
    {
        return a;
    }

    public void b(String s)
    {
        if (f == null)
        {
            f = new ArrayList();
        }
        f.add(s);
    }

    public void c(String s)
    {
        if (e == null)
        {
            e = new ArrayList();
        }
        e.add(s);
    }

    public boolean c()
    {
        return !TextUtils.isEmpty(b);
    }

    public Object clone()
    {
        ait ait1 = new ait();
        ait1.a(a);
        ait1.a(b);
        ait1.b(c);
        ait1.c(d);
        return ait1.a();
    }

    public String d()
    {
        return b;
    }

    public boolean e()
    {
        return !TextUtils.isEmpty(c);
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof ais))
        {
            return false;
        } else
        {
            obj = (ais)obj;
            return a.equals(((ais) (obj)).a);
        }
    }

    public String f()
    {
        return c;
    }

    public String g()
    {
        return d;
    }

    public ceu h()
    {
        if (a.a())
        {
            String s = a.d;
            String s1 = g.p();
            boolean flag;
            if (!TextUtils.isEmpty(b))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            return g.a(s, s1, flag, d, b, 0);
        } else
        {
            return g.a(a.b(), b, b, a.e, d, null);
        }
    }

    public int hashCode()
    {
        return a.hashCode();
    }

    public String i()
    {
        String s = String.valueOf(b());
        String s1 = d();
        String s2 = f();
        String s3 = g();
        return (new StringBuilder(String.valueOf(s).length() + 12 + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length())).append("[Person] ").append(s).append(" ").append(s1).append(" ").append(s2).append(" ").append(s3).toString();
    }

    public List j()
    {
        return f;
    }

    public List k()
    {
        return e;
    }

    public String l()
    {
        return g;
    }

    public String toString()
    {
        String s = String.valueOf(ebw.b(b));
        String s1 = String.valueOf(a);
        String s2 = String.valueOf(ebw.b(c));
        return (new StringBuilder(String.valueOf(s).length() + 39 + String.valueOf(s1).length() + String.valueOf(s2).length())).append("Person {name: ").append(s).append(" | inviteeId: ").append(s1).append(" | email: ").append(s2).append("}").toString();
    }
}
