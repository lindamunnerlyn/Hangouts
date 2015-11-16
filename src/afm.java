// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Process;
import java.util.concurrent.BlockingQueue;

public final class afm extends Thread
{

    private static final boolean b;
    final BlockingQueue a;
    private final BlockingQueue c;
    private final afk d;
    private final agd e;
    private volatile boolean f;

    public afm(BlockingQueue blockingqueue, BlockingQueue blockingqueue1, afk afk1, agd agd1)
    {
        f = false;
        c = blockingqueue;
        a = blockingqueue1;
        d = afk1;
        e = agd1;
    }

    public void a()
    {
        f = true;
        interrupt();
    }

    public void run()
    {
        if (b)
        {
            agi.a("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        d.a();
_L1:
        Object obj;
label0:
        {
            do
            {
                try
                {
                    do
                    {
                        obj = (afw)c.take();
                        ((afw) (obj)).a("cache-queue-take");
                        if (!((afw) (obj)).f())
                        {
                            break label0;
                        }
                        ((afw) (obj)).b("cache-discard-canceled");
                    } while (true);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj) { }
            } while (!f);
            return;
        }
        afl afl1 = d.a(((afw) (obj)).d());
        if (afl1 != null)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        ((afw) (obj)).a("cache-miss");
        a.put(obj);
          goto _L1
label1:
        {
            if (!afl1.a())
            {
                break label1;
            }
            ((afw) (obj)).a("cache-hit-expired");
            ((afw) (obj)).a(afl1);
            a.put(obj);
        }
          goto _L1
        aga aga1;
label2:
        {
            ((afw) (obj)).a("cache-hit");
            aga1 = ((afw) (obj)).a(new aft(afl1.a, afl1.g));
            ((afw) (obj)).a("cache-hit-parsed");
            if (afl1.b())
            {
                break label2;
            }
            e.a(((afw) (obj)), aga1);
        }
          goto _L1
        ((afw) (obj)).a("cache-hit-refresh-needed");
        ((afw) (obj)).a(afl1);
        aga1.d = true;
        e.a(((afw) (obj)), aga1, new afn(this, ((afw) (obj))));
          goto _L1
    }

    static 
    {
        b = agi.b;
    }
}
