// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.animation.Animation;

final class at extends au
{

    final ad a;
    final aq b;

    at(aq aq1, View view, Animation animation, ad ad1)
    {
        b = aq1;
        a = ad1;
        super(view, animation);
    }

    public void onAnimationEnd(Animation animation)
    {
        super.onAnimationEnd(animation);
        if (a.l != null)
        {
            a.l = null;
            b.a(a, a.m, 0, 0, false);
        }
    }
}
