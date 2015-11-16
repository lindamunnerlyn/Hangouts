// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

public final class mb extends AnimatorListenerAdapter
{

    final me a;
    final View b;

    public mb(me me1, View view)
    {
        a = me1;
        b = view;
        super();
    }

    public void onAnimationCancel(Animator animator)
    {
        a.c(b);
    }

    public void onAnimationEnd(Animator animator)
    {
        a.b(b);
    }

    public void onAnimationStart(Animator animator)
    {
        a.a(b);
    }
}
