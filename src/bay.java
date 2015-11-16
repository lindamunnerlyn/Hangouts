// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class bay extends djq
{

    private long c;

    public bay(Context context, aoa aoa1, String s)
    {
        super(context, a(s), aoa1, s);
        c = 0L;
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

    protected cvt b()
    {
        if (c == -1L)
        {
            return null;
        } else
        {
            return new daz(a, b, c);
        }
    }

    protected void c()
    {
        dgk dgk1 = new dgk();
        c = aoq.a(new aow(g.nU, a.h()), b, dgk1, c, false);
        cfo.a(d(), a.h(), dgk1.g());
    }

    public String toString()
    {
        long l = c;
        return a("UpdateWatermarkTask", (new StringBuilder(40)).append("latestReadTimestamp=").append(l).toString());
    }
}
