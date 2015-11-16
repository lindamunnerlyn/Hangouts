// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.statusmessage.impl;

import ai;
import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import dwe;
import dwk;
import g;
import hpd;
import irm;
import irq;
import irr;
import irz;
import its;

public final class StatusMessageSettingsFragment extends hpd
{

    private dwe a;
    private dwk b;

    public StatusMessageSettingsFragment()
    {
    }

    private StatusMessageSettingsFragment(Activity activity)
    {
        a(activity);
    }

    private dwe a()
    {
        if (a == null)
        {
            throw new IllegalStateException("peer() called before initialized");
        } else
        {
            return a;
        }
    }

    private void a(Activity activity)
    {
        try
        {
            b = (dwk)((irr)((irm)activity).a()).a(new irz(this));
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", activity);
        }
        a = b.a();
    }

    public LayoutInflater getLayoutInflater(Bundle bundle)
    {
        return super.getLayoutInflater(bundle).cloneInContext(new irq(getActivity().getLayoutInflater().getContext(), b));
    }

    public void onActivityCreated(Bundle bundle)
    {
        its.c();
        super.onActivityCreated(bundle);
        its.d();
        return;
        bundle;
        its.d();
        throw bundle;
    }

    public void onAttach(Activity activity)
    {
        its.c();
        super.onAttach(activity);
        if (a == null)
        {
            a(activity);
        }
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            activity.getWindow().setStatusBarColor(activity.getResources().getColor(g.dR));
        }
        its.d();
        return;
        activity;
        its.d();
        throw activity;
    }

    public void onCreate(Bundle bundle)
    {
        its.c();
        super.onCreate(bundle);
        its.d();
        return;
        bundle;
        its.d();
        throw bundle;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        its.c();
        super.onCreateView(layoutinflater, viewgroup, bundle);
        layoutinflater = a().a(layoutinflater, viewgroup, bundle);
        its.d();
        return layoutinflater;
        layoutinflater;
        its.d();
        throw layoutinflater;
    }

    public void onDestroy()
    {
        its.c();
        super.onDestroy();
        its.d();
        return;
        Exception exception;
        exception;
        its.d();
        throw exception;
    }

    public void onDestroyView()
    {
        its.c();
        super.onDestroyView();
        its.d();
        return;
        Exception exception;
        exception;
        its.d();
        throw exception;
    }

    public void onDetach()
    {
        its.c();
        super.onDetach();
        its.d();
        return;
        Exception exception;
        exception;
        its.d();
        throw exception;
    }

    public void onPause()
    {
        its.c();
        super.onPause();
        its.d();
        return;
        Exception exception;
        exception;
        its.d();
        throw exception;
    }

    public void onResume()
    {
        its.c();
        super.onResume();
        its.d();
        return;
        Exception exception;
        exception;
        its.d();
        throw exception;
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        a().a(bundle);
    }

    public void onStart()
    {
        its.c();
        super.onStart();
        its.d();
        return;
        Exception exception;
        exception;
        its.d();
        throw exception;
    }

    public void onStop()
    {
        its.c();
        super.onStop();
        its.d();
        return;
        Exception exception;
        exception;
        its.d();
        throw exception;
    }
}
