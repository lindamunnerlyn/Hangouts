// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;

final class btd
    implements android.view.View.OnClickListener
{

    final Context a;
    final btc b;

    btd(btc btc, Context context)
    {
        b = btc;
        a = context;
        super();
    }

    public void onClick(View view)
    {
        g.b(2607);
        ((buz)hgx.a(a, buz)).a(g.c(a));
    }
}
