// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.os.Bundle;
import java.util.ArrayList;

public class gqr
    implements fsn, hjb, hjt, hjv, hjx, hka, hkb
{

    private static final grh a = new gqt();
    private final ArrayList b;
    private final String c;
    private Activity d;
    private grf e;
    private gqu f;
    private grh g;
    private boolean h;

    public gqr(ad ad, hjm hjm1)
    {
        b = new ArrayList();
        g = a;
        c = ad.getClass().getSimpleName();
        hjm1.a(this);
    }

    public gqr(Activity activity, hjm hjm1)
    {
        b = new ArrayList();
        g = a;
        d = activity;
        c = activity.getClass().getSimpleName();
        hjm1.a(this);
    }

    public void E_()
    {
        e.a(this);
    }

    public gqr a(gqq gqq1)
    {
        b.add(gqq1);
        return this;
    }

    public void a()
    {
        e.b(this);
    }

    public void a(Activity activity)
    {
        d = activity;
    }

    public void a(Bundle bundle)
    {
        e = (grf)hgx.a(d, grf);
        if (bundle != null)
        {
            f = (gqu)bundle.getParcelable("boc_background_tasks");
        } else
        {
            f = new gqu(e);
        }
        if (!h)
        {
            bundle = (gri)hgx.b(d, gri);
            if (bundle != null && (d instanceof ai))
            {
                ap ap = ((ai)d).t_();
                g = bundle.a(d, ap);
            }
        }
    }

    public void a(gqn gqn1)
    {
        f.a(gqn1);
        gqn1.c(d.getApplicationContext());
        e.a(gqn1, this);
    }

    void a(String s, grk grk)
    {
        f.b(s);
        g.a(s);
        g.a(true);
        for (int i = b.size() - 1; i >= 0; i--)
        {
            ((gqq)b.get(i)).a(s, grk, g);
        }

        if (g.a())
        {
            g.a(grk);
        }
    }

    public boolean a(String s)
    {
        if (f == null)
        {
            return false;
        } else
        {
            return e.a(this, s);
        }
    }

    public gqr b(gqq gqq1)
    {
        b.remove(gqq1);
        return this;
    }

    public void b(Bundle bundle)
    {
        bundle.putParcelable("boc_background_tasks", f);
    }

    public void b(gqn gqn1)
    {
        g.a(gqn1);
        a(gqn1);
    }

    public void b(String s)
    {
        e.c(this, s);
    }

    int c()
    {
        return f.a();
    }

    void c(String s)
    {
        f.b(s);
    }

    int d(String s)
    {
        return f.a(s);
    }

    String[] d()
    {
        return f.b();
    }

    public void e_()
    {
        if (d.isFinishing())
        {
            e.c(this);
        }
    }

}
