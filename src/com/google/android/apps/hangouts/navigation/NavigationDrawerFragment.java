// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.navigation;

import ai;
import android.app.Activity;
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
import ani;
import bwf;
import cap;
import caq;
import car;
import cas;
import cat;
import cau;
import cav;
import cay;
import caz;
import cba;
import cbc;
import cbd;
import cbf;
import cbg;
import cbh;
import cbi;
import cbk;
import cbl;
import cbn;
import cbo;
import cbp;
import com.google.android.gms.people.accountswitcherview.SelectedAccountNavigationView;
import dbf;
import ebr;
import ebz;
import ejx;
import ejy;
import eka;
import ekd;
import flx;
import fmc;
import fmn;
import fmq;
import fmv;
import fne;
import fng;
import fni;
import fnj;
import fnr;
import fnt;
import fnu;
import fnw;
import fqu;
import fqv;
import g;
import gam;
import gbh;
import gmp;
import gmq;
import gms;
import gmu;
import gwt;
import h;
import hgx;
import hhb;
import hhu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import l;
import pt;

public final class NavigationDrawerFragment extends hhu
    implements fnr, fnt, gmq
{

    public static boolean a = false;
    private fnu aA;
    private ListView aj;
    private List ak;
    private fqu al;
    private fqu am;
    private fqu an;
    private Runnable ao;
    private boolean ap;
    private fqu aq;
    private gwt ar;
    private gms as;
    private bwf at;
    private fnj au;
    private eka av;
    private android.widget.AdapterView.OnItemClickListener aw;
    private fni ax;
    private fng ay;
    private fnw az;
    private DrawerLayout b;
    private cbd c;
    private pt d;
    private SelectedAccountNavigationView e;
    private ejx f;
    private fmv g;
    private cbg h;
    private fne i;

    public NavigationDrawerFragment()
    {
        av = new cau(this);
        aw = new cav(this);
        ax = new cay(this);
        ay = new caz(this);
        az = new cba(this);
        aA = new caq(this);
    }

    public static cbd a(NavigationDrawerFragment navigationdrawerfragment)
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
            obj = resources.getString(l.gO, new Object[] {
                charsequence
            });
        }
        ebr.a(stringbuilder, resources.getString(i1, new Object[] {
            obj
        }));
        if (flag1)
        {
            ebr.a(stringbuilder, resources.getText(l.kz));
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
            boolean flag = g.a(g.nS, "babel_enable_call_me_maybe", true);
            fmc fmc1 = (new fmc()).a(flag);
            fmn.e.a(f, fmc1).a(new cas(this));
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

    public static void a(NavigationDrawerFragment navigationdrawerfragment, fqu fqu1)
    {
        navigationdrawerfragment.c(fqu1);
    }

    public static void a(NavigationDrawerFragment navigationdrawerfragment, fqu fqu1, View view, ImageView imageview, ImageView imageview1, ImageView imageview2, ImageView imageview3)
    {
        if (!navigationdrawerfragment.d(fqu1))
        {
            imageview.setVisibility(8);
            imageview1.setVisibility(8);
            imageview2.setVisibility(8);
            imageview3.setVisibility(8);
            return;
        }
        fqu1 = dbf.a(fqu1.a(), fqu1.d());
        boolean flag1 = true;
        boolean flag = false;
        if (fqu1 != null)
        {
            flag1 = dbf.g(fqu1);
            flag = fqu1.t();
        }
        a(imageview, flag1);
        a(imageview1, flag1);
        a(imageview2, flag);
        a(imageview3, flag);
        view.setContentDescription(navigationdrawerfragment.a(((CharSequence) (fqu1.a())), flag1, flag));
    }

    public static void a(NavigationDrawerFragment navigationdrawerfragment, fqv fqv1)
    {
        if (navigationdrawerfragment.ar.b())
        {
            ArrayList arraylist = new ArrayList();
            ArrayList arraylist1 = new ArrayList();
            Object obj = new ArrayList(arraylist);
            ani ani1 = dbf.e(navigationdrawerfragment.ar.a());
            fqv1 = fqv1.iterator();
            do
            {
                if (!fqv1.hasNext())
                {
                    break;
                }
                fqu fqu3 = (fqu)fqv1.next();
                if (navigationdrawerfragment.d(fqu3))
                {
                    arraylist.add(fqu3);
                    if (fqu3.a().equals(ani1.a()) && TextUtils.equals(fqu3.e(), ani1.ae()))
                    {
                        navigationdrawerfragment.c(fqu3);
                    } else
                    {
                        ((List) (obj)).add(fqu3);
                    }
                }
            } while (true);
            arraylist.addAll(arraylist1);
            if (TextUtils.isEmpty(dbf.e(navigationdrawerfragment.ar.a()).x()))
            {
                navigationdrawerfragment.at.a(navigationdrawerfragment.ar.a(), 2716).a(TimeUnit.DAYS);
            }
            int i1 = arraylist.size();
            if (i1 > 0)
            {
                if (i1 == 1)
                {
                    navigationdrawerfragment.at.a(-1, 2031).a(TimeUnit.DAYS);
                } else
                if (i1 == 2)
                {
                    navigationdrawerfragment.at.a(-1, 2032).a(TimeUnit.DAYS);
                } else
                if (i1 == 3)
                {
                    navigationdrawerfragment.at.a(-1, 2033).a(TimeUnit.DAYS);
                } else
                {
                    navigationdrawerfragment.at.a(-1, 2034).a(TimeUnit.DAYS);
                }
            }
            if (ebz.d() && dbf.j() && dbf.l().q())
            {
                arraylist.add(navigationdrawerfragment.aq);
                navigationdrawerfragment.at.a(ani1.h(), 2035).a(TimeUnit.DAYS);
                if (ani1.q())
                {
                    navigationdrawerfragment.c(navigationdrawerfragment.aq);
                }
            }
            fqv1 = arraylist;
            if (arraylist.isEmpty())
            {
                fqv1 = null;
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
                fqu fqu1;
                fqu fqu2;
                if (((List) (obj)).size() > 0)
                {
                    fqu1 = (fqu)((List) (obj)).get(0);
                } else
                {
                    fqu1 = null;
                }
                navigationdrawerfragment.am = fqu1;
                if (((List) (obj)).size() > 1)
                {
                    fqu1 = (fqu)((List) (obj)).get(1);
                } else
                {
                    fqu1 = null;
                }
                navigationdrawerfragment.an = fqu1;
            }
            fqu1 = navigationdrawerfragment.al;
            obj = navigationdrawerfragment.am;
            fqu2 = navigationdrawerfragment.an;
            if (navigationdrawerfragment.i == null)
            {
                navigationdrawerfragment.i = new fne(navigationdrawerfragment.getActivity(), g.gn, navigationdrawerfragment.ax, navigationdrawerfragment.ay);
                navigationdrawerfragment.i.b();
                navigationdrawerfragment.i.a(navigationdrawerfragment.g);
                navigationdrawerfragment.i.a();
            }
            navigationdrawerfragment.ak = fqv1;
            navigationdrawerfragment.b(fqu1);
            navigationdrawerfragment.i.a(fqv1);
            navigationdrawerfragment.e.a(((fqu) (obj)), fqu2);
            navigationdrawerfragment.h.a();
        }
    }

    public static boolean a(NavigationDrawerFragment navigationdrawerfragment, boolean flag)
    {
        navigationdrawerfragment.ap = flag;
        return flag;
    }

    private static boolean a(fqu fqu1, fqu fqu2)
    {
        if (fqu1 != null) goto _L2; else goto _L1
_L1:
        if (fqu2 != null) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (fqu2 == null)
        {
            return false;
        }
        if (!fqu1.a().equals(fqu2.a()) || !TextUtils.equals(fqu1.e(), fqu2.e()))
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public static pt b(NavigationDrawerFragment navigationdrawerfragment)
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
            gbh.a((new StringBuilder(36)).append("Unknown navigation mode: ").append(i1).toString());
            return;
        }
    }

    private void b(fqu fqu1)
    {
        if (fqu1 == null)
        {
            al = null;
        } else
        {
            fqu fqu2 = al;
            al = fqu1;
            if (ak != null)
            {
                ak = fne.a(ak, fqu2, al);
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

    private void c(fqu fqu1)
    {
label0:
        {
            gbh.b("Selected owner was null", fqu1);
            if (al != null)
            {
                if (a(al, fqu1))
                {
                    break label0;
                }
                if (a(fqu1, am))
                {
                    am = al;
                } else
                if (a(fqu1, an))
                {
                    an = al;
                } else
                {
                    an = am;
                    am = al;
                }
            }
            al = fqu1;
        }
    }

    public static Runnable d(NavigationDrawerFragment navigationdrawerfragment)
    {
        return navigationdrawerfragment.ao;
    }

    private boolean d(fqu fqu1)
    {
        if (fqu1 != aq || dbf.j() && dbf.l().q()) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (!fqu1.b())
        {
            break; /* Loop/switch isn't completed */
        }
        if (as.b(fqu1.a()) == -1) goto _L1; else goto _L3
_L3:
        int i1 = as.b(fqu1.a(), fqu1.d());
        if (i1 == -1 || !as.a(i1).d("is_business_features_enabled")) goto _L1; else goto _L4
_L4:
        if (as.b(fqu1.a()) == -1) goto _L1; else goto _L5
_L5:
        return true;
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

    public static fne h(NavigationDrawerFragment navigationdrawerfragment)
    {
        return navigationdrawerfragment.i;
    }

    public static hhb i(NavigationDrawerFragment navigationdrawerfragment)
    {
        return navigationdrawerfragment.context;
    }

    public static hhb j(NavigationDrawerFragment navigationdrawerfragment)
    {
        return navigationdrawerfragment.context;
    }

    public static hhb k(NavigationDrawerFragment navigationdrawerfragment)
    {
        return navigationdrawerfragment.context;
    }

    public static fqu l(NavigationDrawerFragment navigationdrawerfragment)
    {
        return navigationdrawerfragment.aq;
    }

    public static boolean m(NavigationDrawerFragment navigationdrawerfragment)
    {
        return navigationdrawerfragment.ap;
    }

    public static cbg n(NavigationDrawerFragment navigationdrawerfragment)
    {
        return navigationdrawerfragment.h;
    }

    public static gwt o(NavigationDrawerFragment navigationdrawerfragment)
    {
        return navigationdrawerfragment.ar;
    }

    public static fnj p(NavigationDrawerFragment navigationdrawerfragment)
    {
        return navigationdrawerfragment.au;
    }

    public void a(SelectedAccountNavigationView selectedaccountnavigationview)
    {
        b(selectedaccountnavigationview);
    }

    public void a(fqu fqu1)
    {
        if (ao != null)
        {
            return;
        } else
        {
            c(fqu1);
            b.i(getView());
            e.b(0);
            ao = new cap(this, fqu1);
            b(al);
            return;
        }
    }

    public void a(boolean flag, gmp gmp1, gmp gmp2, int i1, int j1)
    {
        if (!a)
        {
            if (gmp2 == gmp.c)
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

    public final void onAttach(Activity activity)
    {
        super.onAttach(activity);
        try
        {
            c = (cbd)activity;
            return;
        }
        catch (ClassCastException classcastexception)
        {
            throw new ClassCastException(String.valueOf(activity.toString()).concat(" must implement NavigationDrawerListener."));
        }
    }

    public void onAttachBinder(Bundle bundle)
    {
        super.onAttachBinder(bundle);
        binder.a(cbh, new cbh[] {
            new cbk(), new cbl(), new cbn(binder), new cbo(), new cbp()
        });
        ar = ((gwt)binder.a(gwt)).b(this);
        as = (gms)binder.a(gms);
        at = (bwf)binder.a(bwf);
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
        aq = new cbi(context);
        bundle = (new fmq()).a(407).a();
        f = (new ejy(context)).a(fmn.c, bundle).a(av).a();
        e = (SelectedAccountNavigationView)layoutinflater.inflate(g.fd, viewgroup);
        e.a(true);
        e.a(f);
        g = new fmv(getActivity(), f);
        e.a(g);
        e.a(this);
        e.a(this);
        e.a(g.gZ, az, aA);
        e.b(0);
        h = new cbg(this);
        h.a();
        aj = new ListView(context);
        layoutinflater = e;
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            layoutinflater = (FrameLayout)layoutinflater;
            layoutinflater.setFitsSystemWindows(true);
            layoutinflater.setOnApplyWindowInsetsListener(new cbf(this));
            layoutinflater.setForegroundGravity(55);
            au = new fnj();
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
        b.post(new car(this));
    }

    public final void onStart()
    {
        super.onStart();
        b = (DrawerLayout)getActivity().findViewById(h.bb);
        d = new cbc(this);
        b.a(d);
        Object obj = getActivity().findViewById(h.dS);
        if (android.os.Build.VERSION.SDK_INT >= 20)
        {
            ((View) (obj)).setOnApplyWindowInsetsListener(new cat(this));
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
