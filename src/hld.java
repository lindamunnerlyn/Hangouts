// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;

final class hld
    implements android.animation.Animator.AnimatorListener
{

    public boolean a;
    final hlc b;

    hld(hlc hlc1)
    {
        b = hlc1;
        super();
    }

    public void onAnimationCancel(Animator animator)
    {
        a = true;
    }

    public void onAnimationEnd(Animator animator)
    {
        if (!a && !b.al)
        {
            animator.start();
        }
    }

    public void onAnimationRepeat(Animator animator)
    {
    }

    public void onAnimationStart(Animator animator)
    {
        a = false;
    }
}
