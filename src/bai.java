// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class bai extends dif
{

    private long e;

    public bai(Context context, ani ani1, String s)
    {
        super(context, a(s), ani1, s);
        e = 0L;
    }

    public static String a(String s)
    {
        String s1 = String.valueOf("UpdateWatermarkTask");
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            return s1.concat(s);
        } else
        {
            return new String(s1);
        }
    }

    protected ctp b()
    {
        if (e == -1L)
        {
            return null;
        } else
        {
            return new czt(a, b, e);
        }
    }

    protected void c()
    {
        dfb dfb1 = new dfb();
        e = any.a(new aoe(g.nS, a.h()), b, dfb1, e, false);
        cej.a(d(), a.h(), dfb1.g());
    }

    public String toString()
    {
        long l = e;
        return a("UpdateWatermarkTask", (new StringBuilder(40)).append("latestReadTimestamp=").append(l).toString());
    }
}
