// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class aqs
{

    private static final boolean a = false;
    private final gz b = new gz();

    public aqs()
    {
    }

    public aqq a(ani ani1)
    {
        int i = ani1.h();
        gz gz1 = b;
        gz1;
        JVM INSTR monitorenter ;
        aqq aqq2 = (aqq)b.get(Integer.valueOf(i));
        aqq aqq1;
        aqq1 = aqq2;
        if (aqq2 != null)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        if (a)
        {
            ebw.b("Babel", String.format("Adding participant cache for %s - %d", new Object[] {
                ani1.a(), Integer.valueOf(i)
            }));
        }
        aqq1 = new aqq(ani1);
        b.put(Integer.valueOf(i), aqq1);
        gz1;
        JVM INSTR monitorexit ;
        return aqq1;
        ani1;
        gz1;
        JVM INSTR monitorexit ;
        throw ani1;
    }

    static 
    {
        hik hik = ebw.d;
    }
}
