// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.util.modulized;

import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.widget.Chronometer;
import g;
import java.util.concurrent.TimeUnit;

public class ChronometerAccessible extends Chronometer
{

    public ChronometerAccessible(Context context)
    {
        super(context);
    }

    public ChronometerAccessible(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public ChronometerAccessible(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public ChronometerAccessible(Context context, AttributeSet attributeset, int i, int j)
    {
        super(context, attributeset, i, j);
    }

    public CharSequence getContentDescription()
    {
        long l = SystemClock.elapsedRealtime() - getBase();
        int i = (int)TimeUnit.MILLISECONDS.toHours(l);
        int j = (int)(TimeUnit.MILLISECONDS.toMinutes(l) - TimeUnit.HOURS.toMinutes(i));
        int k = (int)(TimeUnit.MILLISECONDS.toSeconds(l) - TimeUnit.MINUTES.toSeconds(j) - TimeUnit.HOURS.toSeconds(i));
        String s;
        String s1;
        String s2;
        if (i == 0)
        {
            s = "";
        } else
        {
            s = getResources().getQuantityString(g.qy, i, new Object[] {
                Integer.valueOf(i)
            });
        }
        if (j == 0)
        {
            s1 = "";
        } else
        {
            s1 = getResources().getQuantityString(g.qk, j, new Object[] {
                Integer.valueOf(j)
            });
        }
        if (k == 0)
        {
            s2 = "";
        } else
        {
            s2 = getResources().getQuantityString(g.qm, k, new Object[] {
                Integer.valueOf(k)
            });
        }
        return getResources().getString(g.qC, new Object[] {
            s, s1, s2
        });
    }
}
