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
import ani;
import bft;
import bfu;
import bfv;
import bfw;
import bjy;
import bq;
import br;
import cnh;
import com.google.android.apps.hangouts.content.EsProvider;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import dbf;
import dgp;
import edj;
import em;
import g;
import gmo;
import h;
import hgx;
import hm;

public class BlockedPeopleFragment extends bjy
    implements br
{

    private ani a;
    private ListView b;
    private bfv c;
    private boolean d;
    private int e;
    private gmo f;
    private hm g;
    private final edj h = new bft(this);
    private final dgp i = new bfu(this);

    public BlockedPeopleFragment()
    {
        d = false;
        e = -1;
    }

    public static void a(BlockedPeopleFragment blockedpeoplefragment)
    {
        blockedpeoplefragment.b();
    }

    public static void a(BlockedPeopleFragment blockedpeoplefragment, int j)
    {
        blockedpeoplefragment.g.remove(Integer.valueOf(j));
        if (blockedpeoplefragment.g.size() == 0)
        {
            blockedpeoplefragment.c();
        }
    }

    public static void a(BlockedPeopleFragment blockedpeoplefragment, View view)
    {
        blockedpeoplefragment.b(view);
    }

    public static ani b(BlockedPeopleFragment blockedpeoplefragment)
    {
        return blockedpeoplefragment.a;
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

    public static hm c(BlockedPeopleFragment blockedpeoplefragment)
    {
        return blockedpeoplefragment.g;
    }

    private void c()
    {
        if (d)
        {
            RealTimeChatService.b(i);
            d = false;
        }
    }

    public static bfv d(BlockedPeopleFragment blockedpeoplefragment)
    {
        return blockedpeoplefragment.c;
    }

    public static int e(BlockedPeopleFragment blockedpeoplefragment)
    {
        return blockedpeoplefragment.e;
    }

    public static void f(BlockedPeopleFragment blockedpeoplefragment)
    {
        blockedpeoplefragment.e = -1;
        blockedpeoplefragment.c();
    }

    public static edj g(BlockedPeopleFragment blockedpeoplefragment)
    {
        return blockedpeoplefragment.h;
    }

    protected void a(View view)
    {
        if (isEmpty())
        {
            view.findViewById(0x1020004).setVisibility(8);
            view.findViewById(h.dq).setVisibility(0);
            view.findViewById(h.dv).setVisibility(8);
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
        f = (gmo)binder.a(gmo);
    }

    public void onCreate(Bundle bundle)
    {
        g = new hm();
        super.onCreate(bundle);
        a = dbf.e(f.a());
    }

    public em onCreateLoader(int j, Bundle bundle)
    {
        switch (j)
        {
        default:
            return null;

        case 1026: 
            bundle = EsProvider.b(a);
            break;
        }
        return new cnh(getActivity(), a, bundle, bfw.a, null, null, "name ASC");
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(g.fi, viewgroup, false);
        b = (ListView)layoutinflater.findViewById(h.dv);
        c = new bfv(this, getActivity());
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
        if (!a.q())
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
        view.findViewById(h.dq).setVisibility(8);
        view.findViewById(h.dv).setVisibility(0);
    }
}
