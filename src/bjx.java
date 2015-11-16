// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

final class bjx
    implements android.view.View.OnTouchListener
{

    final bjq a;

    bjx(bjq bjq1)
    {
        a = bjq1;
        super();
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        int i = motionevent.getAction();
        if (i != 0) goto _L2; else goto _L1
_L1:
        bjq.h(a).removeCallbacks(bjq.g(a));
        if (bjq.a(a) != null)
        {
            bjq.a(a).a();
        }
        bjq.h(a).postDelayed(bjq.g(a), 400L);
_L4:
        return false;
_L2:
        if (i == 1)
        {
            bjq.h(a).removeCallbacks(bjq.g(a));
            view.performClick();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
