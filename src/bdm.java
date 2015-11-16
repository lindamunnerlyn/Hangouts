// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.ImageView;

final class bdm
    implements aqs
{

    final bdk a;
    final int b;
    final bdl c;

    bdm(bdl bdl1, bdk bdk1, int i)
    {
        c = bdl1;
        a = bdk1;
        b = i;
        super();
    }

    public void a(eef eef1, edf edf, boolean flag, aqn aqn1, boolean flag1)
    {
        if (!flag)
        {
            eev.f("Babel_Stickers", "Load failed.");
        } else
        {
            if (aqn1.o().q() != null)
            {
                a.c = aqn1.o().q();
            }
            aqn1 = (ImageView)aqn1.m();
            if (g.a((Integer)aqn1.getTag(), -1) != b || a.d != null)
            {
                edf = String.valueOf(a.a);
                if (edf.length() != 0)
                {
                    edf = "Obsolete update: ".concat(edf);
                } else
                {
                    edf = new String("Obsolete update: ");
                }
                eev.e("Babel_Stickers", edf);
                if (eef1 != null)
                {
                    eef1.b();
                    return;
                }
            } else
            {
                a.d = new bdi(c.a);
                a.d.b = eef1;
                if (edf != null)
                {
                    a.d.a = new ehk(edf);
                }
                bdl.a(aqn1, a);
                return;
            }
        }
    }
}
