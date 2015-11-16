// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class ecv extends LinearLayout
{

    private biq a;
    private String b;
    private long c;

    public ecv(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public void a()
    {
        if (a != null)
        {
            a.a(b, c);
        }
    }

    public void a(long l)
    {
        c = l;
    }

    public void a(biq biq1)
    {
        a = biq1;
    }

    public void a(String s)
    {
        b = s;
    }
}
