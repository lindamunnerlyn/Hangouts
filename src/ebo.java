// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public final class ebo extends ad
{

    public ebo()
    {
    }

    public static ebo a(String s, String s1)
    {
        ebo ebo1 = new ebo();
        ebo1.setArguments(new Bundle());
        ebo1.getArguments().putString("android.intent.extra.TITLE", s);
        if (ebo1.getView() != null)
        {
            ((TextView)ebo1.getView().findViewById(0x1020016)).setText(s);
        }
        ebo1.a(s1);
        return ebo1;
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
        layoutinflater = layoutinflater.inflate(g.pX, viewgroup, false);
        ((TextView)layoutinflater.findViewById(0x1020016)).setText(getArguments().getString("android.intent.extra.TITLE"));
        ((TextView)layoutinflater.findViewById(0x102000b)).setText(getArguments().getString("android.intent.extra.TEXT"));
        return layoutinflater;
    }
}
