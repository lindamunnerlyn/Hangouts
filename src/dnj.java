// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.security.MessageDigest;
import java.util.Iterator;

public final class dnj
    implements fqo
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

    public dnj(fqo fqo1)
    {
        String s;
        a = fqo1.a();
        b = fqo1.j();
        c = fqo1.b();
        d = fqo1.c();
        e = fqo1.d();
        f = fqo1.e();
        g = fqo1.f();
        h = fqo1.g();
        s = null;
        String s1 = fqo1.h();
        s = s1;
_L2:
        i = s;
        j = fqo1.i();
        return;
        NullPointerException nullpointerexception;
        nullpointerexception;
        ebw.d("Babel", "Caught NPE in getAvatarUrl", nullpointerexception);
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
        int k = 0;
        a(messagedigest, a());
        a(messagedigest, j());
        for (Iterator iterator = c.iterator(); iterator.hasNext(); messagedigest.update(dni.a(g.a((Long)iterator.next(), 0L)))) { }
        fqt fqt1;
        for (Iterator iterator1 = c().iterator(); iterator1.hasNext(); a(messagedigest, fqt1.b()))
        {
            fqt1 = (fqt)iterator1.next();
            a(messagedigest, fqt1.a());
        }

        fqz fqz1;
        for (Iterator iterator2 = d().iterator(); iterator2.hasNext(); a(messagedigest, fqz1.b()))
        {
            fqz1 = (fqz)iterator2.next();
            a(messagedigest, fqz1.a());
        }

        a(messagedigest, f);
        byte byte0;
        String as[];
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
        for (int l = as.length; k < l; k++)
        {
            a(messagedigest, as[k]);
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
