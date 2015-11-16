// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.TimeInterpolator;

public final class aia
    implements TimeInterpolator
{

    private final float a;
    private final float b;

    public aia()
    {
        a = 0.4F;
        b = 0.4F;
    }

    public aia(byte byte0)
    {
        a = 0.85F;
        b = 0.6F;
    }

    static float a(float f, float f1, float f2)
    {
        f = f * 2.0F - 1.0F;
        if (f < 0.0F)
        {
            return ((float)(-Math.pow(-f, f1)) + 1.0F) / 2.0F;
        } else
        {
            return ((float)Math.pow(f, f2) + 1.0F) / 2.0F;
        }
    }

    public float getInterpolation(float f)
    {
        return a(f, a, b);
    }
}
