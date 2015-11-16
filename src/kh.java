// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.ViewParent;

class kh extends kg
{

    kh()
    {
    }

    public void a(View view, Runnable runnable)
    {
        view.postOnAnimation(runnable);
    }

    public void a(View view, Runnable runnable, long l)
    {
        view.postOnAnimationDelayed(runnable, l);
    }

    public void a(View view, boolean flag)
    {
        view.setHasTransientState(true);
    }

    public void c(View view, int j)
    {
        int l = j;
        if (j == 4)
        {
            l = 2;
        }
        view.setImportantForAccessibility(l);
    }

    public boolean c(View view)
    {
        return view.hasTransientState();
    }

    public void d(View view)
    {
        view.postInvalidateOnAnimation();
    }

    public int e(View view)
    {
        return view.getImportantForAccessibility();
    }

    public ViewParent i(View view)
    {
        return view.getParentForAccessibility();
    }

    public boolean k(View view)
    {
        return view.hasOverlappingRendering();
    }

    public int n(View view)
    {
        return view.getMinimumWidth();
    }

    public int o(View view)
    {
        return view.getMinimumHeight();
    }

    public void r(View view)
    {
        view.requestFitSystemWindows();
    }

    public boolean t(View view)
    {
        return view.getFitsSystemWindows();
    }
}
