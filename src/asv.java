// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;

final class asv
    implements efk
{

    final asu a;

    asv(asu asu1)
    {
        a = asu1;
        super();
    }

    public void a()
    {
        if (a.g != null)
        {
            a.g.a();
        }
        a.f.a(2726).d();
        if (a.a)
        {
            a.f.a(2556).d();
        }
        if (a.b)
        {
            a.f.a(2562).d();
        }
        if (a.c)
        {
            a.f.a(2559).d();
        }
        ((asl)hlp.a(a.e, asl)).a();
    }

    public void a(int i)
    {
        ask ask1;
        a.h = 0;
        a.i = null;
        ask1 = (ask)a.d.get(i);
        if (ask1.a == null) goto _L2; else goto _L1
_L1:
        a.f.a(2555).d();
_L4:
        ((asl)hlp.a(a.e, asl)).a(ask1);
        return;
_L2:
        if (ask1.c != null)
        {
            a.f.a(2561).d();
        } else
        if (ask1.b != null)
        {
            a.f.a(2558).d();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
