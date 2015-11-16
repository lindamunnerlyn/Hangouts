// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.ImageView;

final class bcw
    implements aqb
{

    final bcu a;
    final int b;
    final bcv c;

    bcw(bcv bcv1, bcu bcu1, int i)
    {
        c = bcv1;
        a = bcu1;
        b = i;
        super();
    }

    public void a(ebh ebh1, eab eab, boolean flag, apw apw1, boolean flag1)
    {
        if (!flag)
        {
            ebw.f("Babel_Stickers", "Load failed.");
        } else
        {
            if (apw1.n().q() != null)
            {
                a.c = apw1.n().q();
            }
            apw1 = (ImageView)apw1.l();
            if (g.a((Integer)apw1.getTag(), -1) != b || a.d != null)
            {
                eab = String.valueOf(a.a);
                if (eab.length() != 0)
                {
                    eab = "Obsolete update: ".concat(eab);
                } else
                {
                    eab = new String("Obsolete update: ");
                }
                ebw.e("Babel_Stickers", eab);
                if (ebh1 != null)
                {
                    ebh1.b();
                    return;
                }
            } else
            {
                a.d = new bcs(c.a);
                a.d.b = ebh1;
                if (eab != null)
                {
                    a.d.a = new eei(eab);
                }
                bcv.a(apw1, a);
                return;
            }
        }
    }
}
