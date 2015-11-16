// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.google.android.apps.hangouts.conversation.v2.FloatingButtonWithCounter;
import com.google.android.libraries.quantum.fab.FloatingActionButton;

public final class azr
    implements android.animation.Animator.AnimatorListener
{

    final FloatingButtonWithCounter a;

    public azr(FloatingButtonWithCounter floatingbuttonwithcounter)
    {
        a = floatingbuttonwithcounter;
        super();
    }

    public void onAnimationCancel(Animator animator)
    {
    }

    public void onAnimationEnd(Animator animator)
    {
        a.a.b(a.getContext().getResources().getColor(g.jN));
        a.a.clearColorFilter();
        a.findViewById(g.kc).setVisibility(0);
    }

    public void onAnimationRepeat(Animator animator)
    {
    }

    public void onAnimationStart(Animator animator)
    {
    }
}
