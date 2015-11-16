// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import com.google.android.apps.hangouts.floatingactionbutton.impl.FloatingActionButton;

final class bet extends lk
{

    final ben a;

    bet(ben ben1)
    {
        a = ben1;
        super();
    }

    public void a(int i)
    {
        if (ben.k(a) == null)
        {
            return;
        }
        i;
        JVM INSTR tableswitch 0 1: default 36
    //                   0 66
    //                   1 135;
           goto _L1 _L2 _L3
_L1:
        gbh.a((new StringBuilder(25)).append("Unknown page: ").append(i).toString());
_L5:
        super.a(i);
        return;
_L2:
        if (ebr.a(ben.r(a)))
        {
            ben.k(a).setVisibility(4);
        } else
        {
            ben.k(a).setContentDescription(ben.k(a).getResources().getString(g.lY));
            ben.k(a).a(ben.i());
        }
        continue; /* Loop/switch isn't completed */
_L3:
        ben.k(a).a(a.g());
        ben.k(a).setContentDescription(ben.k(a).getResources().getString(g.lX));
        if (ebr.a(ben.r(a)))
        {
            ben.k(a).setVisibility(0);
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void a(int i, float f, int j)
    {
        if (ben.k(a) == null)
        {
            return;
        }
        int k = ben.p(a);
        if (j == 0)
        {
            a.a(i);
        }
        if (i == 0)
        {
            j = (int)((float)ben.p(a) + (float)(ben.q(a) - ben.p(a)) * f);
            ben.k(a).a(ben.i(), ben.l(), f);
        } else
        {
            j = k;
            if (i == 1)
            {
                j = ben.q(a);
            }
        }
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            ben.a(a, j);
            return;
        } else
        {
            ben.b(a, j);
            return;
        }
    }
}
