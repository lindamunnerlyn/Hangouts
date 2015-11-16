// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.animation.Animation;

final class avp
    implements android.view.animation.Animation.AnimationListener
{

    final boolean a;
    final ave b;

    avp(ave ave1, boolean flag)
    {
        b = ave1;
        a = flag;
        super();
    }

    public void onAnimationEnd(Animation animation)
    {
        if (a && ave.W(b) != null)
        {
            ave.W(b).run();
            ave.X(b);
        }
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }
}
