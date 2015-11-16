// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import com.google.android.apps.hangouts.conversation.v2.FloatingButtonWithCounter;

public final class aze
    implements android.animation.Animator.AnimatorListener
{

    final FloatingButtonWithCounter a;

    public aze(FloatingButtonWithCounter floatingbuttonwithcounter)
    {
        a = floatingbuttonwithcounter;
        super();
    }

    public void onAnimationCancel(Animator animator)
    {
    }

    public void onAnimationEnd(Animator animator)
    {
        FloatingButtonWithCounter.c(a);
    }

    public void onAnimationRepeat(Animator animator)
    {
    }

    public void onAnimationStart(Animator animator)
    {
    }
}
