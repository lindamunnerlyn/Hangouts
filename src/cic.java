// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public class cic extends bkk
{

    private long a;
    private atu aj;
    private boolean ak;
    private cil al;
    private cip am;
    private cin an;
    private cio ao;
    private cih ap;
    private cig aq;
    private android.view.View.OnClickListener ar;
    private SparseArray as;
    private amx at;
    private boolean au;
    private final cii av = new cii(this);
    private final cik aw = new cik(this);
    private bye ax;
    private Parcelable ay;
    private long b;
    private gqu c;
    private final gxu d;
    private yt e;
    private chn f;
    private boolean g;
    private aoa h;
    private aii i;

    public cic()
    {
        d = new gxu(lifecycle);
        al = new cil(this);
        am = new cip(this);
        an = new cin(this);
        ao = new cio(this);
        ap = new cih(this);
        aq = new cig(this);
        ar = new cij(this);
        new eda(this, lifecycle);
    }

    static long a(cic cic1, long l1)
    {
        cic1.a = l1;
        return l1;
    }

    private aoa a()
    {
        return dcn.e(c.a());
    }

    private void a(amx amx1, int i1)
    {
        g.a(h, i1);
        Bundle bundle = new Bundle();
        bundle.putSerializable("action_sheet_hangouts_contact", amx1);
        amx1 = new cgo();
        amx1.setArguments(bundle);
        amx1.a(getFragmentManager(), null);
    }

    static void a(cic cic1)
    {
        cic1.b(true);
    }

    static void a(cic cic1, int i1)
    {
        cic1.as.remove(i1);
        if (g.a(cic1.as))
        {
            RealTimeChatService.b(cic1.ao);
        }
    }

    static void a(cic cic1, amx amx1)
    {
        cic1.a(amx1, 2768);
    }

    static void a(cic cic1, View view)
    {
        cic1.b(view);
    }

    static boolean a(cic cic1, boolean flag)
    {
        cic1.au = flag;
        return flag;
    }

    static long b(cic cic1, long l1)
    {
        cic1.b = l1;
        return l1;
    }

    static amx b(cic cic1, amx amx1)
    {
        cic1.at = amx1;
        return amx1;
    }

    static aoa b(cic cic1)
    {
        return cic1.h;
    }

    private void b(View view)
    {
        if (view == null)
        {
            return;
        }
        View view1 = view.findViewById(h.fv);
        View view2 = view.findViewById(l.tJ);
        view2.setVisibility(8);
        if (au)
        {
            e.setVisibility(8);
            view1.setVisibility(0);
            d.a(gxx.b);
            return;
        }
        boolean flag;
        if (f == null || !f.b(false))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            e.setVisibility(8);
            view1.setVisibility(8);
            d.a(gxx.a);
            return;
        }
        if (isEmpty())
        {
            view2.setVisibility(0);
            e.setVisibility(8);
            view1.setVisibility(8);
            setupEmptyView(view, h.iP, h.iO);
            d.a(gxx.c);
            g.a(h, 2138);
            return;
        }
        e.setVisibility(0);
        if (ay != null)
        {
            e.d().a(ay);
            ay = null;
        }
        view1.setVisibility(8);
        d.a(gxx.b);
    }

    private void b(boolean flag)
    {
        d.a(gxx.a);
        bq bq1 = getLoaderManager();
        if (flag)
        {
            if (ak)
            {
                bq1.b(0, null, an);
            }
            bq1.b(1, null, an);
            return;
        }
        if (ak)
        {
            bq1.a(0, null, an);
        }
        bq1.a(1, null, an);
    }

    static hlt c(cic cic1)
    {
        return cic1.context;
    }

    static hlp d(cic cic1)
    {
        return cic1.binder;
    }

    static chn e(cic cic1)
    {
        return cic1.f;
    }

    static bye f(cic cic1)
    {
        return cic1.ax;
    }

    static hlt g(cic cic1)
    {
        return cic1.context;
    }

    static hlt h(cic cic1)
    {
        return cic1.context;
    }

    static boolean i(cic cic1)
    {
        return cic1.ak;
    }

    static hlt j(cic cic1)
    {
        return cic1.context;
    }

    static gqu k(cic cic1)
    {
        return cic1.c;
    }

    static atu l(cic cic1)
    {
        return cic1.aj;
    }

    static aii m(cic cic1)
    {
        return cic1.i;
    }

    static long n(cic cic1)
    {
        return cic1.a;
    }

    static hlt o(cic cic1)
    {
        return cic1.context;
    }

    static long p(cic cic1)
    {
        return cic1.b;
    }

    static hlt q(cic cic1)
    {
        return cic1.context;
    }

    static SparseArray r(cic cic1)
    {
        return cic1.as;
    }

    static boolean s(cic cic1)
    {
        return cic1.g;
    }

    static Parcelable t(cic cic1)
    {
        cic1.ay = null;
        return null;
    }

    static cii u(cic cic1)
    {
        return cic1.av;
    }

    static cik v(cic cic1)
    {
        return cic1.aw;
    }

    public void a(aii aii1)
    {
        i = aii1;
        aii1.a(ap);
    }

    public void a(boolean flag)
    {
        g = flag;
    }

    protected boolean isEmpty()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (TextUtils.isEmpty(i.g()))
        {
            flag = flag1;
            if (f.c(false))
            {
                flag = true;
            }
        }
        return flag;
    }

    protected void onAttachBinder(Bundle bundle)
    {
        super.onAttachBinder(bundle);
        c = (gqu)binder.a(gqu);
        ((cjg)binder.a(cjg)).a(l.tY, new cid(this));
        ax = ((byf)binder.a(byf)).a(17);
    }

    public boolean onContextItemSelected(MenuItem menuitem)
    {
        int i1 = menuitem.getItemId();
        if (aq == null) goto _L2; else goto _L1
_L1:
        i1;
        JVM INSTR tableswitch 200 201: default 36
    //                   200 51
    //                   201 38;
           goto _L2 _L3 _L4
_L2:
        return false;
_L4:
        a(at, 2769);
        return true;
_L3:
        menuitem = at.e();
        RealTimeChatService.a(ao);
        int j1 = RealTimeChatService.k(a(), at.i());
        as.append(j1, menuitem);
        return true;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        if (bundle != null)
        {
            ay = bundle.getParcelable("scroll_state");
        }
        h = a();
        aj = (atu)getActivity().getIntent().getSerializableExtra("conversation_type");
        if (aj == null)
        {
            aj = atu.a;
        }
        boolean flag;
        if (aj != atu.b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ak = flag;
        as = new SparseArray();
        if (eep.a(context))
        {
            getActivity().getWindow().setSoftInputMode(2);
        }
        layoutinflater = onCreateView(layoutinflater, viewgroup, bundle, g.nE);
        e = (yt)layoutinflater.findViewById(0x102000a);
        e.m();
        e.b();
        viewgroup.getContext();
        viewgroup = new xw();
        viewgroup.e();
        e.a(viewgroup);
        e.setFocusable(true);
        registerForContextMenu(e);
        e.a(am);
        if (i == null)
        {
            i = new aii();
        }
        f = new chn(getActivity(), a(), i, aq, al, ar, ak);
        if (e != null)
        {
            e.a(f);
        }
        b(false);
        viewgroup = (cjf)hlp.a(context, cjf);
        if (aoc.i(context, h.h()) || viewgroup.a("android.permission.READ_CONTACTS") && viewgroup.a("android.permission.WRITE_CONTACTS"))
        {
            return layoutinflater;
        } else
        {
            eev.e("Babel", "contact permission banner shown");
            g.a(h, 2671);
            viewgroup = layoutinflater.findViewById(l.tY);
            viewgroup.setVisibility(0);
            ((Button)layoutinflater.findViewById(l.tZ)).setOnClickListener(new cie(this, viewgroup));
            ((Button)layoutinflater.findViewById(l.tX)).setOnClickListener(new cif(this, viewgroup));
            return layoutinflater;
        }
    }

    public void onDestroy()
    {
        super.onDestroy();
        av.a(-1);
        aw.a(-1);
        as = null;
        RealTimeChatService.b(ao);
    }

    public void onPause()
    {
        super.onPause();
        if (getActivity().isFinishing() && !TextUtils.isEmpty(i.g()) && f.c(true))
        {
            g.a(h, 2289);
        }
    }

    public void onResume()
    {
        super.onResume();
        if (a() != null)
        {
            b(getView());
        }
        doy.a(false);
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        ay = e.d().b();
        bundle.putParcelable("scroll_state", ay);
    }
}
