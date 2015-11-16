// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import com.google.android.apps.hangouts.views.MessageListItemView;

final class efl
    implements android.animation.Animator.AnimatorListener
{

    final efk a;

    efl(efk efk1)
    {
        a = efk1;
        super();
    }

    private void a()
    {
        MessageListItemView.i(a.a);
        a.a.b(true);
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
