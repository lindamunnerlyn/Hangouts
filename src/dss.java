// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class dss
    implements android.view.View.OnClickListener
{

    boolean a;
    final dsn b;
    final dsu c;
    final dsp d;

    dss(dsp dsp1, dsn dsn, dsu dsu1)
    {
        d = dsp1;
        b = dsn;
        c = dsu1;
        super();
        a = false;
    }

    public void onClick(View view)
    {
        if (!a)
        {
            d.b(b);
            c.onClick(view);
            a = true;
        }
    }
}
