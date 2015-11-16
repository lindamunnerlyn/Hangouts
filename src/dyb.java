// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public final class dyb extends ad
{

    public dyb()
    {
    }

    public static dyb a(String s, String s1)
    {
        dyb dyb1 = new dyb();
        dyb1.setArguments(new Bundle());
        dyb1.a(s);
        dyb1.b(s1);
        return dyb1;
    }

    static dyd a(dyb dyb1)
    {
        return (dyd)((dyk)dyb1.getActivity()).g();
    }

    public void a(String s)
    {
        getArguments().putString("android.intent.extra.TITLE", s);
        if (getView() != null)
        {
            ((TextView)getView().findViewById(0x1020016)).setText(s);
        }
    }

    public void b(String s)
    {
        getArguments().putString("android.intent.extra.TEXT", s);
        if (getView() != null)
        {
            ((TextView)getView().findViewById(0x102000b)).setText(s);
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(g.pX, viewgroup, false);
        ((TextView)layoutinflater.findViewById(0x1020016)).setText(getArguments().getString("android.intent.extra.TITLE"));
        ((TextView)layoutinflater.findViewById(0x102000b)).setText(getArguments().getString("android.intent.extra.TEXT"));
        ((Button)layoutinflater.findViewById(g.pT)).setOnClickListener(new dyc(this));
        ((Button)layoutinflater.findViewById(g.pS)).setVisibility(8);
        return layoutinflater;
    }
}
