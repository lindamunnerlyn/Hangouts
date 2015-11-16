// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.WindowInsets;

final class or
    implements android.view.View.OnApplyWindowInsetsListener
{

    or()
    {
    }

    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowinsets)
    {
        view = (os)view;
        boolean flag;
        if (windowinsets.getSystemWindowInsetTop() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view.a(windowinsets, flag);
        return windowinsets.consumeSystemWindowInsets();
    }
}
