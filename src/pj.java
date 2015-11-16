// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

class pj
    implements ph
{

    pj()
    {
    }

    public Object a(Context context, Interpolator interpolator)
    {
        if (interpolator != null)
        {
            return new OverScroller(context, interpolator);
        } else
        {
            return new OverScroller(context);
        }
    }

    public void a(Object obj, int i, int j, int k, int l, int i1)
    {
        ((OverScroller)obj).startScroll(i, j, k, l, i1);
    }

    public void a(Object obj, int i, int j, int k, int l, int i1, int j1, 
            int k1, int l1)
    {
        ((OverScroller)obj).fling(0, 0, k, l, i1, j1, 0x80000000, 0x7fffffff);
    }

    public boolean a(Object obj)
    {
        return ((OverScroller)obj).isFinished();
    }

    public int b(Object obj)
    {
        return ((OverScroller)obj).getCurrX();
    }

    public int c(Object obj)
    {
        return ((OverScroller)obj).getCurrY();
    }

    public float d(Object obj)
    {
        return 0.0F;
    }

    public boolean e(Object obj)
    {
        return ((OverScroller)obj).computeScrollOffset();
    }

    public void f(Object obj)
    {
        ((OverScroller)obj).abortAnimation();
    }

    public int g(Object obj)
    {
        return ((OverScroller)obj).getFinalX();
    }

    public int h(Object obj)
    {
        return ((OverScroller)obj).getFinalY();
    }
}
