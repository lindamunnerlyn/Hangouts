// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.ViewTreeObserver;

final class aat
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener
{

    final View a;
    final aam b;

    aat(aam aam1, View view)
    {
        b = aam1;
        a = view;
        super();
    }

    public void onGlobalLayout()
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        } else
        {
            a.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        }
        b.n();
    }
}
