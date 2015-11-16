// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class eem
{

    public static final eem a = new eem();
    private static final long b;
    private static final Handler c = new Handler(Looper.getMainLooper());
    private final List d = new ArrayList();
    private final Runnable e = new een(this);

    private eem()
    {
    }

    static long a()
    {
        return b;
    }

    static List a(eem eem1)
    {
        return eem1.d;
    }

    static Handler b()
    {
        return c;
    }

    static Runnable b(eem eem1)
    {
        return eem1.e;
    }

    public void a(eeo eeo)
    {
        d.add(eeo);
        if (d.size() == 1)
        {
            c.postDelayed(e, b);
        }
    }

    public void b(eeo eeo)
    {
        d.remove(eeo);
        if (d.isEmpty())
        {
            c.removeCallbacks(e);
        }
    }

    static 
    {
        b = TimeUnit.SECONDS.toMillis(30L);
    }
}
