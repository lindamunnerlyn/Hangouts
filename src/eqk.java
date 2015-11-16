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

public final class eqk
    implements android.os.Handler.Callback
{

    final ArrayList a = new ArrayList();
    private final eql b;
    private final ArrayList c = new ArrayList();
    private final ArrayList d = new ArrayList();
    private volatile boolean e;
    private final AtomicInteger f = new AtomicInteger(0);
    private boolean g;
    private final Handler h;
    private final Object i = new Object();

    public eqk(Looper looper, eql eql1)
    {
        e = false;
        g = false;
        b = eql1;
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
        g.a(flag, "onUnintentionalDisconnection must only be called on the Handler thread");
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
            enb enb1 = (enb)((Iterator) (obj1)).next();
            if (!e || f.get() != k)
            {
                break;
            }
            if (c.contains(enb1))
            {
                enb1.a(j);
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
        enb enb1;
        int j;
        if (Looper.myLooper() == h.getLooper())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g.a(flag, "onConnectionSuccess must only be called on the Handler thread");
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
        g.a(flag);
        h.removeMessages(1);
        g = true;
        if (a.size() == 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        g.a(flag);
        obj1 = new ArrayList(c);
        j = f.get();
        obj1 = ((ArrayList) (obj1)).iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break;
            }
            enb1 = (enb)((Iterator) (obj1)).next();
            if (!e || !b.d() || f.get() != j)
            {
                break;
            }
            if (!a.contains(enb1))
            {
                enb1.a_(bundle);
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
        end end1;
        int j;
        boolean flag;
        if (Looper.myLooper() == h.getLooper())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g.a(flag, "onConnectionFailure must only be called on the Handler thread");
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
        end1 = (end)((Iterator) (obj1)).next();
        if (!e || f.get() != j)
        {
            return;
        }
        if (d.contains(end1))
        {
            end1.a(connectionresult);
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

    public void a(enb enb1)
    {
        g.d(enb1);
        Object obj = i;
        obj;
        JVM INSTR monitorenter ;
        if (!c.contains(enb1))
        {
            break MISSING_BLOCK_LABEL_74;
        }
        (new StringBuilder("registerConnectionCallbacks(): listener ")).append(enb1).append(" is already registered");
_L2:
        if (b.d())
        {
            h.sendMessage(h.obtainMessage(1, enb1));
        }
        return;
        c.add(enb1);
        if (true) goto _L2; else goto _L1
_L1:
        enb1;
        obj;
        JVM INSTR monitorexit ;
        throw enb1;
    }

    public void a(end end1)
    {
        g.d(end1);
        Object obj = i;
        obj;
        JVM INSTR monitorenter ;
        if (!d.contains(end1))
        {
            break MISSING_BLOCK_LABEL_45;
        }
        (new StringBuilder("registerConnectionFailedListener(): listener ")).append(end1).append(" is already registered");
_L2:
        return;
        d.add(end1);
        if (true) goto _L2; else goto _L1
_L1:
        end1;
        obj;
        JVM INSTR monitorexit ;
        throw end1;
    }

    public void b()
    {
        e = true;
    }

    public void b(enb enb1)
    {
        g.d(enb1);
        Object obj = i;
        obj;
        JVM INSTR monitorenter ;
        if (c.remove(enb1)) goto _L2; else goto _L1
_L1:
        (new StringBuilder("unregisterConnectionCallbacks(): listener ")).append(enb1).append(" not found");
_L4:
        return;
_L2:
        if (g)
        {
            a.add(enb1);
        }
        if (true) goto _L4; else goto _L3
_L3:
        enb1;
        obj;
        JVM INSTR monitorexit ;
        throw enb1;
    }

    public void b(end end1)
    {
        g.d(end1);
        synchronized (i)
        {
            if (!d.remove(end1))
            {
                (new StringBuilder("unregisterConnectionFailedListener(): listener ")).append(end1).append(" not found");
            }
        }
        return;
        end1;
        obj;
        JVM INSTR monitorexit ;
        throw end1;
    }

    public boolean handleMessage(Message message)
    {
        if (message.what == 1)
        {
            enb enb1 = (enb)message.obj;
            synchronized (i)
            {
                if (e && b.d() && c.contains(enb1))
                {
                    enb1.a_(null);
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
