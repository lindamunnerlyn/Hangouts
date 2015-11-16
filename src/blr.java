// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.ListView;

final class blr
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener
{

    final blp a;
    private int b;
    private boolean c;
    private boolean d;

    blr(blp blp1)
    {
        a = blp1;
        super();
        d = true;
    }

    public void onGlobalLayout()
    {
        gbh.b(a.f.findViewById(h.dV));
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
                a.f.findViewById(h.dV).setVisibility(8);
            }
        } else
        if (d)
        {
            d = false;
            a.f.findViewById(h.dV).setVisibility(0);
            return;
        }
    }
}
