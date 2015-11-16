// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public final class afz
{

    private AtomicInteger a;
    private final Map b;
    private final Set c;
    private final PriorityBlockingQueue d;
    private final PriorityBlockingQueue e;
    private final afk f;
    private final afq g;
    private final agd h;
    private afr i[];
    private afm j;
    private List k;

    public afz(afk afk, afq afq, int l)
    {
        this(afk, afq, l, new agd(new Handler(Looper.getMainLooper())));
    }

    private afz(afk afk, afq afq, int l, agd agd1)
    {
        a = new AtomicInteger();
        b = new HashMap();
        c = new HashSet();
        d = new PriorityBlockingQueue();
        e = new PriorityBlockingQueue();
        k = new ArrayList();
        f = afk;
        g = afq;
        i = new afr[l];
        h = agd1;
    }

    public afw a(afw afw1)
    {
        afw1.a(this);
        synchronized (c)
        {
            c.add(afw1);
        }
        afw1.b = Integer.valueOf(a.incrementAndGet());
        afw1.a("add-to-queue");
        if (!afw1.c)
        {
            e.add(afw1);
            return afw1;
        }
        break MISSING_BLOCK_LABEL_69;
        afw1;
        set;
        JVM INSTR monitorexit ;
        throw afw1;
        Map map = b;
        map;
        JVM INSTR monitorenter ;
        Queue queue;
        String s;
        s = afw1.d();
        if (!b.containsKey(s))
        {
            break MISSING_BLOCK_LABEL_179;
        }
        queue = (Queue)b.get(s);
        Object obj;
        obj = queue;
        if (queue != null)
        {
            break MISSING_BLOCK_LABEL_127;
        }
        obj = new LinkedList();
        ((Queue) (obj)).add(afw1);
        b.put(s, obj);
        if (agi.b)
        {
            agi.a("Request for cacheKey=%s is in flight, putting on hold.", new Object[] {
                s
            });
        }
_L1:
        map;
        JVM INSTR monitorexit ;
        return afw1;
        afw1;
        map;
        JVM INSTR monitorexit ;
        throw afw1;
        b.put(s, null);
        d.add(afw1);
          goto _L1
    }

    public void a()
    {
        boolean flag = false;
        if (j != null)
        {
            j.a();
        }
        for (int l = 0; l < i.length; l++)
        {
            if (i[l] != null)
            {
                i[l].a();
            }
        }

        j = new afm(d, e, f, h);
        j.start();
        for (int i1 = ((flag) ? 1 : 0); i1 < i.length; i1++)
        {
            afr afr1 = new afr(e, g, f, h);
            i[i1] = afr1;
            afr1.start();
        }

    }

    public afk b()
    {
        return f;
    }

    void b(afw afw1)
    {
        synchronized (c)
        {
            c.remove(afw1);
        }
        obj = k;
        obj;
        JVM INSTR monitorenter ;
        for (Iterator iterator = k.iterator(); iterator.hasNext(); iterator.next()) { }
        break MISSING_BLOCK_LABEL_66;
        afw1;
        obj;
        JVM INSTR monitorexit ;
        throw afw1;
        afw1;
        obj;
        JVM INSTR monitorexit ;
        throw afw1;
        obj;
        JVM INSTR monitorexit ;
        if (!afw1.c)
        {
            break MISSING_BLOCK_LABEL_153;
        }
        Map map = b;
        map;
        JVM INSTR monitorenter ;
        Queue queue;
        afw1 = afw1.d();
        queue = (Queue)b.remove(afw1);
        if (queue == null)
        {
            break MISSING_BLOCK_LABEL_145;
        }
        if (agi.b)
        {
            agi.a("Releasing %d waiting requests for cacheKey=%s.", new Object[] {
                Integer.valueOf(queue.size()), afw1
            });
        }
        d.addAll(queue);
        map;
        JVM INSTR monitorexit ;
        return;
        afw1;
        map;
        JVM INSTR monitorexit ;
        throw afw1;
    }
}
