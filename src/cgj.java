// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.TextView;

final class cgj extends cgs
{

    final cgh b;

    cgj(cgh cgh, int i, int j)
    {
        b = cgh;
        super(cgh, i, true, false, j);
    }

    protected void a(zq zq)
    {
        zq = (cgt)zq;
        cgt.a(zq).setText(h.iK);
        cgt.a(zq).setFocusableInTouchMode(true);
    }
}
