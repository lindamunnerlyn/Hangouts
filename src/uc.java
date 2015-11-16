// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.internal.widget.ActionBarOverlayLayout;

public final class uc
    implements Runnable
{

    final ActionBarOverlayLayout a;

    public uc(ActionBarOverlayLayout actionbaroverlaylayout)
    {
        a = actionbaroverlaylayout;
        super();
    }

    public void run()
    {
        ActionBarOverlayLayout.b(a);
        ActionBarOverlayLayout.a(a, kb.p(ActionBarOverlayLayout.d(a)).c(0.0F).a(ActionBarOverlayLayout.c(a)));
    }
}
