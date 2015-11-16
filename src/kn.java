// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.WindowInsets;

public final class kn
    implements android.view.View.OnApplyWindowInsetsListener
{

    final jp a;

    public kn(jp jp1)
    {
        a = jp1;
        super();
    }

    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowinsets)
    {
        windowinsets = new mi(windowinsets);
        return ((mi)a.a(view, windowinsets)).e();
    }
}
