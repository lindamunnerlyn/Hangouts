// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.ValueAnimator;
import android.view.View;

final class bxx
    implements android.animation.ValueAnimator.AnimatorUpdateListener
{

    final View a;
    final bxu b;

    bxx(bxu bxu1, View view)
    {
        b = bxu1;
        a = view;
        super();
    }

    public void onAnimationUpdate(ValueAnimator valueanimator)
    {
        bxu.a(a);
    }
}
