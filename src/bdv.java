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

public final class bdv extends cqw
{

    private View a;

    public bdv()
    {
        super(g.lE, new int[] {
            g.lD
        });
    }

    protected String a()
    {
        return getString(g.lF);
    }

    protected void a(int i)
    {
        int j = ((gmo)binder.a(gmo)).a();
        ani ani = dbf.e(j);
        ank.b(getContext(), ani);
        if (((CheckBox)a.findViewById(g.lC)).isChecked())
        {
            ((doh)binder.a(doh)).b(j);
        }
        super.a(i);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        a = super.onCreateView(layoutinflater, viewgroup, bundle);
        layoutinflater = (Button)a.findViewById(g.lD);
        layoutinflater.setTextColor(a.getResources().getColor(h.hG));
        layoutinflater.setText(0x104000a);
        return a;
    }
}
