// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import com.google.android.apps.hangouts.views.MessageListAnimationManager;
import com.google.android.apps.hangouts.views.MessageListItemWrapperView;

public final class efr
    implements android.animation.Animator.AnimatorListener
{

    final com.google.android.apps.hangouts.views.MessageListItemWrapperView.WatermarkGalleryStateTransition a;

    public efr(com.google.android.apps.hangouts.views.MessageListItemWrapperView.WatermarkGalleryStateTransition watermarkgallerystatetransition)
    {
        a = watermarkgallerystatetransition;
        super();
    }

    private void a()
    {
        MessageListItemWrapperView.a(a.a, MessageListItemWrapperView.a(a.a));
        MessageListItemWrapperView.b(a.a, -1);
        MessageListItemWrapperView.c(a.a).a(MessageListItemWrapperView.b(a.a), com.google.android.apps.hangouts.views.MessageListItemWrapperView.WatermarkGalleryStateTransition.a(a));
        efc efc1 = MessageListItemWrapperView.d(a.a).a();
        if (efc1 != null)
        {
            efc1.b();
        }
    }

    public void onAnimationCancel(Animator animator)
    {
        a();
    }

    public void onAnimationEnd(Animator animator)
    {
        a();
    }

    public void onAnimationRepeat(Animator animator)
    {
    }

    public void onAnimationStart(Animator animator)
    {
    }
}
