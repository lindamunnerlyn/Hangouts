// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.animation.Animation;

final class aau
    implements android.view.animation.Animation.AnimationListener
{

    final aao a;

    aau(aao aao1)
    {
        a = aao1;
        super();
    }

    public void onAnimationEnd(Animation animation)
    {
        aao.a(a);
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }
}
