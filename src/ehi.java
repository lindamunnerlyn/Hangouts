// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;

public final class ehi extends eib
{

    public ehi(Context context)
    {
        this(context, (byte)0);
    }

    private ehi(Context context, byte byte0)
    {
        super(context, null);
    }

    public void a(aoa aoa, boolean flag, String s, int i, int j, int k, String s1, 
            ad ad, String s2)
    {
        setOnClickListener(new ehj(this, ad, s1));
        if (TextUtils.isEmpty(s2))
        {
            setContentDescription(s2);
            c(s2);
        } else
        {
            a(l.ce);
        }
        super.a(aoa, flag, s, i, j, k);
    }

    public void a(String s)
    {
    }

    protected boolean a()
    {
        return false;
    }
}
