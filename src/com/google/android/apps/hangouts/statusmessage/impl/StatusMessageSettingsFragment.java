// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.statusmessage.impl;

import ai;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.accessibility.AccessibilityManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import ani;
import com.google.android.apps.hangouts.views.AvatarView;
import dbf;
import dte;
import dtf;
import dtg;
import ebr;
import edy;
import g;
import gmo;
import h;
import hgx;
import hhb;
import hhu;
import l;

public class StatusMessageSettingsFragment extends hhu
{

    private gmo a;
    private ani b;
    private EditText c;
    private TextView d;
    private View e;
    private Button f;
    private AccessibilityManager g;
    private final TextWatcher h = new dtg(this);

    public StatusMessageSettingsFragment()
    {
    }

    public static int a(String s)
    {
        return s.codePointCount(0, s.length());
    }

    public static EditText a(StatusMessageSettingsFragment statusmessagesettingsfragment)
    {
        return statusmessagesettingsfragment.c;
    }

    public static ani b(StatusMessageSettingsFragment statusmessagesettingsfragment)
    {
        return statusmessagesettingsfragment.b;
    }

    public static void c(StatusMessageSettingsFragment statusmessagesettingsfragment)
    {
        ((InputMethodManager)statusmessagesettingsfragment.getActivity().getSystemService("input_method")).hideSoftInputFromWindow(statusmessagesettingsfragment.c.getWindowToken(), 0);
        statusmessagesettingsfragment.getActivity().finish();
    }

    public static View d(StatusMessageSettingsFragment statusmessagesettingsfragment)
    {
        return statusmessagesettingsfragment.e;
    }

    public static Button e(StatusMessageSettingsFragment statusmessagesettingsfragment)
    {
        return statusmessagesettingsfragment.f;
    }

    public static TextView f(StatusMessageSettingsFragment statusmessagesettingsfragment)
    {
        return statusmessagesettingsfragment.d;
    }

    public static boolean g(StatusMessageSettingsFragment statusmessagesettingsfragment)
    {
        return statusmessagesettingsfragment.g != null && statusmessagesettingsfragment.g.isEnabled() && statusmessagesettingsfragment.g.isTouchExplorationEnabled();
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            activity.getWindow().setStatusBarColor(getResources().getColor(g.dS));
        }
    }

    protected void onAttachBinder(Bundle bundle)
    {
        super.onAttachBinder(bundle);
        a = (gmo)binder.a(gmo);
        b = dbf.e(a.a());
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.onCreateView(layoutinflater, viewgroup, bundle);
        b = dbf.e(a.a());
        viewgroup = layoutinflater.inflate(g.he, viewgroup, false);
        c = (EditText)viewgroup.findViewById(h.gf);
        d = (TextView)viewgroup.findViewById(h.gd);
        e = viewgroup.findViewById(h.ge);
        f = (Button)viewgroup.findViewById(h.gh);
        Button button = (Button)viewgroup.findViewById(h.gg);
        ((AvatarView)viewgroup.findViewById(h.dE)).a(b.x(), b.c(), b);
        c.addTextChangedListener(h);
        if (bundle != null)
        {
            layoutinflater = bundle.getString("saved_text");
        } else
        {
            layoutinflater = getActivity().getIntent().getStringExtra("status_message");
        }
        if (layoutinflater != null)
        {
            layoutinflater = ebr.a(Html.fromHtml(layoutinflater));
        } else
        {
            layoutinflater = new SpannableString("");
        }
        edy.a(getContext()).a(layoutinflater, c);
        c.setText(layoutinflater);
        c.setSelection(layoutinflater.length());
        g = (AccessibilityManager)context.getSystemService("accessibility");
        layoutinflater = getResources();
        ((TextView)viewgroup.findViewById(h.dF)).setText(layoutinflater.getString(l.fX, new Object[] {
            "\uD83D\uDE4B"
        }));
        f.setOnClickListener(new dte(this));
        button.setOnClickListener(new dtf(this));
        return viewgroup;
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putString("saved_text", c.getText().toString());
    }
}
