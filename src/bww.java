// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.view.View;

final class bww
    implements android.view.View.OnClickListener
{

    final bws a;

    bww(bws bws1)
    {
        a = bws1;
        super();
    }

    public void onClick(View view)
    {
        if (a.c() != null)
        {
            a.c().dismiss();
        }
    }
}
