// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.animation.Animation;

final class awf
    implements android.view.animation.Animation.AnimationListener
{

    final boolean a;
    final avv b;

    awf(avv avv1, boolean flag)
    {
        b = avv1;
        a = flag;
        super();
    }

    public void onAnimationEnd(Animation animation)
    {
        if (a && avv.X(b) != null)
        {
            avv.X(b).run();
            avv.Y(b);
        }
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }
}
