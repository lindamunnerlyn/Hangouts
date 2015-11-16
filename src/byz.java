// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.ValueAnimator;
import android.view.View;

final class byz
    implements android.animation.ValueAnimator.AnimatorUpdateListener
{

    final View a;
    final byx b;

    byz(byx byx1, View view)
    {
        b = byx1;
        a = view;
        super();
    }

    public void onAnimationUpdate(ValueAnimator valueanimator)
    {
        byx.a(a);
    }
}
