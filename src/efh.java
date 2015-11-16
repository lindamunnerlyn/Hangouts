// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.SystemClock;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;

public final class efh
{

    private static final boolean b = false;
    private static AtomicInteger c = new AtomicInteger(0);
    String a;
    private LinkedList d;

    efh(String s)
    {
        d = new LinkedList();
        a = s;
    }

    public static efh a(String s)
    {
        return efc.a(s);
    }

    private String d(String s)
    {
        String s1 = a;
        return (new StringBuilder(String.valueOf(s1).length() + 1 + String.valueOf(s).length())).append(s1).append("_").append(s).toString();
    }

    String a()
    {
        if (!b)
        {
            return "";
        }
        Object obj = new StringBuilder();
        this;
        JVM INSTR monitorenter ;
        Object obj1;
        obj1 = d;
        d = new LinkedList();
        obj1 = ((LinkedList) (obj1)).descendingIterator();
        ((StringBuilder) (obj)).append(" ** ").append(a).append(" **: ");
        long l;
        long l1;
        l1 = -1L;
        l = 0x7fffffffffffffffL;
_L1:
        efi efi1;
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break MISSING_BLOCK_LABEL_209;
            }
            efi1 = (efi)((Iterator) (obj1)).next();
            if (efi1.c < 0L)
            {
                break MISSING_BLOCK_LABEL_163;
            }
            long l2 = efi1.c - efi1.b;
            l1 = Math.max(l2, l1);
            l = Math.min(l2, l);
            ((StringBuilder) (obj)).append(" [").append(efi1.a).append(" (").append(l2).append("ms)]");
        } while (true);
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        if (SystemClock.elapsedRealtime() - efi1.b < 10000L)
        {
            d.add(efi1);
        }
        ((StringBuilder) (obj)).append(" [? ").append(efi1.a).append(" ?]");
          goto _L1
        this;
        JVM INSTR monitorexit ;
        ((StringBuilder) (obj)).append(";       max (ms): ").append(l1).append("; min (ms): ").append(l).append("; avg (ms): 0.0");
        return ((StringBuilder) (obj)).toString();
    }

    public String b(String s)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = b;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return s;
_L2:
        efi efi1;
        if (d.size() <= 100)
        {
            break; /* Loop/switch isn't completed */
        }
        efi1 = (efi)d.remove(0);
_L4:
        d.add(efi1);
        efi1.a = s;
        efi1.b = SystemClock.elapsedRealtime();
        efi1.c = -1L;
        efi1.d = c.incrementAndGet();
        efc.a(d(s), efi1.d);
        if (true) goto _L1; else goto _L3
        s;
        throw s;
_L3:
        efi1 = new efi();
          goto _L4
    }

    public void c(String s)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = b;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        efi efi1;
        Iterator iterator = d.descendingIterator();
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_91;
            }
            efi1 = (efi)iterator.next();
        } while (!efi1.a.equals(s));
        efi1.c = SystemClock.elapsedRealtime();
_L4:
        efc.b(a);
        if (efi1 == null) goto _L1; else goto _L3
_L3:
        efc.b(d(s), efi1.d);
          goto _L1
        s;
        throw s;
        efi1 = null;
          goto _L4
    }

    static 
    {
        hnc hnc = eev.u;
    }
}
