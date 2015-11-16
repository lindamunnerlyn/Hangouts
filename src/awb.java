// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.Toast;

final class awb
    implements atr
{

    final avv a;

    awb(avv avv1)
    {
        a = avv1;
        super();
    }

    public void a()
    {
        avv.O(a);
    }

    public void a(atp atp1)
    {
        asa asa1;
        for (asa1 = avv.m(a).a(); asa1 == null || atp1 != atp.d;)
        {
            return;
        }

        bxi bxi1 = bxi.d;
        atp1 = asa1.e;
        if (asa1.h != null)
        {
            atp1 = g.a(asa1.h, true);
        }
        if (asa1.e != null)
        {
            ((bxg)avv.Q(a).a(bxg)).a(avv.P(a), a.getFragmentManager(), atp1, asa1.e, asa1.a, bxi1);
            return;
        } else
        {
            Toast.makeText(avv.R(a), g.kH, 0).show();
            return;
        }
    }

    public void b()
    {
        if (avv.B(a) != null)
        {
            avv.a(a, false);
        }
    }

    public void c()
    {
        if (avv.B(a) != null)
        {
            avv.a(a, true);
        }
    }
}
