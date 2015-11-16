// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.ValueAnimator;
import android.view.View;

public final class md
    implements android.animation.ValueAnimator.AnimatorUpdateListener
{

    final mg a;
    final View b;

    public md(mg mg1, View view)
    {
        a = mg1;
        b = view;
        super();
    }

    public void onAnimationUpdate(ValueAnimator valueanimator)
    {
        a.a();
    }
}
