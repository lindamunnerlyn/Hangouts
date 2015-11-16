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

public final class afx
{

    private AtomicInteger a;
    private final Map b;
    private final Set c;
    private final PriorityBlockingQueue d;
    private final PriorityBlockingQueue e;
    private final afi f;
    private final afo g;
    private final agb h;
    private afp i[];
    private afk j;
    private List k;

    public afx(afi afi, afo afo, int l)
    {
        this(afi, afo, l, new agb(new Handler(Looper.getMainLooper())));
    }

    private afx(afi afi, afo afo, int l, agb agb1)
    {
        a = new AtomicInteger();
        b = new HashMap();
        c = new HashSet();
        d = new PriorityBlockingQueue();
        e = new PriorityBlockingQueue();
        k = new ArrayList();
        f = afi;
        g = afo;
        i = new afp[l];
        h = agb1;
    }

    public afu a(afu afu1)
    {
        afu1.a(this);
        synchronized (c)
        {
            c.add(afu1);
        }
        afu1.a = Integer.valueOf(a.incrementAndGet());
        afu1.a("add-to-queue");
        if (!afu1.b)
        {
            e.add(afu1);
            return afu1;
        }
        break MISSING_BLOCK_LABEL_69;
        afu1;
        set;
        JVM INSTR monitorexit ;
        throw afu1;
        Map map = b;
        map;
        JVM INSTR monitorenter ;
        Queue queue;
        String s;
        s = afu1.d();
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
        ((Queue) (obj)).add(afu1);
        b.put(s, obj);
        if (agg.b)
        {
            agg.a("Request for cacheKey=%s is in flight, putting on hold.", new Object[] {
                s
            });
        }
_L1:
        map;
        JVM INSTR monitorexit ;
        return afu1;
        afu1;
        map;
        JVM INSTR monitorexit ;
        throw afu1;
        b.put(s, null);
        d.add(afu1);
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

        j = new afk(d, e, f, h);
        j.start();
        for (int i1 = ((flag) ? 1 : 0); i1 < i.length; i1++)
        {
            afp afp1 = new afp(e, g, f, h);
            i[i1] = afp1;
            afp1.start();
        }

    }

    public afi b()
    {
        return f;
    }

    void b(afu afu1)
    {
        synchronized (c)
        {
            c.remove(afu1);
        }
        obj = k;
        obj;
        JVM INSTR monitorenter ;
        for (Iterator iterator = k.iterator(); iterator.hasNext(); iterator.next()) { }
        break MISSING_BLOCK_LABEL_66;
        afu1;
        obj;
        JVM INSTR monitorexit ;
        throw afu1;
        afu1;
        obj;
        JVM INSTR monitorexit ;
        throw afu1;
        obj;
        JVM INSTR monitorexit ;
        if (!afu1.b)
        {
            break MISSING_BLOCK_LABEL_153;
        }
        Map map = b;
        map;
        JVM INSTR monitorenter ;
        Queue queue;
        afu1 = afu1.d();
        queue = (Queue)b.remove(afu1);
        if (queue == null)
        {
            break MISSING_BLOCK_LABEL_145;
        }
        if (agg.b)
        {
            agg.a("Releasing %d waiting requests for cacheKey=%s.", new Object[] {
                Integer.valueOf(queue.size()), afu1
            });
        }
        d.addAll(queue);
        map;
        JVM INSTR monitorexit ;
        return;
        afu1;
        map;
        JVM INSTR monitorexit ;
        throw afu1;
    }
}
