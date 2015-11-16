// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.IntentFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

final class amr
    implements amo
{

    final String a;
    final Context b;
    final Object c = new Object();
    boolean d;
    private final List e = new ArrayList();

    public amr(String s, Context context, Executor executor)
    {
        a = s;
        b = context;
        executor.execute(new ams(this));
        s = new IntentFilter();
        s.addAction("com.google.gservices.intent.action.GSERVICES_CHANGED");
        context.registerReceiver(new amt(this), s);
    }

    private void b()
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

    public int a(String s, int i)
    {
        b();
        return fzd.a(b.getContentResolver(), s, i);
    }

    public long a(String s, long l)
    {
        b();
        return fzd.a(b.getContentResolver(), s, l);
    }

    public String a(String s, String s1)
    {
        b();
        return fzd.a(b.getContentResolver(), s, s1);
    }

    void a()
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
        b();
        return fzd.a(b.getContentResolver(), s, flag);
    }
}
