// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;

final class bua
    implements gbe
{

    final jba a;
    final boolean b;
    final btz c;

    bua(btz btz1, jba jba1, boolean flag)
    {
        c = btz1;
        a = jba1;
        b = flag;
        super();
    }

    public void a(kop kop)
    {
        if (btz.c())
        {
            ebw.a("Babel", String.format("Successfully responded to knock (%s)", new Object[] {
                a.b
            }));
        }
    }

    public void b(kop kop)
    {
        ebw.g("Babel", String.format("Knock response failed... retrying in %d ms", new Object[] {
            Long.valueOf(btz.d())
        }));
        btz.a(c).postDelayed(new bub(this), btz.d());
    }
}
