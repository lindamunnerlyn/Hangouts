// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public final class alr extends cqw
{

    private dan a;
    private ani b;

    public alr()
    {
        super(g.jr, new int[] {
            l.ud, l.ue
        });
    }

    protected String a()
    {
        if (((dan)hgx.a(getActivity().getApplicationContext(), dan)).b(getActivity()) && "com.google.android.apps.hangouts.phone.recentcalls".equals(getActivity().getIntent().getAction()))
        {
            return getString(g.jv);
        } else
        {
            return getString(g.jz);
        }
    }

    protected void a(int i)
    {
        PreferenceManager.getDefaultSharedPreferences(getActivity()).edit().putBoolean("call_promo_shown", true).apply();
        if (i != l.ue) goto _L2; else goto _L1
_L1:
        if (!a.b(getActivity())) goto _L4; else goto _L3
_L3:
        getActivity().startActivity(g.h(b));
_L2:
        super.a(i);
        return;
_L4:
        if (!g.b(getActivity(), "com.google.android.apps.hangoutsdialer"))
        {
            ebw.a("Babel", "Unable to launch play store intent.");
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = super.onCreateView(layoutinflater, viewgroup, bundle);
        a = (dan)hgx.a(getActivity().getApplicationContext(), dan);
        b = dbf.e(((gmo)binder.a(gmo)).a());
        viewgroup = (Button)layoutinflater.findViewById(l.ue);
        viewgroup.setText(g.jx);
        viewgroup.setTextColor(layoutinflater.getResources().getColor(g.jq));
        bundle = (Button)layoutinflater.findViewById(l.ud);
        bundle.setText(g.jy);
        if (a.b(getActivity())) goto _L2; else goto _L1
_L1:
        viewgroup.setText(g.jw);
_L4:
        g.a((ImageView)layoutinflater.findViewById(l.uc), context.getResources(), h.hs);
        return layoutinflater;
_L2:
        if ("com.google.android.apps.hangouts.phone.recentcalls".equals(getActivity().getIntent().getAction()))
        {
            bundle.setVisibility(8);
            viewgroup.setText(g.ju);
            ((TextView)layoutinflater.findViewById(l.tZ)).setText(g.jv);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
