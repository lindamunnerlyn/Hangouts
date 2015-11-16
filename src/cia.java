// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.TextView;

final class cia extends zs
{

    final chn l;
    private final TextView m;

    public cia(chn chn, View view)
    {
        l = chn;
        super(view);
        m = (TextView)view.findViewById(l.tM);
    }

    static TextView a(cia cia1)
    {
        return cia1.m;
    }

    public void b(int i)
    {
        m.setText(i);
    }
}
