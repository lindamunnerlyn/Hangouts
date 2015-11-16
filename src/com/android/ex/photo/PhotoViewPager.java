// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.ex.photo;

import aaz;
import aba;
import abb;
import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import jg;

public class PhotoViewPager extends ViewPager
{

    private float a;
    private int b;
    private float c;
    private float d;
    private abb e;

    public PhotoViewPager(Context context)
    {
        super(context);
        i();
    }

    public PhotoViewPager(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        i();
    }

    private void i()
    {
        a(new aaz(this));
    }

    public void a(abb abb1)
    {
        e = abb1;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        boolean flag;
        int k;
        int l;
        l = 1;
        int i1;
        if (e != null)
        {
            k = e.a(c, d);
        } else
        {
            k = aba.a;
        }
        if (k == aba.d || k == aba.b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (k == aba.d || k == aba.c)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        i1 = motionevent.getAction() & 0xff;
        if (i1 == 3 || i1 == 1)
        {
            b = -1;
        }
        i1;
        JVM INSTR lookupswitch 3: default 128
    //                   0: 242
    //                   2: 153
    //                   6: 278;
           goto _L1 _L2 _L3 _L4
_L1:
        return super.onInterceptTouchEvent(motionevent);
_L3:
        if (flag || k != 0)
        {
            l = b;
            if (l != -1)
            {
                float f = jg.c(motionevent, jg.a(motionevent, l));
                if (flag && k != 0)
                {
                    a = f;
                    return false;
                }
                if (flag && f > a)
                {
                    a = f;
                    return false;
                }
                if (k != 0 && f < a)
                {
                    a = f;
                    return false;
                }
            }
        }
        continue; /* Loop/switch isn't completed */
_L2:
        a = motionevent.getX();
        c = motionevent.getRawX();
        d = motionevent.getRawY();
        b = jg.b(motionevent, 0);
        continue; /* Loop/switch isn't completed */
_L4:
        int j = jg.b(motionevent);
        if (jg.b(motionevent, j) == b)
        {
            if (j == 0)
            {
                j = l;
            } else
            {
                j = 0;
            }
            a = jg.c(motionevent, j);
            b = jg.b(motionevent, j);
        }
        if (true) goto _L1; else goto _L5
_L5:
    }
}
