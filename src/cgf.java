// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.hangouts.peoplelistv2.impl.EditParticipantsView;

public final class cgf
    implements android.animation.Animator.AnimatorListener
{

    final EditParticipantsView a;

    public cgf(EditParticipantsView editparticipantsview)
    {
        a = editparticipantsview;
        super();
    }

    public void onAnimationCancel(Animator animator)
    {
        animator = (View)((ObjectAnimator)animator).getTarget();
        EditParticipantsView.a(a).removeView(animator);
    }

    public void onAnimationEnd(Animator animator)
    {
        animator = (View)((ObjectAnimator)animator).getTarget();
        EditParticipantsView.a(a).removeView(animator);
    }

    public void onAnimationRepeat(Animator animator)
    {
    }

    public void onAnimationStart(Animator animator)
    {
    }
}
