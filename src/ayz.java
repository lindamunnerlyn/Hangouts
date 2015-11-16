// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

public final class ayz extends AnimatorListenerAdapter
{

    final View a;

    public ayz(View view)
    {
        a = view;
        super();
    }

    public void onAnimationEnd(Animator animator)
    {
        a.setVisibility(8);
    }
}
