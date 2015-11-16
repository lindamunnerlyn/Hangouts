// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

public final class afp extends Thread
{

    private final BlockingQueue a;
    private final afo b;
    private final afi c;
    private final agb d;
    private volatile boolean e;

    public afp(BlockingQueue blockingqueue, afo afo1, afi afi1, agb agb1)
    {
        e = false;
        a = blockingqueue;
        b = afo1;
        c = afi1;
        d = agb1;
    }

    public void a()
    {
        e = true;
        interrupt();
    }

    public void run()
    {
        Process.setThreadPriority(10);
_L2:
        Object obj;
        long l;
        l = SystemClock.elapsedRealtime();
        agf agf1;
        agf agf2;
        try
        {
            obj = (afu)a.take();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            if (e)
            {
                return;
            }
            continue; /* Loop/switch isn't completed */
        }
        ((afu) (obj)).a("network-queue-take");
        if (((afu) (obj)).f())
        {
            ((afu) (obj)).b("network-discard-cancelled");
            continue; /* Loop/switch isn't completed */
        }
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            TrafficStats.setThreadStatsTag(((afu) (obj)).b());
        }
        Object obj1 = b.a(((afu) (obj)));
        ((afu) (obj)).a("network-http-complete");
        if (((afr) (obj1)).d && ((afu) (obj)).o())
        {
            ((afu) (obj)).b("not-modified");
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            obj1 = ((afu) (obj)).a(((afr) (obj1)));
            ((afu) (obj)).a("network-parse-complete");
            if (((afu) (obj)).b && ((afy) (obj1)).b != null)
            {
                c.a(((afu) (obj)).d(), ((afy) (obj1)).b);
                ((afu) (obj)).a("network-cache-written");
            }
            ((afu) (obj)).n();
            d.a(((afu) (obj)), ((afy) (obj1)));
        }
        // Misplaced declaration of an exception variable
        catch (agf agf1)
        {
            agf1.a(SystemClock.elapsedRealtime() - l);
            agf2 = ((afu) (obj)).a(agf1);
            d.a(((afu) (obj)), agf2);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            agg.a(((Throwable) (obj1)), "Unhandled exception %s", new Object[] {
                ((Exception) (obj1)).toString()
            });
            obj1 = new agf(((Throwable) (obj1)));
            ((agf) (obj1)).a(SystemClock.elapsedRealtime() - l);
            d.a(((afu) (obj)), ((agf) (obj1)));
        }
        if (true) goto _L2; else goto _L1
_L1:
    }
}
