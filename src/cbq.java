// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;

public final class cbq
{

    private static final Map a = new gz();

    public static cbr a(String s)
    {
        Map map = a;
        map;
        JVM INSTR monitorenter ;
        cbr cbr2 = (cbr)a.get(s);
        cbr cbr1;
        cbr1 = cbr2;
        if (cbr2 != null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        cbr1 = new cbr(s);
        a.put(s, cbr1);
        map;
        JVM INSTR monitorexit ;
        return cbr1;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

}
