// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.hangout.multiwaveview;

import android.animation.TimeInterpolator;

final class I
    implements TimeInterpolator
{

    public float getInterpolation(float f)
    {
        f--;
        return (f * (f * f * f * f) + 1.0F) * 1.0F + 0.0F;
    }

    I()
    {
    }
}
