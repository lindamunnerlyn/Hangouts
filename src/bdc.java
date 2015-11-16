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

public class bdc extends hhu
{

    public List a;
    private ViewPager b;
    private SlidingTabLayout c;
    private bdf d;
    private gmo e;
    private alw f;
    private dmt g;
    private Map h;
    private AsyncTask i;

    public bdc()
    {
        h = new HashMap();
        a = new ArrayList();
    }

    static bdf a(bdc bdc1, bdf bdf1)
    {
        bdc1.d = bdf1;
        return bdf1;
    }

    static SlidingTabLayout a(bdc bdc1)
    {
        return bdc1.c;
    }

    private void a()
    {
        if (!h.isEmpty())
        {
            ara ara1;
            for (Iterator iterator = h.values().iterator(); iterator.hasNext(); g.b(ara1))
            {
                ara1 = (ara)iterator.next();
            }

            h.clear();
        }
        if (i != null)
        {
            i.cancel(true);
        }
    }

    static bdf b(bdc bdc1)
    {
        return bdc1.d;
    }

    static ViewPager c(bdc bdc1)
    {
        return bdc1.b;
    }

    static Map d(bdc bdc1)
    {
        return bdc1.h;
    }

    static dmt e(bdc bdc1)
    {
        return bdc1.g;
    }

    static gmo f(bdc bdc1)
    {
        return bdc1.e;
    }

    public void a(int j)
    {
        String s = f.a("babel_stickers_account_id", "108618507921641169817");
        Object obj = new aoe(context, j);
        a = ((aoe) (obj)).a(true);
        if (!a.isEmpty())
        {
            cwv cwv1 = new cwv();
            cwv1.e = ((aoe) (obj)).y();
            if (cwv1.e != null && !cwv1.e.isEmpty())
            {
                cwv1.b = "Recent";
                cwv1.a = "Recent";
                cwv1.c = (cww)cwv1.e.get(0);
                a.add(0, cwv1);
            }
        }
        boolean flag = a.isEmpty();
        obj = dbf.e(j);
        if (!((ani) (obj)).q() && !dbf.g(((ani) (obj))))
        {
            long l = ank.p(g.nS, ((ani) (obj)));
            long l1 = g.a(g.nS, "babel_stickers_query_limit_ms", djk.i);
            if (flag || l1 + l < System.currentTimeMillis())
            {
                ebw.e("StickersPagerFragment", (new StringBuilder(63)).append("Sticker update initiated. last:").append(l).append(" empty:").append(flag).toString());
                RealTimeChatService.q(((ani) (obj)), s);
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
        e = (gmo)binder.a(gmo);
        f = (alw)binder.a(alw);
        g = (dmt)binder.a(dmt);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(g.lz, viewgroup, false);
        b = (ViewPager)layoutinflater.findViewById(h.hE);
        c = (SlidingTabLayout)layoutinflater.findViewById(h.hD);
        c.a();
        c.a(g.lw, h.hB);
        c.a(b);
        int j = layoutinflater.getResources().getDimensionPixelSize(g.lq);
        c.getViewTreeObserver().addOnGlobalLayoutListener(new bdd(this, j));
        return layoutinflater;
    }

    public void onPause()
    {
        super.onPause();
        if (b.getChildCount() > 0 && b.c() <= a.size())
        {
            a(((cwv)a.get(b.c())).a);
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
            i = new bde(this, j, this);
            i.execute(new Void[0]);
        }
        super.onResume();
    }
}
