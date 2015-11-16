// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.IntentFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

final class alz
    implements alw
{

    private final String a;
    private final Context b;
    private final Object c = new Object();
    private boolean d;
    private final List e = new ArrayList();

    public alz(String s, Context context, Executor executor)
    {
        a = s;
        b = context;
        executor.execute(new ama(this));
        s = new IntentFilter();
        s.addAction("com.google.gservices.intent.action.GSERVICES_CHANGED");
        context.registerReceiver(new amb(this), s);
    }

    private void a()
    {
        if (d)
        {
            return;
        }
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        long l = System.currentTimeMillis();
_L2:
        boolean flag = d;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        c.wait(3000L);
        if (System.currentTimeMillis() - l <= 3000L) goto _L2; else goto _L1
_L1:
        g.a(null, 2029);
        obj;
        JVM INSTR monitorexit ;
        return;
        Object obj1;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        return;
        obj;
        JVM INSTR monitorexit ;
    }

    static void a(alz alz1)
    {
        fwz.b(alz1.b.getContentResolver(), new String[] {
            alz1.a
        });
        synchronized (alz1.c)
        {
            alz1.d = true;
            alz1.c.notifyAll();
        }
        alz1.b();
        return;
        alz1;
        obj;
        JVM INSTR monitorexit ;
        throw alz1;
    }

    private void b()
    {
        List list = e;
        list;
        JVM INSTR monitorenter ;
        for (Iterator iterator = e.iterator(); iterator.hasNext(); g.a((Runnable)iterator.next())) { }
        break MISSING_BLOCK_LABEL_46;
        Exception exception;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
        list;
        JVM INSTR monitorexit ;
    }

    static void b(alz alz1)
    {
        alz1.b();
    }

    public int a(String s, int i)
    {
        a();
        return fwz.a(b.getContentResolver(), s, i);
    }

    public long a(String s, long l)
    {
        a();
        return fwz.a(b.getContentResolver(), s, l);
    }

    public String a(String s, String s1)
    {
        a();
        return fwz.a(b.getContentResolver(), s, s1);
    }

    public void a(Runnable runnable)
    {
        synchronized (e)
        {
            e.add(runnable);
        }
        return;
        runnable;
        list;
        JVM INSTR monitorexit ;
        throw runnable;
    }

    public boolean a(String s, boolean flag)
    {
        a();
        return fwz.a(b.getContentResolver(), s, flag);
    }
}
