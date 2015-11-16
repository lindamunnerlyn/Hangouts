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

public final class aji extends cqw
{

    public aji()
    {
        super(g.iE, new int[] {
            g.iB, g.iC
        });
    }

    protected String a()
    {
        return ((gmo)binder.a(gmo)).c().b("display_name");
    }

    protected void a(int i)
    {
        ani ani = dbf.e(((gmo)binder.a(gmo)).a());
        if (ani == null)
        {
            ebw.f("Babel", "[BusinessFeaturesPromo.setBusinessPromo] Account changed?");
        } else
        {
            android.content.Context context = getContext();
            boolean flag;
            if (i == g.iC)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            ank.c(context, ani, flag);
            ank.e(getContext(), ani);
        }
        super.a(i);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = super.onCreateView(layoutinflater, viewgroup, bundle);
        viewgroup = ((gmo)binder.a(gmo)).c().b("display_name");
        ((TextView)layoutinflater.findViewById(g.iA)).setText(Html.fromHtml(context.getString(h.hh, new Object[] {
            viewgroup
        })));
        viewgroup = (TextView)layoutinflater.findViewById(g.iz);
        bundle = g.f("https://support.google.com/business/?hl=%locale%", "hangouts_business");
        bundle = context.getString(h.hf, new Object[] {
            bundle.toString()
        });
        g.a(viewgroup, context, bundle);
        ((Button)layoutinflater.findViewById(g.iB)).setText(h.hg);
        viewgroup = (Button)layoutinflater.findViewById(g.iC);
        viewgroup.setTextColor(layoutinflater.getResources().getColor(g.iy));
        viewgroup.setText(h.he);
        g.a((ImageView)layoutinflater.findViewById(g.iD), context.getResources(), g.iF);
        return layoutinflater;
    }
}
