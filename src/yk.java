// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;

final class yk
    implements android.view.View.OnTouchListener
{

    final ya a;

    yk(ya ya1)
    {
        a = ya1;
        super();
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        int i;
        int j;
        int k;
        i = motionevent.getAction();
        j = (int)motionevent.getX();
        k = (int)motionevent.getY();
        if (i != 0 || ya.b(a) == null || !ya.b(a).isShowing() || j < 0 || j >= ya.b(a).getWidth() || k < 0 || k >= ya.b(a).getHeight()) goto _L2; else goto _L1
_L1:
        ya.d(a).postDelayed(ya.c(a), 250L);
_L4:
        return false;
_L2:
        if (i == 1)
        {
            ya.d(a).removeCallbacks(ya.c(a));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
