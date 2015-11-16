// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.widget.ListAdapter;

public final class cfj extends gmd
{

    private final ary aj = new cfk(this);
    private hhb ak;
    private hgx al;
    private hjm am;
    private ani an;
    private arx ao;
    private aip ap;
    private amf aq;
    private atd ar;

    public cfj()
    {
        am = new hjm();
    }

    public static ac a(amf amf1)
    {
        Bundle bundle = new Bundle();
        bundle.putSerializable("action_sheet_hangouts_contact", amf1);
        amf1 = new cfj();
        amf1.setArguments(bundle);
        return amf1;
    }

    static aip a(cfj cfj1)
    {
        return cfj1.ap;
    }

    static aip a(cfj cfj1, aip aip1)
    {
        cfj1.ap = aip1;
        return aip1;
    }

    static arx a(cfj cfj1, arx arx)
    {
        cfj1.ao = arx;
        return arx;
    }

    static atd a(cfj cfj1, atd atd1)
    {
        cfj1.ar = atd1;
        return atd1;
    }

    static arx b(cfj cfj1)
    {
        return cfj1.ao;
    }

    static atd c(cfj cfj1)
    {
        return cfj1.ar;
    }

    static ani d(cfj cfj1)
    {
        return cfj1.an;
    }

    static ListAdapter e(cfj cfj1)
    {
        return cfj1.t();
    }

    static hhb f(cfj cfj1)
    {
        return cfj1.ak;
    }

    static hjm g(cfj cfj1)
    {
        return cfj1.am;
    }

    static hgx h(cfj cfj1)
    {
        return cfj1.al;
    }

    static amf i(cfj cfj1)
    {
        return cfj1.aq;
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        ak = new hhb(activity, hgx.a(activity, getParentFragment()));
        al = ak.getBinder();
        al.a(ary, aj);
        an = dbf.e(((gmo)al.a(gmo)).a());
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle == null)
        {
            aq = (amf)getArguments().getSerializable("action_sheet_hangouts_contact");
        } else
        {
            aq = (amf)bundle.getSerializable("action_sheet_hangouts_contact");
            ap = (aip)bundle.getSerializable("action_sheet_edit_participants_model");
            ar = (atd)bundle.getSerializable("action_sheet_conversation_type");
        }
        if (ar != null)
        {
            ao = ((asa)al.a(asa)).a(ak, am, 0, this, ap, ar);
        } else
        {
            g.a(an, 2504);
        }
        am.c(bundle);
    }

    public void onDestroy()
    {
        super.onDestroy();
        am.c();
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        super.onDismiss(dialoginterface);
        if (ar == null)
        {
            g.a(an, 2505);
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        bundle.putSerializable("action_sheet_hangouts_contact", aq);
        bundle.putSerializable("action_sheet_edit_participants_model", ap);
        bundle.putSerializable("action_sheet_conversation_type", ar);
        am.d(bundle);
    }

    protected String q()
    {
        return null;
    }

    protected android.widget.AdapterView.OnItemClickListener r()
    {
        return new cfl(this);
    }

    protected ListAdapter s()
    {
        Object obj;
        ani ani1;
        boolean flag;
        boolean flag1;
        flag1 = true;
        Resources resources = getResources();
        int k = resources.getColor(g.nm);
        int j = resources.getColor(g.nn);
        cfg cfg1 = new cfg(ak);
        boolean flag7 = an.r();
        boolean flag4 = an.q();
        Drawable drawable;
        Drawable drawable1;
        Drawable drawable2;
        amf amf1;
        boolean flag2;
        if (!flag4 || flag7)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        gbh.a("In SMS-only account but can't SMS", flag2);
        obj = resources.getDrawable(n.e);
        drawable = resources.getDrawable(n.k);
        drawable1 = resources.getDrawable(n.h);
        drawable2 = resources.getDrawable(n.m);
        ((Drawable) (obj)).mutate().setColorFilter(j, android.graphics.PorterDuff.Mode.MULTIPLY);
        drawable.mutate().setColorFilter(j, android.graphics.PorterDuff.Mode.MULTIPLY);
        drawable1.mutate().setColorFilter(j, android.graphics.PorterDuff.Mode.MULTIPLY);
        drawable2.mutate().setColorFilter(j, android.graphics.PorterDuff.Mode.MULTIPLY);
        cfg1.add(new cfo(aq));
        if (flag4) goto _L2; else goto _L1
_L1:
        cfg1.add((new gmh(cfn.a - 1, resources.getString(h.iI))).a(((Drawable) (obj))).a(k));
        if (!dbf.e(((gmo)hgx.a(ak, gmo)).a()).ad()) goto _L4; else goto _L3
_L3:
        bnd.a();
        if (!bnd.c()) goto _L4; else goto _L5
_L5:
        flag = true;
_L11:
        if (flag) goto _L7; else goto _L6
_L6:
        obj = ak;
        amf1 = aq;
        ani1 = dbf.e(((gmo)hgx.a(((Context) (obj)), gmo)).a());
        if (amf1.q()) goto _L9; else goto _L8
_L8:
        ebw.a("Babel_CallUtil", "Contact does not have phone number");
_L15:
        flag = false;
_L13:
        if (!flag) goto _L10; else goto _L7
_L7:
        cfg1.add((new gmh(cfn.c - 1, resources.getString(h.iZ))).a(drawable).a(k));
_L10:
        cfg1.add((new gmh(cfn.d - 1, resources.getString(h.iY))).a(drawable1).a(k));
_L2:
        if (flag7 && aq.q())
        {
            cfg1.add((new gmh(cfn.b - 1, resources.getString(h.iX))).a(drawable2).a(k));
        }
        return cfg1;
_L4:
        flag = false;
          goto _L11
_L9:
        boolean flag3;
        boolean flag5;
        boolean flag6;
        if (ani1.ad() && ((dan)hgx.a(((Context) (obj)), dan)).a(((Context) (obj)), ani1))
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        if (ani1.ad() && ebz.e())
        {
            flag5 = true;
        } else
        {
            flag5 = false;
        }
        obj = ((ConnectivityManager)((Context) (obj)).getSystemService("connectivity")).getActiveNetworkInfo();
        if (obj != null && ((NetworkInfo) (obj)).isConnected())
        {
            flag6 = true;
        } else
        {
            flag6 = false;
        }
        ebw.a("Babel_CallUtil", (new StringBuilder(81)).append("canCallOverHangoutsDialer: ").append(flag3).append(" canCallOverPstn: ").append(flag5).append(" hasCellularService: ").append(flag6).toString());
        flag = flag1;
        if (flag3) goto _L13; else goto _L12
_L12:
        if (!flag5 || !flag6) goto _L15; else goto _L14
_L14:
        flag = flag1;
          goto _L13
    }
}
