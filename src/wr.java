// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.MultiAutoCompleteTextView;

public final class wr extends MultiAutoCompleteTextView
    implements jw
{

    private static final int a[] = {
        0x1010176
    };
    private vi b;
    private wl c;
    private xb d;

    public wr(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, g.u);
    }

    private wr(Context context, AttributeSet attributeset, int i)
    {
        super(vf.a(context), attributeset, i);
        context = vk.a(getContext(), attributeset, a, i);
        b = context.c();
        if (context.g(0))
        {
            setDropDownBackgroundDrawable(context.a(0));
        }
        context.b();
        c = new wl(this, b);
        c.a(attributeset, i);
        d = new xb(this);
        d.a(attributeset, i);
    }

    public void a(ColorStateList colorstatelist)
    {
        if (c != null)
        {
            c.a(colorstatelist);
        }
    }

    public void a(android.graphics.PorterDuff.Mode mode)
    {
        if (c != null)
        {
            c.a(mode);
        }
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        if (c != null)
        {
            c.b();
        }
    }

    public void setBackgroundDrawable(Drawable drawable)
    {
        super.setBackgroundDrawable(drawable);
        if (c != null)
        {
            c.a();
        }
    }

    public void setBackgroundResource(int i)
    {
        super.setBackgroundResource(i);
        if (c != null)
        {
            c.a(i);
        }
    }

    public void setDropDownBackgroundResource(int i)
    {
        if (b != null)
        {
            setDropDownBackgroundDrawable(b.a(i));
            return;
        } else
        {
            super.setDropDownBackgroundResource(i);
            return;
        }
    }

    public void setTextAppearance(Context context, int i)
    {
        super.setTextAppearance(context, i);
        if (d != null)
        {
            d.a(context, i);
        }
    }

}
