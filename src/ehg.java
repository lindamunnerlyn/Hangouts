// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.animation.Animation;
import com.google.android.apps.hangouts.views.FadeImageView;

public final class ehg
    implements android.view.animation.Animation.AnimationListener
{

    final FadeImageView a;

    public ehg(FadeImageView fadeimageview)
    {
        a = fadeimageview;
        super();
    }

    public void onAnimationEnd(Animation animation)
    {
        a.b.setAnimationListener(null);
        a.setBackgroundDrawable(a.c);
        a.startAnimation(a.a);
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }
}
