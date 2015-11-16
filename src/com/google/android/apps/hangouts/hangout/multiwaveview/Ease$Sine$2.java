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
        return 1.0F * (float)Math.sin((double)f * 1.5707963267948966D) + 0.0F;
    }

    ()
    {
    }
}
