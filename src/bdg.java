// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;

final class bdg
    implements aqb
{

    final bdi a;
    final bdf b;

    bdg(bdf bdf1, bdi bdi1)
    {
        b = bdf1;
        a = bdi1;
        super();
    }

    public void a(ebh ebh1, eab eab, boolean flag, apw apw1, boolean flag1)
    {
        bdc.d(b.b).remove(a.d);
        if (flag)
        {
            if (apw1.n().q() != null)
            {
                a.f = apw1.n().q();
            }
            if (a.g != null)
            {
                if (ebh1 != null)
                {
                    ebh1.b();
                    return;
                }
            } else
            {
                a.g = new bdh(b);
                a.g.b = ebh1;
                if (eab != null)
                {
                    a.g.a = new eei(null);
                    a.g.a.d();
                    a.g.a.a(eab);
                }
                b.a(a);
                return;
            }
        }
    }
}
