// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.PrintWriter;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class gfd
{

    private static gfd a = new gfd();
    private final List b = new CopyOnWriteArrayList();
    private final gci c = new gfe(this);
    private gbs d;

    private gfd()
    {
    }

    public static gfd a()
    {
        gbh.b(a);
        gbh.a();
        return a;
    }

    static List a(gfd gfd1)
    {
        return gfd1.b;
    }

    public static void a(String s)
    {
        if (a.d != null)
        {
            a.d.d(s);
        }
    }

    public void a(char c1, int i, String s)
    {
        gbh.a();
        if (d != null)
        {
            d.a(c1, i, s);
        }
    }

    void a(gbs gbs1)
    {
        d = gbs1;
        if (d != null)
        {
            d.a(c);
        }
    }

    public void a(gci gci)
    {
        gbh.a();
        b.add(gci);
    }

    public void a(gho gho1)
    {
        gbh.a();
        if (d != null)
        {
            d.c(gho1.a());
        }
    }

    public void a(PrintWriter printwriter)
    {
        if (d != null)
        {
            d.a(printwriter);
        }
    }

    public void a(String s, String s1, boolean flag, boolean flag1, byte abyte0[])
    {
        gbh.a();
        if (d != null)
        {
            d.a(s, s1, false, flag, flag1, abyte0);
        }
    }

    public void a(byte abyte0[])
    {
        gbh.a();
        if (d != null)
        {
            d.a(abyte0);
        }
    }

    public void a(String as[], String as1[])
    {
        gbh.a();
        gbh.a();
        if (d != null)
        {
            d.a(false, as, as1, 1, true, false, null);
        }
    }

    public gcg b()
    {
        gbh.a();
        if (d == null)
        {
            return null;
        } else
        {
            return d.a();
        }
    }

}
