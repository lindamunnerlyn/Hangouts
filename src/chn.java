// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

public final class chn extends cjd
{

    final aoa e;
    final aii f;
    boolean g;
    chx h;
    String i;
    private final boolean j;
    private final Activity k;
    private final gdd l = (gdd)hlp.a(b(), gdd);
    private anb m;
    private android.view.View.OnClickListener n;
    private android.view.View.OnClickListener o;
    private android.view.View.OnCreateContextMenuListener p;
    private final cje q;
    private final cje r;
    private final cje s;
    private final cje t;
    private final cje u;
    private final cje v;
    private final cje w;
    private final cje x;
    private final cje y;

    public chn(Activity activity, aoa aoa1, aii aii, android.view.View.OnCreateContextMenuListener oncreatecontextmenulistener, android.view.View.OnClickListener onclicklistener, android.view.View.OnClickListener onclicklistener1, boolean flag)
    {
        super(activity);
        a(new chy(this, cib.a, true, true));
        q = (cje)a(new chy(this, cib.b, false, false, ehq.g));
        r = (cje)a(new chy(this, cib.e, false, true));
        s = (cje)a(new cho(this, cib.b, ehq.b));
        t = (cje)a(new chp(this, cib.b, ehq.c));
        u = (cje)a(new chq(this, cib.b, ehq.d));
        v = (cje)a(new chr(this, cib.c));
        w = (cje)a(new chy(this, cib.e, false, true));
        x = (cje)a(new chs(this, cib.d, ehq.e));
        y = (cje)a(new cht(this, cib.c));
        k = activity;
        e = aoa1;
        f = aii;
        p = oncreatecontextmenulistener;
        o = onclicklistener;
        n = onclicklistener1;
        j = flag;
        a(false);
    }

    private void a(cje cje1, anb anb1)
    {
        boolean flag = true;
        String s1 = String.valueOf(cje1);
        eev.a("Babel", (new StringBuilder(String.valueOf(s1).length() + 23)).append("updateCursor partition=").append(s1).toString());
        cje1.a(anb1);
        if (!b(true) || !c(true))
        {
            flag = false;
        }
        v.a(flag);
    }

    private void f()
    {
        boolean flag1 = false;
        if (g)
        {
            boolean flag = flag1;
            if (m != null)
            {
                flag = flag1;
                if (m.getCount() == 0)
                {
                    flag = true;
                }
            }
            y.a(flag);
            x.a(m);
            return;
        } else
        {
            y.a(false);
            x.a(null);
            return;
        }
    }

    public zs a(ViewGroup viewgroup, int i1)
    {
        i1 = cib.g[i1];
        switch (chv.a[i1 - 1])
        {
        default:
            return null;

        case 1: // '\001'
            return new chz(this, k.getLayoutInflater().inflate(g.gA, viewgroup, false));

        case 2: // '\002'
            return new chz(this, k.getLayoutInflater().inflate(g.nH, viewgroup, false));

        case 3: // '\003'
            return new cia(this, k.getLayoutInflater().inflate(g.nG, viewgroup, false));

        case 4: // '\004'
            viewgroup = k.getLayoutInflater().inflate(g.nF, viewgroup, false);
            viewgroup.setOnClickListener(n);
            eep.a(viewgroup, true);
            viewgroup.setFocusable(true);
            return new chx(this, viewgroup);

        case 5: // '\005'
            return new chw(this, k.getLayoutInflater().inflate(g.nI, viewgroup, false));

        case 6: // '\006'
            viewgroup = new ehl(k, e, f);
            break;
        }
        viewgroup.setOnClickListener(o);
        viewgroup.setOnCreateContextMenuListener(p);
        viewgroup.setOnLongClickListener(new chu(this, viewgroup));
        eep.a(viewgroup, true);
        viewgroup.setFocusable(true);
        return new chw(this, viewgroup);
    }

    public void a(anb anb1)
    {
        int i1;
label0:
        {
            a(s, anb1);
            if (anb1 != null && TextUtils.isEmpty(i))
            {
                i1 = anb1.getCount();
                if (i1 != 0)
                {
                    break label0;
                }
                l.a(e.h()).a(2548).d();
            }
            return;
        }
        l.a(e.h()).a(2547).a(Integer.valueOf(i1)).d();
    }

    public void a(String s1)
    {
        i = s1;
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
            list = new anc(list);
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

    public void b(anb anb1)
    {
        a(t, anb1);
    }

    public boolean b(boolean flag)
    {
        while (j && (!s.d() || flag && !u.d())) 
        {
            return false;
        }
        return t.d();
    }

    public void c(anb anb1)
    {
        a(u, anb1);
    }

    public boolean c(boolean flag)
    {
        while (j && (!s.b() || flag && !u.b())) 
        {
            return false;
        }
        return t.b();
    }

    public void d(anb anb1)
    {
        eev.a("Babel", "setGplusCursor");
        m = anb1;
        f();
    }

    public void d(boolean flag)
    {
        if (g != flag)
        {
            if (flag)
            {
                l.a(e.h()).a(2553).d();
            }
            g = flag;
            f();
            if (h != null)
            {
                h.v();
                return;
            }
        }
    }

    public boolean d()
    {
        return j && !TextUtils.isEmpty(i);
    }

    public boolean e()
    {
        return g;
    }
}
