// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public final class alr extends ctg
{

    public alr()
    {
        super(g.jl, new int[] {
            l.tu, l.tv
        });
    }

    protected String a()
    {
        return getString(g.ju);
    }

    protected void a(int i)
    {
        aoa aoa = dcn.e(((gqu)binder.a(gqu)).a());
        if (aoa == null)
        {
            eev.f("Babel", "[CallPromo.buttonClicked] Account changed?");
        } else
        {
            hlt hlt1 = context;
            boolean flag;
            if (i == l.tv)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            aoc.a(hlt1, aoa, flag);
        }
        super.a(i);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = super.onCreateView(layoutinflater, viewgroup, bundle);
        viewgroup = (TextView)layoutinflater.findViewById(l.ts);
        bundle = g.f("https://www.google.com/support/hangouts/?hl=%locale%", "android_sms");
        bundle = getActivity().getString(g.jt, new Object[] {
            bundle.toString()
        });
        g.a(viewgroup, context, bundle);
        ((Button)layoutinflater.findViewById(l.tu)).setText(g.js);
        viewgroup = (Button)layoutinflater.findViewById(l.tv);
        viewgroup.setTextColor(layoutinflater.getResources().getColor(g.jg));
        viewgroup.setText(g.jv);
        g.a((ImageView)layoutinflater.findViewById(l.tr), context.getResources(), h.gX);
        return layoutinflater;
    }
}
