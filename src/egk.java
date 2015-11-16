// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.animation.Animation;
import com.google.android.apps.hangouts.views.RichStatusView;

final class egk
    implements android.view.animation.Animation.AnimationListener
{

    final egj a;
    private final boolean b;

    egk(egj egj1, boolean flag)
    {
        a = egj1;
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
