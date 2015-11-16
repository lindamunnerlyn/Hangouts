// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;

final class btq
    implements android.view.View.OnClickListener
{

    final Context a;
    final btp b;

    btq(btp btp, Context context)
    {
        b = btp;
        a = context;
        super();
    }

    public void onClick(View view)
    {
        g.b(2607);
        ((bvm)hlp.a(a, bvm)).a(g.c(a));
    }
}
