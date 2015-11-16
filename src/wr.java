// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;

final class wr
{

    private final CompoundButton a;
    private final vk b;
    private ColorStateList c;
    private android.graphics.PorterDuff.Mode d;
    private boolean e;
    private boolean f;
    private boolean g;

    wr(CompoundButton compoundbutton, vk vk1)
    {
        c = null;
        d = null;
        e = false;
        f = false;
        a = compoundbutton;
        b = vk1;
    }

    private void b()
    {
        Drawable drawable = nu.a(a);
        if (drawable != null && (e || f))
        {
            drawable = fe.c(drawable).mutate();
            if (e)
            {
                fe.a(drawable, c);
            }
            if (f)
            {
                fe.a(drawable, d);
            }
            if (drawable.isStateful())
            {
                drawable.setState(a.getDrawableState());
            }
            a.setButtonDrawable(drawable);
        }
    }

    int a(int i)
    {
        int j = i;
        if (android.os.Build.VERSION.SDK_INT < 17)
        {
            Drawable drawable = nu.a(a);
            j = i;
            if (drawable != null)
            {
                j = i + drawable.getIntrinsicWidth();
            }
        }
        return j;
    }

    void a()
    {
        if (g)
        {
            g = false;
            return;
        } else
        {
            g = true;
            b();
            return;
        }
    }

    void a(ColorStateList colorstatelist)
    {
        c = colorstatelist;
        e = true;
        b();
    }

    void a(android.graphics.PorterDuff.Mode mode)
    {
        d = mode;
        f = true;
        b();
    }

    void a(AttributeSet attributeset, int i)
    {
        attributeset = a.getContext().obtainStyledAttributes(attributeset, rq.Q, i, 0);
        if (!attributeset.hasValue(rq.R))
        {
            break MISSING_BLOCK_LABEL_55;
        }
        i = attributeset.getResourceId(rq.R, 0);
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        a.setButtonDrawable(b.a(i));
        if (attributeset.hasValue(rq.S))
        {
            nu.a(a, attributeset.getColorStateList(rq.S));
        }
        if (attributeset.hasValue(rq.T))
        {
            nu.a(a, g.a(attributeset.getInt(rq.T, -1)));
        }
        attributeset.recycle();
        return;
        Exception exception;
        exception;
        attributeset.recycle();
        throw exception;
    }
}
