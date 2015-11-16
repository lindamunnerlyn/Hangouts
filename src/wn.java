// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;

final class wn
{

    private final View a;
    private final vk b;
    private vj c;
    private vj d;

    wn(View view, vk vk1)
    {
        a = view;
        b = vk1;
    }

    private void b(ColorStateList colorstatelist)
    {
        if (colorstatelist != null)
        {
            if (c == null)
            {
                c = new vj();
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
            d = new vj();
        }
        d.a = colorstatelist;
        d.d = true;
        b();
    }

    void a(android.graphics.PorterDuff.Mode mode)
    {
        if (d == null)
        {
            d = new vj();
        }
        d.b = mode;
        d.c = true;
        b();
    }

    void a(AttributeSet attributeset, int i)
    {
        attributeset = a.getContext().obtainStyledAttributes(attributeset, rq.cD, i, 0);
        ColorStateList colorstatelist;
        if (!attributeset.hasValue(rq.cE))
        {
            break MISSING_BLOCK_LABEL_52;
        }
        colorstatelist = b.b(attributeset.getResourceId(rq.cE, -1));
        if (colorstatelist == null)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        b(colorstatelist);
        if (attributeset.hasValue(rq.cF))
        {
            kb.a(a, attributeset.getColorStateList(rq.cF));
        }
        if (attributeset.hasValue(rq.cG))
        {
            kb.a(a, g.a(attributeset.getInt(rq.cG, -1)));
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
                vk.a(a, d);
            } else
            if (c != null)
            {
                vk.a(a, c);
                return;
            }
        }
    }
}
