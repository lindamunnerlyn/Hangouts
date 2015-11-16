// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;

final class hgl
    implements android.animation.Animator.AnimatorListener
{

    public boolean a;
    final hgk b;

    hgl(hgk hgk1)
    {
        b = hgk1;
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
