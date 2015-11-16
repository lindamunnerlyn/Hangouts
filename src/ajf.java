// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public final class ajf extends ctg
{

    public ajf()
    {
        super(g.iw, new int[] {
            g.it, g.iu
        });
    }

    protected String a()
    {
        return ((gqu)binder.a(gqu)).c().b("display_name");
    }

    protected void a(int i)
    {
        aoa aoa = dcn.e(((gqu)binder.a(gqu)).a());
        if (aoa == null)
        {
            eev.f("Babel", "[BusinessFeaturesPromo.setBusinessPromo] Account changed?");
        } else
        {
            android.content.Context context = getContext();
            boolean flag;
            if (i == g.iu)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            aoc.c(context, aoa, flag);
            aoc.e(getContext(), aoa);
        }
        super.a(i);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = super.onCreateView(layoutinflater, viewgroup, bundle);
        viewgroup = ((gqu)binder.a(gqu)).c().b("display_name");
        ((TextView)layoutinflater.findViewById(g.is)).setText(Html.fromHtml(context.getString(h.gN, new Object[] {
            viewgroup
        })));
        viewgroup = (TextView)layoutinflater.findViewById(g.ir);
        bundle = g.f("https://support.google.com/business/?hl=%locale%", "hangouts_business");
        bundle = context.getString(h.gL, new Object[] {
            bundle.toString()
        });
        g.a(viewgroup, context, bundle);
        ((Button)layoutinflater.findViewById(g.it)).setText(h.gM);
        viewgroup = (Button)layoutinflater.findViewById(g.iu);
        viewgroup.setTextColor(layoutinflater.getResources().getColor(g.iq));
        viewgroup.setText(h.gK);
        g.a((ImageView)layoutinflater.findViewById(g.iv), context.getResources(), g.ix);
        return layoutinflater;
    }
}
