// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.TimeUnit;

final class hiu extends his
{

    private static final long a;
    private final hm b = new hm();
    private final fzs c;

    hiu(fzs fzs)
    {
        c = fzs;
    }

    static long a()
    {
        return a;
    }

    public hit a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        hit hit2 = (hit)b.get(s);
        hit hit1;
        hit1 = hit2;
        if (hit2 != null)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        hit1 = new hit(s, c);
        b.put(s, hit1);
        this;
        JVM INSTR monitorexit ;
        return hit1;
        s;
        throw s;
    }

    static 
    {
        a = TimeUnit.HOURS.toMillis(1L);
    }
}
