// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.concurrent.TimeUnit;

public final class bac extends dif
{

    private final int e;

    public bac(Context context, ani ani, String s, int i)
    {
        super(context, a(s), ani, s, TimeUnit.SECONDS.toMillis(10L));
        e = i;
    }

    public static String a(String s)
    {
        String s1 = String.valueOf("SetTypingTask");
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
        return new czq(a, b, e);
    }

    public String toString()
    {
        int i = e;
        return a("SetTypingTask", (new StringBuilder(16)).append("type=").append(i).toString());
    }
}
