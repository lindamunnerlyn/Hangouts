// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.util.Log;
import com.google.android.gms.clearcut.LogEventParcelable;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class ely
    implements elp
{

    private static final Object a = new Object();
    private static ScheduledExecutorService b;
    private static final emj c = new emj();
    private static final long d;
    private final erp e;
    private final emf f;
    private final Object g;
    private long h;
    private final long i;
    private ScheduledFuture j;
    private emy k;
    private final Runnable l;

    public ely()
    {
        this(((erp) (new err())), d, new emf());
    }

    private ely(erp erp1, long l1, emf emf1)
    {
        g = new Object();
        h = 0L;
        j = null;
        k = null;
        l = new elz(this);
        e = erp1;
        i = l1;
        f = emf1;
    }

    static emj a()
    {
        return c;
    }

    static ene a(ely ely1, emy emy1, emg emg)
    {
        return ely1.a(emy1, emg);
    }

    private ene a(emy emy1, emg emg)
    {
        c().execute(new ema(this, emy1, emg));
        return emg;
    }

    static Object a(ely ely1)
    {
        return ely1.g;
    }

    static void a(LogEventParcelable logeventparcelable)
    {
        b(logeventparcelable);
    }

    static long b(ely ely1)
    {
        return ely1.h;
    }

    static ScheduledExecutorService b()
    {
        return c();
    }

    private static void b(LogEventParcelable logeventparcelable)
    {
        if (logeventparcelable.f != null && logeventparcelable.e.i.length == 0)
        {
            logeventparcelable.e.i = logeventparcelable.f.d();
        }
        if (logeventparcelable.g != null && logeventparcelable.e.r.length == 0)
        {
            logeventparcelable.e.r = logeventparcelable.g.d();
        }
        logeventparcelable.c = fgm.a(logeventparcelable.e);
    }

    private emh c(emy emy1, LogEventParcelable logeventparcelable)
    {
        c.a();
        logeventparcelable = new emh(this, logeventparcelable, emy1);
        eme eme1 = new eme(this);
        enh enh;
        boolean flag;
        if (!((enk) (logeventparcelable)).g)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g.a(flag, "Result has already been consumed.");
        emy1 = ((emy) (((enk) (logeventparcelable)).c));
        emy1;
        JVM INSTR monitorenter ;
        if (!logeventparcelable.b())
        {
            break MISSING_BLOCK_LABEL_73;
        }
        enh = ((enk) (logeventparcelable)).f;
        eme1.a();
_L2:
        return logeventparcelable;
        ((enk) (logeventparcelable)).e.add(eme1);
        if (true) goto _L2; else goto _L1
_L1:
        logeventparcelable;
        emy1;
        JVM INSTR monitorexit ;
        throw logeventparcelable;
    }

    static erp c(ely ely1)
    {
        return ely1.e;
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

    static emy d(ely ely1)
    {
        return ely1.k;
    }

    static emy e(ely ely1)
    {
        ely1.k = null;
        return null;
    }

    public ene a(Context context, LogEventParcelable logeventparcelable)
    {
        synchronized (g)
        {
            if (k == null)
            {
                k = (new emz(context)).a(ell.c).a();
                k.b();
            }
            h = e.b() + i;
            if (j != null)
            {
                j.cancel(false);
            }
            j = c().schedule(l, i, TimeUnit.MILLISECONDS);
            context = b(k, logeventparcelable);
        }
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public ene a(emy emy1, LogEventParcelable logeventparcelable)
    {
        b(logeventparcelable);
        return emy1.a(c(emy1, logeventparcelable));
    }

    public void a(emy emy1)
    {
        emb emb1 = new emb(this, emy1, emy1);
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        if (b != null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        emy1.a(emb1);
_L2:
        return;
        b.execute(new emd(this, emy1, emb1));
        if (true) goto _L2; else goto _L1
_L1:
        emy1;
        obj;
        JVM INSTR monitorexit ;
        throw emy1;
    }

    public boolean a(long l1, TimeUnit timeunit)
    {
        boolean flag;
        try
        {
            flag = c.a(5000L, timeunit);
        }
        // Misplaced declaration of an exception variable
        catch (TimeUnit timeunit)
        {
            Log.e("ClearcutLoggerApiImpl", "flush interrupted");
            Thread.currentThread().interrupt();
            return false;
        }
        return flag;
    }

    public ene b(emy emy1, LogEventParcelable logeventparcelable)
    {
        return a(emy1, c(emy1, logeventparcelable));
    }

    static 
    {
        d = TimeUnit.MILLISECONDS.convert(2L, TimeUnit.MINUTES);
    }
}
