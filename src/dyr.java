// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public final class dyr extends ad
{

    public dyr()
    {
    }

    public static dyr a()
    {
        return new dyr();
    }

    static dyt a(dyr dyr1)
    {
        return (dyt)((dyk)dyr1.getActivity()).g();
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(g.pY, viewgroup, false);
        viewgroup = getActivity().getString(g.qe);
        bundle = getActivity().getString(g.qd);
        ListView listview = (ListView)layoutinflater.findViewById(0x102000a);
        listview.setAdapter(new ArrayAdapter(getActivity(), 0x1090003, new String[] {
            viewgroup, bundle
        }));
        listview.setOnItemClickListener(new dys(this));
        return layoutinflater;
    }
}
