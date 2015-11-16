// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RadioButton;

public final class wu extends RadioButton
    implements pl
{

    private vk a;
    private wr b;

    public wu(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, g.L);
    }

    private wu(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = vk.a(context);
        b = new wr(this, a);
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
