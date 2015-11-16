// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.AsyncTask;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.google.android.apps.hangouts.conversation.v2.stickerpicker.impl.SlidingTabLayout;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class bds extends hmm
{

    public List a;
    private ViewPager b;
    private SlidingTabLayout c;
    private bdv d;
    private gqu e;
    private amo f;
    private dpn g;
    private Map h;
    private AsyncTask i;

    public bds()
    {
        h = new HashMap();
        a = new ArrayList();
    }

    static bdv a(bds bds1, bdv bdv1)
    {
        bds1.d = bdv1;
        return bdv1;
    }

    static SlidingTabLayout a(bds bds1)
    {
        return bds1.c;
    }

    private void a()
    {
        if (!h.isEmpty())
        {
            arr arr1;
            for (Iterator iterator = h.values().iterator(); iterator.hasNext(); g.b(arr1))
            {
                arr1 = (arr)iterator.next();
            }

            h.clear();
        }
        if (i != null)
        {
            i.cancel(true);
        }
    }

    static bdv b(bds bds1)
    {
        return bds1.d;
    }

    static ViewPager c(bds bds1)
    {
        return bds1.b;
    }

    static Map d(bds bds1)
    {
        return bds1.h;
    }

    static dpn e(bds bds1)
    {
        return bds1.g;
    }

    static gqu f(bds bds1)
    {
        return bds1.e;
    }

    public void a(int j)
    {
        String s = f.a("babel_stickers_account_id", "108618507921641169817");
        Object obj = new aow(context, j);
        a = ((aow) (obj)).a(true);
        if (!a.isEmpty())
        {
            cyz cyz1 = new cyz();
            cyz1.e = ((aow) (obj)).y();
            if (cyz1.e != null && !cyz1.e.isEmpty())
            {
                cyz1.b = "Recent";
                cyz1.a = "Recent";
                cyz1.c = (cza)cyz1.e.get(0);
                a.add(0, cyz1);
            }
        }
        boolean flag = a.isEmpty();
        obj = dcn.e(j);
        if (!((aoa) (obj)).o() && !dcn.f(((aoa) (obj))))
        {
            long l = aoc.n(g.nU, ((aoa) (obj)));
            long l1 = g.a(g.nU, "babel_stickers_query_limit_ms", dlb.i);
            if (flag || l1 + l < System.currentTimeMillis())
            {
                eev.e("StickersPagerFragment", (new StringBuilder(63)).append("Sticker update initiated. last:").append(l).append(" empty:").append(flag).toString());
                RealTimeChatService.q(((aoa) (obj)), s);
                return;
            }
        }
    }

    public void a(String s)
    {
        PreferenceManager.getDefaultSharedPreferences(getActivity()).edit().putString("selected_sticker_album_id", s).commit();
    }

    public String d()
    {
        ai ai = getActivity();
        if (ai == null)
        {
            return null;
        } else
        {
            return PreferenceManager.getDefaultSharedPreferences(ai).getString("selected_sticker_album_id", null);
        }
    }

    public void onActivityResult(int j, int k, Intent intent)
    {
        if (intent != null)
        {
            String s = intent.getStringExtra("album_id");
            if (s != null)
            {
                a(s);
            }
        }
        getParentFragment().onActivityResult(j, k, intent);
    }

    public void onAttachBinder(Bundle bundle)
    {
        super.onAttachBinder(bundle);
        e = (gqu)binder.a(gqu);
        f = (amo)binder.a(amo);
        g = (dpn)binder.a(dpn);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(g.lr, viewgroup, false);
        b = (ViewPager)layoutinflater.findViewById(h.hk);
        c = (SlidingTabLayout)layoutinflater.findViewById(h.hj);
        c.a();
        c.a(g.lo, h.hh);
        c.a(b);
        int j = layoutinflater.getResources().getDimensionPixelSize(g.li);
        c.getViewTreeObserver().addOnGlobalLayoutListener(new bdt(this, j));
        return layoutinflater;
    }

    public void onPause()
    {
        super.onPause();
        if (b.getChildCount() > 0 && b.c() <= a.size())
        {
            a(((cyz)a.get(b.c())).a);
        }
        a();
        if (d != null)
        {
            d.e();
            d = null;
        }
        b.a(null);
        if (a != null)
        {
            a.clear();
        }
    }

    public void onResume()
    {
        if (b != null && d == null)
        {
            int j = e.a();
            b.setVisibility(8);
            c.setVisibility(8);
            a();
            i = new bdu(this, j, this);
            i.execute(new Void[0]);
        }
        super.onResume();
    }
}
