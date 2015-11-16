// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.MotionEvent;
import android.view.View;

final class bmg
    implements android.view.View.OnTouchListener
{

    final bmf a;

    bmg(bmf bmf1)
    {
        a = bmf1;
        super();
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        bmf.a(a).q();
        if (motionevent.getAction() == 1)
        {
            view.performClick();
        }
        return false;
    }
}
