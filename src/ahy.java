// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

final class ahy extends AnimatorListenerAdapter
{

    final View a;

    ahy(View view)
    {
        a = view;
        super();
    }

    public void onAnimationEnd(Animator animator)
    {
        if (a.getAlpha() == 0.0F)
        {
            a.setVisibility(8);
        }
    }

    public void onAnimationStart(Animator animator)
    {
        a.setVisibility(0);
    }
}
