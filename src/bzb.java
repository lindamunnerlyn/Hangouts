// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import java.util.Map;

final class bzb
    implements android.animation.Animator.AnimatorListener
{

    final bzd a;
    final ObjectAnimator b;
    final View c;
    final byx d;

    bzb(byx byx1, bzd bzd, ObjectAnimator objectanimator, View view)
    {
        d = byx1;
        a = bzd;
        b = objectanimator;
        c = view;
        super();
    }

    public void onAnimationCancel(Animator animator)
    {
        byx.b(d).remove(a);
    }

    public void onAnimationEnd(Animator animator)
    {
        if (byx.b(d).containsValue(b))
        {
            c.setAlpha(1.0F);
            byx.a(d).c(a);
            byx.b(d).remove(a);
        }
    }

    public void onAnimationRepeat(Animator animator)
    {
    }

    public void onAnimationStart(Animator animator)
    {
        byx.b(d).put(a, b);
    }
}
