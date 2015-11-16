// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.internal.widget.ActivityChooserView;

public final class ul
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener
{

    final ActivityChooserView a;

    public ul(ActivityChooserView activitychooserview)
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
                ActivityChooserView.b(a).k();
            } else
            {
                ActivityChooserView.b(a).c();
                if (a.a != null)
                {
                    a.a.a(true);
                    return;
                }
            }
        }
    }
}
