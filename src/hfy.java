// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.AsyncTask;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;

final class hfy
{

    final hfx a;
    volatile boolean b;
    volatile long c;
    final AtomicLong d;
    final Runnable e;
    private final Executor f;

    hfy(hfx hfx)
    {
        this(a(), hfx, 0L);
    }

    hfy(hfx hfx, long l)
    {
        this(a(), hfx, l);
    }

    private hfy(Executor executor, hfx hfx, long l)
    {
        b = false;
        d = new AtomicLong(0L);
        e = new hfz(this);
        f = executor;
        a = hfx;
        c = l;
    }

    private static Executor a()
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            return AsyncTask.THREAD_POOL_EXECUTOR;
        } else
        {
            return null;
        }
    }

    void a(long l)
    {
        c = l;
    }

    void b(long l)
    {
label0:
        {
            d.getAndAdd(l);
            if (d.get() == c || !b)
            {
                b = true;
                if (f == null)
                {
                    break label0;
                }
                f.execute(e);
            }
            return;
        }
        (new hga(this)).execute(new Void[0]);
    }
}
