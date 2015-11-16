// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;

public class gtb
    implements fsn, hjv
{

    private ArrayList a;
    private boolean b;

    public gtb(hjm hjm1)
    {
        a = new ArrayList();
        b = true;
        hjm1.a(this);
    }

    static void a(gtb gtb1, gtd gtd1)
    {
        gtb1.a(gtd1);
    }

    private void a(gtd gtd1)
    {
        this;
        JVM INSTR monitorenter ;
        a.remove(gtd1);
        this;
        JVM INSTR monitorexit ;
        return;
        gtd1;
        throw gtd1;
    }

    static void b(gtb gtb1, gtd gtd1)
    {
        gtb1.b(gtd1);
    }

    private void b(gtd gtd1)
    {
        this;
        JVM INSTR monitorenter ;
        a.remove(gtd1);
        this;
        JVM INSTR monitorexit ;
        return;
        gtd1;
        throw gtd1;
    }

    public gtd a(Runnable runnable)
    {
        this;
        JVM INSTR monitorenter ;
        runnable = b(runnable);
        this;
        JVM INSTR monitorexit ;
        return runnable;
        runnable;
        throw runnable;
    }

    public gtd b(Runnable runnable)
    {
        this;
        JVM INSTR monitorenter ;
        gte gte1 = null;
        if (b)
        {
            gte1 = new gte(this, runnable, 0L);
            a.add(gte1);
            gte1.a();
        }
        this;
        JVM INSTR monitorexit ;
        return gte1;
        runnable;
        throw runnable;
    }

    public void e_()
    {
        this;
        JVM INSTR monitorenter ;
        b = false;
        int i = 0;
_L2:
        if (i >= a.size())
        {
            break; /* Loop/switch isn't completed */
        }
        ((gtd)a.get(i)).b();
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        a.clear();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
