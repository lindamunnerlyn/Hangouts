// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.view.View;
import com.google.android.apps.hangouts.views.MessageListItemView;
import com.google.android.apps.hangouts.views.MessageStatusView;

public final class efi
    implements android.animation.Animator.AnimatorListener
{

    final MessageListItemView a;

    public efi(MessageListItemView messagelistitemview)
    {
        a = messagelistitemview;
        super();
    }

    private void a()
    {
        MessageListItemView.h(a).f.setVisibility(8);
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
