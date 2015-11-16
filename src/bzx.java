// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import java.util.Locale;

public final class bzx extends ctg
{

    public bzx()
    {
        super(g.mY, new int[] {
            n.b, n.c
        });
    }

    protected String a()
    {
        return getString(g.nc);
    }

    protected void a(int i)
    {
        if (i == n.c)
        {
            aoc.c(getContext());
        } else
        {
            System.exit(0);
        }
        super.a(i);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        viewgroup = super.onCreateView(layoutinflater, viewgroup, bundle);
        layoutinflater = Locale.getDefault().getLanguage();
        if (layoutinflater == null || layoutinflater.length() != 2)
        {
            layoutinflater = "ko";
        }
        bundle = (TextView)viewgroup.findViewById(n.a);
        Resources resources = viewgroup.getResources();
        int i = g.na;
        String s = (new StringBuilder(String.valueOf(layoutinflater).length() + 44)).append("https://www.google.com/intl/").append(layoutinflater).append("/policies/terms/").toString();
        layoutinflater = String.valueOf(layoutinflater);
        if (layoutinflater.length() != 0)
        {
            layoutinflater = "https://www.google.com/policies/privacy/?hl=".concat(layoutinflater);
        } else
        {
            layoutinflater = new String("https://www.google.com/policies/privacy/?hl=");
        }
        bundle.setText(Html.fromHtml(resources.getString(i, new Object[] {
            "https://www.google.co.kr/intl/ko/policies/terms/location/", s, layoutinflater
        })));
        bundle.setMovementMethod(LinkMovementMethod.getInstance());
        ((Button)viewgroup.findViewById(n.b)).setText(g.nb);
        layoutinflater = (Button)viewgroup.findViewById(n.c);
        layoutinflater.setTextColor(viewgroup.getResources().getColor(l.tC));
        layoutinflater.setText(g.mZ);
        return viewgroup;
    }
}
