// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.MotionEvent;
import android.view.View;

final class axn
    implements android.view.View.OnTouchListener
{

    final axm a;

    axn(axm axm1)
    {
        a = axm1;
        super();
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        a.a.Q();
        return false;
    }
}
