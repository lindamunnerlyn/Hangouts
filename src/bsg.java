// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.MotionEvent;
import android.view.View;

final class bsg
    implements android.view.View.OnTouchListener
{

    final bsf a;

    bsg(bsf bsf)
    {
        a = bsf;
        super();
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (motionevent.getAction() == 0)
        {
            view.setAlpha(0.2F);
        } else
        if (motionevent.getAction() == 1)
        {
            view.setAlpha(1.0F);
            view.performClick();
            return true;
        }
        return false;
    }
}
