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

public class gwt
    implements fsn, gmo, gmy, gxb, hhi, hjt, hjv, hka, hkb, hkc
{

    String a;
    private final ai b;
    private gms c;
    private gxa d;
    private String e;
    private gmp f;
    private int g;
    private gxe h;
    private gwv i;
    private gxe j;
    private int k;
    private boolean l;
    private final List m = new ArrayList();
    private final gtb n;

    public gwt(ai ai1, hjm hjm1)
    {
        f = gmp.a;
        g = -1;
        b = ai1;
        hjm1.a(this);
        n = new gtb(hjm1);
    }

    static ai a(gwt gwt1)
    {
        return gwt1.b;
    }

    private void a(gxe gxe1, gmp gmp1, int i1, boolean flag)
    {
        gmp gmp2 = f;
        int j1 = g;
        h = gxe1;
        f = gmp1;
        g = i1;
        if (flag || gmp1 != gmp2 || i1 != j1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        for (gxe1 = m.iterator(); gxe1.hasNext(); ((gmq)gxe1.next()).a(flag, gmp2, gmp1, j1, i1)) { }
    }

    private boolean a(gxe gxe1, int i1)
    {
        return c.c(i1) && d.a(gxe1, i1);
    }

    static gxa b(gwt gwt1)
    {
        return gwt1.d;
    }

    static gwv c(gwt gwt1)
    {
        gwt1.i = null;
        return null;
    }

    static void d(gwt gwt1)
    {
        gwt1.f();
    }

    private void f()
    {
        h();
        if (b.isFinishing())
        {
            return;
        }
        if (l && i != null)
        {
            i.b.run();
        }
        g();
    }

    private void g()
    {
        if (l && j != null)
        {
            int i1 = k;
            Object obj;
            Object obj1;
            gxe gxe1;
            boolean flag;
            if (i1 != -1)
            {
                obj = gmp.c;
            } else
            {
                obj = gmp.b;
            }
            gxe1 = j;
            if (i1 == -1 && g != -1)
            {
                if (a(gxe1, g))
                {
                    i1 = g;
                    obj1 = gmp.c;
                    obj = h;
                    if (j.c != -1)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                } else
                {
                    obj1 = gmp.a;
                    flag = false;
                    i1 = -1;
                    obj = null;
                }
            } else
            {
                flag = false;
                obj1 = obj;
                obj = gxe1;
            }
            k = -1;
            j = null;
            a(((gxe) (obj)), ((gmp) (obj1)), i1, flag);
        }
    }

    private void h()
    {
        if (!e() && g != -1 && !a(h, g))
        {
            a(null, gmp.a, -1, false);
        }
    }

    public void E_()
    {
        l = true;
        f();
    }

    public void F_()
    {
        if (l)
        {
            h();
        }
    }

    public int a()
    {
        g.w();
        return g;
    }

    public gmo a(gmq gmq1)
    {
        return b(gmq1);
    }

    public gwt a(hgx hgx1)
    {
        hgx1.a(gmo, this);
        hgx1.a(gwt, this);
        return this;
    }

    public gwt a(String s)
    {
        e = s;
        return this;
    }

    public void a(Context context, hgx hgx1, Bundle bundle)
    {
        if (c == null && d == null)
        {
            c = (gms)hgx1.a(gms);
            d = (gxa)hgx1.a(gxa);
        }
    }

    public void a(Bundle bundle)
    {
        if (bundle != null)
        {
            e = bundle.getString("account_key");
            g = bundle.getInt("account_id");
            f = gmp.values()[bundle.getInt("account_handler_state")];
            h = (gxe)bundle.getParcelable("completed_login_request");
            Object obj = (gxe)bundle.getParcelable("queued_login_request");
            if (obj == null)
            {
                obj = null;
            } else
            {
                obj = new gwv(this, ((gxe) (obj)));
            }
            i = ((gwv) (obj));
            j = (gxe)bundle.getParcelable("pending_login_request");
            k = bundle.getInt("pending_id");
            a = bundle.getString("tag");
        }
        l = true;
        c.a(this);
        d.a(this);
    }

    public void a(gxe gxe1)
    {
        if (gxe1.e == null)
        {
            gxe1.e = e;
        }
        if (gxe1.e == null)
        {
            gxe1.e = hgx.a(b, "LoginAccountHandler.account_key");
        }
        if (gxe1.h)
        {
            gxe1.a(b, b.getIntent());
        }
        a = UUID.randomUUID().toString();
        i = new gwv(this, gxe1);
        n.a(inl.a(new gwu(this)));
    }

    public void a(gxe gxe1, String s, int i1)
    {
        if (TextUtils.equals(s, a))
        {
            a = null;
            j = gxe1;
            k = i1;
            g();
        }
    }

    public gwt b(gmq gmq1)
    {
        m.add(gmq1);
        return this;
    }

    public void b(Bundle bundle)
    {
        l = false;
        bundle.putString("account_key", e);
        bundle.putInt("account_id", g);
        bundle.putInt("account_handler_state", f.ordinal());
        bundle.putParcelable("completed_login_request", h);
        Object obj;
        if (i == null)
        {
            obj = null;
        } else
        {
            obj = i.a;
        }
        bundle.putParcelable("queued_login_request", ((android.os.Parcelable) (obj)));
        bundle.putParcelable("pending_login_request", j);
        bundle.putInt("pending_id", k);
        bundle.putString("tag", a);
    }

    public boolean b()
    {
        g.w();
        return g != -1;
    }

    public gmu c()
    {
        g.w();
        return c.a(g);
    }

    public boolean d()
    {
        g.w();
        return c.c(g) && c.a(g).a();
    }

    public boolean e()
    {
        return i != null || a != null || j != null;
    }

    public void e_()
    {
        c.b(this);
        d.b(this);
    }

    public void j_()
    {
        l = true;
        f();
    }
}
