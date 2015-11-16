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

public final class alu extends cqw
{

    public alu()
    {
        super(g.jt, new int[] {
            l.ud, l.ue
        });
    }

    protected String a()
    {
        return getString(g.jC);
    }

    protected void a(int i)
    {
        ani ani = dbf.e(((gmo)binder.a(gmo)).a());
        if (ani == null)
        {
            ebw.f("Babel", "[CallPromo.buttonClicked] Account changed?");
        } else
        {
            hhb hhb1 = context;
            boolean flag;
            if (i == l.ue)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            ank.a(hhb1, ani, flag);
        }
        super.a(i);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = super.onCreateView(layoutinflater, viewgroup, bundle);
        viewgroup = (TextView)layoutinflater.findViewById(l.ub);
        bundle = g.f("https://www.google.com/support/hangouts/?hl=%locale%", "android_sms");
        bundle = getActivity().getString(g.jB, new Object[] {
            bundle.toString()
        });
        g.a(viewgroup, context, bundle);
        ((Button)layoutinflater.findViewById(l.ud)).setText(g.jA);
        viewgroup = (Button)layoutinflater.findViewById(l.ue);
        viewgroup.setTextColor(layoutinflater.getResources().getColor(g.jo));
        viewgroup.setText(g.jD);
        g.a((ImageView)layoutinflater.findViewById(l.ua), context.getResources(), h.hr);
        return layoutinflater;
    }
}
