// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.PrintWriter;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class gic
{

    private static gic a = new gic();
    private final List b = new CopyOnWriteArrayList();
    private final gew c = new gid(this);
    private geg d;

    private gic()
    {
    }

    public static gic a()
    {
        gdv.b("Expected non-null", a);
        gdv.a();
        return a;
    }

    static List a(gic gic1)
    {
        return gic1.b;
    }

    public static void b(String s)
    {
        if (a.d != null)
        {
            a.d.d(s);
        }
    }

    public void a(char c1, int i, String s)
    {
        gdv.a();
        if (d != null)
        {
            d.a(c1, i, s);
        }
    }

    void a(geg geg1)
    {
        d = geg1;
        if (geg1 != null)
        {
            geg1.a(c);
        }
    }

    public void a(gew gew)
    {
        gdv.a();
        b.add(gew);
    }

    public void a(PrintWriter printwriter)
    {
        if (d != null)
        {
            d.a(printwriter);
        }
    }

    public void a(String s)
    {
        gdv.a();
        if (d != null)
        {
            d.c(s);
        }
    }

    public void a(String s, String s1, boolean flag, boolean flag1, byte abyte0[])
    {
        gdv.a();
        if (d != null)
        {
            d.a(s, s1, false, flag, flag1, abyte0);
        }
    }

    public void a(byte abyte0[])
    {
        gdv.a();
        if (d != null)
        {
            d.a(abyte0);
        }
    }

    public void a(String as[], String as1[])
    {
        gdv.a();
        gdv.a();
        if (d != null)
        {
            d.a(false, as, as1, 1, true, false, null);
        }
    }

    public geu b()
    {
        gdv.a();
        if (d == null)
        {
            return null;
        } else
        {
            return d.a();
        }
    }

}
