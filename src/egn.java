// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.ImageView;

public final class egn extends ImageView
    implements can
{

    private String a;

    public egn(Context context)
    {
        this(context, (byte)0);
    }

    private egn(Context context, byte byte0)
    {
        this(context, ((AttributeSet) (null)));
    }

    private egn(Context context, AttributeSet attributeset)
    {
        super(context, null, 0);
    }

    static String a(egn egn1)
    {
        return egn1.a;
    }

    public void a(ani ani, String s, ad ad)
    {
        a(s);
        setImageResource(com.google.android.apps.hangouts.R.drawable.bK);
        setPadding(0, 5, 0, 6);
        setLongClickable(true);
        setOnClickListener(new ego(this, ani, ad));
        setContentDescription(getResources().getString(l.tl));
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

    public void f_()
    {
    }
}
