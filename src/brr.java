// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.google.android.apps.hangouts.hangout.PresentToAllBannerView;

public final class brr extends Animation
{

    final android.widget.RelativeLayout.LayoutParams a;
    final int b;
    final PresentToAllBannerView c;

    public brr(PresentToAllBannerView presenttoallbannerview, android.widget.RelativeLayout.LayoutParams layoutparams, int i)
    {
        c = presenttoallbannerview;
        a = layoutparams;
        b = i;
        super();
    }

    protected void applyTransformation(float f, Transformation transformation)
    {
        a.topMargin = (int)((float)b * f) + 0;
        c.setLayoutParams(a);
    }
}
