// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class hct extends hmm
    implements grl, gvb, hbi
{

    private static final String a[] = {
        "update_account", "prepare_accounts", "logout_during_login", "logout", "load_accounts_add", "load_accounts_add_account_activity", "are_accounts_ready_for_login"
    };
    private String aj;
    private String ak;
    private int al;
    private boolean am;
    private Runnable an;
    private boolean ao;
    private boolean ap;
    private boolean aq;
    private boolean ar;
    private String as[];
    private hda b;
    private gqz c;
    private grk d;
    private hbt e;
    private final gvc f;
    private final gxn g;
    private hbo h;
    private String i;

    public hct()
    {
        f = (new gvc(this, lifecycle)).a(this);
        g = new gxn(lifecycle);
        al = -1;
    }

    static gvv a(hcf hcf1)
    {
        gvv gvv1 = new gvv(hcf1.a);
        gvv1.d().putBoolean("has_recoverable_error", hcf1.b);
        gvv1.d().putBoolean("has_irrecoverable_error", hcf1.c);
        gvv1.d().putInt("account_id", hcf1.d);
        return gvv1;
    }

    public static hct a(ap ap1)
    {
        hct hct2 = (hct)ap1.a("login.fragment");
        hct hct1 = hct2;
        if (hct2 == null)
        {
            hct1 = new hct();
            bg bg1 = ap1.a();
            bg1.a(hct1, "login.fragment");
            bg1.b();
            ap1.b();
        }
        return hct1;
    }

    private void a(String s1)
    {
        String s3 = h.b;
        String s2 = s3;
        if ("com.google.android.libraries.social.login.LoginRequest.DEFAULT_ERROR_TOAST".equals(s3))
        {
            if (aj != null)
            {
                s2 = aj;
            } else
            {
                s2 = h.o;
            }
            s2 = context.getString(g.tq, new Object[] {
                s2
            });
        }
        b(s2, s1);
    }

    private void a(boolean flag)
    {
        String as1[] = a;
        int k = as1.length;
        for (int j = 0; j < k; j++)
        {
            String s1 = as1[j];
            f.b(s1);
        }

        x();
        ap = false;
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
            a((new StringBuilder(32)).append("Not a valid account: ").append(j).toString());
            return;
        } else
        {
            grb grb1 = c.a(j);
            a(grb1.b("account_name"), grb1.b("effective_gaia_id"));
            return;
        }
    }

    private void c(int j)
    {
        Iterator iterator = binder.c(hcc).iterator();
        int k = -1;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            int l = ((hcc)iterator.next()).a();
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
            hcx hcx1 = new hcx("logout_during_login", k, b);
            f.a(hcx1);
            return;
        }
        if (h.g)
        {
            c.a(h.e, j);
        }
        a(false);
        b.a(h, i, j);
    }

    private void c(String s1, String s2)
    {
        int j = c.c(s1);
        if (j == -1)
        {
            a("Viewer account id invalid");
            return;
        } else
        {
            a(c.a(j).b("account_name"), s2);
            return;
        }
    }

    private void f()
    {
        am = true;
        if (an == null)
        {
            an = itp.a(new hcu(this));
        }
        g.a(an);
    }

    private boolean q()
    {
        while (ao || f.a("are_accounts_ready_for_login")) 
        {
            return false;
        }
        if (h.j)
        {
            return true;
        } else
        {
            f.a(new hcv("are_accounts_ready_for_login", b));
            return false;
        }
    }

    private void r()
    {
        boolean flag1;
        flag1 = true;
        x();
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
                        a("Account not found");
                    }
                    j = 1;
                } else
                {
                    j = 0;
                }
            } while (j != 0);
            if (h.q != null)
            {
                c(h.q, h.p);
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
            break MISSING_BLOCK_LABEL_391;
        }
        j = c.d(h.e);
        if (!b.a(h, j))
        {
            break MISSING_BLOCK_LABEL_391;
        }
        flag2 = a(j);
_L12:
        if (!flag2)
        {
            if (h.s != null)
            {
                ar = true;
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
        c(h.n, h.m);
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
        if (ar && isResumed())
        {
            x();
            ar = false;
            aq = true;
            hbb hbb1 = (hbb)binder.a(h.s);
            String s1 = hbb1.getClass().getName();
            ap ap1 = getChildFragmentManager();
            ad ad1 = ap1.a(s1);
            if (ad1 == null)
            {
                Bundle bundle = h.t;
                ad1 = hbb1.a(bundle);
                ad1.setArguments(bundle);
                ap1.a().a(ad1, s1).b();
                ap1.b();
            }
            ((hbc)ad1).a(h);
        }
    }

    private void t()
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

    private void u()
    {
        a(false);
    }

    private void v()
    {
        e.b(getChildFragmentManager());
    }

    private void w()
    {
        if (isResumed() && (ao || ap) && !aq)
        {
            String s1 = h.a;
            if (s1 == null)
            {
                s1 = context.getString(g.ts);
            }
            e.a(getChildFragmentManager(), s1, h.i);
        }
    }

    private void x()
    {
        e.a(getChildFragmentManager());
    }

    public void a()
    {
        f.a(new hcw("load_accounts_add_account_activity", d));
    }

    public void a(hbo hbo1, String s1)
    {
        if (ap)
        {
            a(true);
            b.a(h, i);
        }
        ap = true;
        h = hbo1;
        i = s1;
        aj = null;
        ak = null;
        al = -1;
        f();
    }

    public void a(String s1, gvv gvv1, gvs gvs1)
    {
        int j;
        boolean flag;
        flag = false;
        j = 0;
        gvs1.a(false);
        if (!"update_account".equals(s1)) goto _L2; else goto _L1
_L1:
        if (gvv1 != null) goto _L4; else goto _L3
_L3:
        v();
_L8:
        return;
_L4:
        j = gvv1.d().getInt("account_id");
        if (gvv1.d().getBoolean("has_irrecoverable_error"))
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
        if (gvv1.d().getBoolean("has_recoverable_error"))
        {
            v();
            return;
        }
        if (!b.a(h, j))
        {
            if (c.c(j))
            {
                hbq hbq1 = b.b(h, j);
                if (hbq1 != null)
                {
                    gvs1 = hbq1.getClass().getName();
                    ap ap1 = getChildFragmentManager();
                    gvv1 = ap1.a(gvs1);
                    s1 = gvv1;
                    if (gvv1 == null)
                    {
                        gvv1 = hbq1.b();
                        s1 = gvv1;
                        if (gvv1 != null)
                        {
                            ap1.a().a(gvv1, gvs1).b();
                            ap1.b();
                            s1 = gvv1;
                        }
                    }
                    s1 = (hbr)s1;
                    if (s1 != null)
                    {
                        s1.a(j);
                        return;
                    }
                }
            }
            a((new StringBuilder(52)).append("Login request not satisfied for account: ").append(j).toString());
            return;
        } else
        {
            c(j);
            return;
        }
_L2:
        if (!"prepare_accounts".equals(s1)) goto _L6; else goto _L5
_L5:
        ao = false;
_L10:
        r();
        return;
_L6:
        if ("logout_during_login".equals(s1))
        {
            t();
            return;
        }
        if ("logout".equals(s1))
        {
            u();
            return;
        }
        if ("load_accounts_add".equals(s1))
        {
            if (gvv1 == null || gvv1.f())
            {
                if (gvv1 != null)
                {
                    j = gvv1.a();
                }
                b(context.getString(g.tr), (new StringBuilder(54)).append("Load accounts for add account task failed: ").append(j).toString());
                return;
            } else
            {
                as = gvv1.d().getStringArray("account_name_array");
                d.a(this);
                return;
            }
        }
        if (!"load_accounts_add_account_activity".equals(s1))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (gvv1 == null || gvv1.f())
        {
            int k;
            if (gvv1 == null)
            {
                k = ((flag) ? 1 : 0);
            } else
            {
                k = gvv1.a();
            }
            b(context.getString(g.tr), (new StringBuilder(58)).append("Load accounts for add account activity failed: ").append(k).toString());
            return;
        }
        s1 = new HashSet(Arrays.asList(gvv1.d().getStringArray("account_name_array")));
        s1.removeAll(Arrays.asList(as));
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
        if (gvv1 == null || gvv1.f())
        {
            b(context.getString(g.tr), "Task result has error");
            return;
        }
        if (gvv1.d().getBoolean("are_accounts_ready_for_login")) goto _L10; else goto _L9
_L9:
        if (!ao)
        {
            ao = true;
            w();
            s1 = new hcy("prepare_accounts", b);
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
            a("RPCs disallowed");
            return;
        } else
        {
            w();
            s1 = new hcz("update_account", aj, ak, b, h);
            f.a(s1);
            return;
        }
    }

    public void b()
    {
        f.a(new hcw("load_accounts_add", d));
    }

    public void b(String s1, String s2)
    {
        s2 = String.valueOf(s2);
        if (s2.length() != 0)
        {
            s2 = "Login failed: ".concat(s2);
        } else
        {
            s2 = new String("Login failed: ");
        }
        Log.e("LoginHelperFragment", s2);
        if (s1 != null)
        {
            Toast.makeText(context, s1, 1).show();
        }
        c();
    }

    public void c()
    {
        if (ap)
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
        an = null;
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
        b = (hda)binder.a(hbk);
        c = (gqz)binder.a(gqz);
        d = (grk)binder.a(grk);
        e = (hbt)binder.a(hbt);
        binder.a(hbi, this);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle != null)
        {
            ap = bundle.getBoolean("logging_in");
            am = bundle.getBoolean("login_pending");
            if (am)
            {
                f();
            }
            ar = bundle.getBoolean("interactive_login_pending");
            aq = bundle.getBoolean("logging_in_interactively");
            ao = bundle.getBoolean("preparing_accounts");
            as = bundle.getStringArray("account_names_snapshot");
            h = (hbo)bundle.getParcelable("login_request");
            i = bundle.getString("tag");
            aj = bundle.getString("selected_account_name");
            ak = bundle.getString("selected_effective_gaia_id");
            al = bundle.getInt("account_id_to_login");
        }
    }

    public void onResume()
    {
        super.onResume();
        w();
        s();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("logging_in", ap);
        bundle.putBoolean("login_pending", am);
        bundle.putBoolean("preparing_accounts", ao);
        bundle.putParcelable("login_request", h);
        bundle.putString("tag", i);
        bundle.putString("selected_account_name", aj);
        bundle.putString("selected_effective_gaia_id", ak);
        bundle.putInt("account_id_to_login", al);
        bundle.putStringArray("account_names_snapshot", as);
        bundle.putBoolean("interactive_login_pending", ar);
        bundle.putBoolean("logging_in_interactively", aq);
    }

}
