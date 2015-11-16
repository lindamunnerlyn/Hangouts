// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class btr
    implements android.view.View.OnClickListener
{

    final bpe a;
    final btp b;

    btr(btp btp1, bpe bpe)
    {
        b = btp1;
        a = bpe;
        super();
    }

    public void onClick(View view)
    {
        g.b(275);
        view = b.b;
        boolean flag;
        if (!b.b.h())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view.a(flag);
        btp.a(b, a);
    }
}
