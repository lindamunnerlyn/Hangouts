// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.EditText;

public final class ws extends EditText
    implements jw
{

    private vk a;
    private wn b;
    private xd c;

    public ws(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, g.G);
    }

    private ws(Context context, AttributeSet attributeset, int i)
    {
        super(vh.a(context), attributeset, i);
        a = vk.a(getContext());
        b = new wn(this, a);
        b.a(attributeset, i);
        c = new xd(this);
        c.a(attributeset, i);
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

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        if (b != null)
        {
            b.b();
        }
    }

    public void setBackgroundDrawable(Drawable drawable)
    {
        super.setBackgroundDrawable(drawable);
        if (b != null)
        {
            b.a();
        }
    }

    public void setBackgroundResource(int i)
    {
        super.setBackgroundResource(i);
        if (b != null)
        {
            b.a(i);
        }
    }

    public void setTextAppearance(Context context, int i)
    {
        super.setTextAppearance(context, i);
        if (c != null)
        {
            c.a(context, i);
        }
    }
}
