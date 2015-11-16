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

public final class bxe extends cqw
{

    public bxe()
    {
        super(g.mG, new int[] {
            h.iC
        });
    }

    protected String a()
    {
        return getString(g.mL);
    }

    protected void a(int i)
    {
        ani ani = dbf.e(((gmo)binder.a(gmo)).a());
        if (ani == null)
        {
            ebw.f("Babel", "[LastSeenPromo.setLastSeenPromo] Account changed?");
        } else
        {
            ank.a(getContext(), ani);
            RealTimeChatService.a(ani, 6, true);
        }
        super.a(i);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = super.onCreateView(layoutinflater, viewgroup, bundle);
        viewgroup = (Button)layoutinflater.findViewById(h.iC);
        viewgroup.setTextColor(layoutinflater.getResources().getColor(h.iy));
        viewgroup.setText(g.mK);
        g.a((ImageView)layoutinflater.findViewById(h.iB), context.getResources(), g.mI);
        return layoutinflater;
    }
}
