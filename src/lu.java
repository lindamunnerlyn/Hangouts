// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.util.WeakHashMap;

class lu extends ls
{

    WeakHashMap b;

    lu()
    {
        b = null;
    }

    public long a(View view)
    {
        return view.animate().getDuration();
    }

    public void a(View view, long l)
    {
        view.animate().setDuration(l);
    }

    public void a(View view, Interpolator interpolator)
    {
        view.animate().setInterpolator(interpolator);
    }

    public void a(lr lr, View view)
    {
        view.animate().cancel();
    }

    public void a(lr lr, View view, float f)
    {
        view.animate().alpha(f);
    }

    public void a(lr lr, View view, me me)
    {
        view.setTag(0x7e000000, me);
        lr = new lv(lr);
        view.animate().setListener(new mb(lr, view));
    }

    public void b(View view, long l)
    {
        view.animate().setStartDelay(l);
    }

    public void b(lr lr, View view)
    {
        view.animate().start();
    }

    public void b(lr lr, View view, float f)
    {
        view.animate().translationX(f);
    }

    public void c(lr lr, View view, float f)
    {
        view.animate().translationY(f);
    }
}
