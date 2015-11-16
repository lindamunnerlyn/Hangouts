// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.clearcut.LogEventParcelable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class eix
    implements eio
{

    private static final Object a = new Object();
    private static ScheduledExecutorService b;
    private static final eji c = new eji();
    private static final long d;
    private final eor e;
    private final eje f;
    private final Object g;
    private long h;
    private final long i;
    private ScheduledFuture j;
    private ejx k;
    private final Runnable l;

    public eix()
    {
        this(((eor) (new eot())), d, new eje());
    }

    private eix(eor eor, long l1, eje eje1)
    {
        g = new Object();
        h = 0L;
        j = null;
        k = null;
        l = new eiy(this);
        e = eor;
        i = l1;
        f = eje1;
    }

    static eji a()
    {
        return c;
    }

    static ekd a(eix eix1, ejx ejx1, ejf ejf)
    {
        return eix1.a(ejx1, ejf);
    }

    private ekd a(ejx ejx1, ejf ejf)
    {
        c().execute(new eiz(this, ejx1, ejf));
        return ejf;
    }

    static Object a(eix eix1)
    {
        return eix1.g;
    }

    static void a(LogEventParcelable logeventparcelable)
    {
        if (logeventparcelable.f != null && logeventparcelable.e.i.length == 0)
        {
            logeventparcelable.e.i = logeventparcelable.f.d();
        }
        if (logeventparcelable.g != null && logeventparcelable.e.r.length == 0)
        {
            logeventparcelable.e.r = logeventparcelable.g.d();
        }
        logeventparcelable.c = fdo.a(logeventparcelable.e);
    }

    static long b(eix eix1)
    {
        return eix1.h;
    }

    static ScheduledExecutorService b()
    {
        return c();
    }

    static eor c(eix eix1)
    {
        return eix1.e;
    }

    private static ScheduledExecutorService c()
    {
        synchronized (a)
        {
            if (b == null)
            {
                b = Executors.newSingleThreadScheduledExecutor();
            }
        }
        return b;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static ejx d(eix eix1)
    {
        return eix1.k;
    }

    static ejx e(eix eix1)
    {
        eix1.k = null;
        return null;
    }

    public ekd a(ejx ejx1, LogEventParcelable logeventparcelable)
    {
        c.a();
        logeventparcelable = new ejg(this, logeventparcelable, ejx1);
        logeventparcelable.a(new ejd(this));
        return a(ejx1, ((ejf) (logeventparcelable)));
    }

    public void a(ejx ejx1)
    {
        eja eja1 = new eja(this, ejx1, ejx1);
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        if (b != null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        ejx1.a(eja1);
_L2:
        return;
        b.execute(new ejc(this, ejx1, eja1));
        if (true) goto _L2; else goto _L1
_L1:
        ejx1;
        obj;
        JVM INSTR monitorexit ;
        throw ejx1;
    }

    static 
    {
        d = TimeUnit.MILLISECONDS.convert(2L, TimeUnit.MINUTES);
    }
}
