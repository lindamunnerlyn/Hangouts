// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

public final class dph
{

    private static volatile boolean a;
    private static volatile boolean b;
    private static volatile String c;
    private static volatile String d;
    private final emy e;
    private final aoa f;
    private final dpl g;
    private final String h;
    private fti i;
    private ftp j;
    private boolean k;
    private final eni l;
    private final eni m;

    public dph(emy emy1, aoa aoa1, dpl dpl, String s)
    {
        l = new dpj(this);
        m = new dpk(this);
        e = emy1;
        f = aoa1;
        g = dpl;
        h = s;
    }

    public dph(emy emy1, dpl dpl)
    {
        this(emy1, null, dpl, null);
    }

    static fti a(dph dph1, fti fti)
    {
        dph1.i = fti;
        return fti;
    }

    static ftp a(dph dph1, ftp ftp)
    {
        dph1.j = ftp;
        return ftp;
    }

    static boolean a(dph dph1)
    {
        return dph1.k;
    }

    static fti b(dph dph1)
    {
        return dph1.i;
    }

    static void b()
    {
        c();
    }

    static dpl c(dph dph1)
    {
        return dph1.g;
    }

    private static void c()
    {
        boolean flag1 = true;
        c = g.a(g.nU, "babel_local_contact_roster_mode", "default");
        d = g.a(g.nU, "babel_local_contact_search_mode", "default");
        boolean flag;
        if (TextUtils.equals(c, "always_disable"))
        {
            eev.c("Babel", "Force disable local contact roster");
            a = true;
            flag = true;
        } else
        if (TextUtils.equals(c, "always_enable"))
        {
            eev.c("Babel", "Force enable local contact roster");
            a = false;
            flag = true;
        } else
        {
            flag = false;
        }
        if (TextUtils.equals(d, "always_disable"))
        {
            eev.c("Babel", "Force disable local contact search");
            b = true;
        } else
        if (TextUtils.equals(d, "always_enable"))
        {
            eev.c("Babel", "Force enable local contact search");
            b = false;
        } else
        {
            flag1 = false;
        }
        if (!flag)
        {
            eev.c("Babel", "Enable local contact roster by default.");
            a = false;
        }
        if (!flag1)
        {
            eev.c("Babel", "Enable local contact search by default.");
            b = false;
        }
    }

    static ftp d(dph dph1)
    {
        return dph1.j;
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
            return f.ab();
        }
    }

    private void f()
    {
        if (!e.e())
        {
            eev.f("Babel", "Google API client not connected. Skip loading aggregated people");
            return;
        } else
        {
            fou fou1 = new fou();
            fou1.a(h);
            fou1.d();
            fph.e.a(e, d(), e(), fou1).a(l);
            return;
        }
    }

    private void g()
    {
        if (!e.e())
        {
            eev.f("Babel", "Google API client not connected. Skip loading people");
            return;
        }
        foy foy1 = new foy();
        foy1.a();
        if (!TextUtils.isEmpty(h))
        {
            foy1.a(h);
        }
        fph.e.a(e, d(), e(), foy1).a(m);
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
        g.a(g.nU).a(new dpi());
    }
}
