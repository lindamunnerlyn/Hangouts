// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.BlockingQueue;

public final class afr extends Thread
{

    private final BlockingQueue a;
    private final afq b;
    private final afk c;
    private final agd d;
    private volatile boolean e;

    public afr(BlockingQueue blockingqueue, afq afq1, afk afk1, agd agd1)
    {
        e = false;
        a = blockingqueue;
        b = afq1;
        c = afk1;
        d = agd1;
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
        agh agh1;
        agh agh2;
        try
        {
            obj = (afw)a.take();
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
        ((afw) (obj)).a("network-queue-take");
        if (((afw) (obj)).f())
        {
            ((afw) (obj)).b("network-discard-cancelled");
            continue; /* Loop/switch isn't completed */
        }
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            TrafficStats.setThreadStatsTag(((afw) (obj)).b());
        }
        Object obj1 = b.a(((afw) (obj)));
        ((afw) (obj)).a("network-http-complete");
        String s;
        if (((aft) (obj1)).d && ((afw) (obj)).o())
        {
            ((afw) (obj)).b("not-modified");
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            obj1 = ((afw) (obj)).a(((aft) (obj1)));
            ((afw) (obj)).a("network-parse-complete");
            if (((afw) (obj)).c && ((aga) (obj1)).b != null)
            {
                c.a(((afw) (obj)).d(), ((aga) (obj1)).b);
                ((afw) (obj)).a("network-cache-written");
            }
            ((afw) (obj)).n();
            d.a(((afw) (obj)), ((aga) (obj1)));
        }
        // Misplaced declaration of an exception variable
        catch (agh agh1)
        {
            agh1.a(SystemClock.elapsedRealtime() - l);
            agh2 = ((afw) (obj)).a(agh1);
            d.a(((afw) (obj)), agh2);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            s = ((Exception) (obj1)).toString();
            Log.e(agi.a, agi.d("Unhandled exception %s", new Object[] {
                s
            }), ((Throwable) (obj1)));
            obj1 = new agh(((Throwable) (obj1)));
            ((agh) (obj1)).a(SystemClock.elapsedRealtime() - l);
            d.a(((afw) (obj)), ((agh) (obj1)));
        }
        if (true) goto _L2; else goto _L1
_L1:
    }
}
