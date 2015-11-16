// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;

final class wl
{

    private final View a;
    private final vi b;
    private vh c;
    private vh d;

    wl(View view, vi vi1)
    {
        a = view;
        b = vi1;
    }

    private void b(ColorStateList colorstatelist)
    {
        if (colorstatelist != null)
        {
            if (c == null)
            {
                c = new vh();
            }
            c.a = colorstatelist;
            c.d = true;
        } else
        {
            c = null;
        }
        b();
    }

    void a()
    {
        b(null);
    }

    void a(int i)
    {
        ColorStateList colorstatelist;
        if (b != null)
        {
            colorstatelist = b.b(i);
        } else
        {
            colorstatelist = null;
        }
        b(colorstatelist);
    }

    void a(ColorStateList colorstatelist)
    {
        if (d == null)
        {
            d = new vh();
        }
        d.a = colorstatelist;
        d.d = true;
        b();
    }

    void a(android.graphics.PorterDuff.Mode mode)
    {
        if (d == null)
        {
            d = new vh();
        }
        d.b = mode;
        d.c = true;
        b();
    }

    void a(AttributeSet attributeset, int i)
    {
        attributeset = a.getContext().obtainStyledAttributes(attributeset, ro.cD, i, 0);
        ColorStateList colorstatelist;
        if (!attributeset.hasValue(ro.cE))
        {
            break MISSING_BLOCK_LABEL_52;
        }
        colorstatelist = b.b(attributeset.getResourceId(ro.cE, -1));
        if (colorstatelist == null)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        b(colorstatelist);
        if (attributeset.hasValue(ro.cF))
        {
            kb.a(a, attributeset.getColorStateList(ro.cF));
        }
        if (attributeset.hasValue(ro.cG))
        {
            kb.a(a, g.a(attributeset.getInt(ro.cG, -1)));
        }
        attributeset.recycle();
        return;
        Exception exception;
        exception;
        attributeset.recycle();
        throw exception;
    }

    void b()
    {
        if (a.getBackground() != null)
        {
            if (d != null)
            {
                vi.a(a, d);
            } else
            if (c != null)
            {
                vi.a(a, c);
                return;
            }
        }
    }
}
