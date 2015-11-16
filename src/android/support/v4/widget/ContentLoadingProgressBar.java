// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import ny;
import nz;

public class ContentLoadingProgressBar extends ProgressBar
{

    public long a;
    public boolean b;
    public boolean c;
    public boolean d;
    private final Runnable e;
    private final Runnable f;

    public ContentLoadingProgressBar(Context context)
    {
        this(context, null);
    }

    public ContentLoadingProgressBar(Context context, AttributeSet attributeset)
    {
        super(context, attributeset, 0);
        a = -1L;
        b = false;
        c = false;
        d = false;
        e = new ny(this);
        f = new nz(this);
    }

    private void b()
    {
        removeCallbacks(e);
        removeCallbacks(f);
    }

    public void a()
    {
        a = -1L;
        d = false;
        removeCallbacks(e);
        if (!c)
        {
            postDelayed(f, 500L);
            c = true;
        }
    }

    public void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        b();
    }

    public void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        b();
    }
}
