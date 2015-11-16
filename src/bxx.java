// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.ViewGroup;

public final class bxx
    implements ejx
{

    public bxx()
    {
    }

    public eia a(Context context, int i, bid bid, Resources resources)
    {
        return new bxv(context, i, bid, resources);
    }

    public eia a(ViewGroup viewgroup, int i, LayoutInflater layoutinflater)
    {
        viewgroup = layoutinflater.inflate(g.mI, viewgroup, true);
        return new byc(layoutinflater.getContext(), i, viewgroup);
    }
}
