// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public final class dye extends ad
{

    public dye()
    {
    }

    public static dye a(String s, String s1)
    {
        dye dye1 = new dye();
        dye1.setArguments(new Bundle());
        dye1.getArguments().putString("android.intent.extra.TITLE", s);
        if (dye1.getView() != null)
        {
            ((TextView)dye1.getView().findViewById(0x1020016)).setText(s);
        }
        dye1.a(s1);
        return dye1;
    }

    public void a(String s)
    {
        getArguments().putString("android.intent.extra.TEXT", s);
        if (getView() != null)
        {
            ((TextView)getView().findViewById(0x102000b)).setText(s);
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(g.pV, viewgroup, false);
        ((TextView)layoutinflater.findViewById(0x1020016)).setText(getArguments().getString("android.intent.extra.TITLE"));
        ((TextView)layoutinflater.findViewById(0x102000b)).setText(getArguments().getString("android.intent.extra.TEXT"));
        return layoutinflater;
    }
}
