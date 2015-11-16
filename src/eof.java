// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

final class eof
    implements emy
{

    private final eql A = new eoi(this);
    final Lock a = new ReentrantLock();
    final eqk b;
    final Queue c = new LinkedList();
    BroadcastReceiver d;
    final Map e = new HashMap();
    final Map f = new HashMap();
    Set g;
    final epo h;
    final Map i = new HashMap();
    final emu j;
    volatile eop k;
    final Set l = Collections.newSetFromMap(new ConcurrentHashMap(16, 0.75F, 2));
    private final Condition m;
    private final int n;
    private final int o;
    private final Context p;
    private final Looper q;
    private volatile boolean r;
    private long s;
    private long t;
    private final eok u;
    private final eml v;
    private ConnectionResult w;
    private final Set x = Collections.newSetFromMap(new WeakHashMap());
    private final eon y = new eog(this);
    private final enb z = new eoh(this);

    public eof(Context context, Looper looper, epo epo1, eml eml, emu emu1, Map map, ArrayList arraylist, 
            ArrayList arraylist1, int i1, int j1)
    {
        s = 0x1d4c0L;
        t = 5000L;
        g = new HashSet();
        w = null;
        p = context;
        b = new eqk(looper, A);
        q = looper;
        u = new eok(this, looper);
        v = eml;
        n = i1;
        o = j1;
        m = a.newCondition();
        k = new eoe(this);
        for (eml = arraylist.iterator(); eml.hasNext(); b.a(arraylist))
        {
            arraylist = (enb)eml.next();
        }

        for (eml = arraylist1.iterator(); eml.hasNext(); b.a(arraylist))
        {
            arraylist = (end)eml.next();
        }

        arraylist = epo1.e();
        arraylist1 = map.keySet().iterator();
        while (arraylist1.hasNext()) 
        {
            emt emt1 = (emt)arraylist1.next();
            eml = ((eml) (map.get(emt1)));
            if (arraylist.get(emt1) != null)
            {
                if (((epp)arraylist.get(emt1)).b)
                {
                    i1 = 1;
                } else
                {
                    i1 = 2;
                }
            } else
            {
                i1 = 0;
            }
            i.put(emt1, Integer.valueOf(i1));
            if (emt1.d())
            {
                eml = emt1.b();
                enb enb1 = z;
                end end1 = a(emt1, i1);
                eml = new epu(context, looper, eml.i(), enb1, end1, epo1, eml.h());
            } else
            {
                eml = emt1.a().a(context, looper, epo1, eml, z, a(emt1, i1));
            }
            e.put(emt1.c(), eml);
        }
        h = epo1;
        j = emu1;
    }

    private final end a(emt emt1, int i1)
    {
        return new eoj(this, emt1, i1);
    }

    static void a(eof eof1)
    {
        eof1.a.lock();
        if (eof1.k())
        {
            eof1.b();
        }
        eof1.a.unlock();
        return;
        Exception exception;
        exception;
        eof1.a.unlock();
        throw exception;
    }

    public Looper a()
    {
        return q;
    }

    public ConnectionResult a(TimeUnit timeunit)
    {
        long l1;
        long l2;
        boolean flag;
        if (Looper.myLooper() != Looper.getMainLooper())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g.a(flag, "blockingConnect must not be called on the UI thread");
        a.lock();
        b();
        l1 = timeunit.toNanos(1000L);
_L2:
        flag = f();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        l2 = m.awaitNanos(l1);
        l1 = l2;
        if (l2 > 0L) goto _L2; else goto _L1
_L1:
        timeunit = new ConnectionResult(14, null);
        a.unlock();
        return timeunit;
        timeunit;
        Thread.currentThread().interrupt();
        timeunit = new ConnectionResult(15, null);
        a.unlock();
        return timeunit;
        if (!e())
        {
            break MISSING_BLOCK_LABEL_153;
        }
        timeunit = ConnectionResult.a;
        a.unlock();
        return timeunit;
        if (w == null)
        {
            break MISSING_BLOCK_LABEL_176;
        }
        timeunit = w;
        a.unlock();
        return timeunit;
        timeunit = new ConnectionResult(13, null);
        a.unlock();
        return timeunit;
        timeunit;
        a.unlock();
        throw timeunit;
    }

    public emw a(emx emx)
    {
        emx = (emw)e.get(emx);
        g.b(emx, "Appropriate Api was not requested.");
        return emx;
    }

    public enm a(enm enm1)
    {
        boolean flag;
        if (enm1.h != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g.b(flag, "This task can not be enqueued (it's probably a Batch or malformed)");
        g.b(e.containsKey(enm1.h), "GoogleApiClient is not configured to use the API required for this call.");
        a.lock();
        enm1 = k.a(enm1);
        a.unlock();
        return enm1;
        enm1;
        a.unlock();
        throw enm1;
    }

    public eor a(Object obj)
    {
        g.b(obj, "Listener must not be null");
        a.lock();
        obj = new eor(q, obj);
        x.add(obj);
        a.unlock();
        return ((eor) (obj));
        obj;
        a.unlock();
        throw obj;
    }

    void a(ConnectionResult connectionresult)
    {
        a.lock();
        w = connectionresult;
        k = new eoe(this);
        k.a();
        m.signalAll();
        a.unlock();
        return;
        connectionresult;
        a.unlock();
        throw connectionresult;
    }

    public void a(enb enb1)
    {
        b.a(enb1);
    }

    public void a(end end1)
    {
        b.a(end1);
    }

    void a(eol eol)
    {
        eol = u.obtainMessage(3, eol);
        u.sendMessage(eol);
    }

    void a(eoo eoo1)
    {
        l.add(eoo1);
        eoo1.a(y);
    }

    void a(RuntimeException runtimeexception)
    {
        runtimeexception = u.obtainMessage(4, runtimeexception);
        u.sendMessage(runtimeexception);
    }

    public void a(String s1, PrintWriter printwriter)
    {
        printwriter.append(s1).append("mState=").append(k.d());
        printwriter.append(" mResuming=").print(r);
        printwriter.append(" mWorkQueue.size()=").print(c.size());
        printwriter.append(" mUnconsumedRunners.size()=").println(l.size());
        String s2 = (new StringBuilder()).append(s1).append("  ").toString();
        emt emt1;
        for (Iterator iterator = i.keySet().iterator(); iterator.hasNext(); ((emw)e.get(emt1.c())).a(s2, printwriter))
        {
            emt1 = (emt)iterator.next();
            printwriter.append(s1).append(emt1.e()).println(":");
        }

    }

    public void b()
    {
        a.lock();
        k.c();
        a.unlock();
        return;
        Exception exception;
        exception;
        a.unlock();
        throw exception;
    }

    public void b(enb enb1)
    {
        b.b(enb1);
    }

    public void b(end end1)
    {
        b.b(end1);
    }

    public ConnectionResult c()
    {
        InterruptedException interruptedexception;
        ConnectionResult connectionresult;
        boolean flag;
        if (Looper.myLooper() != Looper.getMainLooper())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g.a(flag, "blockingConnect must not be called on the UI thread");
        a.lock();
        b();
_L1:
        flag = f();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        m.await();
          goto _L1
        interruptedexception;
        Thread.currentThread().interrupt();
        connectionresult = new ConnectionResult(15, null);
        a.unlock();
        return connectionresult;
        ConnectionResult connectionresult1;
        if (!e())
        {
            break MISSING_BLOCK_LABEL_108;
        }
        connectionresult1 = ConnectionResult.a;
        a.unlock();
        return connectionresult1;
        if (w == null)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        connectionresult1 = w;
        a.unlock();
        return connectionresult1;
        connectionresult1 = new ConnectionResult(13, null);
        a.unlock();
        return connectionresult1;
        Exception exception;
        exception;
        a.unlock();
        throw exception;
    }

    public void d()
    {
        a.lock();
        m();
        k.b();
        a.unlock();
        return;
        Exception exception;
        exception;
        a.unlock();
        throw exception;
    }

    public boolean e()
    {
        return k instanceof eno;
    }

    public boolean f()
    {
        return k instanceof enq;
    }

    void g()
    {
        eoo eoo1;
        for (Iterator iterator = l.iterator(); iterator.hasNext(); eoo1.c())
        {
            eoo1 = (eoo)iterator.next();
            eoo1.a(null);
        }

        l.clear();
        for (Iterator iterator1 = x.iterator(); iterator1.hasNext(); ((eor)iterator1.next()).a()) { }
        x.clear();
    }

    void h()
    {
        for (Iterator iterator = e.values().iterator(); iterator.hasNext(); ((emw)iterator.next()).c()) { }
    }

    void i()
    {
        a.lock();
        k = new enq(this, h, i, v, j, a, p);
        k.a();
        m.signalAll();
        a.unlock();
        return;
        Exception exception;
        exception;
        a.unlock();
        throw exception;
    }

    void j()
    {
        a.lock();
        m();
        k = new eno(this);
        k.a();
        m.signalAll();
        a.unlock();
        return;
        Exception exception;
        exception;
        a.unlock();
        throw exception;
    }

    boolean k()
    {
        return r;
    }

    void l()
    {
        if (k())
        {
            return;
        }
        r = true;
        if (d == null)
        {
            d = new eom(this);
            IntentFilter intentfilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
            intentfilter.addDataScheme("package");
            p.getApplicationContext().registerReceiver(d, intentfilter);
        }
        u.sendMessageDelayed(u.obtainMessage(1), s);
        u.sendMessageDelayed(u.obtainMessage(2), t);
    }

    boolean m()
    {
        if (!k())
        {
            return false;
        }
        r = false;
        u.removeMessages(2);
        u.removeMessages(1);
        if (d != null)
        {
            p.getApplicationContext().unregisterReceiver(d);
            d = null;
        }
        return true;
    }

    public int n()
    {
        return System.identityHashCode(this);
    }
}
