// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

public final class dmn
{

    private static volatile boolean a;
    private static volatile boolean b;
    private static volatile String c;
    private static volatile String d;
    private final ejx e;
    private final ani f;
    private final dmr g;
    private final String h;
    private fqp i;
    private fqy j;
    private boolean k;
    private final ekh l;
    private final ekh m;

    public dmn(ejx ejx1, ani ani1, dmr dmr, String s)
    {
        l = new dmp(this);
        m = new dmq(this);
        e = ejx1;
        f = ani1;
        g = dmr;
        h = s;
    }

    public dmn(ejx ejx1, dmr dmr)
    {
        this(ejx1, null, dmr, null);
    }

    static fqp a(dmn dmn1, fqp fqp)
    {
        dmn1.i = fqp;
        return fqp;
    }

    static fqy a(dmn dmn1, fqy fqy)
    {
        dmn1.j = fqy;
        return fqy;
    }

    static boolean a(dmn dmn1)
    {
        return dmn1.k;
    }

    static fqp b(dmn dmn1)
    {
        return dmn1.i;
    }

    static void b()
    {
        c();
    }

    static dmr c(dmn dmn1)
    {
        return dmn1.g;
    }

    private static void c()
    {
        boolean flag1 = true;
        c = g.a(g.nS, "babel_local_contact_roster_mode", "default");
        d = g.a(g.nS, "babel_local_contact_search_mode", "default");
        boolean flag;
        if (TextUtils.equals(c, "always_disable"))
        {
            ebw.c("Babel", "Force disable local contact roster");
            a = true;
            flag = true;
        } else
        if (TextUtils.equals(c, "always_enable"))
        {
            ebw.c("Babel", "Force enable local contact roster");
            a = false;
            flag = true;
        } else
        {
            flag = false;
        }
        if (TextUtils.equals(d, "always_disable"))
        {
            ebw.c("Babel", "Force disable local contact search");
            b = true;
        } else
        if (TextUtils.equals(d, "always_enable"))
        {
            ebw.c("Babel", "Force enable local contact search");
            b = false;
        } else
        {
            flag1 = false;
        }
        if (!flag)
        {
            ebw.c("Babel", "Enable local contact roster by default.");
            a = false;
        }
        if (!flag1)
        {
            ebw.c("Babel", "Enable local contact search by default.");
            b = false;
        }
    }

    static fqy d(dmn dmn1)
    {
        return dmn1.j;
    }

    private String d()
    {
        if (f == null)
        {
            return "fake_account";
        } else
        {
            return f.a();
        }
    }

    private String e()
    {
        if (f == null)
        {
            return null;
        } else
        {
            return f.ae();
        }
    }

    private void f()
    {
        if (!e.e())
        {
            ebw.f("Babel", "Google API client not connected. Skip loading aggregated people");
            return;
        } else
        {
            fly fly1 = new fly();
            fly1.a(h);
            fly1.d();
            fmn.e.a(e, d(), e(), fly1).a(l);
            return;
        }
    }

    private void g()
    {
        if (!e.e())
        {
            ebw.f("Babel", "Google API client not connected. Skip loading people");
            return;
        }
        fme fme1 = new fme();
        fme1.a();
        if (!TextUtils.isEmpty(h))
        {
            fme1.a(h);
        }
        fmn.e.a(e, d(), e(), fme1).a(m);
    }

    public void a()
    {
label0:
        {
label1:
            {
                if (!k)
                {
                    if (!TextUtils.isEmpty(h))
                    {
                        break label0;
                    }
                    if (!a)
                    {
                        break label1;
                    }
                    g();
                }
                return;
            }
            f();
            return;
        }
        if (b)
        {
            g();
            return;
        } else
        {
            f();
            return;
        }
    }

    static 
    {
        c();
        g.a(g.nS).a(new dmo());
    }
}
