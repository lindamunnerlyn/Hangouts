// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Collections;
import java.util.Locale;

public final class crw extends hmm
{

    private doi a;
    private crk aj;
    private boolean ak;
    private boolean al;
    private aha b;
    private EditText c;
    private String d;
    private String e;
    private aoa f;
    private View g;
    private boolean h;
    private boolean i;

    public crw()
    {
        g = null;
    }

    static doi a(crw crw1, doi doi1)
    {
        crw1.a = doi1;
        return doi1;
    }

    static String a(crw crw1)
    {
        return crw1.b();
    }

    static String a(crw crw1, String s)
    {
        crw1.d = s;
        return s;
    }

    private void a(boolean flag)
    {
        c = (EditText)g.findViewById(w.v);
        Object obj;
        Object obj1;
        EditText edittext;
        Spinner spinner;
        if (!TextUtils.isEmpty(d))
        {
            obj = eey.a(d);
            obj1 = eey.a(d, efb.c);
            obj1 = ((String) (obj1)).substring(((String) (obj1)).indexOf(' ') + 1);
        } else
        {
            String s = Locale.getDefault().getCountry();
            Object obj2 = null;
            obj1 = obj2;
            obj = s;
            if (flag)
            {
                g.a(f, 1979);
                obj1 = obj2;
                obj = s;
            }
        }
        c.setText(((CharSequence) (obj1)));
        doh.a(((String) (obj)));
        a = doh.b(((String) (obj)));
        obj1 = doh.a();
        b = new aha(((String) (obj)));
        c.addTextChangedListener(b);
        edittext = (EditText)g.findViewById(w.p);
        obj = String.valueOf(a.c);
        if (((String) (obj)).length() != 0)
        {
            obj = "+".concat(((String) (obj)));
        } else
        {
            obj = new String("+");
        }
        edittext.setText(((CharSequence) (obj)));
        obj = new csb(this, getActivity(), ((java.util.List) (obj1)));
        spinner = (Spinner)g.findViewById(w.q);
        spinner.setAdapter(((android.widget.SpinnerAdapter) (obj)));
        spinner.setPrompt(getActivity().getString(g.of));
        edittext.setOnClickListener(new crz(this, spinner));
        spinner.setOnItemSelectedListener(new csa(this, ((java.util.List) (obj1)), edittext));
    }

    static boolean a(crw crw1, boolean flag)
    {
        crw1.al = flag;
        return flag;
    }

    static aoa b(crw crw1)
    {
        return crw1.f;
    }

    private String b()
    {
        String s;
        if (aj == null)
        {
            s = "";
        } else
        {
            String s1 = aj.b();
            s = s1;
            if (TextUtils.isEmpty(s1))
            {
                String s2 = eey.g();
                s = s2;
                if (TextUtils.isEmpty(s2))
                {
                    return aj.c();
                }
            }
        }
        return s;
    }

    static void b(crw crw1, boolean flag)
    {
        crw1.a(flag);
    }

    static doi c(crw crw1)
    {
        return crw1.a;
    }

    static aha d(crw crw1)
    {
        return crw1.b;
    }

    static hlt e(crw crw1)
    {
        return crw1.context;
    }

    public String a()
    {
        String s = eey.b(c.getText().toString(), a.b);
        if (s != null)
        {
            d = s;
        }
        return d;
    }

    protected boolean a(int j)
    {
        if (j != w.l) goto _L2; else goto _L1
_L1:
        Object obj = eey.b(c.getText().toString(), a.b);
        if (obj != null) goto _L4; else goto _L3
_L3:
        obj = getActivity().getString(g.oj);
        obj = Toast.makeText(getActivity(), ((CharSequence) (obj)), 0);
        ((Toast) (obj)).setGravity(49, 0, 0);
        ((Toast) (obj)).show();
_L6:
        return false;
_L4:
        if (!((String) (obj)).equals(d))
        {
            d = ((String) (obj));
            g.a(f, 1980);
        }
        g.a(f, 2195);
        if (ak)
        {
            if (al)
            {
                g.a(f, 2632);
            } else
            {
                g.a(f, 2633);
            }
        }
        if (aj != null)
        {
            aj.a(d, e, i);
        }
        return true;
_L2:
        if (j == w.k && !h)
        {
            g.a(f, 2683);
            return false;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        ((cjg)binder.a(cjg)).a(w.j, new crx(this, bundle));
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        h = getArguments().getBoolean("from_settings", false);
        i = getArguments().getBoolean("set_discoverability", true);
        gqu gqu1 = (gqu)binder.a(gqu);
        f = dcn.e(gqu1.a());
        e = gqu1.c().b("account_name");
        aj = (crk)binder.b(crk);
        if (bundle != null) goto _L2; else goto _L1
_L1:
        g.a(f, 2685);
        if (!h) goto _L4; else goto _L3
_L3:
        g.a(f, 1977);
_L5:
        aoc.f(context, f);
_L2:
        g = layoutinflater.inflate(g.nZ, viewgroup, false);
        layoutinflater = (TextView)g.findViewById(w.r);
        if (!i)
        {
            break MISSING_BLOCK_LABEL_311;
        }
        layoutinflater.setVisibility(0);
        viewgroup = g.f("https://support.google.com/hangouts/answer/3116671?hl=%locale%", "phone_verification");
        viewgroup = getActivity().getString(g.og, new Object[] {
            viewgroup.toString()
        });
        g.a(layoutinflater, context, viewgroup);
        layoutinflater.setOnClickListener(new cry(this));
_L6:
        if (!eey.i())
        {
            break MISSING_BLOCK_LABEL_320;
        }
        d = b();
        boolean flag;
        if (bundle == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        try
        {
            a(flag);
        }
        // Misplaced declaration of an exception variable
        catch (LayoutInflater layoutinflater)
        {
            eev.d("Babel", "NPE in Phone Verification, dismissing the promo", layoutinflater.fillInStackTrace());
            if (aj != null)
            {
                aj.d();
            }
            getActivity().finish();
        }
        return g;
_L4:
        g.a(f, 1596);
          goto _L5
        layoutinflater.setVisibility(8);
          goto _L6
        ((cjg)binder.a(cjg)).a(w.j, Collections.singletonList("android.permission.READ_PHONE_STATE"), 2655, null);
        ak = true;
        if (bundle != null)
        {
            break MISSING_BLOCK_LABEL_255;
        }
        g.a(f, 2634);
        break MISSING_BLOCK_LABEL_255;
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        if (c != null)
        {
            String s = eey.b(c.getText().toString(), a.b);
            if (s != null && aj != null)
            {
                aj.b(s);
            }
        }
        super.onSaveInstanceState(bundle);
    }
}
