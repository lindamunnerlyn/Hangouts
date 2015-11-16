// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

final class bxv extends AnimatorListenerAdapter
{

    final View a;
    final bya b;
    final bxu c;

    bxv(bxu bxu1, View view, bya bya)
    {
        c = bxu1;
        a = view;
        b = bya;
        super();
    }

    public void onAnimationEnd(Animator animator)
    {
        a.setAlpha(1.0F);
        bxu.a(c).b(b);
        a.setLayerType(0, null);
    }
}
