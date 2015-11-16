// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.fragments;

import android.database.Cursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import aoa;
import bgf;
import bgg;
import bgh;
import bgi;
import bkk;
import bq;
import br;
import com.google.android.apps.hangouts.content.EsProvider;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import coz;
import dcn;
import dhy;
import egl;
import em;
import g;
import gqu;
import h;
import hlp;
import hlt;
import hm;

public class BlockedPeopleFragment extends bkk
    implements br
{

    private aoa a;
    private ListView b;
    private bgh c;
    private boolean d;
    private int e;
    private gqu f;
    private hm g;
    private final egl h = new bgf(this);
    private final dhy i = new bgg(this);

    public BlockedPeopleFragment()
    {
        d = false;
        e = -1;
    }

    public static void a(BlockedPeopleFragment blockedpeoplefragment)
    {
        blockedpeoplefragment.b();
    }

    public static void a(BlockedPeopleFragment blockedpeoplefragment, int l)
    {
        blockedpeoplefragment.g.remove(Integer.valueOf(l));
        if (blockedpeoplefragment.g.size() == 0)
        {
            blockedpeoplefragment.c();
        }
    }

    public static void a(BlockedPeopleFragment blockedpeoplefragment, View view)
    {
        blockedpeoplefragment.b(view);
    }

    public static hlt b(BlockedPeopleFragment blockedpeoplefragment)
    {
        return blockedpeoplefragment.context;
    }

    private void b()
    {
        if (!d)
        {
            RealTimeChatService.a(i);
            d = true;
        }
    }

    private void b(View view)
    {
        if (a())
        {
            showEmptyViewProgress(view);
            return;
        }
        if (isEmpty())
        {
            showEmptyView(view);
            return;
        } else
        {
            showContent(view);
            return;
        }
    }

    public static aoa c(BlockedPeopleFragment blockedpeoplefragment)
    {
        return blockedpeoplefragment.a;
    }

    private void c()
    {
        if (d)
        {
            RealTimeChatService.b(i);
            d = false;
        }
    }

    public static hm d(BlockedPeopleFragment blockedpeoplefragment)
    {
        return blockedpeoplefragment.g;
    }

    public static bgh e(BlockedPeopleFragment blockedpeoplefragment)
    {
        return blockedpeoplefragment.c;
    }

    public static int f(BlockedPeopleFragment blockedpeoplefragment)
    {
        return blockedpeoplefragment.e;
    }

    public static void g(BlockedPeopleFragment blockedpeoplefragment)
    {
        blockedpeoplefragment.e = -1;
        blockedpeoplefragment.c();
    }

    public static hlt h(BlockedPeopleFragment blockedpeoplefragment)
    {
        return blockedpeoplefragment.context;
    }

    public static hlt i(BlockedPeopleFragment blockedpeoplefragment)
    {
        return blockedpeoplefragment.context;
    }

    public static hlt j(BlockedPeopleFragment blockedpeoplefragment)
    {
        return blockedpeoplefragment.context;
    }

    public static egl k(BlockedPeopleFragment blockedpeoplefragment)
    {
        return blockedpeoplefragment.h;
    }

    protected void a(View view)
    {
        if (isEmpty())
        {
            view.findViewById(0x1020004).setVisibility(8);
            view.findViewById(h.de).setVisibility(0);
            view.findViewById(h.dj).setVisibility(8);
        }
    }

    public void a(em em1, Cursor cursor)
    {
        switch (em1.o())
        {
        default:
            return;

        case 1026: 
            c.a(cursor);
            break;
        }
        b(getView());
    }

    protected boolean a()
    {
        return c == null || c.a() == null || e > 0;
    }

    protected boolean isEmpty()
    {
        return c == null || c.a() == null || c.getCount() == 0;
    }

    protected void onAttachBinder(Bundle bundle)
    {
        super.onAttachBinder(bundle);
        f = (gqu)binder.a(gqu);
    }

    public void onCreate(Bundle bundle)
    {
        g = new hm();
        super.onCreate(bundle);
        a = dcn.e(f.a());
    }

    public em onCreateLoader(int l, Bundle bundle)
    {
        switch (l)
        {
        default:
            return null;

        case 1026: 
            bundle = EsProvider.b(a);
            break;
        }
        return new coz(getActivity(), a, bundle, bgi.a, null, null, "name ASC");
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(g.fg, viewgroup, false);
        b = (ListView)layoutinflater.findViewById(h.dj);
        c = new bgh(this, getActivity());
        b.setAdapter(c);
        getLoaderManager().a(1026, new Bundle(), this).s();
        return layoutinflater;
    }

    public void onDestroy()
    {
        super.onDestroy();
        c();
        b.setAdapter(null);
        g = null;
    }

    public void onLoadFinished(em em1, Object obj)
    {
        a(em1, (Cursor)obj);
    }

    public void onLoaderReset(em em1)
    {
        switch (em1.o())
        {
        default:
            return;

        case 1026: 
            c.a(null);
            break;
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
    }

    public void onStart()
    {
        super.onStart();
        if (!a.o())
        {
            b();
            e = RealTimeChatService.d(a);
        }
        b(getView());
    }

    public void onStop()
    {
        super.onStop();
        c();
        g.clear();
    }

    protected void showContent(View view)
    {
        super.showContent(view);
        view.findViewById(h.de).setVisibility(8);
        view.findViewById(h.dj).setVisibility(0);
    }
}
