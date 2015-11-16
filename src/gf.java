// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Locale;

public final class gf
{

    private static gp a;
    private static final String b = Character.toString('\u200E');
    private static final String c = Character.toString('\u200F');
    private static final gf d;
    private static final gf e;
    private final boolean f;
    private final int g;
    private final gp h;

    gf(boolean flag, int i, gp gp1)
    {
        f = flag;
        g = i;
        h = gp1;
    }

    public static gf a()
    {
        return (new gg()).a();
    }

    static boolean a(Locale locale)
    {
        return gw.a(locale) == 1;
    }

    private static int b(String s)
    {
        return (new gh(s)).b();
    }

    static gp b()
    {
        return a;
    }

    private static int c(String s)
    {
        return (new gh(s)).a();
    }

    static gf c()
    {
        return e;
    }

    static gf d()
    {
        return d;
    }

    public String a(String s, gp gp1)
    {
        if (s == null)
        {
            return null;
        }
        boolean flag1 = gp1.a(s, s.length());
        StringBuilder stringbuilder = new StringBuilder();
        boolean flag;
        if ((g & 2) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            boolean flag2;
            if (flag1)
            {
                gp1 = gq.b;
            } else
            {
                gp1 = gq.a;
            }
            flag2 = gp1.a(s, s.length());
            if (!f && (flag2 || c(s) == 1))
            {
                gp1 = b;
            } else
            if (f && (!flag2 || c(s) == -1))
            {
                gp1 = c;
            } else
            {
                gp1 = "";
            }
            stringbuilder.append(gp1);
        }
        if (flag1 != f)
        {
            char c1;
            if (flag1)
            {
                c1 = '\u202B';
            } else
            {
                c1 = '\u202A';
            }
            stringbuilder.append(c1);
            stringbuilder.append(s);
            stringbuilder.append('\u202C');
        } else
        {
            stringbuilder.append(s);
        }
        if (flag1)
        {
            gp1 = gq.b;
        } else
        {
            gp1 = gq.a;
        }
        flag1 = gp1.a(s, s.length());
        if (!f && (flag1 || b(s) == 1))
        {
            s = b;
        } else
        if (f && (!flag1 || b(s) == -1))
        {
            s = c;
        } else
        {
            s = "";
        }
        stringbuilder.append(s);
        return stringbuilder.toString();
    }

    public boolean a(String s)
    {
        return h.a(s, s.length());
    }

    static 
    {
        a = gq.c;
        d = new gf(false, 2, a);
        e = new gf(true, 2, a);
    }
}
