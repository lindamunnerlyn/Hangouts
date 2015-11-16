// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

final class yi
    implements Runnable
{

    final yg a;

    yi(yg yg1)
    {
        a = yg1;
        super();
    }

    public void run()
    {
        yg yg1 = a;
        yg1.d();
        View view;
        for (view = yg1.c; !view.isEnabled() || view.isLongClickable() || !yg1.b();)
        {
            return;
        }

        view.getParent().requestDisallowInterceptTouchEvent(true);
        long l = SystemClock.uptimeMillis();
        MotionEvent motionevent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
        view.onTouchEvent(motionevent);
        motionevent.recycle();
        yg1.d = true;
        yg1.e = true;
    }
}
