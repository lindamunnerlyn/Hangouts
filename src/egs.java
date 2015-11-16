// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class egs extends eez
{

    private String a;

    public egs(Context context)
    {
        this(context, (byte)0);
    }

    private egs(Context context, byte byte0)
    {
        super(context, null);
    }

    static String a(egs egs1)
    {
        return egs1.a;
    }

    public void a(ani ani, boolean flag, String s, String s1, ad ad, int i, int j, 
            int k)
    {
        a(s);
        setOnClickListener(new egt(this, s, s1, ad));
        a(l.ts);
        if (drk.a())
        {
            s = a;
        } else
        {
            s = null;
        }
        super.a(ani, flag, s, i, j, k);
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
