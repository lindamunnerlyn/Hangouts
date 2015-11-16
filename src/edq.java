// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import com.google.android.apps.hangouts.views.ConversationListItemWrapper;

public final class edq
    implements android.animation.Animator.AnimatorListener
{

    final Runnable a;
    final ConversationListItemWrapper b;

    public edq(ConversationListItemWrapper conversationlistitemwrapper, Runnable runnable)
    {
        b = conversationlistitemwrapper;
        a = runnable;
        super();
    }

    public void onAnimationCancel(Animator animator)
    {
    }

    public void onAnimationEnd(Animator animator)
    {
        a.run();
    }

    public void onAnimationRepeat(Animator animator)
    {
    }

    public void onAnimationStart(Animator animator)
    {
    }
}
