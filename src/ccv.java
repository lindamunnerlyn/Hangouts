// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;

public final class ccv
{

    private static final Map a = new gz();

    public static ccw a(String s)
    {
        Map map = a;
        map;
        JVM INSTR monitorenter ;
        ccw ccw2 = (ccw)a.get(s);
        ccw ccw1;
        ccw1 = ccw2;
        if (ccw2 != null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        ccw1 = new ccw(s);
        a.put(s, ccw1);
        map;
        JVM INSTR monitorexit ;
        return ccw1;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

}
