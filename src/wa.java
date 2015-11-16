// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;

final class wa extends tl
{

    final vu c;

    public wa(vu vu1, Context context, sy sy1, View view)
    {
        c = vu1;
        super(context, sy1, view, true, g.q);
        a();
        a(vu1.k);
    }

    public void onDismiss()
    {
        super.onDismiss();
        c.c.close();
        c.h = null;
    }
}
