// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

final class efc
{

    private static final boolean a;
    private static boolean b = true;
    private static final efe c;
    private static Map d = new HashMap(20);
    private static HashSet e = new HashSet(20);
    private static Runnable f = null;

    static efh a(String s)
    {
        Map map = d;
        map;
        JVM INSTR monitorenter ;
        efh efh2 = (efh)d.get(s);
        efh efh1;
        efh1 = efh2;
        if (efh2 != null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        efh1 = new efh(s);
        d.put(s, efh1);
        map;
        JVM INSTR monitorexit ;
        return efh1;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    static void a()
    {
        Map map = d;
        map;
        JVM INSTR monitorenter ;
        f = null;
        for (Iterator iterator = e.iterator(); iterator.hasNext(); a((String)iterator.next()).a()) { }
        break MISSING_BLOCK_LABEL_50;
        Exception exception;
        exception;
        map;
        JVM INSTR monitorexit ;
        throw exception;
        e = new HashSet();
        map;
        JVM INSTR monitorexit ;
    }

    static void a(String s, int i)
    {
        c.a(s, i);
    }

    static void b(String s)
    {
label0:
        {
            synchronized (d)
            {
                if (b)
                {
                    break label0;
                }
            }
            return;
        }
        e.add(s);
        if (f == null)
        {
            s = new efd();
            f = s;
            g.a(s, 5000L);
        }
        map;
        JVM INSTR monitorexit ;
        return;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    static void b(String s, int i)
    {
        c.b(s, i);
    }

    static 
    {
        hnc hnc = eev.u;
        a = false;
        if (android.os.Build.VERSION.SDK_INT >= 18 && a)
        {
            c = new eff();
        } else
        {
            c = new efg();
        }
    }
}
