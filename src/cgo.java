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

public final class cgo extends gqj
{

    private final asn aj = new cgp(this);
    private hlt ak;
    private hlp al;
    private hof am;
    private aoa an;
    private asm ao;
    private aii ap;
    private amx aq;
    private atu ar;

    public cgo()
    {
        am = new hof();
    }

    static aii a(cgo cgo1)
    {
        return cgo1.ap;
    }

    static aii a(cgo cgo1, aii aii1)
    {
        cgo1.ap = aii1;
        return aii1;
    }

    static asm a(cgo cgo1, asm asm)
    {
        cgo1.ao = asm;
        return asm;
    }

    static atu a(cgo cgo1, atu atu1)
    {
        cgo1.ar = atu1;
        return atu1;
    }

    static asm b(cgo cgo1)
    {
        return cgo1.ao;
    }

    static atu c(cgo cgo1)
    {
        return cgo1.ar;
    }

    static aoa d(cgo cgo1)
    {
        return cgo1.an;
    }

    static hlt e(cgo cgo1)
    {
        return cgo1.ak;
    }

    static hlp f(cgo cgo1)
    {
        return cgo1.al;
    }

    static ListAdapter g(cgo cgo1)
    {
        return cgo1.t();
    }

    static hof h(cgo cgo1)
    {
        return cgo1.am;
    }

    static amx i(cgo cgo1)
    {
        return cgo1.aq;
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        ak = new hlt(activity, hlp.a(activity, getParentFragment()));
        al = ak.getBinder();
        am.a(new cgq(this));
        al.a(asn, aj);
        an = dcn.e(((gqu)al.a(gqu)).a());
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle == null)
        {
            aq = (amx)getArguments().getSerializable("action_sheet_hangouts_contact");
        } else
        {
            aq = (amx)bundle.getSerializable("action_sheet_hangouts_contact");
            ap = (aii)bundle.getSerializable("action_sheet_edit_participants_model");
            ar = (atu)bundle.getSerializable("action_sheet_conversation_type");
        }
        if (ar != null)
        {
            ao = ((asp)al.a(asp)).a(ak, am, 0, this, ap, ar);
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
        return new cgr(this);
    }

    protected ListAdapter s()
    {
        Object obj;
        aoa aoa1;
        boolean flag;
        boolean flag1;
        flag1 = true;
        Resources resources = getResources();
        int k = resources.getColor(g.nn);
        int j = resources.getColor(g.no);
        cgl cgl1 = new cgl(ak);
        boolean flag7 = an.p();
        boolean flag4 = an.o();
        Drawable drawable;
        Drawable drawable1;
        Drawable drawable2;
        amx amx1;
        boolean flag2;
        if (!flag4 || flag7)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        gdv.a("In SMS-only account but can't SMS", flag2);
        obj = resources.getDrawable(n.e);
        drawable = resources.getDrawable(n.k);
        drawable1 = resources.getDrawable(n.h);
        drawable2 = resources.getDrawable(n.m);
        ((Drawable) (obj)).mutate().setColorFilter(j, android.graphics.PorterDuff.Mode.MULTIPLY);
        drawable.mutate().setColorFilter(j, android.graphics.PorterDuff.Mode.MULTIPLY);
        drawable1.mutate().setColorFilter(j, android.graphics.PorterDuff.Mode.MULTIPLY);
        drawable2.mutate().setColorFilter(j, android.graphics.PorterDuff.Mode.MULTIPLY);
        cgl1.add(new cgu(aq));
        if (flag4) goto _L2; else goto _L1
_L1:
        cgl1.add((new gqn(cgt.a - 1, resources.getString(h.iE))).a(((Drawable) (obj))).a(k));
        if (!dcn.e(((gqu)hlp.a(ak, gqu)).a()).aa()) goto _L4; else goto _L3
_L3:
        bnk.a();
        if (!bnk.c()) goto _L4; else goto _L5
_L5:
        flag = true;
_L11:
        if (flag) goto _L7; else goto _L6
_L6:
        obj = ak;
        amx1 = aq;
        aoa1 = dcn.e(((gqu)hlp.a(((Context) (obj)), gqu)).a());
        if (amx1.q()) goto _L9; else goto _L8
_L8:
        eev.a("Babel_CallUtil", "Contact does not have phone number");
_L15:
        flag = false;
_L13:
        if (!flag) goto _L10; else goto _L7
_L7:
        cgl1.add((new gqn(cgt.c - 1, resources.getString(h.iX))).a(drawable).a(k));
_L10:
        cgl1.add((new gqn(cgt.d - 1, resources.getString(h.iW))).a(drawable1).a(k));
_L2:
        if (flag7 && aq.q())
        {
            cgl1.add((new gqn(cgt.b - 1, resources.getString(h.iV))).a(drawable2).a(k));
        }
        return cgl1;
_L4:
        flag = false;
          goto _L11
_L9:
        boolean flag3;
        boolean flag5;
        boolean flag6;
        if (aoa1.aa() && ((dbt)hlp.a(((Context) (obj)), dbt)).a(((Context) (obj)), aoa1))
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        if (aoa1.aa() && eey.e())
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
        eev.a("Babel_CallUtil", (new StringBuilder(81)).append("canCallOverHangoutsDialer: ").append(flag3).append(" canCallOverPstn: ").append(flag5).append(" hasCellularService: ").append(flag6).toString());
        flag = flag1;
        if (flag3) goto _L13; else goto _L12
_L12:
        if (!flag5 || !flag6) goto _L15; else goto _L14
_L14:
        flag = flag1;
          goto _L13
    }
}
