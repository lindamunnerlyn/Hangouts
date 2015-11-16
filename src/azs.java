// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import com.google.android.apps.hangouts.conversation.v2.FloatingButtonWithCounter;

public final class azs
    implements android.animation.Animator.AnimatorListener
{

    final FloatingButtonWithCounter a;

    public azs(FloatingButtonWithCounter floatingbuttonwithcounter)
    {
        a = floatingbuttonwithcounter;
        super();
    }

    public void onAnimationCancel(Animator animator)
    {
    }

    public void onAnimationEnd(Animator animator)
    {
        a.c();
    }

    public void onAnimationRepeat(Animator animator)
    {
    }

    public void onAnimationStart(Animator animator)
    {
    }
}
