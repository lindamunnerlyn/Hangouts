// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.internal.widget.ActivityChooserView;

public final class un
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener
{

    final ActivityChooserView a;

    public un(ActivityChooserView activitychooserview)
    {
        a = activitychooserview;
        super();
    }

    public void onGlobalLayout()
    {
        if (a.c())
        {
            if (!a.isShown())
            {
                a.d().k();
            } else
            {
                a.d().c();
                if (a.g != null)
                {
                    a.g.a(true);
                    return;
                }
            }
        }
    }
}
