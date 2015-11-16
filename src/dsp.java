// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.os.Handler;
import android.text.TextUtils;
import android.widget.TextView;
import com.google.android.libraries.quantum.snackbar.Snackbar;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;

public class dsp
    implements fsn, hkc
{

    public Activity a;
    public Snackbar b;
    private final Queue c;
    private final List d;
    private dsn e;
    private Runnable f;
    private boolean g;
    private final ad h;

    public dsp(ad ad1, hjm hjm1)
    {
        c = new ArrayDeque();
        d = new ArrayList();
        h = ad1;
        hjm1.a(this);
    }

    public dsp(Activity activity, hjm hjm1)
    {
        c = new ArrayDeque();
        d = new ArrayList();
        h = null;
        a = activity;
        hjm1.a(this);
    }

    static dsn a(dsp dsp1)
    {
        return dsp1.e;
    }

    private void b()
    {
        if (e == null && b != null)
        {
            dsn dsn1 = (dsn)c.poll();
            if (dsn1 != null)
            {
                a(dsn1, false);
                g = true;
                b.a();
            }
        }
    }

    static void b(dsp dsp1)
    {
        dsp1.b();
    }

    public void a(Snackbar snackbar)
    {
        b = snackbar;
        snackbar.setOnClickListener(new dsq(this));
    }

    public void a(dsn dsn1)
    {
        if (dsn1.equals(e))
        {
            Runnable runnable = f;
            g.y().removeCallbacks(runnable);
            g.a(f, dsn1.e());
            return;
        }
        if (!c.contains(dsn1))
        {
            c.add(dsn1);
        }
        b();
    }

    public void a(dsn dsn1, dsn dsn2)
    {
        if (dsn1.equals(dsn2))
        {
            return;
        }
        if (c.contains(dsn1))
        {
            c.remove(dsn1);
            c.add(dsn2);
            return;
        }
        if (e != null && e.equals(dsn1))
        {
            Runnable runnable = f;
            g.y().removeCallbacks(runnable);
            a(dsn2, dsn1.a().equals(dsn2.b()));
            return;
        } else
        {
            a(dsn2);
            return;
        }
    }

    public void a(dsn dsn1, boolean flag)
    {
        Object obj = dsn1.d();
        if (obj != null)
        {
            obj = new dss(this, dsn1, ((dsu) (obj)));
        } else
        {
            obj = null;
        }
        if (flag)
        {
            g.a(new dsw(b, e, dsn1));
        } else
        if (!TextUtils.isEmpty(dsn1.b()))
        {
            Snackbar snackbar = b;
            TextView textview = (TextView)b.findViewById(h.dK);
            snackbar.a(g.a(dsn1.a(), dsn1.b(), textview), dsn1.c(), ((android.view.View.OnClickListener) (obj)));
        } else
        {
            b.a(dsn1.a(), dsn1.c(), ((android.view.View.OnClickListener) (obj)));
        }
        e = dsn1;
        f = new dst(this, dsn1);
        g.a(f, dsn1.e());
        b.measure(-2, -2);
        for (dsn1 = d.iterator(); dsn1.hasNext(); ((dsv)dsn1.next()).a(b)) { }
    }

    public void a(dsv dsv1)
    {
        if (!d.contains(dsv1))
        {
            if (g)
            {
                dsv1.a(b);
            } else
            {
                dsv1.a();
            }
            d.add(dsv1);
        }
    }

    public dsp b(hgx hgx1)
    {
        hgx1.a(dsp, this);
        return this;
    }

    public void b(dsn dsn1)
    {
        if (e != null && e.equals(dsn1))
        {
            b.b();
            if (dsn1.d() != null)
            {
                dsn1.d().a();
            }
            e = null;
            g.a(new dsr(this), 350L);
            if (c.isEmpty())
            {
                for (dsn1 = d.iterator(); dsn1.hasNext(); ((dsv)dsn1.next()).a()) { }
                g = false;
            }
            return;
        } else
        {
            c.remove(dsn1);
            return;
        }
    }

    public void b(dsv dsv1)
    {
        d.remove(dsv1);
    }

    public void j_()
    {
        if (a == null)
        {
            a = h.getActivity();
        }
        a((Snackbar)a.findViewById(h.fZ));
        b();
    }
}
