// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.view.View;
import com.google.android.apps.hangouts.views.MessageListItemView;
import com.google.android.apps.hangouts.views.MessageStatusView;
import com.google.android.apps.hangouts.views.ScalingTextView;

public final class eil
    implements android.animation.Animator.AnimatorListener
{

    final MessageListItemView a;

    public eil(MessageListItemView messagelistitemview)
    {
        a = messagelistitemview;
        super();
    }

    private void a()
    {
        MessageListItemView.h(a).f.setVisibility(8);
        MessageListItemView.h(a).d.a(0.0F);
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
