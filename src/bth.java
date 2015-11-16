// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class bth
    implements android.view.View.OnClickListener
{

    final bot a;
    final bov b;
    final btc c;

    bth(btc btc1, bot bot1, bov bov)
    {
        c = btc1;
        a = bot1;
        b = bov;
        super();
    }

    public void onClick(View view)
    {
        int i = 0;
        g.b(1579);
        view = bnd.l();
        bot bot1;
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
        btc.b(c, b);
        bot1 = a;
        if (view == null || !view.h())
        {
            i = 8;
        }
        bot1.b(i);
        a.j();
    }
}
