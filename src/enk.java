// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

public final class enk
    implements android.os.Handler.Callback
{

    final ArrayList a = new ArrayList();
    private final enl b;
    private final ArrayList c = new ArrayList();
    private final ArrayList d = new ArrayList();
    private volatile boolean e;
    private final AtomicInteger f = new AtomicInteger(0);
    private boolean g;
    private final Handler h;
    private final Object i = new Object();

    public enk(Looper looper, enl enl1)
    {
        e = false;
        g = false;
        b = enl1;
        h = new Handler(looper, this);
    }

    public void a()
    {
        e = false;
        f.incrementAndGet();
    }

    public void a(int j)
    {
        boolean flag = false;
        if (Looper.myLooper() == h.getLooper())
        {
            flag = true;
        }
        h.a(flag, "onUnintentionalDisconnection must only be called on the Handler thread");
        h.removeMessages(1);
        Object obj = i;
        obj;
        JVM INSTR monitorenter ;
        g = true;
        Object obj1 = new ArrayList(c);
        int k = f.get();
        obj1 = ((ArrayList) (obj1)).iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break;
            }
            eka eka1 = (eka)((Iterator) (obj1)).next();
            if (!e || f.get() != k)
            {
                break;
            }
            if (c.contains(eka1))
            {
                eka1.a(j);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_139;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        a.clear();
        g = false;
        obj;
        JVM INSTR monitorexit ;
    }

    public void a(Bundle bundle)
    {
        Object obj;
        boolean flag;
        boolean flag1 = true;
        Object obj1;
        eka eka1;
        int j;
        if (Looper.myLooper() == h.getLooper())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        h.a(flag, "onConnectionSuccess must only be called on the Handler thread");
        obj = i;
        obj;
        JVM INSTR monitorenter ;
        if (!g)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        h.a(flag);
        h.removeMessages(1);
        g = true;
        if (a.size() == 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        h.a(flag);
        obj1 = new ArrayList(c);
        j = f.get();
        obj1 = ((ArrayList) (obj1)).iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break;
            }
            eka1 = (eka)((Iterator) (obj1)).next();
            if (!e || !b.d() || f.get() != j)
            {
                break;
            }
            if (!a.contains(eka1))
            {
                eka1.a_(bundle);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_203;
        bundle;
        obj;
        JVM INSTR monitorexit ;
        throw bundle;
        a.clear();
        g = false;
        obj;
        JVM INSTR monitorexit ;
    }

    public void a(ConnectionResult connectionresult)
    {
        Object obj;
        Object obj1;
        ekc ekc1;
        int j;
        boolean flag;
        if (Looper.myLooper() == h.getLooper())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        h.a(flag, "onConnectionFailure must only be called on the Handler thread");
        h.removeMessages(1);
        obj = i;
        obj;
        JVM INSTR monitorenter ;
        obj1 = new ArrayList(d);
        j = f.get();
        obj1 = ((ArrayList) (obj1)).iterator();
_L2:
        if (!((Iterator) (obj1)).hasNext())
        {
            break MISSING_BLOCK_LABEL_134;
        }
        ekc1 = (ekc)((Iterator) (obj1)).next();
        if (!e || f.get() != j)
        {
            return;
        }
        if (d.contains(ekc1))
        {
            ekc1.a(connectionresult);
        }
        if (true) goto _L2; else goto _L1
_L1:
        connectionresult;
        obj;
        JVM INSTR monitorexit ;
        throw connectionresult;
        obj;
        JVM INSTR monitorexit ;
    }

    public void a(eka eka1)
    {
        h.a(eka1);
        Object obj = i;
        obj;
        JVM INSTR monitorenter ;
        if (!c.contains(eka1))
        {
            break MISSING_BLOCK_LABEL_74;
        }
        (new StringBuilder("registerConnectionCallbacks(): listener ")).append(eka1).append(" is already registered");
_L2:
        if (b.d())
        {
            h.sendMessage(h.obtainMessage(1, eka1));
        }
        return;
        c.add(eka1);
        if (true) goto _L2; else goto _L1
_L1:
        eka1;
        obj;
        JVM INSTR monitorexit ;
        throw eka1;
    }

    public void a(ekc ekc1)
    {
        h.a(ekc1);
        Object obj = i;
        obj;
        JVM INSTR monitorenter ;
        if (!d.contains(ekc1))
        {
            break MISSING_BLOCK_LABEL_45;
        }
        (new StringBuilder("registerConnectionFailedListener(): listener ")).append(ekc1).append(" is already registered");
_L2:
        return;
        d.add(ekc1);
        if (true) goto _L2; else goto _L1
_L1:
        ekc1;
        obj;
        JVM INSTR monitorexit ;
        throw ekc1;
    }

    public void b()
    {
        e = true;
    }

    public void b(eka eka1)
    {
        h.a(eka1);
        Object obj = i;
        obj;
        JVM INSTR monitorenter ;
        if (c.remove(eka1)) goto _L2; else goto _L1
_L1:
        (new StringBuilder("unregisterConnectionCallbacks(): listener ")).append(eka1).append(" not found");
_L4:
        return;
_L2:
        if (g)
        {
            a.add(eka1);
        }
        if (true) goto _L4; else goto _L3
_L3:
        eka1;
        obj;
        JVM INSTR monitorexit ;
        throw eka1;
    }

    public void b(ekc ekc1)
    {
        h.a(ekc1);
        synchronized (i)
        {
            if (!d.remove(ekc1))
            {
                (new StringBuilder("unregisterConnectionFailedListener(): listener ")).append(ekc1).append(" not found");
            }
        }
        return;
        ekc1;
        obj;
        JVM INSTR monitorexit ;
        throw ekc1;
    }

    public boolean handleMessage(Message message)
    {
        if (message.what == 1)
        {
            eka eka1 = (eka)message.obj;
            synchronized (i)
            {
                if (e && b.d() && c.contains(eka1))
                {
                    eka1.a_(null);
                }
            }
            return true;
        } else
        {
            Log.wtf("GmsClientEvents", "Don't know how to handle this message.");
            return false;
        }
        exception;
        message;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
