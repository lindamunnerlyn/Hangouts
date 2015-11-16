// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.ImageView;

final class chx extends zs
{

    final chn l;
    private final ImageView m;

    public chx(chn chn1, View view)
    {
        l = chn1;
        super(view);
        m = (ImageView)view.findViewById(l.tE);
    }

    public void v()
    {
        int i;
        if (l.g)
        {
            i = n.f;
        } else
        {
            i = n.g;
        }
        m.setImageResource(i);
    }
}
