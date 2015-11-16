// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.SystemClock;
import android.util.SparseArray;

final class ctb
    implements Runnable
{

    final csy a;
    private boolean b;
    private long c;
    private long d;

    ctb(csy csy1)
    {
        a = csy1;
        super();
    }

    public void a()
    {
        synchronized (csy.b(a))
        {
            long l = SystemClock.elapsedRealtime() + 100L;
            if (l < c)
            {
                c = l;
                csy.b(a).notifyAll();
            }
        }
        return;
        exception;
        css;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void b()
    {
        synchronized (csy.b(a))
        {
            if (!b)
            {
                b = true;
                c = 0L;
                d = 0L;
                Thread thread = new Thread(this, "presence_fetcher");
                thread.setPriority(4);
                thread.setDaemon(true);
                thread.start();
            }
        }
        return;
        exception;
        css;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void run()
    {
        css css = csy.b(a);
        css;
        JVM INSTR monitorenter ;
        eev.e("Babel", "Presence polling thread starting");
_L6:
        long l1;
        do
        {
            l1 = SystemClock.elapsedRealtime();
            if (l1 >= c)
            {
                break;
            }
            csy.b(a).wait(c - l1);
        } while (true);
          goto _L1
        Object obj;
        obj;
        eev.f("Babel", "Presence polling thread interrupted");
        b = false;
        eev.e("Babel", "Presence polling thread exiting");
_L10:
        css;
        JVM INSTR monitorexit ;
        return;
_L1:
        if (csy.c(a).size() == 0) goto _L3; else goto _L2
_L2:
        int i;
        long l;
        if (l1 >= d - 12000L)
        {
            i = 1;
        } else
        {
            i = 0;
        }
          goto _L4
_L9:
        l1 += 60000L;
        d = l1;
        c = l1;
        i = 0;
_L8:
        if (i >= csy.c(a).size()) goto _L6; else goto _L5
_L5:
        ((csl)csy.c(a).valueAt(i)).a(l);
        i++;
        if (true) goto _L8; else goto _L7
_L7:
          goto _L6
_L12:
        l = System.currentTimeMillis();
        l -= 60000L;
          goto _L9
_L3:
        b = false;
        eev.e("Babel", "Presence polling thread exiting");
          goto _L10
        obj;
        css;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        b = false;
        eev.e("Babel", "Presence polling thread exiting");
        throw obj;
_L4:
        if (i == 0) goto _L12; else goto _L11
_L11:
        l = 0L;
          goto _L9
    }
}
