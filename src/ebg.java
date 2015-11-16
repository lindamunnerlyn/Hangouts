// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.SystemClock;
import android.util.SparseArray;

final class ebg
    implements Runnable
{

    final ebe a;
    private boolean b;
    private long c;
    private long d;

    ebg(ebe ebe1)
    {
        a = ebe1;
        super();
    }

    public void a()
    {
        synchronized (ebe.a(a))
        {
            long l = SystemClock.elapsedRealtime() + 100L;
            if (l < c)
            {
                c = l;
                ebe.a(a).notifyAll();
            }
        }
        return;
        exception;
        ebb;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void b()
    {
        synchronized (ebe.a(a))
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
        ebb;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void run()
    {
        ebb ebb = ebe.a(a);
        ebb;
        JVM INSTR monitorenter ;
        ebw.e("Babel", "Presence polling thread starting");
_L6:
        long l1;
        do
        {
            l1 = SystemClock.elapsedRealtime();
            if (l1 >= c)
            {
                break;
            }
            ebe.a(a).wait(c - l1);
        } while (true);
          goto _L1
        Object obj;
        obj;
        ebw.f("Babel", "Presence polling thread interrupted");
        b = false;
        ebw.e("Babel", "Presence polling thread exiting");
_L10:
        ebb;
        JVM INSTR monitorexit ;
        return;
_L1:
        if (ebe.b(a).size() == 0) goto _L3; else goto _L2
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
        if (i >= ebe.b(a).size()) goto _L6; else goto _L5
_L5:
        ((dza)ebe.b(a).valueAt(i)).a(l);
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
        ebw.e("Babel", "Presence polling thread exiting");
          goto _L10
        obj;
        ebb;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        b = false;
        ebw.e("Babel", "Presence polling thread exiting");
        throw obj;
_L4:
        if (i == 0) goto _L12; else goto _L11
_L11:
        l = 0L;
          goto _L9
    }
}
