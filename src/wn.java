// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckBox;

public final class wn extends CheckBox
    implements pj
{

    private vi a;
    private wp b;

    public wn(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, g.w);
    }

    private wn(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = vi.a(context);
        b = new wp(this, a);
        b.a(attributeset, i);
    }

    public void a(ColorStateList colorstatelist)
    {
        if (b != null)
        {
            b.a(colorstatelist);
        }
    }

    public void a(android.graphics.PorterDuff.Mode mode)
    {
        if (b != null)
        {
            b.a(mode);
        }
    }

    public int getCompoundPaddingLeft()
    {
        int j = super.getCompoundPaddingLeft();
        int i = j;
        if (b != null)
        {
            i = b.a(j);
        }
        return i;
    }

    public void setButtonDrawable(int i)
    {
        Drawable drawable;
        if (a != null)
        {
            drawable = a.a(i);
        } else
        {
            drawable = ef.a(getContext(), i);
        }
        setButtonDrawable(drawable);
    }

    public void setButtonDrawable(Drawable drawable)
    {
        super.setButtonDrawable(drawable);
        if (b != null)
        {
            b.a();
        }
    }
}