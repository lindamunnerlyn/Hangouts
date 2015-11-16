// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public final class ebt
{

    private final ConcurrentHashMap a = new ConcurrentHashMap();

    public ebt()
    {
    }

    public void a(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        a.putIfAbsent(obj, new AtomicInteger(0));
        ((AtomicInteger)a.get(obj)).incrementAndGet();
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        throw obj;
    }

    public void b(Object obj)
    {
        a.putIfAbsent(obj, new AtomicInteger(1));
    }

    public boolean c(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        n.b(a.containsKey(obj), "Tried to decrement nonexistent key %s", new Object[] {
            obj
        });
        if (((AtomicInteger)a.get(obj)).decrementAndGet() != 0) goto _L2; else goto _L1
_L1:
        a.remove(obj);
        boolean flag = true;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
        obj;
        throw obj;
    }
}
