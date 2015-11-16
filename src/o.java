// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;

public final class o
    implements a
{

    public static final int a = 0x7f0d0002;
    public static final int b = 0x7f0d0129;
    public static final int c = 0x7f0d02b4;
    public static final int d = 0x7f0d02b5;
    public static final int e = 0x7f0d008d;
    public static final int f = 0x7f0d0080;
    public static final int g = 0x7f0d0245;
    public static final int h = 0x7f0d0176;
    public static final int i = 0x7f0d0182;
    public static final int j = 0x7f0d02a5;
    public static final int k = 0x7f0d02a2;
    public static final int l = 0x7f0d0081;
    public static final int m = 0x7f0d02a3;
    private TimeInterpolator n;

    o()
    {
    }

    public void a(View view)
    {
        if (n == null)
        {
            n = (new ValueAnimator()).getInterpolator();
        }
        view.animate().setInterpolator(n);
    }
}
