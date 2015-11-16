// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;

final class gxq
    implements gxp, Runnable
{

    final Runnable a;
    final gxn b;
    private final long c = 0L;
    private itr d;

    gxq(gxn gxn1, Runnable runnable, long l)
    {
        b = gxn1;
        super();
        a = runnable;
    }

    public void a()
    {
        d = itr.a();
        g.a(this, c);
    }

    public void b()
    {
        g.x().removeCallbacks(this);
        b.b(this);
    }

    public void run()
    {
        itr.a(d, new gxr(this)).run();
    }
}
