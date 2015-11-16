// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.libraries.quantum.snackbar.Snackbar;

public final class cqa extends cqw
{

    cqf a;
    private boolean aj;
    private String ak;
    private ani al;
    cqn b;
    cql c;
    private int d;
    private View e;
    private Button f;
    private Button g;
    private boolean h;
    private String i;

    public cqa()
    {
        super(g.nU, new int[] {
            w.k, w.l
        });
    }

    public static cqa a(boolean flag)
    {
        cqa cqa1 = new cqa();
        Bundle bundle = new Bundle();
        bundle.putBoolean("from_settings", flag);
        bundle.putBoolean("set_discoverability", true);
        bundle.putInt("current_step", 1);
        cqa1.setArguments(bundle);
        return cqa1;
    }

    private void b()
    {
        bg bg1 = getActivity().t_().a();
        if (d != 1) goto _L2; else goto _L1
_L1:
        boolean flag = h;
        boolean flag2 = aj;
        cqf cqf1 = new cqf();
        Bundle bundle = new Bundle();
        bundle.putBoolean("from_settings", flag);
        bundle.putBoolean("set_discoverability", flag2);
        cqf1.setArguments(bundle);
        a = cqf1;
        bg1.b(w.o, a);
_L4:
        bg1.b();
        c();
        return;
_L2:
        if (d == 2)
        {
            String s = i;
            boolean flag1 = aj;
            cqn cqn1 = new cqn();
            Bundle bundle1 = new Bundle();
            bundle1.putBoolean("set_discoverability", flag1);
            bundle1.putString("phone_number", s);
            cqn1.setArguments(bundle1);
            b = cqn1;
            bg1.b(w.o, b);
        } else
        if (d == 3)
        {
            String s1 = i;
            cql cql1 = new cql();
            Bundle bundle2 = new Bundle();
            bundle2.putString("phone_number", s1);
            cql1.setArguments(bundle2);
            c = cql1;
            bg1.b(w.o, c);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void c()
    {
        Snackbar snackbar = (Snackbar)e.findViewById(w.m);
        snackbar.setVisibility(8);
        if (d == 1)
        {
            snackbar.a(Html.fromHtml(getActivity().getString(g.oj, new Object[] {
                ak
            })));
            snackbar.setVisibility(0);
            if (h)
            {
                g.setText(g.oa);
            } else
            {
                g.setText(g.ok);
            }
            f.setText(g.oc);
        } else
        {
            if (d == 2)
            {
                g.setText(g.oa);
                f.setText(g.on);
                return;
            }
            if (d == 3)
            {
                f.setText(g.of);
                return;
            }
        }
    }

    protected String a()
    {
        if (d == 1)
        {
            return getString(g.og);
        }
        if (d == 2)
        {
            return getString(g.ob);
        }
        if (d == 3)
        {
            return getString(g.oo);
        } else
        {
            return "";
        }
    }

    protected void a(int j)
    {
        if (d != 1) goto _L2; else goto _L1
_L1:
        if (j != w.l) goto _L4; else goto _L3
_L3:
        if (a.a(j))
        {
            i = a.a();
            d = 2;
        }
        b();
_L6:
        return;
_L4:
        if (j == w.k)
        {
            ank.f(getContext(), al);
            if (h)
            {
                getActivity().finish();
                return;
            } else
            {
                g.a(al, 2684);
                super.a(j);
                return;
            }
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (d != 2)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (j != w.l)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (b.a(j))
        {
            ank.f(getContext(), al);
            d = 3;
            b();
            return;
        }
        continue; /* Loop/switch isn't completed */
        if (j != w.k) goto _L6; else goto _L5
_L5:
        g.a(al, 2407);
        d = 1;
        b();
        return;
        if (d != 3) goto _L6; else goto _L7
_L7:
        if (j == w.l)
        {
            c.a(j);
            d = 1;
            if (h)
            {
                getActivity().finish();
                return;
            } else
            {
                super.a(j);
                return;
            }
        }
        if (j == w.k)
        {
            d = 2;
            b();
            return;
        }
        if (true) goto _L6; else goto _L8
_L8:
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        Object obj;
        if (bundle != null)
        {
            obj = bundle;
        } else
        {
            obj = getArguments();
        }
        d = ((Bundle) (obj)).getInt("current_step");
        i = ((Bundle) (obj)).getString("phone_number");
        h = ((Bundle) (obj)).getBoolean("from_settings");
        aj = ((Bundle) (obj)).getBoolean("set_discoverability");
        obj = (gmo)binder.a(gmo);
        al = dbf.e(((gmo) (obj)).a());
        ak = ((gmo) (obj)).c().b("account_name");
        obj = (cpt)binder.b(cpt);
        if (obj != null && ((cpt) (obj)).a() == 101 && bundle == null)
        {
            d = 2;
            i = ((cpt) (obj)).b();
        }
        e = super.onCreateView(layoutinflater, viewgroup, bundle);
        g = (Button)e.findViewById(w.k);
        f = (Button)e.findViewById(w.l);
        f.setTextColor(e.getResources().getColor(h.jb));
        if (bundle != null) goto _L2; else goto _L1
_L1:
        b();
_L4:
        return e;
_L2:
        layoutinflater = getActivity().t_();
        if (d != 1)
        {
            break; /* Loop/switch isn't completed */
        }
        a = (cqf)layoutinflater.a(w.o);
_L5:
        c();
        if (true) goto _L4; else goto _L3
_L3:
        if (d == 2)
        {
            b = (cqn)layoutinflater.a(w.o);
        } else
        if (d == 3)
        {
            c = (cql)layoutinflater.a(w.o);
        }
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        bundle.putInt("current_step", d);
        bundle.putString("phone_number", i);
        bundle.putBoolean("from_settings", h);
        bundle.putBoolean("set_discoverability", aj);
        super.onSaveInstanceState(bundle);
    }
}
