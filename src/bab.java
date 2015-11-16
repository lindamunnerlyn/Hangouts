// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.concurrent.TimeUnit;

public final class bab extends dif
{

    private final boolean e;
    private final int f;

    public bab(Context context, ani ani, String s, boolean flag, int i)
    {
        super(context, a(s), ani, s, TimeUnit.SECONDS.toMillis(30L));
        e = flag;
        f = i;
    }

    public static String a(String s)
    {
        String s1 = String.valueOf("SetFocusTask");
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
        return new czp(a, b, e, f);
    }

    public String toString()
    {
        boolean flag = e;
        int i = f;
        return a("SetFocusTask", (new StringBuilder(34)).append("focused=").append(flag).append(", timeout=").append(i).toString());
    }
}
