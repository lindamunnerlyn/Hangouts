// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.MotionEvent;
import android.view.View;

final class blx
    implements android.view.View.OnTouchListener
{

    final blw a;

    blx(blw blw1)
    {
        a = blw1;
        super();
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        blw.a(a).q();
        if (motionevent.getAction() == 1)
        {
            view.performClick();
        }
        return false;
    }
}
