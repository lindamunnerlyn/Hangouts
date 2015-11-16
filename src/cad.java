// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.SystemClock;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public final class cad
    implements gda
{

    private static final Set c;
    private final cac a;
    private final jlt b = new jlt();

    cad(cac cac1, int i)
    {
        a = cac1;
        Object obj = b;
        cac1 = cac1.c();
        if (((jlt) (obj)).e == null)
        {
            obj.e = new lcj();
        }
        bpm bpm1 = bnk.a().s();
        lcj lcj1 = ((jlt) (obj)).e;
        char c1;
        if (bpm1 != null && bpm1.j())
        {
            c1 = '\u0198';
        } else
        {
            c1 = '\u0197';
        }
        lcj1.b = Integer.valueOf(c1);
        ((jlt) (obj)).e.c = Integer.valueOf(2);
        obj = ((jlt) (obj)).e;
        if (g.L(cac1))
        {
            c1 = '\003';
        } else
        {
            c1 = '\002';
        }
        obj.a = Integer.valueOf(c1);
        if (b.a == null)
        {
            b.a = new jll();
        }
        b.a.j = new jlm();
        b.a.j.a = Integer.valueOf(i);
    }

    private int e()
    {
        return g.a(b.a.j.a, 0);
    }

    public gda a()
    {
        g.v();
        jlt jlt1 = b;
        Object obj = bnk.a().s();
        if (obj != null)
        {
            if (jlt1.a == null)
            {
                jlt1.a = new jll();
            }
            if (jlt1.a.a == null)
            {
                jlt1.a.a = new jlk();
            }
            ((bpm) (obj)).a(jlt1.a.a);
            obj = bnk.a().d();
            if (obj != null)
            {
                jlt1.a.a.d = ((gmt) (obj)).a();
            }
        }
        return this;
    }

    public gda a(int i)
    {
        if (b.a.j.c == null)
        {
            b.a.j.c = new jln();
        }
        if (b.a.j.c.d == null)
        {
            b.a.j.c.d = new jlo();
        }
        b.a.j.c.d.a = Integer.valueOf(i);
        return this;
    }

    public gda a(Integer integer)
    {
        if (b.a.j.c == null)
        {
            b.a.j.c = new jln();
        }
        b.a.j.c.b = integer;
        return this;
    }

    public gda a(String s)
    {
        if (c.contains(Integer.valueOf(e())))
        {
            if (b.a.j.c == null)
            {
                b.a.j.c = new jln();
            }
            b.a.j.c.a = s;
            return this;
        } else
        {
            int i = e();
            gdv.a((new StringBuilder(63)).append("Impression ").append(i).append(" is not permitted to transmit extra data.").toString());
            return this;
        }
    }

    public gda a(jlf jlf)
    {
        b.a.j.d = jlf;
        return this;
    }

    public gda a(jlg jlg)
    {
        b.a.j.f = jlg;
        return this;
    }

    public gda a(jlh jlh)
    {
        b.a.j.e = jlh;
        return this;
    }

    public gda a(jli jli)
    {
        b.a.j.h = jli;
        return this;
    }

    public gda a(jlq jlq)
    {
        b.a.j.g = jlq;
        return this;
    }

    public void a(TimeUnit timeunit)
    {
        if (((dra)hlp.a(a.c(), dra)).a(a.b(), e(), timeunit.toSeconds(1L)))
        {
            d();
        }
    }

    public gda b()
    {
        jlt jlt1 = b;
        long l = a.d();
        if (jlt1.a == null)
        {
            jlt1.a = new jll();
        }
        if (jlt1.a.k == null)
        {
            jlt1.a.k = new jlj();
        }
        jlt1.a.k.a = Long.valueOf(SystemClock.elapsedRealtime() - l);
        return this;
    }

    public gda b(String s)
    {
        if (b.a.a == null)
        {
            b.a.a = new jlk();
        }
        b.a.a.i = s;
        return this;
    }

    public gda c()
    {
        String as[];
        if (a.b() != -1)
        {
            if ((as = dcz.S(a.b())).length != 0)
            {
                if (b.a == null)
                {
                    b.a = new jll();
                }
                if (b.a.k == null)
                {
                    b.a.k = new jlj();
                }
                b.a.k.b = as;
                return this;
            }
        }
        return this;
    }

    public gda c(String s)
    {
        if (b.a.a == null)
        {
            b.a.a = new jlk();
        }
        b.a.a.j = s;
        return this;
    }

    public gda d(String s)
    {
        if (b.a == null)
        {
            b.a = new jll();
        }
        if (b.a.a == null)
        {
            b.a.a = new jlk();
        }
        b.a.a.h = s;
        return this;
    }

    public void d()
    {
        jlm jlm1;
        Context context;
        int i;
        jlm1 = b.a.j;
        context = a.c();
        i = 0;
        context.getResources().getConfiguration().orientation;
        JVM INSTR tableswitch 1 2: default 52
    //                   1 173
    //                   2 178;
           goto _L1 _L2 _L3
_L1:
        if (i != 0)
        {
            if (jlm1.c == null)
            {
                jlm1.c = new jln();
            }
            jlm1.c.c = Integer.valueOf(i);
        }
        a.a(b);
        if (eev.a("RtcImpressions", 3))
        {
            eev.c("RtcImpressions", b.toString());
            String s = String.valueOf(b.a.j.a);
            eev.c("RtcImpressions", (new StringBuilder(String.valueOf(s).length() + 6)).append("Type: ").append(s).toString());
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

    static 
    {
        Object aobj[] = new Object[10];
        aobj[0] = Integer.valueOf(2018);
        aobj[1] = Integer.valueOf(2019);
        aobj[2] = Integer.valueOf(1939);
        aobj[3] = Integer.valueOf(1934);
        aobj[4] = Integer.valueOf(2518);
        aobj[5] = Integer.valueOf(2519);
        System.arraycopy(new Integer[] {
            Integer.valueOf(2232), Integer.valueOf(2233), Integer.valueOf(2678), Integer.valueOf(2697)
        }, 0, ((Object) (aobj)), 6, 4);
        c = jth.a(10, aobj);
    }
}
