// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

public class hbd
    implements gqu, grf, hbl, hma, hon, hop, hou, hov, how, hoy
{

    final ai a;
    hbk b;
    String c;
    hbf d;
    private gqz e;
    private String f;
    private gqv g;
    private int h;
    private hbo i;
    private hbo j;
    private int k;
    private boolean l;
    private final List m;
    private final gxn n;

    public hbd(ai ai1, hof hof1)
    {
        g = gqv.a;
        h = -1;
        m = new ArrayList();
        a = ai1;
        hof1.a(this);
        n = new gxn(hof1);
    }

    public hbd(ai ai1, hof hof1, gqz gqz1, hbk hbk1, hbs hbs)
    {
        g = gqv.a;
        h = -1;
        m = new ArrayList();
        g.e(hbs);
        n = new gxn(hof1);
        a = ai1;
        e = gqz1;
        b = hbk1;
        hof1.a(this);
    }

    private void a(hbo hbo1, gqv gqv1, int i1, boolean flag)
    {
        gqv gqv2 = g;
        int j1 = h;
        i = hbo1;
        g = gqv1;
        h = i1;
        if (flag || gqv1 != gqv2 || i1 != j1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        for (hbo1 = m.iterator(); hbo1.hasNext(); ((gqw)hbo1.next()).a(flag, gqv2, gqv1, j1, i1)) { }
    }

    private boolean a(hbo hbo1, int i1)
    {
        return e.c(i1) && b.a(hbo1, i1);
    }

    private void g()
    {
        if (l && j != null)
        {
            int i1 = k;
            Object obj;
            Object obj1;
            hbo hbo1;
            boolean flag;
            if (i1 != -1)
            {
                obj = gqv.c;
            } else
            {
                obj = gqv.b;
            }
            hbo1 = j;
            if (i1 == -1 && h != -1)
            {
                if (a(hbo1, h))
                {
                    i1 = h;
                    obj1 = gqv.c;
                    obj = i;
                    if (j.c != -1)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                } else
                {
                    obj1 = gqv.a;
                    flag = false;
                    i1 = -1;
                    obj = null;
                }
            } else
            {
                flag = false;
                obj1 = obj;
                obj = hbo1;
            }
            k = -1;
            j = null;
            a(((hbo) (obj)), ((gqv) (obj1)), i1, flag);
        }
    }

    private void h()
    {
        if (!e() && h != -1 && !a(i, h))
        {
            a(null, gqv.a, -1, false);
        }
    }

    public void G_()
    {
        l = true;
        f();
    }

    public void H_()
    {
        if (l)
        {
            h();
        }
    }

    public int a()
    {
        g.v();
        return h;
    }

    public gqu a(gqw gqw1)
    {
        return b(gqw1);
    }

    public hbd a(hlp hlp1)
    {
        hlp1.a(gqu, this);
        hlp1.a(hbd, this);
        return this;
    }

    public hbd a(String s)
    {
        f = s;
        return this;
    }

    public void a(Context context, hlp hlp1, Bundle bundle)
    {
        if (e == null && b == null)
        {
            e = (gqz)hlp1.a(gqz);
            b = (hbk)hlp1.a(hbk);
        }
    }

    public void a(Bundle bundle)
    {
        if (bundle != null)
        {
            f = bundle.getString("account_key");
            h = bundle.getInt("account_id");
            g = gqv.values()[bundle.getInt("account_handler_state")];
            i = (hbo)bundle.getParcelable("completed_login_request");
            Object obj = (hbo)bundle.getParcelable("queued_login_request");
            if (obj == null)
            {
                obj = null;
            } else
            {
                obj = new hbf(this, ((hbo) (obj)));
            }
            d = ((hbf) (obj));
            j = (hbo)bundle.getParcelable("pending_login_request");
            k = bundle.getInt("pending_id");
            c = bundle.getString("tag");
        }
        l = true;
        e.a(this);
        b.a(this);
    }

    public void a(hbo hbo1)
    {
        if (hbo1.e == null)
        {
            hbo1.e = f;
        }
        if (hbo1.e == null)
        {
            hbo1.e = hlp.a(a, "LoginAccountHandler.account_key");
        }
        if (hbo1.h)
        {
            hbo1.a(a, a.getIntent());
        }
        c = UUID.randomUUID().toString();
        d = new hbf(this, hbo1);
        n.a(itp.a(new hbe(this)));
    }

    public void a(hbo hbo1, String s, int i1)
    {
        if (TextUtils.equals(s, c))
        {
            c = null;
            j = hbo1;
            k = i1;
            g();
        }
    }

    public hbd b(gqw gqw1)
    {
        m.add(gqw1);
        return this;
    }

    public void b(Bundle bundle)
    {
        l = false;
        bundle.putString("account_key", f);
        bundle.putInt("account_id", h);
        bundle.putInt("account_handler_state", g.ordinal());
        bundle.putParcelable("completed_login_request", i);
        Object obj;
        if (d == null)
        {
            obj = null;
        } else
        {
            obj = d.a;
        }
        bundle.putParcelable("queued_login_request", ((android.os.Parcelable) (obj)));
        bundle.putParcelable("pending_login_request", j);
        bundle.putInt("pending_id", k);
        bundle.putString("tag", c);
    }

    public boolean b()
    {
        g.v();
        return h != -1;
    }

    public grb c()
    {
        g.v();
        return e.a(h);
    }

    public boolean d()
    {
        g.v();
        return e.c(h) && e.a(h).a();
    }

    public boolean e()
    {
        return d != null || c != null || j != null;
    }

    void f()
    {
        h();
        if (a.isFinishing())
        {
            return;
        }
        if (l && d != null)
        {
            d.b.run();
        }
        g();
    }

    public void f_()
    {
        e.b(this);
        b.b(this);
    }

    public void k_()
    {
        l = true;
        f();
    }
}
