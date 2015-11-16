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
            return -1F * (float)Math.cos((double)f * 1.5707963267948966D) + 1.0F + 0.0F;
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
            return 1.0F * (float)Math.sin((double)f * 1.5707963267948966D) + 0.0F;
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
            return -0.5F * ((float)Math.cos(3.1415926535897931D * (double)f) - 1.0F) + 0.0F;
        }

            _cls3()
            {
            }
    }

}
