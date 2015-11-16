// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

final class gen
    implements gds, Runnable
{

    private final gdk a;
    private final String b;
    private CountDownLatch c;

    gen(gdk gdk1, String s)
    {
        a = gdk1;
        b = s;
    }

    public void a(kws kws)
    {
        gne.a(3, "vclib", "Leave RPC succeeded!");
        c.countDown();
    }

    public void b(kws kws)
    {
        gne.a(5, "vclib", "Leave RPC failed!");
        c.countDown();
    }

    public void run()
    {
        gne.a(3, "vclib", "LeaveHandler starting");
        c = new CountDownLatch(1);
        jho jho1 = new jho();
        jho1.a = b;
        gne.a(3, "vclib", String.format("Sending leave RPC: %s", new Object[] {
            b
        }));
        a.c(jho1, this);
        try
        {
            if (!c.await(1L, TimeUnit.MINUTES))
            {
                gne.a(5, "vclib", "LeaveRPC not complete yet! Not waiting any further");
            }
        }
        catch (InterruptedException interruptedexception)
        {
            gne.a(6, "vclib", "LeaveHandler was interrupted!");
        }
        gne.a(3, "vclib", "LeaveHandler terminating");
    }
}
