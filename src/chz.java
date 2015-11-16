// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.TextView;

final class chz extends zs
{

    final chn l;
    private TextView m;

    chz(chn chn, View view)
    {
        l = chn;
        super(view);
        m = (TextView)view.findViewById(l.tW);
    }

    static TextView a(chz chz1)
    {
        return chz1.m;
    }
}
