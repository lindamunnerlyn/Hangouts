// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.animation.Animation;
import com.google.android.apps.hangouts.views.RichStatusView;

final class ejm
    implements android.view.animation.Animation.AnimationListener
{

    final ejl a;
    private final boolean b;

    ejm(ejl ejl1, boolean flag)
    {
        a = ejl1;
        super();
        b = flag;
    }

    public void onAnimationEnd(Animation animation)
    {
        if (!b)
        {
            a.b.setVisibility(8);
            RichStatusView.a(a.e);
        }
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }
}
