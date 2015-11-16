// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.ValueAnimator;
import com.google.android.apps.hangouts.floatingactionbutton.impl.FloatingActionButton;

public final class bey
    implements android.animation.ValueAnimator.AnimatorUpdateListener
{

    final FloatingActionButton a;

    public bey(FloatingActionButton floatingactionbutton)
    {
        a = floatingactionbutton;
        super();
    }

    public void onAnimationUpdate(ValueAnimator valueanimator)
    {
        valueanimator = (Float)valueanimator.getAnimatedValue();
        a.f = g.a(valueanimator);
        a.invalidate();
    }
}
