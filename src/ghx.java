// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;

public final class ghx
    implements Runnable
{

    private final ggl a;
    private final gjl b;
    private final gbe c;
    private final Handler d;
    private long e;
    private boolean f;

    public ghx(Context context, ggl ggl1, gjl gjl1, gbe gbe)
    {
        this(ggl1, gjl1, new Handler(context.getMainLooper()), gbe);
    }

    private ghx(ggl ggl1, gjl gjl1, Handler handler, gbe gbe)
    {
        a = ggl1;
        b = gjl1;
        d = handler;
        c = gbe;
        e = -1L;
        f = false;
    }

    static long a(ghx ghx1, long l)
    {
        ghx1.e = l;
        return l;
    }

    static boolean a(ghx ghx1)
    {
        return ghx1.f;
    }

    public static boolean a(gjl gjl1)
    {
        while (gjl1.f() != null || gjl1.m() == null && gjl1.g() == null && !c(gjl1)) 
        {
            return false;
        }
        return true;
    }

    static gbe b(ghx ghx1)
    {
        return ghx1.c;
    }

    static boolean b(gjl gjl1)
    {
        return c(gjl1);
    }

    static gjl c(ghx ghx1)
    {
        return ghx1.b;
    }

    private jbn c()
    {
        jbn jbn1 = new jbn();
        if ("conversation".equals(b.g()))
        {
            int i;
            if (b.t())
            {
                i = 1;
            } else
            {
                i = 2;
            }
            jbn1.e = Integer.valueOf(i);
        }
        jbn1.d = Boolean.valueOf(true);
        return jbn1;
    }

    private static boolean c(gjl gjl1)
    {
        return gjl1.i() != null || gjl1.k() != null || gjl1.l() != null;
    }

    static long d(ghx ghx1)
    {
        return ghx1.e;
    }

    static Handler e(ghx ghx1)
    {
        return ghx1.d;
    }

    public void a()
    {
        f = true;
    }

    public void b()
    {
        gbh.a("Nothing to resolve.", a(b));
        if (f)
        {
            gkc.c("vclib", "Resolve flow canceled");
            return;
        }
        jbn jbn1;
        if (c(b))
        {
            jbp jbp1 = new jbp();
            jbp1.b = b.i();
            jbp1.a = b.j();
            if (!TextUtils.isEmpty(b.k()) && !TextUtils.isEmpty(b.l()))
            {
                jbp1.c = b.k();
                jbp1.d = b.l();
            }
            jbn1 = c();
            jbn1.c = jbp1;
        } else
        if (b.g() != null)
        {
            jau jau1 = new jau();
            jau1.a = b.g();
            jau1.b = b.h();
            jbn1 = c();
            jbn1.a = jau1;
        } else
        if (b.m() != null)
        {
            jbn1 = c();
            jbn1.f = b.m().toString();
        } else
        {
            throw new IllegalArgumentException("CreateResolve request is not external key, named room or sharing url.");
        }
        gkc.c("vclib", "Issuing resolve request (%s)", new Object[] {
            jbn1
        });
        a.a(jbn1, new ghy(this));
    }

    public void run()
    {
        b();
    }
}
