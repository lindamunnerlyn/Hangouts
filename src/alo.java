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

public final class alo extends ctg
{

    private dbt a;
    private aoa b;

    public alo()
    {
        super(g.jj, new int[] {
            l.tu, l.tv
        });
    }

    protected String a()
    {
        if (((dbt)hlp.a(getActivity().getApplicationContext(), dbt)).b(getActivity()) && "com.google.android.apps.hangouts.phone.recentcalls".equals(getActivity().getIntent().getAction()))
        {
            return getString(g.jn);
        } else
        {
            return getString(g.jr);
        }
    }

    protected void a(int i)
    {
        PreferenceManager.getDefaultSharedPreferences(getActivity()).edit().putBoolean("call_promo_shown", true).apply();
        if (i != l.tv) goto _L2; else goto _L1
_L1:
        if (!a.b(getActivity())) goto _L4; else goto _L3
_L3:
        getActivity().startActivity(g.g(b));
_L2:
        super.a(i);
        return;
_L4:
        if (!g.b(getActivity(), "com.google.android.apps.hangoutsdialer"))
        {
            eev.a("Babel", "Unable to launch play store intent.");
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = super.onCreateView(layoutinflater, viewgroup, bundle);
        a = (dbt)hlp.a(getActivity().getApplicationContext(), dbt);
        b = dcn.e(((gqu)binder.a(gqu)).a());
        viewgroup = (Button)layoutinflater.findViewById(l.tv);
        viewgroup.setText(g.jp);
        viewgroup.setTextColor(layoutinflater.getResources().getColor(g.ji));
        bundle = (Button)layoutinflater.findViewById(l.tu);
        bundle.setText(g.jq);
        if (a.b(getActivity())) goto _L2; else goto _L1
_L1:
        viewgroup.setText(g.jo);
_L4:
        g.a((ImageView)layoutinflater.findViewById(l.tt), context.getResources(), h.gY);
        return layoutinflater;
_L2:
        if ("com.google.android.apps.hangouts.phone.recentcalls".equals(getActivity().getIntent().getAction()))
        {
            bundle.setVisibility(8);
            viewgroup.setText(g.jm);
            ((TextView)layoutinflater.findViewById(l.tq)).setText(g.jn);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
