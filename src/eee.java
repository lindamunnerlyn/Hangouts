// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.animation.Animation;
import com.google.android.apps.hangouts.views.FadeImageView;

public final class eee
    implements android.view.animation.Animation.AnimationListener
{

    final FadeImageView a;

    public eee(FadeImageView fadeimageview)
    {
        a = fadeimageview;
        super();
    }

    public void onAnimationEnd(Animation animation)
    {
        FadeImageView.a(a).setAnimationListener(null);
        a.setBackgroundDrawable(FadeImageView.b(a));
        a.startAnimation(FadeImageView.c(a));
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }
}
