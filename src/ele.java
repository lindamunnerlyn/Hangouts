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

final class ele
    implements ejx
{

    private final enl A = new elh(this);
    final Lock a = new ReentrantLock();
    final enk b;
    final Queue c = new LinkedList();
    BroadcastReceiver d;
    final Map e = new HashMap();
    final Map f = new HashMap();
    Set g;
    final emo h;
    final Map i = new HashMap();
    final ejt j;
    volatile elo k;
    final Set l = Collections.newSetFromMap(new ConcurrentHashMap(16, 0.75F, 2));
    private final Condition m;
    private final int n;
    private final int o;
    private final Context p;
    private final Looper q;
    private volatile boolean r;
    private long s;
    private long t;
    private final elj u;
    private final ejk v;
    private ConnectionResult w;
    private final Set x = Collections.newSetFromMap(new WeakHashMap());
    private final elm y = new elf(this);
    private final eka z = new elg(this);

    public ele(Context context, Looper looper, emo emo1, ejk ejk, ejt ejt1, Map map, ArrayList arraylist, 
            ArrayList arraylist1, int i1, int j1)
    {
        s = 0x1d4c0L;
        t = 5000L;
        g = new HashSet();
        w = null;
        p = context;
        b = new enk(looper, A);
        q = looper;
        u = new elj(this, looper);
        v = ejk;
        n = i1;
        o = j1;
        m = a.newCondition();
        k = new eld(this);
        for (ejk = arraylist.iterator(); ejk.hasNext(); b.a(arraylist))
        {
            arraylist = (eka)ejk.next();
        }

        for (ejk = arraylist1.iterator(); ejk.hasNext(); b.a(arraylist))
        {
            arraylist = (ekc)ejk.next();
        }

        arraylist = emo1.e();
        arraylist1 = map.keySet().iterator();
        while (arraylist1.hasNext()) 
        {
            ejs ejs1 = (ejs)arraylist1.next();
            ejk = ((ejk) (map.get(ejs1)));
            if (arraylist.get(ejs1) != null)
            {
                if (((emp)arraylist.get(ejs1)).b)
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
            i.put(ejs1, Integer.valueOf(i1));
            if (ejs1.d())
            {
                ejk = ejs1.b();
                eka eka1 = z;
                ekc ekc1 = a(ejs1, i1);
                ejk = new emu(context, looper, ejk.i(), eka1, ekc1, emo1, ejk.h());
            } else
            {
                ejk = ejs1.a().a(context, looper, emo1, ejk, z, a(ejs1, i1));
            }
            e.put(ejs1.c(), ejk);
        }
        h = emo1;
        j = ejt1;
    }

    private final ekc a(ejs ejs1, int i1)
    {
        return new eli(this, ejs1, i1);
    }

    static void a(ele ele1)
    {
        ele1.a.lock();
        if (ele1.k())
        {
            ele1.b();
        }
        ele1.a.unlock();
        return;
        Exception exception;
        exception;
        ele1.a.unlock();
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
        h.a(flag, "blockingConnect must not be called on the UI thread");
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

    public ejv a(ejw ejw)
    {
        ejw = (ejv)e.get(ejw);
        h.a(ejw, "Appropriate Api was not requested.");
        return ejw;
    }

    public ekl a(ekl ekl1)
    {
        boolean flag;
        if (ekl1.h != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        h.b(flag, "This task can not be enqueued (it's probably a Batch or malformed)");
        h.b(e.containsKey(ekl1.h), "GoogleApiClient is not configured to use the API required for this call.");
        a.lock();
        ekl1 = k.a(ekl1);
        a.unlock();
        return ekl1;
        ekl1;
        a.unlock();
        throw ekl1;
    }

    public elq a(Object obj)
    {
        h.a(obj, "Listener must not be null");
        a.lock();
        obj = new elq(q, obj);
        x.add(obj);
        a.unlock();
        return ((elq) (obj));
        obj;
        a.unlock();
        throw obj;
    }

    void a(ConnectionResult connectionresult)
    {
        a.lock();
        w = connectionresult;
        k = new eld(this);
        k.a();
        m.signalAll();
        a.unlock();
        return;
        connectionresult;
        a.unlock();
        throw connectionresult;
    }

    public void a(eka eka1)
    {
        b.a(eka1);
    }

    public void a(ekc ekc1)
    {
        b.a(ekc1);
    }

    void a(elk elk)
    {
        elk = u.obtainMessage(3, elk);
        u.sendMessage(elk);
    }

    void a(eln eln1)
    {
        l.add(eln1);
        eln1.a(y);
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
        ejs ejs1;
        for (Iterator iterator = i.keySet().iterator(); iterator.hasNext(); ((ejv)e.get(ejs1.c())).a(s2, printwriter))
        {
            ejs1 = (ejs)iterator.next();
            printwriter.append(s1).append(ejs1.e()).println(":");
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

    public void b(eka eka1)
    {
        b.b(eka1);
    }

    public void b(ekc ekc1)
    {
        b.b(ekc1);
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
        h.a(flag, "blockingConnect must not be called on the UI thread");
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
        return k instanceof ekn;
    }

    public boolean f()
    {
        return k instanceof ekp;
    }

    void g()
    {
        eln eln1;
        for (Iterator iterator = l.iterator(); iterator.hasNext(); eln1.b())
        {
            eln1 = (eln)iterator.next();
            eln1.a(null);
        }

        l.clear();
        for (Iterator iterator1 = x.iterator(); iterator1.hasNext(); ((elq)iterator1.next()).a()) { }
        x.clear();
    }

    void h()
    {
        for (Iterator iterator = e.values().iterator(); iterator.hasNext(); ((ejv)iterator.next()).c()) { }
    }

    void i()
    {
        a.lock();
        k = new ekp(this, h, i, v, j, a, p);
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
        k = new ekn(this);
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
            d = new ell(this);
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
