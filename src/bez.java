// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.hangouts.floatingactionbutton.impl.FloatingActionButton;

public final class bez extends AnimatorListenerAdapter
{

    final FloatingActionButton a;

    public bez(FloatingActionButton floatingactionbutton)
    {
        a = floatingactionbutton;
        super();
    }

    public void onAnimationEnd(Animator animator)
    {
        if (a.g == bfc.a)
        {
            a.b = a.d;
            a.c = a.e;
        }
        a.d = -1;
        a.e = null;
        a.f = 0.0F;
        a.invalidate();
    }
}
