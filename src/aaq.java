// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.animation.Animation;

final class aaq
    implements android.view.animation.Animation.AnimationListener
{

    final aam a;

    aaq(aam aam1)
    {
        a = aam1;
        super();
    }

    public void onAnimationEnd(Animation animation)
    {
        a.m();
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }
}
