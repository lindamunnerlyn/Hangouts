// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.ImageView;

public final class ejp extends ImageView
    implements cbs
{

    String a;

    public ejp(Context context)
    {
        this(context, (byte)0);
    }

    private ejp(Context context, byte byte0)
    {
        this(context, ((AttributeSet) (null)));
    }

    private ejp(Context context, AttributeSet attributeset)
    {
        super(context, null, 0);
    }

    public void a(aoa aoa, String s, ad ad)
    {
        a(s);
        setImageResource(com.google.android.apps.hangouts.R.drawable.bF);
        setPadding(0, 5, 0, 6);
        setLongClickable(true);
        setOnClickListener(new ejq(this, aoa, ad));
        setContentDescription(getResources().getString(l.sD));
    }

    public void a(String s)
    {
        a = s;
    }

    public void b()
    {
    }

    public void c()
    {
    }

    public void d()
    {
    }

    public void h_()
    {
    }
}
