// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.LinearLayout;

final class bql extends Animation
{

    final android.view.ViewGroup.LayoutParams a;
    final int b;
    final int c;
    final LinearLayout d;
    final boolean e;
    final bqf f;

    bql(bqf bqf1, android.view.ViewGroup.LayoutParams layoutparams, int i, int j, LinearLayout linearlayout, boolean flag)
    {
        f = bqf1;
        a = layoutparams;
        b = i;
        c = j;
        d = linearlayout;
        e = flag;
        super();
    }

    protected void applyTransformation(float f1, Transformation transformation)
    {
        transformation = (android.widget.FrameLayout.LayoutParams)a;
        transformation.bottomMargin = b + (int)((float)c * f1);
        d.setLayoutParams(transformation);
        if (e)
        {
            d.setAlpha(f1);
        } else
        {
            d.setAlpha(1.0F - f1);
        }
        if (f1 == 1.0F)
        {
            bqf.b(f);
        }
    }
}
