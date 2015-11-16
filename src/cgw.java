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

public class cgw extends bjy
{

    private long a;
    private atd aj;
    private boolean ak;
    private chf al;
    private chj am;
    private chh an;
    private chi ao;
    private chb ap;
    private cha aq;
    private android.view.View.OnClickListener ar;
    private SparseArray as;
    private amf at;
    private boolean au;
    private final chc av = new chc(this);
    private final che aw = new che(this);
    private bxi ax;
    private Parcelable ay;
    private long b;
    private gmo c;
    private final gti d;
    private yr e;
    private cgh f;
    private boolean g;
    private ani h;
    private aip i;

    public cgw()
    {
        d = new gti(lifecycle);
        al = new chf(this);
        am = new chj(this);
        an = new chh(this);
        ao = new chi(this);
        ap = new chb(this);
        aq = new cha(this);
        ar = new chd(this);
        new dzw(this, lifecycle);
    }

    static long a(cgw cgw1, long l1)
    {
        cgw1.a = l1;
        return l1;
    }

    private ani a()
    {
        return dbf.e(c.a());
    }

    private void a(amf amf1, int i1)
    {
        g.a(h, i1);
        cfj.a(amf1).a(getFragmentManager(), null);
    }

    static void a(cgw cgw1)
    {
        cgw1.b(true);
    }

    static void a(cgw cgw1, int i1)
    {
        cgw1.as.remove(i1);
        if (g.a(cgw1.as))
        {
            RealTimeChatService.b(cgw1.ao);
        }
    }

    static void a(cgw cgw1, amf amf1)
    {
        cgw1.a(amf1, 2135);
    }

    static void a(cgw cgw1, View view)
    {
        cgw1.b(view);
    }

    static boolean a(cgw cgw1, boolean flag)
    {
        cgw1.au = flag;
        return flag;
    }

    static long b(cgw cgw1, long l1)
    {
        cgw1.b = l1;
        return l1;
    }

    static amf b(cgw cgw1, amf amf1)
    {
        cgw1.at = amf1;
        return amf1;
    }

    static ani b(cgw cgw1)
    {
        return cgw1.h;
    }

    private void b(View view)
    {
        if (view == null)
        {
            return;
        }
        View view1 = view.findViewById(h.fN);
        View view2 = view.findViewById(l.us);
        view2.setVisibility(8);
        if (au)
        {
            e.setVisibility(8);
            view1.setVisibility(0);
            d.a(gtl.b);
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
            d.a(gtl.a);
            return;
        }
        if (isEmpty())
        {
            view2.setVisibility(0);
            e.setVisibility(8);
            view1.setVisibility(8);
            setupEmptyView(view, h.iR, h.iQ);
            d.a(gtl.c);
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
        d.a(gtl.b);
    }

    private void b(boolean flag)
    {
        d.a(gtl.a);
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

    static hhb c(cgw cgw1)
    {
        return cgw1.context;
    }

    static hgx d(cgw cgw1)
    {
        return cgw1.binder;
    }

    static cgh e(cgw cgw1)
    {
        return cgw1.f;
    }

    static bxi f(cgw cgw1)
    {
        return cgw1.ax;
    }

    static hhb g(cgw cgw1)
    {
        return cgw1.context;
    }

    static hhb h(cgw cgw1)
    {
        return cgw1.context;
    }

    static boolean i(cgw cgw1)
    {
        return cgw1.ak;
    }

    static hhb j(cgw cgw1)
    {
        return cgw1.context;
    }

    static gmo k(cgw cgw1)
    {
        return cgw1.c;
    }

    static atd l(cgw cgw1)
    {
        return cgw1.aj;
    }

    static aip m(cgw cgw1)
    {
        return cgw1.i;
    }

    static long n(cgw cgw1)
    {
        return cgw1.a;
    }

    static hhb o(cgw cgw1)
    {
        return cgw1.context;
    }

    static long p(cgw cgw1)
    {
        return cgw1.b;
    }

    static hhb q(cgw cgw1)
    {
        return cgw1.context;
    }

    static SparseArray r(cgw cgw1)
    {
        return cgw1.as;
    }

    static boolean s(cgw cgw1)
    {
        return cgw1.g;
    }

    static Parcelable t(cgw cgw1)
    {
        cgw1.ay = null;
        return null;
    }

    static chc u(cgw cgw1)
    {
        return cgw1.av;
    }

    static che v(cgw cgw1)
    {
        return cgw1.aw;
    }

    public void a(aip aip1)
    {
        i = aip1;
        aip1.a(ap);
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
        c = (gmo)binder.a(gmo);
        ((cia)binder.a(cia)).a(l.uH, new cgx(this));
        bundle = (bxj)binder.b(bxj);
        if (bundle != null)
        {
            ax = bundle.a(17);
        }
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
        a(at, 2273);
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
        aj = (atd)getActivity().getIntent().getSerializableExtra("conversation_type");
        if (aj == null)
        {
            aj = atd.a;
        }
        boolean flag;
        if (aj != atd.b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ak = flag;
        as = new SparseArray();
        if (ebr.a(context))
        {
            getActivity().getWindow().setSoftInputMode(2);
        }
        layoutinflater = onCreateView(layoutinflater, viewgroup, bundle, g.nC);
        e = (yr)layoutinflater.findViewById(0x102000a);
        e.m();
        e.b();
        viewgroup.getContext();
        viewgroup = new xu();
        viewgroup.e();
        e.a(viewgroup);
        e.setFocusable(true);
        registerForContextMenu(e);
        e.a(am);
        if (i == null)
        {
            i = new aip();
        }
        f = new cgh(getActivity(), a(), i, aq, al, ar, ak);
        if (e != null)
        {
            e.a(f);
        }
        b(false);
        viewgroup = (chz)hgx.a(context, chz);
        if (ank.i(context, h.h()) || viewgroup.a("android.permission.READ_CONTACTS") && viewgroup.a("android.permission.WRITE_CONTACTS"))
        {
            return layoutinflater;
        } else
        {
            ebw.e("Babel", "contact permission banner shown");
            g.a(h, 2671);
            viewgroup = layoutinflater.findViewById(l.uH);
            viewgroup.setVisibility(0);
            ((Button)layoutinflater.findViewById(l.uI)).setOnClickListener(new cgy(this, viewgroup));
            ((Button)layoutinflater.findViewById(l.uG)).setOnClickListener(new cgz(this, viewgroup));
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
        dme.a(false);
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        ay = e.d().b();
        bundle.putParcelable("scroll_state", ay);
    }
}
