// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;

final class wc extends tn
{

    final vw f;

    public wc(vw vw1, Context context, ta ta1, View view)
    {
        f = vw1;
        super(context, ta1, view, true, g.q);
        a();
        a(vw1.k);
    }

    public void onDismiss()
    {
        super.onDismiss();
        f.c.close();
        f.h = null;
    }
}
