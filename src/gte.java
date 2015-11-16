// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;

final class gte
    implements gtd, Runnable
{

    final Runnable a;
    final gtb b;
    private final long c = 0L;
    private inn d;

    gte(gtb gtb1, Runnable runnable, long l)
    {
        b = gtb1;
        super();
        a = runnable;
    }

    public void a()
    {
        d = inn.a();
        g.a(this, c);
    }

    public void b()
    {
        g.y().removeCallbacks(this);
        gtb.b(b, this);
    }

    public void run()
    {
        inn.a(d, new gtf(this)).run();
    }
}
