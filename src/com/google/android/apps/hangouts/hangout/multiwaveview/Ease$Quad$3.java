// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.hangout.multiwaveview;

import android.animation.TimeInterpolator;

final class 
    implements TimeInterpolator
{

    public float getInterpolation(float f)
    {
        f /= 0.5F;
        if (f < 1.0F)
        {
            return f * (0.5F * f) + 0.0F;
        } else
        {
            f--;
            return (f * (f - 2.0F) - 1.0F) * -0.5F + 0.0F;
        }
    }

    ()
    {
    }
}
