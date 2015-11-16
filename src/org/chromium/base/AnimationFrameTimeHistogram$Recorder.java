// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;

import android.animation.TimeAnimator;

class a
    implements android.animation.a
{

    private final TimeAnimator a = new TimeAnimator();
    private long b[];
    private int c;

    static void a(a a1)
    {
        a1.c = 0;
        a1.b = new long[600];
        a1.a.start();
    }

    static boolean b(a a1)
    {
        boolean flag = a1.a.isStarted();
        a1.a.end();
        return flag;
    }

    static long[] c(a a1)
    {
        return a1.b;
    }

    static int d(b b1)
    {
        return b1.c;
    }

    static void e(c c1)
    {
        c1.b = null;
    }

    public void onTimeUpdate(TimeAnimator timeanimator, long l, long l1)
    {
        if (c == b.length)
        {
            a.end();
            b = null;
        } else
        if (l1 > 0L)
        {
            timeanimator = b;
            int i = c;
            c = i + 1;
            timeanimator[i] = l1;
            return;
        }
    }

    private ()
    {
        a.setTimeListener(this);
    }
}
