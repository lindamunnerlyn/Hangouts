// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;

final class bdw
    implements aqs
{

    final bdy a;
    final bdv b;

    bdw(bdv bdv1, bdy bdy1)
    {
        b = bdv1;
        a = bdy1;
        super();
    }

    public void a(eef eef1, edf edf, boolean flag, aqn aqn1, boolean flag1)
    {
        bds.d(b.b).remove(a.d);
        if (flag)
        {
            if (aqn1.o().q() != null)
            {
                a.f = aqn1.o().q();
            }
            if (a.g != null)
            {
                if (eef1 != null)
                {
                    eef1.b();
                    return;
                }
            } else
            {
                a.g = new bdx(b);
                a.g.b = eef1;
                if (edf != null)
                {
                    a.g.a = new ehk(null);
                    a.g.a.d();
                    a.g.a.a(edf);
                }
                b.a(a);
                return;
            }
        }
    }
}
