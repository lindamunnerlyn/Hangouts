// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.widget.TextView;

final class cgk extends cgs
{

    final cgh b;

    cgk(cgh cgh1, int i, int j)
    {
        b = cgh1;
        super(cgh1, i, true, false, j);
    }

    protected void a(zq zq)
    {
        zq = (cgt)zq;
        cgt.a(zq).setText(b.b().getString(l.hX, new Object[] {
            cgh.a(b).l()
        }));
        cgt.a(zq).setFocusableInTouchMode(true);
    }
}
