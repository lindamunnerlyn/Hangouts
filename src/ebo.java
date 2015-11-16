// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class ebo
{

    public static final ebo a = new ebo();
    private static final long b;
    private static final Handler c = new Handler(Looper.getMainLooper());
    private final List d = new ArrayList();
    private final Runnable e = new ebp(this);

    private ebo()
    {
    }

    static long a()
    {
        return b;
    }

    static List a(ebo ebo1)
    {
        return ebo1.d;
    }

    static Handler b()
    {
        return c;
    }

    static Runnable b(ebo ebo1)
    {
        return ebo1.e;
    }

    public void a(ebq ebq)
    {
        d.add(ebq);
        if (d.size() == 1)
        {
            c.postDelayed(e, b);
        }
    }

    public void b(ebq ebq)
    {
        d.remove(ebq);
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
