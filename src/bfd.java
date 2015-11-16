// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.ValueAnimator;
import com.google.android.apps.hangouts.floatingactionbutton.impl.QuickButtonContainer;

public final class bfd
    implements android.animation.ValueAnimator.AnimatorUpdateListener
{

    final QuickButtonContainer a;

    public bfd(QuickButtonContainer quickbuttoncontainer)
    {
        a = quickbuttoncontainer;
        super();
    }

    public void onAnimationUpdate(ValueAnimator valueanimator)
    {
        if (QuickButtonContainer.a(a))
        {
            a.setAlpha(valueanimator.getAnimatedFraction());
        }
    }
}
