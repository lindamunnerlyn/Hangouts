// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.ViewGroup;

public final class bxb
    implements egv
{

    public bxb()
    {
    }

    public eey a(Context context, int i, bhr bhr, Resources resources)
    {
        return new bwz(context, i, bhr, resources);
    }

    public eey a(ViewGroup viewgroup, int i, LayoutInflater layoutinflater)
    {
        viewgroup = layoutinflater.inflate(g.mH, viewgroup, true);
        return new bxg(layoutinflater.getContext(), i, viewgroup);
    }
}
