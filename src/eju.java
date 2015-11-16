// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class eju extends eib
{

    private String a;

    public eju(Context context)
    {
        this(context, (byte)0);
    }

    private eju(Context context, byte byte0)
    {
        super(context, null);
    }

    static String a(eju eju1)
    {
        return eju1.a;
    }

    public void a(aoa aoa, boolean flag, String s, String s1, ad ad, int i, int j, 
            int k)
    {
        a(s);
        setOnClickListener(new ejv(this, s, s1, ad));
        a(l.sK);
        if (due.a())
        {
            s = a;
        } else
        {
            s = null;
        }
        super.a(aoa, flag, s, i, j, k);
    }

    public void a(String s)
    {
        a = s;
    }

    protected boolean f()
    {
        return true;
    }
}
