// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CheckedTextView;

public final class wo extends CheckedTextView
{

    private static final int a[] = {
        0x1010108
    };
    private vi b;

    public wo(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, (byte)0);
    }

    private wo(Context context, AttributeSet attributeset, byte byte0)
    {
        super(context, attributeset, 0x10103c8);
        if (vi.a)
        {
            context = vk.a(getContext(), attributeset, a, 0x10103c8);
            setCheckMarkDrawable(context.a(0));
            context.b();
            b = context.c();
        }
    }

    public void setCheckMarkDrawable(int i)
    {
        if (b != null)
        {
            setCheckMarkDrawable(b.a(i));
            return;
        } else
        {
            super.setCheckMarkDrawable(i);
            return;
        }
    }

}
