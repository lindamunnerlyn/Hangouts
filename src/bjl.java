// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

final class bjl
    implements android.view.View.OnTouchListener
{

    final bje a;

    bjl(bje bje1)
    {
        a = bje1;
        super();
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        int i = motionevent.getAction();
        if (i != 0) goto _L2; else goto _L1
_L1:
        bje.h(a).removeCallbacks(bje.g(a));
        if (bje.a(a) != null)
        {
            bje.a(a).a();
        }
        bje.h(a).postDelayed(bje.g(a), 400L);
_L4:
        return false;
_L2:
        if (i == 1)
        {
            bje.h(a).removeCallbacks(bje.g(a));
            view.performClick();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
