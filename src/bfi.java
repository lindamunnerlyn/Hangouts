// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.view.View;
import com.google.android.apps.hangouts.floatingactionbutton.impl.FloatingActionButton;

final class bfi extends lk
{

    final bfd a;

    bfi(bfd bfd1)
    {
        a = bfd1;
        super();
    }

    public void a(int i)
    {
        if (a.g == null)
        {
            return;
        }
        i;
        JVM INSTR tableswitch 0 1: default 36
    //                   0 66
    //                   1 135;
           goto _L1 _L2 _L3
_L1:
        gdv.a((new StringBuilder(25)).append("Unknown page: ").append(i).toString());
_L5:
        super.a(i);
        return;
_L2:
        if (eep.a(a.f))
        {
            a.h.setVisibility(4);
        } else
        {
            a.g.setContentDescription(a.g.getResources().getString(g.lM));
            a.g.a(bfd.a);
        }
        continue; /* Loop/switch isn't completed */
_L3:
        a.g.a(a.i());
        a.g.setContentDescription(a.g.getResources().getString(g.lL));
        if (eep.a(a.f))
        {
            a.h.setVisibility(0);
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void a(int i, float f, int j)
    {
        if (a.g == null)
        {
            return;
        }
        int k = a.j;
        if (j == 0)
        {
            a.a(i);
        }
        if (i == 0)
        {
            j = (int)((float)a.j + (float)(a.k - a.j) * f);
            a.g.a(bfd.a, bfd.d, f);
        } else
        {
            j = k;
            if (i == 1)
            {
                j = a.k;
            }
        }
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            a.b(j);
            return;
        } else
        {
            a.a(j);
            return;
        }
    }
}
