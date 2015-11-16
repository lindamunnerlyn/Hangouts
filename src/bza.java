// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.SystemClock;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public final class bza
    implements gam
{

    private static final Set c = jmi.a(Integer.valueOf(2018), Integer.valueOf(2019), Integer.valueOf(1939), Integer.valueOf(1934), Integer.valueOf(2518), Integer.valueOf(2519), new Integer[] {
        Integer.valueOf(2232), Integer.valueOf(2233), Integer.valueOf(2678), Integer.valueOf(2697)
    });
    private final byz a;
    private final jfe b = new jfe();

    bza(byz byz1, int i)
    {
        a = byz1;
        Object obj = b;
        byz1 = byz1.c();
        if (((jfe) (obj)).e == null)
        {
            obj.e = new kuf();
        }
        bpd bpd1 = bnd.a().t();
        kuf kuf1 = ((jfe) (obj)).e;
        char c1;
        if (bpd1 != null && bpd1.k())
        {
            c1 = '\u0198';
        } else
        {
            c1 = '\u0197';
        }
        kuf1.b = Integer.valueOf(c1);
        ((jfe) (obj)).e.c = Integer.valueOf(2);
        obj = ((jfe) (obj)).e;
        if (g.L(byz1))
        {
            c1 = '\003';
        } else
        {
            c1 = '\002';
        }
        obj.a = Integer.valueOf(c1);
        if (b.a == null)
        {
            b.a = new jew();
        }
        b.a.j = new jex();
        b.a.j.a = Integer.valueOf(i);
    }

    private int e()
    {
        return g.a(b.a.j.a, 0);
    }

    public gam a()
    {
        g.w();
        jfe jfe1 = b;
        Object obj = bnd.a().t();
        if (obj != null)
        {
            if (jfe1.a == null)
            {
                jfe1.a = new jew();
            }
            if (jfe1.a.a == null)
            {
                jfe1.a.a = new jev();
            }
            ((bpd) (obj)).a(jfe1.a.a);
            obj = bnd.a().d();
            if (obj != null)
            {
                jfe1.a.a.d = ((gjr) (obj)).a();
            }
        }
        return this;
    }

    public gam a(int i)
    {
        if (b.a.j.c == null)
        {
            b.a.j.c = new jey();
        }
        if (b.a.j.c.d == null)
        {
            b.a.j.c.d = new jez();
        }
        b.a.j.c.d.a = Integer.valueOf(i);
        return this;
    }

    public gam a(Integer integer)
    {
        if (b.a.j.c == null)
        {
            b.a.j.c = new jey();
        }
        b.a.j.c.b = integer;
        return this;
    }

    public gam a(String s)
    {
        if (c.contains(Integer.valueOf(e())))
        {
            if (b.a.j.c == null)
            {
                b.a.j.c = new jey();
            }
            b.a.j.c.a = s;
            return this;
        } else
        {
            int i = e();
            gbh.a((new StringBuilder(63)).append("Impression ").append(i).append(" is not permitted to transmit extra data.").toString());
            return this;
        }
    }

    public gam a(jer jer)
    {
        b.a.j.d = jer;
        return this;
    }

    public gam a(jet jet)
    {
        b.a.j.e = jet;
        return this;
    }

    public gam a(jfb jfb)
    {
        b.a.j.g = jfb;
        return this;
    }

    public void a(TimeUnit timeunit)
    {
        if (((doh)hgx.a(a.c(), doh)).a(a.b(), e(), timeunit.toSeconds(1L)))
        {
            d();
        }
    }

    public gam b()
    {
        jfe jfe1 = b;
        long l = a.d();
        if (jfe1.a == null)
        {
            jfe1.a = new jew();
        }
        if (jfe1.a.k == null)
        {
            jfe1.a.k = new jeu();
        }
        jfe1.a.k.a = Long.valueOf(SystemClock.elapsedRealtime() - l);
        return this;
    }

    public gam b(String s)
    {
        if (b.a.a == null)
        {
            b.a.a = new jev();
        }
        b.a.a.i = s;
        return this;
    }

    public gam c()
    {
        String as[];
        if (a.b() != -1)
        {
            if ((as = dbq.M(a.b())).length != 0)
            {
                if (b.a == null)
                {
                    b.a = new jew();
                }
                if (b.a.k == null)
                {
                    b.a.k = new jeu();
                }
                b.a.k.b = as;
                return this;
            }
        }
        return this;
    }

    public gam c(String s)
    {
        if (b.a == null)
        {
            b.a = new jew();
        }
        if (b.a.a == null)
        {
            b.a.a = new jev();
        }
        b.a.a.h = s;
        return this;
    }

    public void d()
    {
        jex jex1;
        Context context;
        int i;
        jex1 = b.a.j;
        context = a.c();
        i = 0;
        context.getResources().getConfiguration().orientation;
        JVM INSTR tableswitch 1 2: default 52
    //                   1 120
    //                   2 125;
           goto _L1 _L2 _L3
_L1:
        if (i != 0)
        {
            if (jex1.c == null)
            {
                jex1.c = new jey();
            }
            jex1.c.c = Integer.valueOf(i);
        }
        a.a(b);
        if (ebw.a("RtcImpressions", 3))
        {
            ebw.c("RtcImpressions", b.toString());
        }
        return;
_L2:
        i = 1;
        continue; /* Loop/switch isn't completed */
_L3:
        i = 2;
        if (true) goto _L1; else goto _L4
_L4:
    }

}
