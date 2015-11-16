// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;

final class asg
    implements eci
{

    final asf a;

    asg(asf asf1)
    {
        a = asf1;
        super();
    }

    public void a()
    {
        if (a.h != null)
        {
            a.h.a();
        }
        a.g.a(a.f, 2726).d();
        if (a.a)
        {
            a.g.a(a.f, 2556).d();
        }
        if (a.b)
        {
            a.g.a(a.f, 2562).d();
        }
        if (a.c)
        {
            a.g.a(a.f, 2559).d();
        }
        ((arw)hgx.a(a.e, arw)).a();
    }

    public void a(int i)
    {
        arv arv1;
        a.i = 0;
        a.j = null;
        arv1 = (arv)a.d.get(i);
        if (arv1.a == null) goto _L2; else goto _L1
_L1:
        a.g.a(a.f, 2555).d();
_L4:
        ((arw)hgx.a(a.e, arw)).a(arv1);
        return;
_L2:
        if (arv1.c != null)
        {
            a.g.a(a.f, 2561).d();
        } else
        if (arv1.b != null)
        {
            a.g.a(a.f, 2558).d();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
