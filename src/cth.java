// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class cth
    implements android.view.View.OnAttachStateChangeListener
{

    final ctg a;

    cth(ctg ctg)
    {
        a = ctg;
        super();
    }

    public void onViewAttachedToWindow(View view)
    {
        view.sendAccessibilityEvent(32);
    }

    public void onViewDetachedFromWindow(View view)
    {
    }
}
