// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.widget.TextView;

final class chq extends chy
{

    final chn b;

    chq(chn chn1, int i, int j)
    {
        b = chn1;
        super(chn1, i, true, false, j);
    }

    protected void a(zs zs)
    {
        zs = (chz)zs;
        chz.a(zs).setText(b.b().getString(l.hr, new Object[] {
            b.e.j()
        }));
        chz.a(zs).setFocusableInTouchMode(true);
    }
}
