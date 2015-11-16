// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.MotionEvent;

final class yd extends uw
{

    private boolean f;
    private boolean g;
    private boolean h;
    private lr i;
    private ow j;

    public yd(Context context, boolean flag)
    {
        super(context, g.F);
        g = flag;
        setCacheColorHint(0);
    }

    static boolean a(yd yd1, boolean flag)
    {
        yd1.f = flag;
        return flag;
    }

    public boolean a(MotionEvent motionevent, int k)
    {
        int l = jg.a(motionevent);
        l;
        JVM INSTR tableswitch 1 3: default 36
    //                   1 137
    //                   2 301
    //                   3 129;
           goto _L1 _L2 _L3 _L4
_L3:
        break MISSING_BLOCK_LABEL_301;
_L1:
        boolean flag;
        k = 0;
        flag = true;
_L7:
        if (!flag || k != 0)
        {
            h = false;
            setPressed(false);
            drawableStateChanged();
            if (i != null)
            {
                i.b();
                i = null;
            }
        }
        if (!flag) goto _L6; else goto _L5
_L5:
        if (j == null)
        {
            j = new ow(this);
        }
        j.a(true);
        j.onTouch(this, motionevent);
_L9:
        return flag;
_L4:
        k = 0;
        flag = false;
          goto _L7
_L2:
        flag = false;
_L10:
        int i1;
        int j1;
        i1 = motionevent.findPointerIndex(k);
        if (i1 < 0)
        {
            k = 0;
            flag = false;
        } else
        {
label0:
            {
                k = (int)motionevent.getX(i1);
                i1 = (int)motionevent.getY(i1);
                j1 = pointToPosition(k, i1);
                if (j1 != -1)
                {
                    break label0;
                }
                k = 1;
            }
        }
          goto _L7
        android.view.View view = getChildAt(j1 - getFirstVisiblePosition());
        float f1 = k;
        float f2 = i1;
        h = true;
        setPressed(true);
        layoutChildren();
        setSelection(j1);
        a(j1, view, f1, f2);
        a(false);
        refreshDrawableState();
        if (l == 1)
        {
            performItemClick(view, j1, getItemIdAtPosition(j1));
        }
          goto _L1
_L6:
        if (j == null) goto _L9; else goto _L8
_L8:
        j.a(false);
        return flag;
        flag = true;
          goto _L10
    }

    protected boolean c()
    {
        return h || super.c();
    }

    public boolean hasFocus()
    {
        return g || super.hasFocus();
    }

    public boolean hasWindowFocus()
    {
        return g || super.hasWindowFocus();
    }

    public boolean isFocused()
    {
        return g || super.isFocused();
    }

    public boolean isInTouchMode()
    {
        return g && f || super.isInTouchMode();
    }
}
