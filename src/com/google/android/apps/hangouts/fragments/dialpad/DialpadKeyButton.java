// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.fragments.dialpad;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import bmu;
import bmv;
import bmw;
import g;
import gdv;
import mn;

public class DialpadKeyButton extends FrameLayout
{

    private static final int a = ViewConfiguration.getLongPressTimeout() << 1;
    private static final Handler b = new Handler();
    private AccessibilityManager c;
    private RectF d;
    private boolean e;
    private int f;
    private boolean g;
    private CharSequence h;
    private CharSequence i;
    private boolean j;
    private boolean k;
    private Runnable l;
    private bmw m;

    public DialpadKeyButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        d = new RectF();
        a(context);
    }

    public DialpadKeyButton(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        d = new RectF();
        a(context);
    }

    public static int a(DialpadKeyButton dialpadkeybutton)
    {
        return dialpadkeybutton.f;
    }

    private void a()
    {
        if (m != null)
        {
            m.a(this);
        }
    }

    private void a(Context context)
    {
        c = (AccessibilityManager)context.getSystemService("accessibility");
    }

    public static void a(DialpadKeyButton dialpadkeybutton, CharSequence charsequence)
    {
        dialpadkeybutton.FrameLayout.setContentDescription(charsequence);
    }

    private void a(boolean flag)
    {
        if (m != null)
        {
            m.a(this, flag);
        }
    }

    private void b()
    {
        if (isPressed())
        {
            return;
        } else
        {
            setPressed(true);
            sendAccessibilityEvent(1);
            setPressed(false);
            return;
        }
    }

    public static void b(DialpadKeyButton dialpadkeybutton)
    {
        dialpadkeybutton.a(false);
    }

    private void b(boolean flag)
    {
        if (g != flag)
        {
            g = flag;
        }
    }

    public static void c(DialpadKeyButton dialpadkeybutton)
    {
        dialpadkeybutton.a();
    }

    public static void d(DialpadKeyButton dialpadkeybutton)
    {
        dialpadkeybutton.b(true);
    }

    public static CharSequence e(DialpadKeyButton dialpadkeybutton)
    {
        return dialpadkeybutton.h;
    }

    public static AccessibilityManager f(DialpadKeyButton dialpadkeybutton)
    {
        return dialpadkeybutton.c;
    }

    public void a(bmw bmw1)
    {
        m = bmw1;
    }

    public void a(CharSequence charsequence)
    {
        setLongClickable(true);
        h = charsequence;
        if (g)
        {
            super.setContentDescription(h);
        }
    }

    public boolean onHoverEvent(MotionEvent motionevent)
    {
        if (!c.isEnabled() || !mn.a(c)) goto _L2; else goto _L1
_L1:
        motionevent.getActionMasked();
        JVM INSTR tableswitch 9 10: default 48
    //                   9 54
    //                   10 137;
           goto _L2 _L3 _L4
_L2:
        return super.onHoverEvent(motionevent);
_L3:
        super.setContentDescription(i);
        j = isClickable();
        k = isLongClickable();
        if (k && h != null)
        {
            if (l == null)
            {
                l = new bmv(this);
            }
            postDelayed(l, a);
        }
        setClickable(false);
        setLongClickable(false);
        continue; /* Loop/switch isn't completed */
_L4:
        if (d.contains(motionevent.getX(), motionevent.getY()))
        {
            if (g)
            {
                performLongClick();
            } else
            {
                b();
            }
            if (!isPressed())
            {
                setPressed(true);
                a(true);
            }
            gdv.a("Expected condition to be true", isPressed());
            setPressed(false);
            a(false);
            if (g)
            {
                a();
            } else
            {
                performClick();
            }
        }
        f = f + 1;
        if (l != null)
        {
            removeCallbacks(l);
        }
        b(false);
        setClickable(j);
        setLongClickable(k);
        if (true) goto _L2; else goto _L5
_L5:
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        if (i1 == 66)
        {
            if (keyevent.getRepeatCount() != 0)
            {
                return true;
            }
            keyevent.startTracking();
            a(true);
            e = false;
        }
        return super.onKeyDown(i1, keyevent);
    }

    public boolean onKeyLongPress(int i1, KeyEvent keyevent)
    {
        if (i1 == 66)
        {
            a(false);
            if (isLongClickable())
            {
                a();
            }
            e = true;
        }
        return super.onKeyLongPress(i1, keyevent);
    }

    public boolean onKeyUp(int i1, KeyEvent keyevent)
    {
        if (i1 == 66 && !e)
        {
            a(false);
        }
        return super.onKeyUp(i1, keyevent);
    }

    public void onMeasure(int i1, int j1)
    {
        super.onMeasure(i1, j1);
        setMeasuredDimension(android.view.View.MeasureSpec.getSize(i1) / 3, getResources().getDimensionPixelSize(g.dY));
    }

    public void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
        d.set(getPaddingLeft(), getPaddingTop(), i1 - getPaddingRight(), j1 - getPaddingBottom());
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        motionevent.getAction();
        JVM INSTR tableswitch 0 1: default 28
    //                   0 30
    //                   1 74;
           goto _L1 _L2 _L3
_L1:
        return true;
_L2:
        if (!isPressed())
        {
            setPressed(true);
            a(true);
            int i1 = f;
            b.postDelayed(new bmu(this, i1), ViewConfiguration.getLongPressTimeout());
            return true;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (isPressed())
        {
            setPressed(false);
            a(false);
            f = f + 1;
            performClick();
            return true;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public boolean performAccessibilityAction(int i1, Bundle bundle)
    {
        if (i1 == 16)
        {
            b();
            a(true);
            a(false);
            return true;
        }
        if (i1 == 32)
        {
            if (!isPressed())
            {
                setPressed(true);
                sendAccessibilityEvent(2);
                setPressed(false);
            }
            a(true);
            a(false);
            a();
        }
        return super.performAccessibilityAction(i1, bundle);
    }

    public void setContentDescription(CharSequence charsequence)
    {
        i = charsequence;
        super.setContentDescription(charsequence);
    }

}
