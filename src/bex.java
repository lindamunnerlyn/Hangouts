// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

final class bex extends Animation
{

    int a;
    int b;
    View c;

    public bex(View view, int i)
    {
        c = view;
        a = view.getLayoutParams().height;
        b = i - a;
        setDuration((new ValueAnimator()).getDuration());
    }

    protected void applyTransformation(float f, Transformation transformation)
    {
        c.getLayoutParams().height = (int)((float)a + (float)b * f);
        c.requestLayout();
    }

    public void initialize(int i, int j, int k, int l)
    {
        super.initialize(i, j, k, l);
    }

    public boolean willChangeBounds()
    {
        return true;
    }
}
