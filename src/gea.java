// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class gea extends gdz
{

    private final int a[];
    private final SparseArray b;
    private final SparseArray c;
    private boolean d;
    private gcz e;

    public gea(Context context, int ai[])
    {
        this(context, ai, gdb.a);
    }

    private gea(Context context, int ai[], SparseArray sparsearray)
    {
        a = ai;
        c = sparsearray;
        b = new SparseArray();
        d = false;
        context = (gdd)hlp.b(context, gdd);
        if (context != null)
        {
            e = context.a();
        }
    }

    public void a()
    {
        this;
        JVM INSTR monitorenter ;
        if (d) goto _L2; else goto _L1
_L1:
        if (e != null) goto _L4; else goto _L3
_L3:
        boolean flag = false;
_L11:
        d = flag;
        if (e == null) goto _L2; else goto _L5
_L5:
        if (!d) goto _L7; else goto _L6
_L6:
        e.a(2616).d();
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L4:
        jmh jmh1;
        Object obj;
        Object obj1;
        jmh1 = new jmh();
        obj = new HashSet();
        obj1 = new ArrayList();
        int i = 0;
_L12:
        if (i >= b.size()) goto _L9; else goto _L8
_L8:
        int j = b.keyAt(i);
        long l1 = ((Long)b.valueAt(i)).longValue();
        if (((Set) (obj)).add(Integer.valueOf(j)))
        {
            jmj jmj1 = new jmj();
            jmj1.a = Integer.valueOf(j);
            jmj1.b = Long.valueOf(l1);
            ((ArrayList) (obj1)).add(jmj1);
        }
          goto _L10
_L9:
        if (!((ArrayList) (obj1)).isEmpty())
        {
            break MISSING_BLOCK_LABEL_192;
        }
        flag = false;
          goto _L11
        jmh1.b = (jmj[])((ArrayList) (obj1)).toArray(new jmj[((ArrayList) (obj1)).size()]);
        obj = new ArrayList();
        i = 0;
_L13:
        Long long1;
        int k;
        int l;
        int i1;
        if (i >= c.size())
        {
            break MISSING_BLOCK_LABEL_417;
        }
        k = c.keyAt(i);
        l = ((gdc)c.valueAt(i)).a;
        i1 = ((gdc)c.valueAt(i)).b;
        obj1 = (Long)b.get(l);
        long1 = (Long)b.get(i1);
        if (obj1 == null || long1 == null)
        {
            break MISSING_BLOCK_LABEL_528;
        }
        jmi jmi1 = new jmi();
        jmi1.d = Long.valueOf(long1.longValue() - ((Long) (obj1)).longValue());
        jmi1.a = Integer.valueOf(k);
        ((ArrayList) (obj)).add(jmi1);
        obj1 = String.valueOf(jmi1.d);
        (new StringBuilder(String.valueOf(obj1).length() + 36)).append(" Clearcut[").append(l).append("-").append(i1).append("]: ").append(((String) (obj1)));
        break MISSING_BLOCK_LABEL_528;
        jmh1.a = (jmi[])((ArrayList) (obj)).toArray(new jmi[((ArrayList) (obj)).size()]);
        jmh1.c = a;
        obj = new jlt();
        obj.a = new jll();
        a(((jlt) (obj)).a);
        ((jlt) (obj)).a.n = jmh1;
        e.a(((jlt) (obj)));
        flag = true;
          goto _L11
_L7:
        e.a(2617).d();
          goto _L2
        Exception exception;
        exception;
        throw exception;
_L10:
        i++;
          goto _L12
        i++;
          goto _L13
    }

    public void a(int i, long l)
    {
        this;
        JVM INSTR monitorenter ;
        (new StringBuilder(42)).append("Marking [").append(i).append("]=").append(l);
        if (l <= 0L) goto _L2; else goto _L1
_L1:
        if (b.get(i) != null) goto _L4; else goto _L3
_L3:
        b.put(i, Long.valueOf(l));
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L4:
        Log.wtf("MarkReporterDefault", (new StringBuilder(40)).append("Mark [").append(i).append("] is set more than once").toString());
        if (true) goto _L2; else goto _L5
_L5:
        Exception exception;
        exception;
        throw exception;
    }

    public void a(jll jll1)
    {
    }

    public transient void a(int ai[])
    {
        int i = 0;
        this;
        JVM INSTR monitorenter ;
        if (d) goto _L2; else goto _L1
_L1:
        long l = SystemClock.elapsedRealtime();
_L3:
        if (i > 0)
        {
            break; /* Loop/switch isn't completed */
        }
        a(ai[0], l);
        i++;
        if (true) goto _L3; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        ai;
        throw ai;
    }
}
