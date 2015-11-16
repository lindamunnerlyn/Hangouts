// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Point;
import android.support.v4.view.ViewPager;

final class bjs
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener
{

    final bjq a;

    bjs(bjq bjq1)
    {
        a = bjq1;
        super();
    }

    public void onGlobalLayout()
    {
        gng.a(bjq.b(a), this);
        while (a.getActivity() == null || bjq.c(a) == null) 
        {
            return;
        }
        bjq.c(a).a(bjq.d(a).x, bjq.b(a).getHeight());
        bjq.c(a).d();
        bjq.a(a, bjq.e(a), true);
    }
}
