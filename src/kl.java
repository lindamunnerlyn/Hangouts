// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.ColorStateList;
import android.view.View;

final class kl extends kk
{

    kl()
    {
    }

    public mh a(View view, mh mh)
    {
        Object obj = mh;
        if (mh instanceof mi)
        {
            android.view.WindowInsets windowinsets = ((mi)mh).e();
            view = view.onApplyWindowInsets(windowinsets);
            obj = mh;
            if (view != windowinsets)
            {
                obj = new mi(view);
            }
        }
        return ((mh) (obj));
    }

    public void a(View view, ColorStateList colorstatelist)
    {
        view.setBackgroundTintList(colorstatelist);
    }

    public void a(View view, android.graphics.PorterDuff.Mode mode)
    {
        view.setBackgroundTintMode(mode);
    }

    public void a(View view, jp jp)
    {
        view.setOnApplyWindowInsetsListener(new kn(jp));
    }

    public void f(View view, float f1)
    {
        view.setElevation(f1);
    }

    public void r(View view)
    {
        view.requestApplyInsets();
    }

    public float s(View view)
    {
        return view.getElevation();
    }

    public void v(View view)
    {
        view.stopNestedScroll();
    }
}
