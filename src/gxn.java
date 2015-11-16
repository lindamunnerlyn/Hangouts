// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;

public class gxn
    implements hop, hoy
{

    private ArrayList a;
    private boolean b;

    public gxn(hof hof1)
    {
        a = new ArrayList();
        b = true;
        hof1.a(this);
    }

    public gxp a(Runnable runnable)
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

    void a(gxp gxp1)
    {
        this;
        JVM INSTR monitorenter ;
        a.remove(gxp1);
        this;
        JVM INSTR monitorexit ;
        return;
        gxp1;
        throw gxp1;
    }

    public gxp b(Runnable runnable)
    {
        this;
        JVM INSTR monitorenter ;
        gxq gxq1 = null;
        if (b)
        {
            gxq1 = new gxq(this, runnable, 0L);
            a.add(gxq1);
            gxq1.a();
        }
        this;
        JVM INSTR monitorexit ;
        return gxq1;
        runnable;
        throw runnable;
    }

    void b(gxp gxp1)
    {
        this;
        JVM INSTR monitorenter ;
        a.remove(gxp1);
        this;
        JVM INSTR monitorexit ;
        return;
        gxp1;
        throw gxp1;
    }

    public void f_()
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
        ((gxp)a.get(i)).b();
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
