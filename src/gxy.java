// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class gxy extends hhu
    implements gne, gqq, gwy
{

    private static final String a[] = {
        "update_account", "prepare_accounts", "logout_during_login", "logout", "load_accounts_add", "load_accounts_add_account_activity", "are_accounts_ready_for_login"
    };
    private String aj;
    private String ak;
    private int al;
    private boolean am;
    private boolean an;
    private Runnable ao;
    private boolean ap;
    private boolean aq;
    private String ar[];
    private gyf b;
    private gms c;
    private gnd d;
    private gxi e;
    private final gqr f;
    private final gtb g;
    private gxe h;
    private String i;

    public gxy()
    {
        f = (new gqr(this, lifecycle)).a(this);
        g = new gtb(lifecycle);
        al = -1;
    }

    static grk a(gxu gxu1)
    {
        grk grk1 = new grk(gxu1.a);
        grk1.d().putBoolean("has_recoverable_error", gxu1.b);
        grk1.d().putBoolean("has_irrecoverable_error", gxu1.c);
        grk1.d().putInt("account_id", gxu1.d);
        return grk1;
    }

    public static gxy a(ap ap1)
    {
        gxy gxy2 = (gxy)ap1.a("login.fragment");
        gxy gxy1 = gxy2;
        if (gxy2 == null)
        {
            gxy1 = new gxy();
            bg bg1 = ap1.a();
            bg1.a(gxy1, "login.fragment");
            bg1.b();
            ap1.b();
        }
        return gxy1;
    }

    private void a(boolean flag)
    {
        String as[] = a;
        int k = as.length;
        for (int j = 0; j < k; j++)
        {
            String s1 = as[j];
            f.b(s1);
        }

        w();
        aq = false;
        if (!flag)
        {
            getFragmentManager().a().a(this).b();
        }
    }

    private boolean a(int j)
    {
        if (j != -1)
        {
            b(j);
            return true;
        } else
        {
            return false;
        }
    }

    private void b(int j)
    {
        if (!c.c(j))
        {
            t();
            return;
        } else
        {
            gmu gmu1 = c.a(j);
            a(gmu1.b("account_name"), gmu1.b("effective_gaia_id"));
            return;
        }
    }

    private void b(String s1, String s2)
    {
        int j = c.c(s1);
        if (j == -1)
        {
            t();
            return;
        } else
        {
            a(c.a(j).b("account_name"), s2);
            return;
        }
    }

    private void c(int j)
    {
        Iterator iterator = binder.c(gxr).iterator();
        int k = -1;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            int l = ((gxr)iterator.next()).a();
            k = l;
            if (l == -1)
            {
                continue;
            }
            k = l;
            break;
        } while (true);
        if (k != -1 && k != j)
        {
            al = j;
            gyc gyc1 = new gyc("logout_during_login", k, b);
            f.a(gyc1);
            return;
        }
        if (h.g)
        {
            c.a(h.e, j);
        }
        a(false);
        b.a(h, i, j);
    }

    private void f()
    {
        am = true;
        if (ao == null)
        {
            ao = inl.a(new gxz(this));
        }
        g.a(ao);
    }

    private boolean q()
    {
        while (ap || f.a("are_accounts_ready_for_login")) 
        {
            return false;
        }
        if (h.j)
        {
            return true;
        } else
        {
            f.a(new gya("are_accounts_ready_for_login", b));
            return false;
        }
    }

    private void r()
    {
        boolean flag1;
        flag1 = true;
        w();
        boolean flag;
        if (aj != null)
        {
            a(aj, ak);
            flag = true;
        } else
        {
            flag = false;
        }
        break MISSING_BLOCK_LABEL_28;
_L4:
        int j;
        boolean flag2;
        do
        {
            do
            {
                do
                {
                    return;
                } while (flag || a(h.c));
                String s1 = h.o;
                String s2 = h.p;
                if (s1 != null)
                {
                    if (c.b(s1, s2) != -1)
                    {
                        a(s1, s2);
                    } else
                    {
                        t();
                    }
                    j = 1;
                } else
                {
                    j = 0;
                }
            } while (j != 0);
            if (h.q != null)
            {
                b(h.q, h.p);
                j = 1;
            } else
            {
                j = 0;
            }
        } while (j != 0);
        if (!h.h) goto _L2; else goto _L1
_L1:
        if (h.k != -1)
        {
            b(h.k);
            j = 1;
        } else
        {
label0:
            {
                if (h.l == null)
                {
                    break label0;
                }
                a(h.l, h.m);
                j = 1;
            }
        }
_L10:
        if (j != 0) goto _L4; else goto _L3
_L3:
        if (h.r == null) goto _L6; else goto _L5
_L5:
        j = h.r.a();
        if (j == -1) goto _L6; else goto _L7
_L7:
        b(j);
        j = 1;
_L11:
        if (j != 0) goto _L4; else goto _L8
_L8:
        if (!h.f)
        {
            break MISSING_BLOCK_LABEL_388;
        }
        j = c.d(h.e);
        if (!b.a(h, j))
        {
            break MISSING_BLOCK_LABEL_388;
        }
        flag2 = a(j);
_L12:
        if (!flag2)
        {
            if (h.s != null)
            {
                an = true;
                s();
                j = ((flag1) ? 1 : 0);
            } else
            {
                j = 0;
            }
            if (j == 0)
            {
                c();
                return;
            }
        }
          goto _L4
        if (h.n == null) goto _L2; else goto _L9
_L9:
        b(h.n, h.m);
        j = 1;
          goto _L10
_L2:
        j = 0;
          goto _L10
_L6:
        j = 0;
          goto _L11
        flag2 = false;
          goto _L12
    }

    private void s()
    {
        if (an && isResumed())
        {
            w();
            gwr gwr1 = (gwr)binder.a(h.s);
            String s1 = gwr1.getClass().getName();
            ap ap1 = getChildFragmentManager();
            ad ad1 = ap1.a(s1);
            if (ad1 == null)
            {
                Bundle bundle = h.t;
                ad1 = gwr1.a(bundle);
                ad1.setArguments(bundle);
                ap1.a().a(ad1, s1).b();
                ap1.b();
            }
            ((gws)ad1).a(h);
        }
    }

    private void t()
    {
        String s2 = h.b;
        String s1 = s2;
        if ("com.google.android.libraries.social.login.LoginRequest.DEFAULT_ERROR_TOAST".equals(s2))
        {
            s1 = context.getString(g.sP);
        }
        a(s1);
    }

    private void u()
    {
        e.b(getChildFragmentManager());
    }

    private void v()
    {
        if (isResumed() && (ap || aq))
        {
            String s1 = h.a;
            if (s1 == null)
            {
                s1 = context.getString(g.sR);
            }
            e.a(getChildFragmentManager(), s1, h.i);
        }
    }

    private void w()
    {
        e.a(getChildFragmentManager());
    }

    public void a()
    {
        f.a(new gyb("load_accounts_add_account_activity", d));
    }

    public void a(gxe gxe1, String s1)
    {
        if (aq)
        {
            a(true);
            b.a(h, i);
        }
        aq = true;
        h = gxe1;
        i = s1;
        aj = null;
        ak = null;
        al = -1;
        f();
    }

    public void a(String s1)
    {
        if (s1 != null)
        {
            Toast.makeText(context, s1, 1).show();
        }
        c();
    }

    public void a(String s1, grk grk1, grh grh1)
    {
        grh1.a(false);
        if (!"update_account".equals(s1)) goto _L2; else goto _L1
_L1:
        if (grk1 != null) goto _L4; else goto _L3
_L3:
        u();
_L8:
        return;
_L4:
        int j = grk1.d().getInt("account_id");
        if (grk1.d().getBoolean("has_irrecoverable_error"))
        {
            s1 = b.d(j);
            if (s1 != null)
            {
                startActivityForResult(s1, 1);
                return;
            } else
            {
                e.c(getChildFragmentManager());
                return;
            }
        }
        if (grk1.d().getBoolean("has_recoverable_error"))
        {
            u();
            return;
        }
        if (!b.a(h, j))
        {
            if (c.c(j))
            {
                gxg gxg1 = b.b(h, j);
                if (gxg1 != null)
                {
                    grh1 = gxg1.getClass().getName();
                    ap ap1 = getChildFragmentManager();
                    grk1 = ap1.a(grh1);
                    s1 = grk1;
                    if (grk1 == null)
                    {
                        grk1 = gxg1.b();
                        s1 = grk1;
                        if (grk1 != null)
                        {
                            ap1.a().a(grk1, grh1).b();
                            ap1.b();
                            s1 = grk1;
                        }
                    }
                    s1 = (gxh)s1;
                    if (s1 != null)
                    {
                        s1.a(j);
                        return;
                    }
                }
            }
            t();
            return;
        } else
        {
            c(j);
            return;
        }
_L2:
        if (!"prepare_accounts".equals(s1)) goto _L6; else goto _L5
_L5:
        ap = false;
_L10:
        r();
        return;
_L6:
        if ("logout_during_login".equals(s1))
        {
            if (al != -1)
            {
                c(al);
                return;
            } else
            {
                c();
                return;
            }
        }
        if ("logout".equals(s1))
        {
            a(false);
            return;
        }
        if ("load_accounts_add".equals(s1))
        {
            if (grk1 == null || grk1.f())
            {
                a(context.getString(g.sQ));
                return;
            } else
            {
                ar = grk1.d().getStringArray("account_name_array");
                d.a(this);
                return;
            }
        }
        if (!"load_accounts_add_account_activity".equals(s1))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (grk1 == null || grk1.f())
        {
            a(context.getString(g.sQ));
            return;
        }
        s1 = new HashSet(Arrays.asList(grk1.d().getStringArray("account_name_array")));
        s1.removeAll(Arrays.asList(ar));
        if (!s1.isEmpty())
        {
            aj = (String)s1.iterator().next();
            if (q())
            {
                a(aj, null);
                return;
            }
        } else
        {
            c();
            return;
        }
        continue; /* Loop/switch isn't completed */
        if (!"are_accounts_ready_for_login".equals(s1)) goto _L8; else goto _L7
_L7:
        if (grk1 == null || grk1.f())
        {
            a(context.getString(g.sQ));
            return;
        }
        if (grk1.d().getBoolean("are_accounts_ready_for_login")) goto _L10; else goto _L9
_L9:
        if (!ap)
        {
            ap = true;
            v();
            s1 = new gyd("prepare_accounts", b);
            f.a(s1);
            return;
        }
        if (true) goto _L8; else goto _L11
_L11:
    }

    public void a(String s1, String s2)
    {
        aj = s1;
        ak = s2;
        int j = c.b(s1, s2);
        boolean flag;
        if (c.c(j) && b.a(h, j))
        {
            c(j);
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return;
        }
        if (h.j)
        {
            t();
            return;
        } else
        {
            v();
            s1 = new gye("update_account", aj, ak, b, h);
            f.a(s1);
            return;
        }
    }

    public void b()
    {
        f.a(new gyb("load_accounts_add", d));
    }

    public void c()
    {
        if (aq)
        {
            a(false);
            b.a(h, i);
        }
    }

    public void d()
    {
        e();
    }

    void e()
    {
        am = false;
        ao = null;
        if (q())
        {
            r();
        }
    }

    public void onActivityResult(int j, int k, Intent intent)
    {
label0:
        {
            if (j == 1)
            {
                if (k != -1)
                {
                    break label0;
                }
                f();
            }
            return;
        }
        c();
    }

    protected void onAttachBinder(Bundle bundle)
    {
        super.onAttachBinder(bundle);
        b = (gyf)binder.a(gxa);
        c = (gms)binder.a(gms);
        d = (gnd)binder.a(gnd);
        e = (gxi)binder.a(gxi);
        binder.a(gwy, this);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle != null)
        {
            aq = bundle.getBoolean("logging_in");
            am = bundle.getBoolean("login_pending");
            if (am)
            {
                f();
            }
            ap = bundle.getBoolean("preparing_accounts");
            ar = bundle.getStringArray("account_names_snapshot");
            h = (gxe)bundle.getParcelable("login_request");
            i = bundle.getString("tag");
            aj = bundle.getString("selected_account_name");
            ak = bundle.getString("selected_effective_gaia_id");
            al = bundle.getInt("account_id_to_login");
        }
    }

    public void onResume()
    {
        super.onResume();
        v();
        s();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("logging_in", aq);
        bundle.putBoolean("login_pending", am);
        bundle.putBoolean("preparing_accounts", ap);
        bundle.putParcelable("login_request", h);
        bundle.putString("tag", i);
        bundle.putString("selected_account_name", aj);
        bundle.putString("selected_effective_gaia_id", ak);
        bundle.putInt("account_id_to_login", al);
        bundle.putStringArray("account_names_snapshot", ar);
    }

}
