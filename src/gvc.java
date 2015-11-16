// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.os.Bundle;
import java.util.ArrayList;

public class gvc
    implements hnt, hon, hop, hor, hou, hov, hoy
{

    private static final gvs a = new gve();
    private final ArrayList b;
    private final hm c;
    private final String d;
    private Activity e;
    private gvq f;
    private gvf g;
    private gvs h;
    private boolean i;

    public gvc(ad ad, hof hof1)
    {
        b = new ArrayList();
        c = new hm();
        h = a;
        d = ad.getClass().getSimpleName();
        hof1.a(this);
    }

    public gvc(Activity activity, hof hof1)
    {
        b = new ArrayList();
        c = new hm();
        h = a;
        e = activity;
        d = activity.getClass().getSimpleName();
        hof1.a(this);
    }

    public void G_()
    {
        f.a(this);
    }

    public gvc a(gvb gvb1)
    {
        b.add(gvb1);
        return this;
    }

    public void a()
    {
        f.b(this);
    }

    public void a(Activity activity)
    {
        e = activity;
    }

    public void a(Bundle bundle)
    {
        f = (gvq)hlp.a(e, gvq);
        if (bundle != null)
        {
            g = (gvf)bundle.getParcelable("boc_background_tasks");
        } else
        {
            g = new gvf(f);
        }
        if (!i)
        {
            bundle = (gvt)hlp.b(e, gvt);
            if (bundle != null && (e instanceof ai))
            {
                ap ap = ((ai)e).u_();
                h = bundle.a(e, ap);
            }
        }
    }

    public void a(guy guy1)
    {
        g.a(guy1);
        guy1.c(e.getApplicationContext());
        f.a(guy1, this);
    }

    void a(String s, gvv gvv)
    {
        g.b(s);
        h.a(s);
        h.a(true);
        ArrayList arraylist = (ArrayList)c.get(s);
        if (arraylist != null)
        {
            for (int j = arraylist.size() - 1; j >= 0; j--)
            {
                arraylist.get(j);
            }

        }
        for (int k = b.size() - 1; k >= 0; k--)
        {
            ((gvb)b.get(k)).a(s, gvv, h);
        }

        if (h.a())
        {
            h.a(gvv);
        }
    }

    public boolean a(String s)
    {
        if (g == null)
        {
            return false;
        } else
        {
            return f.a(this, s);
        }
    }

    public gvc b(gvb gvb1)
    {
        b.remove(gvb1);
        return this;
    }

    public void b(Bundle bundle)
    {
        bundle.putParcelable("boc_background_tasks", g);
    }

    public void b(guy guy1)
    {
        h.a(guy1);
        a(guy1);
    }

    public void b(String s)
    {
        f.c(this, s);
    }

    int c()
    {
        return g.a();
    }

    void c(String s)
    {
        g.b(s);
    }

    int d(String s)
    {
        return g.a(s);
    }

    String[] d()
    {
        return g.b();
    }

    public void f_()
    {
        if (e.isFinishing())
        {
            f.c(this);
        }
    }

}
