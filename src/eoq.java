// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.SystemClock;

public final class eoq
{

    private final long a;
    private final int b;
    private final hm c;

    public eoq()
    {
        a = 60000L;
        b = 10;
        c = new hm(10);
    }

    public eoq(long l)
    {
        a = l;
        b = 1024;
        c = new hm();
    }

    public Long a(String s)
    {
        long l1 = SystemClock.elapsedRealtime();
        long l = a;
        this;
        JVM INSTR monitorenter ;
_L3:
        if (c.size() < b) goto _L2; else goto _L1
_L1:
        int i = c.size() - 1;
_L4:
        if (i < 0)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        if (l1 - ((Long)c.c(i)).longValue() > l)
        {
            c.d(i);
        }
        break MISSING_BLOCK_LABEL_135;
        l /= 2L;
        (new StringBuilder("The max capacity ")).append(b).append(" is not enough. Current durationThreshold is: ").append(l);
          goto _L3
_L2:
        s = (Long)c.put(s, Long.valueOf(l1));
        this;
        JVM INSTR monitorexit ;
        return s;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        i--;
          goto _L4
    }

    public boolean b(String s)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        if (c.remove(s) != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
    }
}
