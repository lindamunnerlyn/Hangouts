// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class cqx
    implements android.view.View.OnAttachStateChangeListener
{

    final cqw a;

    cqx(cqw cqw)
    {
        a = cqw;
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
