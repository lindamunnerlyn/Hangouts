// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;

public final class bel extends ctg
{

    private View a;

    public bel()
    {
        super(g.lw, new int[] {
            g.lv
        });
    }

    protected String a()
    {
        return getString(g.lx);
    }

    protected void a(int i)
    {
        int j = ((gqu)binder.a(gqu)).a();
        aoa aoa = dcn.e(j);
        aoc.b(getContext(), aoa);
        if (((CheckBox)a.findViewById(g.lu)).isChecked())
        {
            ((dra)binder.a(dra)).b(j);
        }
        super.a(i);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        a = super.onCreateView(layoutinflater, viewgroup, bundle);
        layoutinflater = (Button)a.findViewById(g.lv);
        layoutinflater.setTextColor(a.getResources().getColor(h.hm));
        layoutinflater.setText(0x104000a);
        return a;
    }
}
