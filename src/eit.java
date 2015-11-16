// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import com.google.android.apps.hangouts.views.MessageListAnimationManager;
import com.google.android.apps.hangouts.views.MessageListItemWrapperView;

public final class eit
    implements android.animation.Animator.AnimatorListener
{

    final com.google.android.apps.hangouts.views.MessageListItemWrapperView.WatermarkGalleryStateTransition a;

    public eit(com.google.android.apps.hangouts.views.MessageListItemWrapperView.WatermarkGalleryStateTransition watermarkgallerystatetransition)
    {
        a = watermarkgallerystatetransition;
        super();
    }

    private void a()
    {
        MessageListItemWrapperView.a(a.b, MessageListItemWrapperView.a(a.b));
        MessageListItemWrapperView.b(a.b, -1);
        MessageListItemWrapperView.c(a.b).a(MessageListItemWrapperView.b(a.b), a.a);
        eie eie1 = MessageListItemWrapperView.d(a.b).a();
        if (eie1 != null)
        {
            eie1.b();
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
