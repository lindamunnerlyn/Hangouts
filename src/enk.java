// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;

public abstract class enk
    implements ene
{

    private final CountDownLatch a = new CountDownLatch(1);
    private eni b;
    public final Object c = new Object();
    public final enl d;
    public final ArrayList e = new ArrayList();
    public volatile enh f;
    public volatile boolean g;
    private boolean h;
    private boolean i;
    private eqs j;

    protected enk(Looper looper)
    {
        d = new enl(looper);
    }

    static void b(enh enh)
    {
        if (!(enh instanceof eng))
        {
            break MISSING_BLOCK_LABEL_16;
        }
        ((eng)enh).b();
        return;
        RuntimeException runtimeexception;
        runtimeexception;
        (new StringBuilder("Unable to release ")).append(enh);
        return;
    }

    private void c(enh enh)
    {
        f = enh;
        j = null;
        a.countDown();
        enh = f;
        if (b != null)
        {
            d.a();
            if (!h)
            {
                d.a(b, g());
            }
        }
        for (enh = e.iterator(); enh.hasNext(); ((enf)enh.next()).a()) { }
        e.clear();
    }

    private enh g()
    {
        boolean flag = true;
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        enh enh;
        if (g)
        {
            flag = false;
        }
        g.a(flag, "Result has already been consumed.");
        g.a(b(), "Result is not ready.");
        enh = f;
        f = null;
        b = null;
        g = true;
        e();
        return enh;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final enh a()
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
        g.a(flag, "await must not be called on the UI thread");
        if (!g)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        g.a(flag, "Result has already been consumed");
        try
        {
            a.await();
        }
        catch (InterruptedException interruptedexception)
        {
            b(Status.b);
        }
        g.a(b(), "Result is not ready.");
        return g();
    }

    public abstract enh a(Status status);

    public final void a(enh enh)
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
                b(enh);
            }
            return;
        }
        boolean flag;
        if (!b())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g.a(flag, "Results have already been set");
        if (!g)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        g.a(flag, "Result has already been consumed");
        c(enh);
        obj;
        JVM INSTR monitorexit ;
        return;
        enh;
        obj;
        JVM INSTR monitorexit ;
        throw enh;
    }

    public final void a(eni eni)
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
            g.a(flag, "Result has already been consumed.");
            synchronized (c)
            {
                if (!d())
                {
                    break label0;
                }
            }
            return;
        }
        if (!b())
        {
            break MISSING_BLOCK_LABEL_59;
        }
        d.a(eni, g());
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        eni;
        obj;
        JVM INSTR monitorexit ;
        throw eni;
        b = eni;
          goto _L1
    }

    public final void a(eqs eqs1)
    {
        synchronized (c)
        {
            j = eqs1;
        }
        return;
        eqs1;
        obj;
        JVM INSTR monitorexit ;
        throw eqs1;
    }

    public final void b(Status status)
    {
        synchronized (c)
        {
            if (!b())
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

    public final boolean b()
    {
        return a.getCount() == 0L;
    }

    public void c()
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
        eqs eqs1 = j;
        if (eqs1 == null)
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

    public boolean d()
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

    protected void e()
    {
    }
}
