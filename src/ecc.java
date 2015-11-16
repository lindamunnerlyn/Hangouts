// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public final class ecc extends ad
{

    public ecc()
    {
    }

    public static ecc a()
    {
        return new ecc();
    }

    static ece a(ecc ecc1)
    {
        return (ece)((ebv)ecc1.getActivity()).g();
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(g.qa, viewgroup, false);
        viewgroup = getActivity().getString(g.qg);
        bundle = getActivity().getString(g.qf);
        ListView listview = (ListView)layoutinflater.findViewById(0x102000a);
        listview.setAdapter(new ArrayAdapter(getActivity(), 0x1090003, new String[] {
            viewgroup, bundle
        }));
        listview.setOnItemClickListener(new ecd(this));
        return layoutinflater;
    }
}
