// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.Toast;
import java.util.List;

final class axc
    implements avr
{

    final avv a;

    axc(avv avv1)
    {
        a = avv1;
        super();
    }

    public void a()
    {
        if (avv.aW(a))
        {
            avv.aX(a);
        }
    }

    public void a(int i)
    {
        avv.a(a, new axe(this, i));
    }

    public void a(String s)
    {
        if (avv.aM(a))
        {
            avv.c(a, s);
            return;
        } else
        {
            avv.aN(a).add(new axd(this, s));
            avv.t(a);
            Toast.makeText(avv.aO(a), l.jm, 0).show();
            return;
        }
    }

    public void b()
    {
        avv.aP(a);
    }

    public void c()
    {
        if (avv.aQ(a)) goto _L2; else goto _L1
_L1:
        if (!avv.aR(a)) goto _L4; else goto _L3
_L3:
        asa asa1 = avv.m(a).a();
        hlt hlt = avv.aS(a);
        int i;
        if (asa1 != null && asa1.g)
        {
            i = l.ss;
        } else
        {
            i = l.sr;
        }
        Toast.makeText(hlt, i, 0).show();
_L2:
        avv.an(a).b();
        avv.a(a, false);
        return;
_L4:
        if (avv.aT(a) != null && !avv.aT(a).a)
        {
            avv.aT(a).a(a.getContext(), false);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public boolean d()
    {
        if (avv.B(a) != null)
        {
            avv.a(a, true);
        }
        return false;
    }
}
