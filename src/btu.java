// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class btu
    implements android.view.View.OnClickListener
{

    final bpc a;
    final bpe b;
    final btp c;

    btu(btp btp1, bpc bpc1, bpe bpe)
    {
        c = btp1;
        a = bpc1;
        b = bpe;
        super();
    }

    public void onClick(View view)
    {
        int i = 0;
        g.b(1579);
        view = bnk.k();
        bpc bpc1;
        if (view == null)
        {
            a.m();
        } else
        {
            boolean flag;
            if (!view.h())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            view.a(flag);
        }
        btp.b(c, b);
        bpc1 = a;
        if (view == null || !view.h())
        {
            i = 8;
        }
        bpc1.b(i);
        a.j();
    }
}
