// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import java.util.List;

final class ckc
{

    private static Handler a;
    private static List b;
    private static final Runnable c = new ckd();

    public static void a()
    {
        if (a != null)
        {
            a.removeCallbacks(c);
            a = null;
            b = null;
        }
    }

    public static void a(Handler handler, List list)
    {
        if (a == null)
        {
            gbh.a(b);
            a = handler;
            b = list;
            handler.postDelayed(c, 1000L);
        }
    }

    static List b()
    {
        return b;
    }

    static List c()
    {
        b = null;
        return null;
    }

    static Handler d()
    {
        a = null;
        return null;
    }

}
