// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

public class xe extends TextView
{

    private xd a;

    public xe(Context context)
    {
        this(context, null);
    }

    public xe(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x1010084);
    }

    public xe(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = new xd(this);
        a.a(attributeset, i);
    }

    public void setTextAppearance(Context context, int i)
    {
        super.setTextAppearance(context, i);
        if (a != null)
        {
            a.a(context, i);
        }
    }
}
