// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class bya extends ctg
{

    public bya()
    {
        super(g.mH, new int[] {
            h.iy
        });
    }

    protected String a()
    {
        return getString(g.mM);
    }

    protected void a(int i)
    {
        aoa aoa = dcn.e(((gqu)binder.a(gqu)).a());
        if (aoa == null)
        {
            eev.f("Babel", "[LastSeenPromo.setLastSeenPromo] Account changed?");
        } else
        {
            aoc.a(getContext(), aoa);
            RealTimeChatService.a(aoa, 6, true);
        }
        super.a(i);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = super.onCreateView(layoutinflater, viewgroup, bundle);
        viewgroup = (Button)layoutinflater.findViewById(h.iy);
        viewgroup.setTextColor(layoutinflater.getResources().getColor(h.iu));
        viewgroup.setText(g.mL);
        g.a((ImageView)layoutinflater.findViewById(h.ix), context.getResources(), g.mJ);
        return layoutinflater;
    }
}
