// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class bcy extends hmk
{

    public bcy()
    {
    }

    public Dialog a(Bundle bundle)
    {
        bundle = super.a(bundle);
        bundle.requestWindowFeature(1);
        return bundle;
    }

    protected void e(Bundle bundle)
    {
        super.e(bundle);
        al.a(bcx, new bcz(this));
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.onCreateView(layoutinflater, viewgroup, bundle);
        layoutinflater = layoutinflater.inflate(g.lt, viewgroup, false);
        viewgroup = hmm.instantiate(ak, bds.getName());
        getChildFragmentManager().a().b(h.hl, viewgroup).b();
        return layoutinflater;
    }
}
