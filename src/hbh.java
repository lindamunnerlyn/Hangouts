// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.AsyncTask;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;

final class hbh
{

    final hbg a;
    volatile boolean b;
    volatile long c;
    final AtomicLong d;
    final Runnable e;
    private final Executor f;

    hbh(hbg hbg)
    {
        this(a(), hbg, 0L);
    }

    hbh(hbg hbg, long l)
    {
        this(a(), hbg, l);
    }

    private hbh(Executor executor, hbg hbg, long l)
    {
        b = false;
        d = new AtomicLong(0L);
        e = new hbi(this);
        f = executor;
        a = hbg;
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
        (new hbj(this)).execute(new Void[0]);
    }
}
