// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.widget.ImageView;
import com.google.android.apps.hangouts.conversation.v2.FloatingButtonWithCounter;

public final class azq
    implements android.animation.Animator.AnimatorListener
{

    final ImageView a;
    final FloatingButtonWithCounter b;

    public azq(FloatingButtonWithCounter floatingbuttonwithcounter, ImageView imageview)
    {
        b = floatingbuttonwithcounter;
        a = imageview;
        super();
    }

    public void onAnimationCancel(Animator animator)
    {
    }

    public void onAnimationEnd(Animator animator)
    {
        if (a != null)
        {
            a.setVisibility(0);
        }
    }

    public void onAnimationRepeat(Animator animator)
    {
    }

    public void onAnimationStart(Animator animator)
    {
    }
}
