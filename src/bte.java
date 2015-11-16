// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class bte
    implements android.view.View.OnClickListener
{

    final bov a;
    final btc b;

    bte(btc btc1, bov bov)
    {
        b = btc1;
        a = bov;
        super();
    }

    public void onClick(View view)
    {
        g.b(275);
        view = btc.a(b);
        boolean flag;
        if (!btc.a(b).i())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view.a(flag);
        btc.a(b, a);
    }
}
