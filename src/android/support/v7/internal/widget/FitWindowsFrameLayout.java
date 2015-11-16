// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import uw;
import ux;

public class FitWindowsFrameLayout extends FrameLayout
    implements uw
{

    private ux a;

    public FitWindowsFrameLayout(Context context)
    {
        super(context);
    }

    public FitWindowsFrameLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public void a(ux ux1)
    {
        a = ux1;
    }

    protected boolean fitSystemWindows(Rect rect)
    {
        if (a != null)
        {
            a.a(rect);
        }
        return super.fitSystemWindows(rect);
    }
}
