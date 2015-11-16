// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public final class eby extends ad
{

    public eby()
    {
    }

    static ecb a(eby eby1)
    {
        return (ecb)((ebv)eby1.getActivity()).g();
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(g.pZ, viewgroup, false);
        ((TextView)layoutinflater.findViewById(0x1020016)).setText(getActivity().getString(g.qe));
        ((TextView)layoutinflater.findViewById(0x102000b)).setText(getActivity().getString(g.qd));
        viewgroup = (Button)layoutinflater.findViewById(g.pV);
        viewgroup.setText(getActivity().getString(g.qc));
        viewgroup.setOnClickListener(new ebz(this));
        ((Button)layoutinflater.findViewById(g.pU)).setOnClickListener(new eca(this));
        return layoutinflater;
    }
}
