// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.animation.Interpolator;

public final class aib
    implements Interpolator
{

    private final float a = 0.85F;
    private final float b = 0.6F;

    public aib()
    {
    }

    public float getInterpolation(float f)
    {
        return aia.a(f, a, b);
    }
}
