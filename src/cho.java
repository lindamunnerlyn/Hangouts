// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.TextView;

final class cho extends chy
{

    final chn b;

    cho(chn chn, int i, int j)
    {
        b = chn;
        super(chn, i, true, false, j);
    }

    protected void a(zs zs)
    {
        zs = (chz)zs;
        chz.a(zs).setText(h.iC);
        chz.a(zs).setFocusableInTouchMode(true);
    }
}
