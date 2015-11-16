// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.hangouts.floatingactionbutton.impl.FloatingActionButton;

public final class bej extends AnimatorListenerAdapter
{

    final FloatingActionButton a;

    public bej(FloatingActionButton floatingactionbutton)
    {
        a = floatingactionbutton;
        super();
    }

    public void onAnimationEnd(Animator animator)
    {
        if (FloatingActionButton.a(a) == bem.a)
        {
            FloatingActionButton.a(a, FloatingActionButton.b(a));
            FloatingActionButton.a(a, FloatingActionButton.c(a));
        }
        FloatingActionButton.d(a);
        FloatingActionButton.e(a);
        FloatingActionButton.a(a, 0.0F);
        a.invalidate();
    }
}
