// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;

public final class efb
    implements android.animation.Animator.AnimatorListener
{

    final com.google.android.apps.hangouts.views.MessageListAnimationManager.AnimateInNewMessageRunnable a;

    public efb(com.google.android.apps.hangouts.views.MessageListAnimationManager.AnimateInNewMessageRunnable animateinnewmessagerunnable)
    {
        a = animateinnewmessagerunnable;
        super();
    }

    public void onAnimationCancel(Animator animator)
    {
    }

    public void onAnimationEnd(Animator animator)
    {
        com.google.android.apps.hangouts.views.MessageListAnimationManager.AnimateInNewMessageRunnable.b(a);
    }

    public void onAnimationRepeat(Animator animator)
    {
    }

    public void onAnimationStart(Animator animator)
    {
    }
}
