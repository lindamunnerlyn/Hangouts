// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Process;
import java.util.concurrent.BlockingQueue;

public final class afk extends Thread
{

    private static final boolean a;
    private final BlockingQueue b;
    private final BlockingQueue c;
    private final afi d;
    private final agb e;
    private volatile boolean f;

    public afk(BlockingQueue blockingqueue, BlockingQueue blockingqueue1, afi afi1, agb agb1)
    {
        f = false;
        b = blockingqueue;
        c = blockingqueue1;
        d = afi1;
        e = agb1;
    }

    static BlockingQueue a(afk afk1)
    {
        return afk1.c;
    }

    public void a()
    {
        f = true;
        interrupt();
    }

    public void run()
    {
        if (a)
        {
            agg.a("start new dispatcher", new Object[0]);
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
                        obj = (afu)b.take();
                        ((afu) (obj)).a("cache-queue-take");
                        if (!((afu) (obj)).f())
                        {
                            break label0;
                        }
                        ((afu) (obj)).b("cache-discard-canceled");
                    } while (true);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj) { }
            } while (!f);
            return;
        }
        afj afj1 = d.a(((afu) (obj)).d());
        if (afj1 != null)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        ((afu) (obj)).a("cache-miss");
        c.put(obj);
          goto _L1
label1:
        {
            if (!afj1.a())
            {
                break label1;
            }
            ((afu) (obj)).a("cache-hit-expired");
            ((afu) (obj)).a(afj1);
            c.put(obj);
        }
          goto _L1
        afy afy1;
label2:
        {
            ((afu) (obj)).a("cache-hit");
            afy1 = ((afu) (obj)).a(new afr(afj1.a, afj1.g));
            ((afu) (obj)).a("cache-hit-parsed");
            if (afj1.b())
            {
                break label2;
            }
            e.a(((afu) (obj)), afy1);
        }
          goto _L1
        ((afu) (obj)).a("cache-hit-refresh-needed");
        ((afu) (obj)).a(afj1);
        afy1.d = true;
        e.a(((afu) (obj)), afy1, new afl(this, ((afu) (obj))));
          goto _L1
    }

    static 
    {
        a = agg.b;
    }
}
