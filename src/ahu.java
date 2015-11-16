// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.animation.Interpolator;

public final class ahu
    implements Interpolator
{

    private final float a = 0.85F;
    private final float b = 0.6F;

    public ahu()
    {
    }

    public float getInterpolation(float f)
    {
        return aht.a(f, a, b);
    }
}
