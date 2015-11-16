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

public class dvi
    implements how, hoy
{

    dvg a;
    public Activity b;
    public Snackbar c;
    private final Queue d;
    private final List e;
    private Runnable f;
    private boolean g;
    private final ad h;

    public dvi(ad ad1, hof hof1)
    {
        d = new ArrayDeque();
        e = new ArrayList();
        h = ad1;
        hof1.a(this);
    }

    public dvi(Activity activity, hof hof1)
    {
        d = new ArrayDeque();
        e = new ArrayList();
        h = null;
        b = activity;
        hof1.a(this);
    }

    public void a(Snackbar snackbar)
    {
        c = snackbar;
        snackbar.setOnClickListener(new dvj(this));
    }

    public void a(dvg dvg1)
    {
        if (dvg1.equals(a))
        {
            Runnable runnable = f;
            g.x().removeCallbacks(runnable);
            g.a(f, dvg1.e());
            return;
        }
        if (!d.contains(dvg1))
        {
            d.add(dvg1);
        }
        b();
    }

    public void a(dvg dvg1, dvg dvg2)
    {
        if (dvg1.equals(dvg2))
        {
            return;
        }
        if (d.contains(dvg1))
        {
            d.remove(dvg1);
            d.add(dvg2);
            return;
        }
        if (a != null && a.equals(dvg1))
        {
            Runnable runnable = f;
            g.x().removeCallbacks(runnable);
            a(dvg2, dvg1.a().equals(dvg2.b()));
            return;
        } else
        {
            a(dvg2);
            return;
        }
    }

    public void a(dvg dvg1, boolean flag)
    {
        Object obj = dvg1.d();
        if (obj != null)
        {
            obj = new dvl(this, dvg1, ((dvn) (obj)));
        } else
        {
            obj = null;
        }
        if (flag)
        {
            g.a(new dvp(c, a, dvg1));
        } else
        if (!TextUtils.isEmpty(dvg1.b()))
        {
            Snackbar snackbar = c;
            TextView textview = (TextView)c.findViewById(h.dy);
            snackbar.a(g.a(dvg1.a(), dvg1.b(), textview), dvg1.c(), ((android.view.View.OnClickListener) (obj)));
        } else
        {
            c.a(dvg1.a(), dvg1.c(), ((android.view.View.OnClickListener) (obj)));
        }
        a = dvg1;
        f = new dvm(this, dvg1);
        g.a(f, dvg1.e());
        c.measure(-2, -2);
        for (dvg1 = e.iterator(); dvg1.hasNext(); ((dvo)dvg1.next()).a(c)) { }
    }

    public void a(dvo dvo1)
    {
        if (!e.contains(dvo1))
        {
            if (g)
            {
                dvo1.a(c);
            } else
            {
                dvo1.a();
            }
            e.add(dvo1);
        }
    }

    public dvi b(hlp hlp1)
    {
        hlp1.a(dvi, this);
        return this;
    }

    void b()
    {
        if (a == null && c != null)
        {
            dvg dvg1 = (dvg)d.poll();
            if (dvg1 != null)
            {
                a(dvg1, false);
                g = true;
                c.a();
            }
        }
    }

    public void b(dvg dvg1)
    {
        if (a != null && a.equals(dvg1))
        {
            c.b();
            if (dvg1.d() != null)
            {
                dvg1.d().a();
            }
            a = null;
            g.a(new dvk(this), 350L);
            if (d.isEmpty())
            {
                for (dvg1 = e.iterator(); dvg1.hasNext(); ((dvo)dvg1.next()).a()) { }
                g = false;
            }
            return;
        } else
        {
            d.remove(dvg1);
            return;
        }
    }

    public void b(dvo dvo1)
    {
        e.remove(dvo1);
    }

    public void k_()
    {
        if (b == null)
        {
            b = h.getActivity();
        }
        a((Snackbar)b.findViewById(h.fH));
        b();
    }
}
