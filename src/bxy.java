// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import java.util.Map;

final class bxy
    implements android.animation.Animator.AnimatorListener
{

    final bya a;
    final ObjectAnimator b;
    final View c;
    final bxu d;

    bxy(bxu bxu1, bya bya, ObjectAnimator objectanimator, View view)
    {
        d = bxu1;
        a = bya;
        b = objectanimator;
        c = view;
        super();
    }

    public void onAnimationCancel(Animator animator)
    {
        bxu.b(d).remove(a);
    }

    public void onAnimationEnd(Animator animator)
    {
        if (bxu.b(d).containsValue(b))
        {
            c.setAlpha(1.0F);
            bxu.a(d).c(a);
            bxu.b(d).remove(a);
        }
    }

    public void onAnimationRepeat(Animator animator)
    {
    }

    public void onAnimationStart(Animator animator)
    {
        bxu.b(d).put(a, b);
    }
}
