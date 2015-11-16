// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

public final class cgh extends chx
{

    private final boolean e;
    private final Activity f;
    private final ani g;
    private final aip h;
    private final bwf i = (bwf)hgx.a(b(), bwf);
    private boolean j;
    private cgr k;
    private amj l;
    private String m;
    private android.view.View.OnClickListener n;
    private android.view.View.OnClickListener o;
    private android.view.View.OnCreateContextMenuListener p;
    private final chy q;
    private final chy r;
    private final chy s;
    private final chy t;
    private final chy u;
    private final chy v;
    private final chy w;
    private final chy x;
    private final chy y;

    public cgh(Activity activity, ani ani1, aip aip, android.view.View.OnCreateContextMenuListener oncreatecontextmenulistener, android.view.View.OnClickListener onclicklistener, android.view.View.OnClickListener onclicklistener1, boolean flag)
    {
        super(activity);
        a(new cgs(this, cgv.a, true, true));
        q = (chy)a(new cgs(this, cgv.b, false, false, eeo.g));
        r = (chy)a(new cgs(this, cgv.e, false, true));
        s = (chy)a(new cgi(this, cgv.b, eeo.b));
        t = (chy)a(new cgj(this, cgv.b, eeo.c));
        u = (chy)a(new cgk(this, cgv.b, eeo.d));
        v = (chy)a(new cgl(this, cgv.c));
        w = (chy)a(new cgs(this, cgv.e, false, true));
        x = (chy)a(new cgm(this, cgv.d, eeo.e));
        y = (chy)a(new cgn(this, cgv.c));
        f = activity;
        g = ani1;
        h = aip;
        p = oncreatecontextmenulistener;
        o = onclicklistener;
        n = onclicklistener1;
        e = flag;
        a(false);
    }

    static ani a(cgh cgh1)
    {
        return cgh1.g;
    }

    static cgr a(cgh cgh1, cgr cgr1)
    {
        cgh1.k = cgr1;
        return cgr1;
    }

    private void a(chy chy1, amj amj1)
    {
        boolean flag = true;
        String s1 = String.valueOf(chy1);
        ebw.a("Babel", (new StringBuilder(String.valueOf(s1).length() + 23)).append("updateCursor partition=").append(s1).toString());
        chy1.a(amj1);
        if (!b(true) || !c(true))
        {
            flag = false;
        }
        v.a(flag);
    }

    static cgr b(cgh cgh1)
    {
        return cgh1.k;
    }

    static boolean c(cgh cgh1)
    {
        return cgh1.j;
    }

    static String d(cgh cgh1)
    {
        return cgh1.m;
    }

    static aip e(cgh cgh1)
    {
        return cgh1.h;
    }

    private void f()
    {
        boolean flag1 = false;
        if (j)
        {
            boolean flag = flag1;
            if (l != null)
            {
                flag = flag1;
                if (l.getCount() == 0)
                {
                    flag = true;
                }
            }
            y.a(flag);
            x.a(l);
            return;
        } else
        {
            y.a(false);
            x.a(null);
            return;
        }
    }

    public zq a(ViewGroup viewgroup, int i1)
    {
        i1 = cgv.g[i1];
        switch (cgp.a[i1 - 1])
        {
        default:
            return null;

        case 1: // '\001'
            return new cgt(this, f.getLayoutInflater().inflate(g.gF, viewgroup, false));

        case 2: // '\002'
            return new cgt(this, f.getLayoutInflater().inflate(g.nF, viewgroup, false));

        case 3: // '\003'
            return new cgu(this, f.getLayoutInflater().inflate(g.nE, viewgroup, false));

        case 4: // '\004'
            viewgroup = f.getLayoutInflater().inflate(g.nD, viewgroup, false);
            viewgroup.setOnClickListener(n);
            ebr.a(viewgroup, true);
            viewgroup.setFocusable(true);
            return new cgr(this, viewgroup);

        case 5: // '\005'
            return new cgq(this, f.getLayoutInflater().inflate(g.nG, viewgroup, false));

        case 6: // '\006'
            viewgroup = new eej(f, g, h);
            break;
        }
        viewgroup.setOnClickListener(o);
        viewgroup.setOnCreateContextMenuListener(p);
        viewgroup.setOnLongClickListener(new cgo(this, viewgroup));
        ebr.a(viewgroup, true);
        viewgroup.setFocusable(true);
        return new cgq(this, viewgroup);
    }

    public void a(amj amj1)
    {
        int i1;
label0:
        {
            a(s, amj1);
            if (amj1 != null && TextUtils.isEmpty(m))
            {
                i1 = amj1.getCount();
                if (i1 != 0)
                {
                    break label0;
                }
                i.a(g.h(), 2548).d();
            }
            return;
        }
        i.a(g.h(), 2547).a(Integer.valueOf(i1)).d();
    }

    public void a(String s1)
    {
        m = s1;
        boolean flag = d();
        w.a(flag);
        x.a(flag);
    }

    public void a(List list)
    {
        boolean flag;
        if (list != null && !list.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            list = new amk(list);
        } else
        {
            list = null;
        }
        q.a(list);
        r.a(flag);
    }

    public long b(int i1)
    {
        return -1L;
    }

    public void b(amj amj1)
    {
        a(t, amj1);
    }

    public boolean b(boolean flag)
    {
        while (e && (!s.d() || flag && !u.d())) 
        {
            return false;
        }
        return t.d();
    }

    public void c(amj amj1)
    {
        a(u, amj1);
    }

    public boolean c(boolean flag)
    {
        while (e && (!s.b() || flag && !u.b())) 
        {
            return false;
        }
        return t.b();
    }

    public void d(amj amj1)
    {
        ebw.a("Babel", "setGplusCursor");
        l = amj1;
        f();
    }

    public void d(boolean flag)
    {
        if (j != flag)
        {
            if (flag)
            {
                i.a(g.h(), 2553).d();
            }
            j = flag;
            f();
            if (k != null)
            {
                k.v();
                return;
            }
        }
    }

    public boolean d()
    {
        return e && !TextUtils.isEmpty(m);
    }

    public boolean e()
    {
        return j;
    }
}
