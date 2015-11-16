// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.io.Serializable;

public final class eby
    implements Serializable
{

    private static gkv a;
    private static final long serialVersionUID = 1L;
    private final String b;
    private final glq c;
    private final boolean d;
    private Boolean e;
    private String f;
    private Long g;
    private String h;

    public eby(String s, String s1)
    {
        this(s, s1, false);
    }

    eby(String s, String s1, boolean flag)
    {
        int i;
        c = a.a(s, s1);
        b = s1;
        d = flag;
        s1 = null;
        i = 0;
_L5:
        if (i >= s.length()) goto _L2; else goto _L1
_L1:
        char c1 = s.charAt(i);
        if (!Character.isLetter(c1)) goto _L4; else goto _L3
_L3:
        Object obj;
        obj = s1;
        if (s1 == null)
        {
            obj = new StringBuilder();
        }
        ((StringBuilder) (obj)).append(c1);
_L6:
        i++;
        s1 = ((String) (obj));
          goto _L5
_L4:
        obj = s1;
        if (!Character.isDigit(c1)) goto _L6; else goto _L2
_L2:
        if (s1 != null)
        {
            h = s1.toString();
        }
        return;
    }

    public static void a()
    {
        a = gkv.b();
    }

    public gle a(eby eby1)
    {
        boolean flag;
        if (h == null)
        {
            if (eby1.h == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        {
            flag = h.equalsIgnoreCase(eby1.h);
        }
        if (!flag)
        {
            return gle.b;
        } else
        {
            return a.a(c, eby1.c);
        }
    }

    public String a(int i)
    {
        return a.a(c, i);
    }

    public boolean a(String s)
    {
        return TextUtils.equals(b, s);
    }

    public int b(String s)
    {
        String s1 = g();
        if (s1 != null)
        {
            s = s1;
        }
        return a.e(s);
    }

    public boolean b()
    {
        return d;
    }

    public boolean c()
    {
        return glv.a().a(Long.toString(c.b()), (String)jhb.c(b).a(ebz.j()));
    }

    public glq d()
    {
        return c;
    }

    public boolean e()
    {
        if (e == null)
        {
            e = Boolean.valueOf(a.b(c));
        }
        return g.a(e, false);
    }

    public long f()
    {
        if (g == null)
        {
            g = Long.valueOf(c.b());
        }
        return g.a(g, 0L);
    }

    public String g()
    {
        if (f == null)
        {
            f = a.c(c);
        }
        return f;
    }
}
