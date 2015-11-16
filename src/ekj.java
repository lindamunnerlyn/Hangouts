// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;

public abstract class ekj
    implements ekd
{

    private final CountDownLatch a = new CountDownLatch(1);
    private ekh b;
    public final Object c = new Object();
    public final ekk d;
    public final ArrayList e = new ArrayList();
    public volatile ekg f;
    public volatile boolean g;
    private boolean h;
    private boolean i;
    private ens j;

    protected ekj(Looper looper)
    {
        d = new ekk(looper);
    }

    static void b(ekg ekg)
    {
        if (!(ekg instanceof ekf))
        {
            break MISSING_BLOCK_LABEL_16;
        }
        ((ekf)ekg).b();
        return;
        RuntimeException runtimeexception;
        runtimeexception;
        (new StringBuilder("Unable to release ")).append(ekg);
        return;
    }

    private void c(ekg ekg)
    {
        f = ekg;
        j = null;
        a.countDown();
        ekg = f;
        if (b != null)
        {
            d.a();
            if (!h)
            {
                d.a(b, g());
            }
        }
        for (ekg = e.iterator(); ekg.hasNext(); ((eke)ekg.next()).a()) { }
        e.clear();
    }

    private boolean f()
    {
        return a.getCount() == 0L;
    }

    private ekg g()
    {
        boolean flag = true;
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        ekg ekg;
        if (g)
        {
            flag = false;
        }
        h.a(flag, "Result has already been consumed.");
        h.a(f(), "Result is not ready.");
        ekg = f;
        f = null;
        b = null;
        g = true;
        d();
        return ekg;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final ekg a()
    {
        boolean flag1 = true;
        boolean flag;
        if (Looper.myLooper() != Looper.getMainLooper())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        h.a(flag, "await must not be called on the UI thread");
        if (!g)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        h.a(flag, "Result has already been consumed");
        try
        {
            a.await();
        }
        catch (InterruptedException interruptedexception)
        {
            b(Status.b);
        }
        h.a(f(), "Result is not ready.");
        return g();
    }

    public abstract ekg a(Status status);

    public final void a(eke eke1)
    {
        Object obj;
        ekg ekg;
        boolean flag;
        if (!g)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        h.a(flag, "Result has already been consumed.");
        obj = c;
        obj;
        JVM INSTR monitorenter ;
        if (!f())
        {
            break MISSING_BLOCK_LABEL_45;
        }
        ekg = f;
        eke1.a();
_L2:
        return;
        e.add(eke1);
        if (true) goto _L2; else goto _L1
_L1:
        eke1;
        obj;
        JVM INSTR monitorexit ;
        throw eke1;
    }

    public final void a(ekg ekg)
    {
        boolean flag1;
label0:
        {
            flag1 = true;
            synchronized (c)
            {
                if (!i && !h)
                {
                    break label0;
                }
                b(ekg);
            }
            return;
        }
        boolean flag;
        if (!f())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        h.a(flag, "Results have already been set");
        if (!g)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        h.a(flag, "Result has already been consumed");
        c(ekg);
        obj;
        JVM INSTR monitorexit ;
        return;
        ekg;
        obj;
        JVM INSTR monitorexit ;
        throw ekg;
    }

    public final void a(ekh ekh)
    {
label0:
        {
            boolean flag;
            if (!g)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            h.a(flag, "Result has already been consumed.");
            synchronized (c)
            {
                if (!c())
                {
                    break label0;
                }
            }
            return;
        }
        if (!f())
        {
            break MISSING_BLOCK_LABEL_59;
        }
        d.a(ekh, g());
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        ekh;
        obj;
        JVM INSTR monitorexit ;
        throw ekh;
        b = ekh;
          goto _L1
    }

    public final void a(ens ens1)
    {
        synchronized (c)
        {
            j = ens1;
        }
        return;
        ens1;
        obj;
        JVM INSTR monitorexit ;
        throw ens1;
    }

    public void b()
    {
label0:
        {
            synchronized (c)
            {
                if (!h && !g)
                {
                    break label0;
                }
            }
            return;
        }
        ens ens1 = j;
        if (ens1 == null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        try
        {
            j.a();
        }
        catch (RemoteException remoteexception) { }
        b(f);
        b = null;
        h = true;
        c(a(Status.e));
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void b(Status status)
    {
        synchronized (c)
        {
            if (!f())
            {
                a(a(status));
                i = true;
            }
        }
        return;
        status;
        obj;
        JVM INSTR monitorexit ;
        throw status;
    }

    public boolean c()
    {
        boolean flag;
        synchronized (c)
        {
            flag = h;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void d()
    {
    }
}
