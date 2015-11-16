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
        return -1F * (float)Math.cos((double)f * 1.5707963267948966D) + 1.0F + 0.0F;
    }

    ()
    {
    }
}
