// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.hangouts.floatingactionbutton.impl.QuickButtonContainer;

public final class bfe extends AnimatorListenerAdapter
{

    final QuickButtonContainer a;

    public bfe(QuickButtonContainer quickbuttoncontainer)
    {
        a = quickbuttoncontainer;
        super();
    }

    public void onAnimationEnd(Animator animator)
    {
        if (QuickButtonContainer.b(a) != animator)
        {
            return;
        } else
        {
            QuickButtonContainer.c(a);
            a.setVisibility(QuickButtonContainer.d(a));
            QuickButtonContainer.e(a);
            QuickButtonContainer.f(a);
            return;
        }
    }
}
