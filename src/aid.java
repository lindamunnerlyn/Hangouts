// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.animation.AccelerateDecelerateInterpolator;

final class aid extends AccelerateDecelerateInterpolator
{

    final aic a;
    private ahz b;

    aid(aic aic)
    {
        a = aic;
        super();
        b = new ahz(0.8F);
    }

    public float getInterpolation(float f)
    {
        return super.getInterpolation(b.getInterpolation(f));
    }
}
