// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Point;
import android.support.v4.view.ViewPager;

final class bjg
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener
{

    final bje a;

    bjg(bje bje1)
    {
        a = bje1;
        super();
    }

    public void onGlobalLayout()
    {
        gke.a(bje.b(a), this);
        while (a.getActivity() == null || bje.c(a) == null) 
        {
            return;
        }
        bje.c(a).a(bje.d(a).x, bje.b(a).getHeight());
        bje.c(a).d();
        bje.a(a, bje.e(a), true);
    }
}
