// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

final class byy extends AnimatorListenerAdapter
{

    final View a;
    final bzd b;
    final byx c;

    byy(byx byx1, View view, bzd bzd)
    {
        c = byx1;
        a = view;
        b = bzd;
        super();
    }

    public void onAnimationEnd(Animator animator)
    {
        a.setAlpha(1.0F);
        byx.a(c).b(b);
        a.setLayerType(0, null);
    }
}
