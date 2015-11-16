// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.views;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import cao;
import dqb;
import efx;
import h;
import l;

public class OtrModificationMessageListItemView extends LinearLayout
    implements cao
{

    private static int c[][];
    private TextView a;
    private long b;

    public OtrModificationMessageListItemView(Context context)
    {
        this(context, null);
    }

    public OtrModificationMessageListItemView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public long a()
    {
        return b;
    }

    public void a(int i, dqb dqb1, String s, boolean flag)
    {
        boolean flag1 = false;
        if (i == 1)
        {
            i = 0;
        } else
        {
            i = 1;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        efx.a[dqb1.ordinal()];
        JVM INSTR tableswitch 1 4: default 52
    //                   1 73
    //                   2 73
    //                   3 84
    //                   4 95;
           goto _L3 _L4 _L4 _L5 _L6
_L3:
        i = ((flag1) ? 1 : 0);
_L7:
        if (i > 0)
        {
            a.setText(i);
        }
        return;
_L4:
        i = c[i][0];
        continue; /* Loop/switch isn't completed */
_L5:
        i = c[i][1];
        continue; /* Loop/switch isn't completed */
_L6:
        i = c[i][2];
        if (true) goto _L7; else goto _L2
_L2:
        dqb1 = getResources();
        a.setText(dqb1.getString(c[i][3], new Object[] {
            s
        }));
        return;
    }

    public void a(long l1)
    {
        b = l1;
    }

    public View b()
    {
        return this;
    }

    public void c()
    {
        setContentDescription(a.getText());
    }

    public void onFinishInflate()
    {
        a = (TextView)findViewById(h.gp);
    }

    static 
    {
        c = (new int[][] {
            new int[] {
                l.rI, l.rF, l.rH, l.rG
            }, new int[] {
                l.rM, l.rJ, l.rL, l.rK
            }
        });
    }
}
