// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.navigation;

import ai;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.widget.DrawerLayout;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import aoa;
import cbu;
import cbv;
import cbw;
import cbx;
import cby;
import cbz;
import cca;
import ccd;
import cce;
import ccf;
import cch;
import cci;
import cck;
import ccl;
import ccm;
import ccn;
import ccp;
import ccq;
import ccs;
import cct;
import ccu;
import com.google.android.gms.people.accountswitcherview.SelectedAccountNavigationView;
import dcn;
import eep;
import eey;
import emy;
import emz;
import enb;
import ene;
import fot;
import fow;
import fph;
import fpk;
import fpr;
import fqa;
import fqc;
import fqe;
import fqf;
import fqn;
import fqp;
import fqq;
import fqs;
import ftl;
import ftm;
import g;
import gcz;
import gda;
import gdd;
import gdv;
import gqv;
import gqw;
import gqz;
import grb;
import h;
import hbd;
import hlp;
import hlt;
import hmm;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import l;
import pv;

public final class NavigationDrawerFragment extends hmm
    implements fqn, fqp, gqw
{

    public static boolean a = false;
    private fqq aA;
    private ListView aj;
    private List ak;
    private ftl al;
    private ftl am;
    private ftl an;
    private Runnable ao;
    private boolean ap;
    private ftl aq;
    private hbd ar;
    private gqz as;
    private gdd at;
    private fqf au;
    private enb av;
    private android.widget.AdapterView.OnItemClickListener aw;
    private fqe ax;
    private fqc ay;
    private fqs az;
    private DrawerLayout b;
    private cci c;
    private pv d;
    private SelectedAccountNavigationView e;
    private emy f;
    private fpr g;
    private ccl h;
    private fqa i;

    public NavigationDrawerFragment()
    {
        av = new cbz(this);
        aw = new cca(this);
        ax = new ccd(this);
        ay = new cce(this);
        az = new ccf(this);
        aA = new cbv(this);
    }

    public static cci a(NavigationDrawerFragment navigationdrawerfragment)
    {
        return navigationdrawerfragment.c;
    }

    public static CharSequence a(NavigationDrawerFragment navigationdrawerfragment, CharSequence charsequence, boolean flag, boolean flag1)
    {
        return navigationdrawerfragment.a(charsequence, flag, flag1);
    }

    private CharSequence a(CharSequence charsequence, boolean flag, boolean flag1)
    {
        Resources resources = context.getResources();
        StringBuilder stringbuilder = new StringBuilder();
        int i1 = l.i;
        Object obj = charsequence;
        if (flag)
        {
            obj = resources.getString(l.gx, new Object[] {
                charsequence
            });
        }
        eep.a(stringbuilder, resources.getString(i1, new Object[] {
            obj
        }));
        if (flag1)
        {
            eep.a(stringbuilder, resources.getText(l.jS));
        }
        return stringbuilder.toString();
    }

    public static Runnable a(NavigationDrawerFragment navigationdrawerfragment, Runnable runnable)
    {
        navigationdrawerfragment.ao = runnable;
        return runnable;
    }

    private void a()
    {
        if (!ar.b())
        {
            return;
        } else
        {
            fow fow1 = (new fow()).b();
            fph.e.a(f, fow1).a(new cbx(this));
            return;
        }
    }

    private static void a(ImageView imageview, boolean flag)
    {
        if (flag)
        {
            imageview.setVisibility(0);
            imageview.bringToFront();
            return;
        } else
        {
            imageview.setVisibility(8);
            return;
        }
    }

    public static void a(NavigationDrawerFragment navigationdrawerfragment, SelectedAccountNavigationView selectedaccountnavigationview)
    {
        navigationdrawerfragment.b(selectedaccountnavigationview);
    }

    public static void a(NavigationDrawerFragment navigationdrawerfragment, ftl ftl1)
    {
        navigationdrawerfragment.c(ftl1);
    }

    public static void a(NavigationDrawerFragment navigationdrawerfragment, ftl ftl1, View view, ImageView imageview, ImageView imageview1, ImageView imageview2, ImageView imageview3)
    {
        if (!navigationdrawerfragment.d(ftl1))
        {
            imageview.setVisibility(8);
            imageview1.setVisibility(8);
            imageview2.setVisibility(8);
            imageview3.setVisibility(8);
            return;
        }
        ftl1 = dcn.a(ftl1.a(), ftl1.d());
        boolean flag1 = true;
        boolean flag = false;
        if (ftl1 != null)
        {
            flag1 = dcn.f(ftl1);
            flag = ftl1.r();
        }
        a(imageview, flag1);
        a(imageview1, flag1);
        a(imageview2, flag);
        a(imageview3, flag);
        view.setContentDescription(navigationdrawerfragment.a(((CharSequence) (ftl1.a())), flag1, flag));
    }

    public static void a(NavigationDrawerFragment navigationdrawerfragment, ftm ftm1)
    {
        if (navigationdrawerfragment.ar.b())
        {
            ArrayList arraylist = new ArrayList();
            ArrayList arraylist1 = new ArrayList();
            Object obj = new ArrayList(arraylist);
            aoa aoa1 = dcn.e(navigationdrawerfragment.ar.a());
            ftm1 = ftm1.iterator();
            do
            {
                if (!ftm1.hasNext())
                {
                    break;
                }
                ftl ftl3 = (ftl)ftm1.next();
                if (navigationdrawerfragment.d(ftl3))
                {
                    arraylist.add(ftl3);
                    if (ftl3.a().equals(aoa1.a()) && TextUtils.equals(ftl3.e(), aoa1.ab()))
                    {
                        navigationdrawerfragment.c(ftl3);
                    } else
                    {
                        ((List) (obj)).add(ftl3);
                    }
                }
            } while (true);
            arraylist.addAll(arraylist1);
            if (TextUtils.isEmpty(dcn.e(navigationdrawerfragment.ar.a()).v()))
            {
                navigationdrawerfragment.at.a(navigationdrawerfragment.ar.a()).a(2716).a(TimeUnit.DAYS);
            }
            int i1 = arraylist.size();
            if (i1 > 0)
            {
                if (i1 == 1)
                {
                    navigationdrawerfragment.at.a(-1).a(2031).a(TimeUnit.DAYS);
                } else
                if (i1 == 2)
                {
                    navigationdrawerfragment.at.a(-1).a(2032).a(TimeUnit.DAYS);
                } else
                if (i1 == 3)
                {
                    navigationdrawerfragment.at.a(-1).a(2033).a(TimeUnit.DAYS);
                } else
                {
                    navigationdrawerfragment.at.a(-1).a(2034).a(TimeUnit.DAYS);
                }
            }
            if (eey.d() && dcn.j() && dcn.l().o())
            {
                arraylist.add(navigationdrawerfragment.aq);
                navigationdrawerfragment.at.a(aoa1.h()).a(2035).a(TimeUnit.DAYS);
                if (aoa1.o())
                {
                    navigationdrawerfragment.c(navigationdrawerfragment.aq);
                }
            }
            ftm1 = arraylist;
            if (arraylist.isEmpty())
            {
                ftm1 = null;
            }
            if (navigationdrawerfragment.am != null && !navigationdrawerfragment.d(navigationdrawerfragment.am))
            {
                navigationdrawerfragment.am = null;
            }
            if (navigationdrawerfragment.an != null && !navigationdrawerfragment.d(navigationdrawerfragment.an))
            {
                navigationdrawerfragment.an = null;
            }
            if (navigationdrawerfragment.am == null)
            {
                navigationdrawerfragment.am = navigationdrawerfragment.an;
                navigationdrawerfragment.an = null;
            }
            if (navigationdrawerfragment.am == null)
            {
                ftl ftl1;
                ftl ftl2;
                if (((List) (obj)).size() > 0)
                {
                    ftl1 = (ftl)((List) (obj)).get(0);
                } else
                {
                    ftl1 = null;
                }
                navigationdrawerfragment.am = ftl1;
                if (((List) (obj)).size() > 1)
                {
                    ftl1 = (ftl)((List) (obj)).get(1);
                } else
                {
                    ftl1 = null;
                }
                navigationdrawerfragment.an = ftl1;
            }
            ftl1 = navigationdrawerfragment.al;
            obj = navigationdrawerfragment.am;
            ftl2 = navigationdrawerfragment.an;
            if (navigationdrawerfragment.i == null)
            {
                navigationdrawerfragment.i = new fqa(navigationdrawerfragment.getActivity(), g.gj, navigationdrawerfragment.ax, navigationdrawerfragment.ay);
                navigationdrawerfragment.i.b();
                navigationdrawerfragment.i.a(navigationdrawerfragment.g);
                navigationdrawerfragment.i.a();
            }
            navigationdrawerfragment.ak = ftm1;
            navigationdrawerfragment.b(ftl1);
            navigationdrawerfragment.i.a(ftm1);
            navigationdrawerfragment.e.a(((ftl) (obj)), ftl2);
            navigationdrawerfragment.h.a();
        }
    }

    public static boolean a(NavigationDrawerFragment navigationdrawerfragment, boolean flag)
    {
        navigationdrawerfragment.ap = flag;
        return flag;
    }

    private static boolean a(ftl ftl1, ftl ftl2)
    {
        if (ftl1 != null) goto _L2; else goto _L1
_L1:
        if (ftl2 != null) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (ftl2 == null)
        {
            return false;
        }
        if (!ftl1.a().equals(ftl2.a()) || !TextUtils.equals(ftl1.e(), ftl2.e()))
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public static pv b(NavigationDrawerFragment navigationdrawerfragment)
    {
        return navigationdrawerfragment.d;
    }

    private void b(SelectedAccountNavigationView selectedaccountnavigationview)
    {
        int i1 = selectedaccountnavigationview.a();
        if (i1 == 0)
        {
            aj.setAdapter(h);
            return;
        }
        if (i1 == 1)
        {
            aj.setAdapter(i);
            return;
        } else
        {
            gdv.a((new StringBuilder(36)).append("Unknown navigation mode: ").append(i1).toString());
            return;
        }
    }

    private void b(ftl ftl1)
    {
        if (ftl1 == null)
        {
            al = null;
        } else
        {
            ftl ftl2 = al;
            al = ftl1;
            if (ak != null)
            {
                ak = fqa.a(ak, ftl2, al);
                e.a(al);
                i.a(ak);
                return;
            }
        }
    }

    public static void c(NavigationDrawerFragment navigationdrawerfragment)
    {
        navigationdrawerfragment.a();
    }

    private void c(ftl ftl1)
    {
label0:
        {
            gdv.b("Selected owner was null", ftl1);
            if (al != null)
            {
                if (a(al, ftl1))
                {
                    break label0;
                }
                if (a(ftl1, am))
                {
                    am = al;
                } else
                if (a(ftl1, an))
                {
                    an = al;
                } else
                {
                    an = am;
                    am = al;
                }
            }
            al = ftl1;
        }
    }

    public static Runnable d(NavigationDrawerFragment navigationdrawerfragment)
    {
        return navigationdrawerfragment.ao;
    }

    private boolean d(ftl ftl1)
    {
        if (ftl1 != aq || dcn.j() && dcn.l().o()) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (!ftl1.b())
        {
            break; /* Loop/switch isn't completed */
        }
        if (as.b(ftl1.a()) == -1) goto _L1; else goto _L3
_L3:
        int i1 = as.b(ftl1.a(), ftl1.d());
        if (i1 == -1 || !as.a(i1).d("is_business_features_enabled")) goto _L1; else goto _L4
_L4:
        int j1 = as.b(ftl1.a());
        return as.d(j1);
    }

    public static DrawerLayout e(NavigationDrawerFragment navigationdrawerfragment)
    {
        return navigationdrawerfragment.b;
    }

    public static SelectedAccountNavigationView f(NavigationDrawerFragment navigationdrawerfragment)
    {
        return navigationdrawerfragment.e;
    }

    public static ListView g(NavigationDrawerFragment navigationdrawerfragment)
    {
        return navigationdrawerfragment.aj;
    }

    public static fqa h(NavigationDrawerFragment navigationdrawerfragment)
    {
        return navigationdrawerfragment.i;
    }

    public static hlt i(NavigationDrawerFragment navigationdrawerfragment)
    {
        return navigationdrawerfragment.context;
    }

    public static hlt j(NavigationDrawerFragment navigationdrawerfragment)
    {
        return navigationdrawerfragment.context;
    }

    public static hlt k(NavigationDrawerFragment navigationdrawerfragment)
    {
        return navigationdrawerfragment.context;
    }

    public static hlt l(NavigationDrawerFragment navigationdrawerfragment)
    {
        return navigationdrawerfragment.context;
    }

    public static ftl m(NavigationDrawerFragment navigationdrawerfragment)
    {
        return navigationdrawerfragment.aq;
    }

    public static boolean n(NavigationDrawerFragment navigationdrawerfragment)
    {
        return navigationdrawerfragment.ap;
    }

    public static ccl o(NavigationDrawerFragment navigationdrawerfragment)
    {
        return navigationdrawerfragment.h;
    }

    public static hbd p(NavigationDrawerFragment navigationdrawerfragment)
    {
        return navigationdrawerfragment.ar;
    }

    public static fqf q(NavigationDrawerFragment navigationdrawerfragment)
    {
        return navigationdrawerfragment.au;
    }

    public void a(SelectedAccountNavigationView selectedaccountnavigationview)
    {
        b(selectedaccountnavigationview);
    }

    public void a(ftl ftl1)
    {
        if (ao != null)
        {
            return;
        } else
        {
            c(ftl1);
            b.i(getView());
            e.b(0);
            ao = new cbu(this, ftl1);
            b(al);
            return;
        }
    }

    public void a(boolean flag, gqv gqv1, gqv gqv2, int i1, int j1)
    {
        if (!a)
        {
            if (gqv2 == gqv.c)
            {
                if (f != null && !f.e() && !f.f())
                {
                    f.b();
                }
                a();
                h.a();
                return;
            }
            if (f != null && (f.e() || f.f()))
            {
                f.d();
                return;
            }
        }
    }

    public void onActivityResult(int i1, int j1, Intent intent)
    {
        super.onActivityResult(i1, j1, intent);
        if (i1 == 1 && j1 == -1)
        {
            i1 = intent.getIntExtra("account_id", -1);
            if (i1 >= 0)
            {
                intent = as.a(i1);
                c.a(intent.b("account_name"), intent.b("effective_gaia_id"));
            }
        }
    }

    public final void onAttach(Activity activity)
    {
        super.onAttach(activity);
        c = (cci)activity;
    }

    public void onAttachBinder(Bundle bundle)
    {
        super.onAttachBinder(bundle);
        binder.a(ccm, new ccm[] {
            new ccp(), new ccq(), new ccs(binder), new cct(), new ccu()
        });
        ar = ((hbd)binder.a(hbd)).b(this);
        as = (gqz)binder.a(gqz);
        at = (gdd)binder.a(gdd);
    }

    public final void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        d.b();
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.onCreateView(layoutinflater, viewgroup, bundle);
        setHasOptionsMenu(true);
        aq = new ccn(context);
        bundle = (new fpk()).a(407).a();
        f = (new emz(context)).a(fph.c, bundle).a(av).a();
        e = (SelectedAccountNavigationView)layoutinflater.inflate(g.fb, viewgroup);
        e.a(true);
        e.a(f);
        g = new fpr(getActivity(), f);
        e.a(g);
        e.a(this);
        e.a(this);
        e.a(g.gR, az, aA);
        e.b(0);
        h = new ccl(this);
        h.a();
        aj = new ListView(context);
        layoutinflater = e;
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            layoutinflater = (FrameLayout)layoutinflater;
            layoutinflater.setFitsSystemWindows(true);
            layoutinflater.setOnApplyWindowInsetsListener(new cck(this));
            layoutinflater.setForegroundGravity(55);
            au = new fqf();
            layoutinflater.setForeground(au);
        }
        aj.addHeaderView(e);
        aj.setAdapter(h);
        aj.setOnItemClickListener(aw);
        aj.setDividerHeight(0);
        aj.setBackgroundColor(context.getResources().getColor(0x106000b));
        return aj;
    }

    public final boolean onOptionsItemSelected(MenuItem menuitem)
    {
        return d.a(menuitem) || super.onOptionsItemSelected(menuitem);
    }

    public final void onPause()
    {
        super.onPause();
        b.i(getView());
        h.a(false);
    }

    public final void onResume()
    {
        super.onResume();
        if (f != null && !f.e() && !f.f())
        {
            f.b();
        }
        b.post(new cbw(this));
    }

    public final void onStart()
    {
        super.onStart();
        b = (DrawerLayout)getActivity().findViewById(h.aV);
        d = new cch(this);
        b.a(d);
        Object obj = getActivity().findViewById(h.dJ);
        if (android.os.Build.VERSION.SDK_INT >= 20)
        {
            ((View) (obj)).setOnApplyWindowInsetsListener(new cby(this));
        }
        ((View) (obj)).setFitsSystemWindows(true);
        obj = PreferenceManager.getDefaultSharedPreferences(getActivity());
        if (!((SharedPreferences) (obj)).getBoolean("navigation_drawer_shown", false))
        {
            ((SharedPreferences) (obj)).edit().putBoolean("navigation_drawer_shown", true).apply();
            b.h(getView());
        }
    }

    public final void onStop()
    {
        if (f != null && (f.e() || f.f()))
        {
            f.d();
        }
        super.onStop();
    }

}
