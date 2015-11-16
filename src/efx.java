// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class efx extends LinearLayout
{

    private bjc a;
    private String b;
    private long c;

    public efx(Context context, AttributeSet attributeset)
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

    public void a(bjc bjc1)
    {
        a = bjc1;
    }

    public void a(String s)
    {
        b = s;
    }
}
