// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Debug;
import android.os.Process;

public class dkw
    implements Runnable
{

    private final Object a = new Object();
    final Thread b = new Thread(this);
    private final Object c = new Object();
    private final Object d = new Object();
    private Object e;
    private boolean f;
    private boolean g;
    private boolean h;
    private final long i;
    private final long j;
    private volatile boolean k;

    public dkw(String s, long l, long l1)
    {
        i = l;
        j = l1;
        b.setName(s);
        b.start();
    }

    public String a(Object obj)
    {
        if (obj == null)
        {
            return "NULL";
        } else
        {
            return obj.toString();
        }
    }

    public void a()
    {
        if (k)
        {
            return;
        }
        synchronized (c)
        {
            g = true;
            c.notify();
        }
        obj = d;
        obj;
        JVM INSTR monitorenter ;
        boolean flag = h;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        Exception exception;
        try
        {
            d.wait();
        }
        catch (InterruptedException interruptedexception) { }
        h = false;
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
    }

    public void b()
    {
        k = true;
        synchronized (a)
        {
            a.notify();
        }
        synchronized (c)
        {
            c.notify();
        }
        synchronized (d)
        {
            h = true;
            d.notify();
        }
        try
        {
            b.join(1000L);
            if (b.isAlive())
            {
                eev.g("Babel", "failed to stop watchdog thread in 1000 ms");
            }
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            return;
        }
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
        exception2;
        obj;
        JVM INSTR monitorexit ;
        throw exception2;
    }

    public void b(Object obj)
    {
        if (k)
        {
            return;
        }
        synchronized (a)
        {
            f = true;
            e = obj;
            a.notify();
        }
        return;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public void run()
    {
_L8:
        if (k) goto _L2; else goto _L1
_L1:
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        boolean flag = f;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        a.wait();
        flag = k;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
_L9:
        f = false;
        obj;
        JVM INSTR monitorexit ;
        long l1 = System.currentTimeMillis();
        obj = c;
        obj;
        JVM INSTR monitorenter ;
        int l = 0;
_L6:
        if (g)
        {
            break MISSING_BLOCK_LABEL_337;
        }
        flag = k;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_337;
        }
        c.wait(i);
        flag = k;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        Object obj2;
        obj2;
        obj;
        JVM INSTR monitorexit ;
        throw obj2;
        obj2;
        obj;
        JVM INSTR monitorexit ;
        throw obj2;
        long l2 = System.currentTimeMillis() - l1;
        if (l2 < j) goto _L4; else goto _L3
_L3:
        l2 = j;
        String s = String.valueOf(a(e));
        eev.f("Babel", (new StringBuilder(String.valueOf(s).length() + 61)).append("error, intent took more than ").append(l2).append(" ms; opcode ").append(s).toString());
        Process.sendSignal(Process.myPid(), 3);
        if (Debug.isDebuggerConnected()) goto _L6; else goto _L5
_L5:
        throw new IllegalStateException("hung up in RTCS");
_L4:
        if (l2 <= i) goto _L6; else goto _L7
_L7:
        long l3 = i;
        String s1 = String.valueOf(a(e));
        eev.f("Babel", (new StringBuilder(String.valueOf(s1).length() + 104)).append("warning ").append(l).append("; intent took more than ").append(l3).append(" ms; opcode ").append(s1).append("; ").append(l2).append(" so far").toString());
        if (l != 0)
        {
            break MISSING_BLOCK_LABEL_330;
        }
        Process.sendSignal(Process.myPid(), 3);
        l++;
          goto _L6
        g = false;
        obj;
        JVM INSTR monitorexit ;
        synchronized (d)
        {
            h = true;
            d.notify();
        }
          goto _L8
        exception;
        obj1;
        JVM INSTR monitorexit ;
        throw exception;
_L2:
        return;
        exception;
          goto _L9
        exception;
          goto _L6
    }
}
