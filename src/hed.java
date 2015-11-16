// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.TimeUnit;

final class hed extends heb
{

    private static final long a;
    private final hm b = new hm();
    private final fxo c;

    hed(fxo fxo)
    {
        c = fxo;
    }

    static long a()
    {
        return a;
    }

    public hec a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        hec hec2 = (hec)b.get(s);
        hec hec1;
        hec1 = hec2;
        if (hec2 != null)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        hec1 = new hec(s, c);
        b.put(s, hec1);
        this;
        JVM INSTR monitorexit ;
        return hec1;
        s;
        throw s;
    }

    static 
    {
        a = TimeUnit.HOURS.toMillis(1L);
    }
}
