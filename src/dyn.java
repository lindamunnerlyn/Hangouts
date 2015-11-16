// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public final class dyn extends ad
{

    public dyn()
    {
    }

    static dyq a(dyn dyn1)
    {
        return (dyq)((dyk)dyn1.getActivity()).g();
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(g.pX, viewgroup, false);
        ((TextView)layoutinflater.findViewById(0x1020016)).setText(getActivity().getString(g.qc));
        ((TextView)layoutinflater.findViewById(0x102000b)).setText(getActivity().getString(g.qb));
        viewgroup = (Button)layoutinflater.findViewById(g.pT);
        viewgroup.setText(getActivity().getString(g.qa));
        viewgroup.setOnClickListener(new dyo(this));
        ((Button)layoutinflater.findViewById(g.pS)).setOnClickListener(new dyp(this));
        return layoutinflater;
    }
}
