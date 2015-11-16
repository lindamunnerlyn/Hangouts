// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.AutoCompleteTextView;

public class wm extends AutoCompleteTextView
    implements jw
{

    private static final int a[] = {
        0x1010176
    };
    private vk b;
    private wn c;
    private xd d;

    public wm(Context context)
    {
        this(context, null);
    }

    public wm(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, g.u);
    }

    public wm(Context context, AttributeSet attributeset, int i)
    {
        super(vh.a(context), attributeset, i);
        context = vm.a(getContext(), attributeset, a, i);
        b = context.c();
        if (context.g(0))
        {
            setDropDownBackgroundDrawable(context.a(0));
        }
        context.b();
        c = new wn(this, b);
        c.a(attributeset, i);
        d = new xd(this);
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
