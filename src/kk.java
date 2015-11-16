// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

class kk extends kj
{

    kk()
    {
    }

    public void c(View view, int i)
    {
        view.setImportantForAccessibility(i);
    }

    public void d(View view, int i)
    {
        view.setAccessibilityLiveRegion(i);
    }

    public boolean w(View view)
    {
        return view.isLaidOut();
    }

    public boolean x(View view)
    {
        return view.isAttachedToWindow();
    }
}
