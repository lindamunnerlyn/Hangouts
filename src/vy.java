// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.support.v7.internal.widget.TintImageView;

final class vy extends TintImageView
    implements wc
{

    final vu a;
    private final float b[] = new float[2];

    public vy(vu vu1, Context context)
    {
        a = vu1;
        super(context, null, g.p);
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        setOnTouchListener(new vz(this, this, vu1));
    }

    public boolean d()
    {
        return false;
    }

    public boolean e()
    {
        return false;
    }

    public boolean performClick()
    {
        if (super.performClick())
        {
            return true;
        } else
        {
            playSoundEffect(0);
            a.e();
            return true;
        }
    }

    protected boolean setFrame(int i, int j, int k, int l)
    {
        boolean flag = super.setFrame(i, j, k, l);
        android.graphics.drawable.Drawable drawable = getDrawable();
        android.graphics.drawable.Drawable drawable1 = getBackground();
        if (drawable != null && drawable1 != null)
        {
            int i1 = getWidth();
            j = getHeight();
            i = Math.max(i1, j) / 2;
            int j1 = getPaddingLeft();
            int k1 = getPaddingRight();
            k = getPaddingTop();
            l = getPaddingBottom();
            i1 = (i1 + (j1 - k1)) / 2;
            j = (j + (k - l)) / 2;
            fe.a(drawable1, i1 - i, j - i, i1 + i, j + i);
        }
        return flag;
    }
}
