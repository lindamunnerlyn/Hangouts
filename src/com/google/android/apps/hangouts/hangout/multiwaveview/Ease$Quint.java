// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.hangout.multiwaveview;

import android.animation.TimeInterpolator;

class _cls3
{

    public static final TimeInterpolator easeIn = new _cls1();
    public static final TimeInterpolator easeInOut = new _cls3();
    public static final TimeInterpolator easeOut = new _cls2();


    _cls3()
    {
    }

    class _cls1
        implements TimeInterpolator
    {

        public float getInterpolation(float f)
        {
            return 1.0F * f * f * f * f * f + 0.0F;
        }

            _cls1()
            {
            }
    }


    class _cls2
        implements TimeInterpolator
    {

        public float getInterpolation(float f)
        {
            f--;
            return (f * (f * f * f * f) + 1.0F) * 1.0F + 0.0F;
        }

            _cls2()
            {
            }
    }


    class _cls3
        implements TimeInterpolator
    {

        public float getInterpolation(float f)
        {
            f /= 0.5F;
            if (f < 1.0F)
            {
                return f * (0.5F * f * f * f * f) + 0.0F;
            } else
            {
                f -= 2.0F;
                return (f * (f * f * f * f) + 2.0F) * 0.5F + 0.0F;
            }
        }

            _cls3()
            {
            }
    }

}
