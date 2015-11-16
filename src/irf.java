// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.lang.ref.ReferenceQueue;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

final class irf
    implements Runnable
{

    final ire a;

    irf(ire ire1)
    {
        a = ire1;
        super();
    }

    public void run()
    {
        irg.a((irg)a.a.remove()).a(null);
        a.b.execute(this);
        return;
        Object obj;
        obj;
        Set set = irg.a();
        set;
        JVM INSTR monitorenter ;
        for (Iterator iterator = irg.a().iterator(); iterator.hasNext(); ((kas)iterator.next()).a(((Throwable) (obj)))) { }
        break MISSING_BLOCK_LABEL_82;
        obj;
        set;
        JVM INSTR monitorexit ;
        throw obj;
        set;
        JVM INSTR monitorexit ;
        return;
        InterruptedException interruptedexception;
        interruptedexception;
        a.b.execute(this);
        return;
        obj;
        interruptedexception = irg.a();
        interruptedexception;
        JVM INSTR monitorenter ;
        for (Iterator iterator1 = irg.a().iterator(); iterator1.hasNext(); ((kas)iterator1.next()).a(((Throwable) (obj)))) { }
        break MISSING_BLOCK_LABEL_147;
        obj;
        interruptedexception;
        JVM INSTR monitorexit ;
        throw obj;
        interruptedexception;
        JVM INSTR monitorexit ;
        return;
        obj;
        a.b.execute(this);
_L1:
        throw obj;
        RejectedExecutionException rejectedexecutionexception;
        rejectedexecutionexception;
        interruptedexception = irg.a();
        interruptedexception;
        JVM INSTR monitorenter ;
        for (Iterator iterator2 = irg.a().iterator(); iterator2.hasNext(); ((kas)iterator2.next()).a(rejectedexecutionexception)) { }
        break MISSING_BLOCK_LABEL_216;
        obj;
        interruptedexception;
        JVM INSTR monitorexit ;
        throw obj;
        interruptedexception;
        JVM INSTR monitorexit ;
          goto _L1
    }
}
