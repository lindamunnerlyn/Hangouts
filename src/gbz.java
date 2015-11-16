// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

final class gbz
    implements gbe, Runnable
{

    private final ggl a;
    private final String b;
    private final String c;
    private CountDownLatch d;

    gbz(ggl ggl1, String s, String s1)
    {
        a = ggl1;
        b = s;
        c = s1;
    }

    public void a(kop kop)
    {
        gkc.b("vclib", "Leave RPC succeeded!");
        d.countDown();
    }

    public void b(kop kop)
    {
        gkc.d("vclib", "Leave RPC failed!");
        d.countDown();
    }

    public void run()
    {
        gkc.b("vclib", "LeaveHandler starting");
        d = new CountDownLatch(1);
        jbh jbh1 = new jbh();
        jbh1.a = b;
        jbh1.b = c;
        gkc.b("vclib", String.format("Sending leave RPC: %s, %s", new Object[] {
            b, c
        }));
        a.a(jbh1, this);
        try
        {
            if (!d.await(1L, TimeUnit.MINUTES))
            {
                gkc.d("vclib", "LeaveRPC not complete yet! Not waiting any further");
            }
        }
        catch (InterruptedException interruptedexception)
        {
            gkc.e("vclib", "LeaveHandler was interrupted!");
        }
        gkc.b("vclib", "LeaveHandler terminating");
    }
}
