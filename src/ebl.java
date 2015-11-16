// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public final class ebl extends ad
{

    public ebl()
    {
    }

    public static ebl a(String s, String s1)
    {
        ebl ebl1 = new ebl();
        ebl1.setArguments(new Bundle());
        ebl1.a(s);
        ebl1.b(s1);
        return ebl1;
    }

    static ebn a(ebl ebl1)
    {
        return (ebn)((ebv)ebl1.getActivity()).g();
    }

    public void a(String s)
    {
        getArguments().putString("android.intent.extra.TITLE", s);
        if (getView() != null)
        {
            ((TextView)getView().findViewById(0x1020016)).setText(s);
        }
    }

    public void b(String s)
    {
        getArguments().putString("android.intent.extra.TEXT", s);
        if (getView() != null)
        {
            ((TextView)getView().findViewById(0x102000b)).setText(s);
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(g.pZ, viewgroup, false);
        ((TextView)layoutinflater.findViewById(0x1020016)).setText(getArguments().getString("android.intent.extra.TITLE"));
        ((TextView)layoutinflater.findViewById(0x102000b)).setText(getArguments().getString("android.intent.extra.TEXT"));
        ((Button)layoutinflater.findViewById(g.pV)).setOnClickListener(new ebm(this));
        ((Button)layoutinflater.findViewById(g.pU)).setVisibility(8);
        return layoutinflater;
    }
}
