// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.view.View;

class kf extends ke
{

    kf()
    {
    }

    public int a(int i, int k, int i1)
    {
        return View.resolveSizeAndState(i, k, i1);
    }

    long a()
    {
        return ValueAnimator.getFrameDelay();
    }

    public void a(View view, float f1)
    {
        view.setTranslationX(f1);
    }

    public void a(View view, int i, Paint paint)
    {
        view.setLayerType(i, null);
    }

    public void a(View view, boolean flag)
    {
        view.setSaveFromParentEnabled(false);
    }

    public void b(View view, float f1)
    {
        view.setTranslationY(f1);
    }

    public void b(View view, boolean flag)
    {
        view.setActivated(flag);
    }

    public void c(View view, float f1)
    {
        view.setAlpha(f1);
    }

    public void d(View view, float f1)
    {
        view.setScaleX(f1);
    }

    public void e(View view, float f1)
    {
        view.setScaleY(f1);
    }

    public float f(View view)
    {
        return view.getAlpha();
    }

    public int g(View view)
    {
        return view.getLayerType();
    }

    public int j(View view)
    {
        return view.getMeasuredState();
    }

    public float l(View view)
    {
        return view.getTranslationX();
    }

    public float m(View view)
    {
        return view.getTranslationY();
    }

    public void u(View view)
    {
        view.jumpDrawablesToCurrentState();
    }
}
