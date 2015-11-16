// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.concurrent.TimeUnit;

public final class baq extends djq
{

    private final boolean c;
    private final int d;

    public baq(Context context, aoa aoa, String s, boolean flag, int i)
    {
        super(context, a(s), aoa, s, TimeUnit.SECONDS.toMillis(30L));
        c = flag;
        d = i;
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

    protected cvt b()
    {
        return new dav(a, b, c, d);
    }

    public String toString()
    {
        boolean flag = c;
        int i = d;
        return a("SetFocusTask", (new StringBuilder(34)).append("focused=").append(flag).append(", timeout=").append(i).toString());
    }
}
