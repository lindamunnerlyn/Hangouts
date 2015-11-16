// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.animation.Animation;

class au
    implements android.view.animation.Animation.AnimationListener
{

    private boolean a;
    private View b;

    public au(View view, Animation animation)
    {
        a = false;
        if (view == null || animation == null)
        {
            return;
        } else
        {
            b = view;
            return;
        }
    }

    public void onAnimationEnd(Animation animation)
    {
        if (a)
        {
            kb.d(b, 0);
        }
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
        a = aq.a(b, animation);
        if (a)
        {
            kb.d(b, 2);
        }
    }
}
