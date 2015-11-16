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

public final class cqf extends hhu
{

    private dll a;
    private cpt aj;
    private boolean ak;
    private boolean al;
    private ahi b;
    private EditText c;
    private String d;
    private String e;
    private ani f;
    private View g;
    private boolean h;
    private boolean i;

    public cqf()
    {
        g = null;
    }

    static dll a(cqf cqf1, dll dll1)
    {
        cqf1.a = dll1;
        return dll1;
    }

    static String a(cqf cqf1)
    {
        return cqf1.b();
    }

    static String a(cqf cqf1, String s)
    {
        cqf1.d = s;
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
            obj = ebz.a(d);
            obj1 = ebz.a(d, ecc.c);
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
        dlk.a(((String) (obj)));
        a = dlk.b(((String) (obj)));
        obj1 = dlk.a();
        b = new ahi(((String) (obj)));
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
        obj = new cqk(this, getActivity(), ((java.util.List) (obj1)));
        spinner = (Spinner)g.findViewById(w.q);
        spinner.setAdapter(((android.widget.SpinnerAdapter) (obj)));
        spinner.setPrompt(getActivity().getString(g.od));
        edittext.setOnClickListener(new cqi(this, spinner));
        spinner.setOnItemSelectedListener(new cqj(this, ((java.util.List) (obj1)), edittext));
    }

    static boolean a(cqf cqf1, boolean flag)
    {
        cqf1.al = flag;
        return flag;
    }

    static ani b(cqf cqf1)
    {
        return cqf1.f;
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
                String s2 = ebz.g();
                s = s2;
                if (TextUtils.isEmpty(s2))
                {
                    return aj.c();
                }
            }
        }
        return s;
    }

    static void b(cqf cqf1, boolean flag)
    {
        cqf1.a(flag);
    }

    static dll c(cqf cqf1)
    {
        return cqf1.a;
    }

    static ahi d(cqf cqf1)
    {
        return cqf1.b;
    }

    static hhb e(cqf cqf1)
    {
        return cqf1.context;
    }

    public String a()
    {
        String s = ebz.b(c.getText().toString(), a.b);
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
        Object obj = ebz.b(c.getText().toString(), a.b);
        if (obj != null) goto _L4; else goto _L3
_L3:
        obj = getActivity().getString(g.oh);
        obj = Toast.makeText(getActivity(), ((CharSequence) (obj)), 1);
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
        ((cia)binder.a(cia)).a(w.j, new cqg(this, bundle));
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        h = getArguments().getBoolean("from_settings", false);
        i = getArguments().getBoolean("set_discoverability", true);
        gmo gmo1 = (gmo)binder.a(gmo);
        f = dbf.e(gmo1.a());
        e = gmo1.c().b("account_name");
        aj = (cpt)binder.b(cpt);
        if (bundle != null) goto _L2; else goto _L1
_L1:
        g.a(f, 2685);
        if (!h) goto _L4; else goto _L3
_L3:
        g.a(f, 1977);
_L5:
        ank.f(context, f);
_L2:
        g = layoutinflater.inflate(g.nX, viewgroup, false);
        layoutinflater = (TextView)g.findViewById(w.r);
        if (!i)
        {
            break MISSING_BLOCK_LABEL_311;
        }
        layoutinflater.setVisibility(0);
        viewgroup = g.f("https://support.google.com/hangouts/answer/3116671?hl=%locale%", "phone_verification");
        viewgroup = getActivity().getString(g.oe, new Object[] {
            viewgroup.toString()
        });
        g.a(layoutinflater, context, viewgroup);
        layoutinflater.setOnClickListener(new cqh(this));
_L6:
        if (!ebz.i())
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
            ebw.d("Babel", "NPE in Phone Verification, dismissing the promo", layoutinflater.fillInStackTrace());
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
        ((cia)binder.a(cia)).a(w.j, Collections.singletonList("android.permission.READ_PHONE_STATE"), 2655, null);
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
            String s = ebz.b(c.getText().toString(), a.b);
            if (s != null && aj != null)
            {
                aj.b(s);
            }
        }
        super.onSaveInstanceState(bundle);
    }
}
