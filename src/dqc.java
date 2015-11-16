// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.security.MessageDigest;
import java.util.Iterator;

public final class dqc
    implements fth
{

    private final String a;
    private final String b;
    private final Iterable c;
    private final Iterable d;
    private final Iterable e;
    private final String f;
    private final boolean g;
    private final String h;
    private final String i;
    private final String j[];

    public dqc(fth fth1)
    {
        String s;
        a = fth1.a();
        b = fth1.j();
        c = fth1.b();
        d = fth1.c();
        e = fth1.d();
        f = fth1.e();
        g = fth1.f();
        h = fth1.g();
        s = null;
        String s1 = fth1.h();
        s = s1;
_L2:
        i = s;
        j = fth1.i();
        return;
        NullPointerException nullpointerexception;
        nullpointerexception;
        eev.d("Babel", "Caught NPE in getAvatarUrl", nullpointerexception);
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static void a(MessageDigest messagedigest, String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            messagedigest.update(s.getBytes());
        }
    }

    public String a()
    {
        return a;
    }

    public void a(MessageDigest messagedigest)
    {
        boolean flag = false;
        a(messagedigest, a());
        a(messagedigest, j());
        byte abyte0[];
        for (Iterator iterator = c.iterator(); iterator.hasNext(); messagedigest.update(abyte0))
        {
            long l1 = g.a((Long)iterator.next(), 0L);
            abyte0 = new byte[8];
            for (int k = 7; k >= 0; k--)
            {
                abyte0[k] = (byte)(int)(255L & l1);
                l1 >>= 8;
            }

        }

        ftk ftk1;
        for (Iterator iterator1 = c().iterator(); iterator1.hasNext(); a(messagedigest, ftk1.b()))
        {
            ftk1 = (ftk)iterator1.next();
            a(messagedigest, ftk1.a());
        }

        ftq ftq1;
        for (Iterator iterator2 = d().iterator(); iterator2.hasNext(); a(messagedigest, ftq1.b()))
        {
            ftq1 = (ftq)iterator2.next();
            a(messagedigest, ftq1.a());
        }

        a(messagedigest, f);
        byte byte0;
        String as[];
        int i1;
        if (g)
        {
            byte0 = 1;
        } else
        {
            byte0 = 0;
        }
        messagedigest.update(byte0);
        a(messagedigest, h);
        a(messagedigest, i);
        as = j;
        i1 = as.length;
        for (int l = ((flag) ? 1 : 0); l < i1; l++)
        {
            a(messagedigest, as[l]);
        }

    }

    public Iterable b()
    {
        return c;
    }

    public Iterable c()
    {
        return d;
    }

    public Iterable d()
    {
        return e;
    }

    public String e()
    {
        return f;
    }

    public boolean f()
    {
        return g;
    }

    public String g()
    {
        return h;
    }

    public String h()
    {
        return i;
    }

    public String[] i()
    {
        return j;
    }

    public String j()
    {
        return b;
    }
}
