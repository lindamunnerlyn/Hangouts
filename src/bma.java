// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.ListView;

final class bma
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener
{

    final bly a;
    private int b;
    private boolean c;
    private boolean d;

    bma(bly bly1)
    {
        a = bly1;
        super();
        d = true;
    }

    public void onGlobalLayout()
    {
        gdv.b("Expected non-null", a.f.findViewById(h.dM));
        if (!c)
        {
            b = a.f.getMeasuredHeight();
            c = true;
        }
        if (a.b().getMeasuredHeight() > b)
        {
            if (!d)
            {
                d = true;
                a.f.findViewById(h.dM).setVisibility(8);
            }
        } else
        if (d)
        {
            d = false;
            a.f.findViewById(h.dM).setVisibility(0);
            return;
        }
    }
}
