// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.fragments;

import ai;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;
import ap;
import bef;
import beg;
import bfo;
import bg;
import bgn;
import bgo;
import bgp;
import bgq;
import bgr;
import bgs;
import bgt;
import bgu;
import bgv;
import bgw;
import bgx;
import bhj;
import bho;
import bjy;
import blo;
import blp;
import blw;
import blz;
import bms;
import bmt;
import dbf;
import dbx;
import ebw;
import edk;
import g;
import gbh;
import gmo;
import h;
import hgx;
import java.util.List;
import l;

public class CallContactPickerFragment extends bjy
    implements beg, bfo, blz, bmt
{

    private gmo a;
    private View aj;
    private View ak;
    private int al;
    private int am;
    private bgx an;
    private boolean ao;
    private bef ap;
    private boolean aq;
    private boolean ar;
    private android.view.View.OnClickListener as;
    private EditText b;
    private FrameLayout c;
    private FrameLayout d;
    private FrameLayout e;
    private ImageView f;
    private blw g;
    private blp h;
    private bms i;

    public CallContactPickerFragment()
    {
        al = -1;
        am = -1;
    }

    public static bgx a(CallContactPickerFragment callcontactpickerfragment)
    {
        return callcontactpickerfragment.an;
    }

    private void a(int j)
    {
        a(j, am);
    }

    private void a(int j, int k)
    {
        boolean flag = true;
        if (j == al) goto _L2; else goto _L1
_L1:
        j;
        JVM INSTR tableswitch 0 2: default 36
    //                   0 67
    //                   1 42
    //                   2 106;
           goto _L3 _L4 _L5 _L6
_L3:
        al = j;
_L2:
        return;
_L5:
        d.setVisibility(8);
        c.setVisibility(0);
        a(false);
        continue; /* Loop/switch isn't completed */
_L4:
        if (k == 1)
        {
            flag = false;
        }
        gbh.a(flag);
        d.setVisibility(0);
        c.setVisibility(8);
        a(false);
        continue; /* Loop/switch isn't completed */
_L6:
        d.setVisibility(8);
        c.setVisibility(8);
        a(true);
        if (true) goto _L3; else goto _L7
_L7:
    }

    private void a(int j, boolean flag)
    {
        int k;
        k = 1;
        if (j == am)
        {
            return;
        }
        j;
        JVM INSTR tableswitch 0 2: default 40
    //                   0 46
    //                   1 198
    //                   2 344;
           goto _L1 _L2 _L3 _L4
_L1:
        am = j;
        return;
_L2:
        if (ap == null)
        {
            aj.setVisibility(0);
            ak.setVisibility(8);
        } else
        {
            ap.d();
        }
        if (e.getVisibility() != 8)
        {
            e.setVisibility(8);
            if (am != -1)
            {
                e.sendAccessibilityEvent(32);
            }
        }
        b.setSelection(b.getText().length());
        b.setVisibility(0);
        if (b.length() == 0)
        {
            k = 0;
        }
        a(k, 0);
        if (flag)
        {
            e.startAnimation(AnimationUtils.loadAnimation(getActivity(), g.cC));
        }
        an.o_();
        continue; /* Loop/switch isn't completed */
_L3:
        if (ap == null)
        {
            aj.setVisibility(8);
            ak.setVisibility(0);
        } else
        {
            ap.b();
        }
        if (e.getVisibility() != 0)
        {
            e.setVisibility(0);
            if (am != -1)
            {
                e.sendAccessibilityEvent(32);
            }
        }
        if (flag)
        {
            e.startAnimation(AnimationUtils.loadAnimation(getActivity(), g.cB));
        }
        if (i.c())
        {
            a(2);
        } else
        {
            a(1);
        }
        b.setVisibility(8);
        an.n_();
        h.a(getActivity().getCurrentFocus());
        continue; /* Loop/switch isn't completed */
_L4:
        if (ap == null)
        {
            aj.setVisibility(0);
            ak.setVisibility(8);
        } else
        {
            ap.d();
        }
        if (e.getVisibility() != 8)
        {
            e.setVisibility(8);
            if (am != -1)
            {
                e.sendAccessibilityEvent(32);
            }
        }
        b.setVisibility(8);
        if (flag)
        {
            e.startAnimation(AnimationUtils.loadAnimation(getActivity(), g.cC));
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    public static void a(CallContactPickerFragment callcontactpickerfragment, int j)
    {
        callcontactpickerfragment.a(j);
    }

    private static int b(int j)
    {
        switch (j)
        {
        default:
            ebw.g("Babel", "Unsupported call action type for CallContactPickerFragment!");
            return -1;

        case 1: // '\001'
            return 2;

        case 2: // '\002'
            return 3;
        }
    }

    public static blw b(CallContactPickerFragment callcontactpickerfragment)
    {
        return callcontactpickerfragment.g;
    }

    public static void b(CallContactPickerFragment callcontactpickerfragment, int j)
    {
        callcontactpickerfragment.a(j, true);
    }

    public static int c(CallContactPickerFragment callcontactpickerfragment)
    {
        return callcontactpickerfragment.am;
    }

    public static bef d(CallContactPickerFragment callcontactpickerfragment)
    {
        return callcontactpickerfragment.ap;
    }

    public static View e(CallContactPickerFragment callcontactpickerfragment)
    {
        return callcontactpickerfragment.aj;
    }

    public static View f(CallContactPickerFragment callcontactpickerfragment)
    {
        return callcontactpickerfragment.ak;
    }

    public static bms g(CallContactPickerFragment callcontactpickerfragment)
    {
        return callcontactpickerfragment.i;
    }

    private void r()
    {
        boolean flag = an.h();
        boolean flag1 = PreferenceManager.getDefaultSharedPreferences(getActivity()).getBoolean("dialpad_visible", false);
        if (flag && flag1)
        {
            a(1, false);
            if (ap == null)
            {
                aj.setVisibility(8);
                ak.setVisibility(0);
                return;
            } else
            {
                ap.c();
                return;
            }
        } else
        {
            a(0, false);
            return;
        }
    }

    private void s()
    {
        android.content.SharedPreferences.Editor editor = PreferenceManager.getDefaultSharedPreferences(getActivity()).edit();
        boolean flag;
        if (am == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        editor.putBoolean("dialpad_visible", flag).apply();
        a(-1, false);
        a(-1);
        if (ap == null)
        {
            aj.setVisibility(0);
            return;
        } else
        {
            ap.a(true);
            return;
        }
    }

    public int a()
    {
        return am != 1 ? 2 : 1;
    }

    public void a(bgx bgx1)
    {
        an = bgx1;
    }

    public void a(edk edk1)
    {
label0:
        {
            if (an != null)
            {
                b.setText("");
                Object obj = edk1.a();
                int j = edk1.h();
                String s1 = edk1.e();
                String s2 = edk1.f();
                String s3 = edk1.g();
                edk1 = edk1.c();
                obj = (bho)((bhj) (obj)).f().get(0);
                edk1 = new dbx(b(an.a()), ((bho) (obj)).a, edk1, j, s1, s2, s3, 61);
                if (!TextUtils.isEmpty(edk1.c()))
                {
                    break label0;
                }
                Toast.makeText(context, l.sG, 0).show();
            }
            return;
        }
        an.a(edk1);
    }

    public void a(String s1)
    {
        b.setText(s1);
        b.setSelection(b.getText().length());
    }

    public void a(boolean flag)
    {
label0:
        {
            boolean flag1;
            if (f.getVisibility() == 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag != flag1)
            {
                if (!flag)
                {
                    break label0;
                }
                f.setVisibility(0);
                f.startAnimation(AnimationUtils.loadAnimation(getActivity(), g.cz));
            }
            return;
        }
        f.setVisibility(8);
        f.startAnimation(AnimationUtils.loadAnimation(getActivity(), g.cA));
    }

    public void b()
    {
        String s1 = an.m_();
        if (!TextUtils.equals(s1, "com.google.android.apps.hangouts.phone.dialpad")) goto _L2; else goto _L1
_L1:
        a(1, false);
        s1 = an.d();
        if (s1 != null)
        {
            i.a(s1);
            an.e();
        }
_L4:
        an.c();
        return;
_L2:
        if (TextUtils.equals(s1, "com.google.android.apps.hangouts.phone.recentcalls"))
        {
            a(0, false);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void b(String s1)
    {
        a(0, true);
        s1 = new dbx(b(an.a()), s1, null, 0, null, null, null, 61);
        an.a(s1);
        g.a(dbf.e(a.a()), 858);
    }

    public void b(boolean flag)
    {
        ak.setEnabled(flag);
    }

    public void c()
    {
        if (!aq)
        {
            ar = true;
        } else
        {
            ar = false;
            boolean flag;
            if (g.f())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (h.f())
            {
                flag = true;
            }
            if (flag)
            {
                if (!ao && b.getText().length() > 0)
                {
                    g.a(b.getText());
                } else
                {
                    b.setText("");
                    i.d();
                    h.r();
                    g.r();
                    a(0, false);
                    a(0);
                }
                ao = true;
                return;
            }
        }
    }

    public boolean d()
    {
        if (am == 1)
        {
            a(0, true);
            if (b.length() == 0)
            {
                a(0);
            }
            return true;
        }
        if (am == 2)
        {
            a(0, false);
            return true;
        } else
        {
            return false;
        }
    }

    public void e()
    {
        a(1);
    }

    public void f()
    {
        if (am == 1)
        {
            a(0, true);
        }
    }

    protected boolean isEmpty()
    {
        return false;
    }

    public void onActivityResult(int j, int k, Intent intent)
    {
        super.onActivityResult(j, k, intent);
        if (j == 102)
        {
            h.c();
        }
    }

    protected void onAttachBinder(Bundle bundle)
    {
        super.onAttachBinder(bundle);
        a = (gmo)binder.a(gmo);
        if (getUserVisibleHint())
        {
            g.a(dbf.e(a.a()), 854);
        }
        ap = (bef)binder.b(bef);
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        if (e.getVisibility() == 0 && getResources().getConfiguration().orientation == 2)
        {
            b.setVisibility(8);
            return;
        } else
        {
            b.setVisibility(0);
            return;
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        boolean flag3 = false;
        super.onCreateView(layoutinflater, viewgroup, bundle);
        setHasOptionsMenu(true);
        layoutinflater = layoutinflater.inflate(g.fl, viewgroup, false);
        b = (EditText)layoutinflater.findViewById(h.am);
        b.setCustomSelectionActionModeCallback(new bgn(this));
        b.addTextChangedListener(new bgp(this));
        b.setInputType(b.getInputType() | 0x80000);
        b.setOnClickListener(new bgq(this));
        layoutinflater.getViewTreeObserver().addOnGlobalLayoutListener(new bgr(this, layoutinflater));
        aj = layoutinflater.findViewById(h.di);
        viewgroup = new bgs(this);
        ak = layoutinflater.findViewById(h.aS);
        bundle = new bgt(this);
        ak.setOnLongClickListener(new bgu(this));
        boolean flag;
        boolean flag1;
        boolean flag2;
        if (ap != null)
        {
            aj.setVisibility(8);
            ak.setVisibility(8);
            as = new bgv(this);
            ap.a(as);
            ap.c(bundle);
            ap.a(this);
        } else
        {
            aj.setOnClickListener(viewgroup);
            ak.setOnClickListener(bundle);
        }
        c = (FrameLayout)layoutinflater.findViewById(h.dw);
        d = (FrameLayout)layoutinflater.findViewById(h.fo);
        e = (FrameLayout)layoutinflater.findViewById(h.ez);
        e.setAccessibilityDelegate(new bgw(this));
        g = (blw)getChildFragmentManager().a(blw.getName());
        h = (blp)getChildFragmentManager().a(blp.getName());
        i = (bms)getChildFragmentManager().a(bms.getName());
        if (g == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (h == null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag == flag1)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        gbh.a(flag2);
        if (g == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (i == null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        flag2 = flag3;
        if (flag == flag1)
        {
            flag2 = true;
        }
        gbh.a(flag2);
        if (g == null)
        {
            g = new blw();
            h = new blp();
            i = new bms();
            getChildFragmentManager().a().a(h.dw, g, blw.getName()).a(h.fo, h, blp.getName()).a(h.ez, i, bms.getName()).b();
        }
        f = (ImageView)layoutinflater.findViewById(h.aX);
        f.setOnClickListener(new bgo(this));
        aq = true;
        if (ar)
        {
            c();
        }
        g.a(this);
        i.a(this);
        return layoutinflater;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        if (as != null)
        {
            ap.b(as);
        }
        aq = false;
    }

    public void onHiddenChanged(boolean flag)
    {
        super.onHiddenChanged(flag);
        if (flag)
        {
            s();
            return;
        } else
        {
            r();
            return;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 1)
        {
            blo.a(getResources()).a(getFragmentManager());
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    public void onPause()
    {
        super.onPause();
        s();
    }

    public void onResume()
    {
        super.onResume();
        ebw.c("Babel", "Resuming CallContactPickerFragment");
        b();
    }

    public void onStart()
    {
        super.onStart();
        g.a(this);
        h.a(this);
        r();
        c();
        g.a(dbf.e(a.a()), 854);
    }

    public void q()
    {
        if (am == 1)
        {
            a(2, true);
        }
    }

    public void setUserVisibleHint(boolean flag)
    {
        super.setUserVisibleHint(flag);
        if (flag && isAdded())
        {
            g.a(dbf.e(a.a()), 854);
        }
    }
}
