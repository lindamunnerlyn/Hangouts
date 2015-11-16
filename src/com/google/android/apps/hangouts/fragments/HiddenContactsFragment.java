// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.fragments;

import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import bkk;
import bks;
import bkt;
import bku;
import bkv;
import bq;
import br;
import com.google.android.apps.hangouts.content.EsProvider;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import coz;
import dcn;
import dhy;
import ehx;
import em;
import g;
import gqu;
import h;
import hlp;
import hlt;

public class HiddenContactsFragment extends bkk
    implements br
{

    private gqu a;
    private ListView b;
    private bku c;
    private boolean d;
    private int e;
    private SparseArray f;
    private SparseArray g;
    private final ehx h = new bks(this);
    private final dhy i = new bkt(this);

    public HiddenContactsFragment()
    {
        d = false;
        e = -1;
    }

    public static SparseArray a(HiddenContactsFragment hiddencontactsfragment)
    {
        return hiddencontactsfragment.g;
    }

    public static void a(HiddenContactsFragment hiddencontactsfragment, int l)
    {
        hiddencontactsfragment.f.remove(l);
        hiddencontactsfragment.g.remove(l);
        if (g.a(hiddencontactsfragment.g))
        {
            hiddencontactsfragment.c();
        }
    }

    public static void a(HiddenContactsFragment hiddencontactsfragment, View view)
    {
        hiddencontactsfragment.b(view);
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

    public static void b(HiddenContactsFragment hiddencontactsfragment)
    {
        hiddencontactsfragment.b();
    }

    public static gqu c(HiddenContactsFragment hiddencontactsfragment)
    {
        return hiddencontactsfragment.a;
    }

    private void c()
    {
        if (d)
        {
            RealTimeChatService.b(i);
            d = false;
        }
    }

    public static SparseArray d(HiddenContactsFragment hiddencontactsfragment)
    {
        return hiddencontactsfragment.f;
    }

    public static bku e(HiddenContactsFragment hiddencontactsfragment)
    {
        return hiddencontactsfragment.c;
    }

    public static int f(HiddenContactsFragment hiddencontactsfragment)
    {
        return hiddencontactsfragment.e;
    }

    public static void g(HiddenContactsFragment hiddencontactsfragment)
    {
        hiddencontactsfragment.e = -1;
        hiddencontactsfragment.c();
    }

    public static hlt h(HiddenContactsFragment hiddencontactsfragment)
    {
        return hiddencontactsfragment.context;
    }

    public static hlt i(HiddenContactsFragment hiddencontactsfragment)
    {
        return hiddencontactsfragment.context;
    }

    public static hlt j(HiddenContactsFragment hiddencontactsfragment)
    {
        return hiddencontactsfragment.context;
    }

    public static ehx k(HiddenContactsFragment hiddencontactsfragment)
    {
        return hiddencontactsfragment.h;
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

        case 1027: 
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

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        activity.getIntent();
    }

    protected void onAttachBinder(Bundle bundle)
    {
        super.onAttachBinder(bundle);
        a = (gqu)binder.a(gqu);
    }

    public void onCreate(Bundle bundle)
    {
        f = new SparseArray();
        g = new SparseArray();
        super.onCreate(bundle);
    }

    public em onCreateLoader(int l, Bundle bundle)
    {
        switch (l)
        {
        default:
            return null;

        case 1027: 
            bundle = dcn.e(a.a());
            break;
        }
        android.net.Uri uri = EsProvider.c(bundle);
        return new coz(getActivity(), bundle, uri, bkv.a, null, null, "name ASC");
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(g.gm, viewgroup, false);
        b = (ListView)layoutinflater.findViewById(h.dj);
        c = new bku(this, getActivity());
        b.setAdapter(c);
        getLoaderManager().a(1027, new Bundle(), this).s();
        return layoutinflater;
    }

    public void onDestroy()
    {
        super.onDestroy();
        c();
        b.setAdapter(null);
        f = null;
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

        case 1027: 
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
        b();
        e = RealTimeChatService.a(a.a(), true);
        b(getView());
    }

    public void onStop()
    {
        super.onStop();
        c();
        g.clear();
        f.clear();
    }

    protected void showContent(View view)
    {
        super.showContent(view);
        view.findViewById(h.de).setVisibility(8);
        view.findViewById(h.dj).setVisibility(0);
    }
}
