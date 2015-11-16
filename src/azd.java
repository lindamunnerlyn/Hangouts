// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.google.android.apps.hangouts.conversation.v2.FloatingButtonWithCounter;
import com.google.android.libraries.quantum.fab.FloatingActionButton;

public final class azd
    implements android.animation.Animator.AnimatorListener
{

    final FloatingButtonWithCounter a;

    public azd(FloatingButtonWithCounter floatingbuttonwithcounter)
    {
        a = floatingbuttonwithcounter;
        super();
    }

    public void onAnimationCancel(Animator animator)
    {
    }

    public void onAnimationEnd(Animator animator)
    {
        FloatingButtonWithCounter.b(a).b(a.getContext().getResources().getColor(g.jU));
        FloatingButtonWithCounter.b(a).clearColorFilter();
        a.findViewById(g.kj).setVisibility(0);
    }

    public void onAnimationRepeat(Animator animator)
    {
    }

    public void onAnimationStart(Animator animator)
    {
    }
}
