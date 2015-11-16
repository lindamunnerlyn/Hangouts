// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class arj
{

    private static final boolean a = false;
    private final gz b = new gz();

    public arj()
    {
    }

    public arh a(aoa aoa1)
    {
        int i = aoa1.h();
        gz gz1 = b;
        gz1;
        JVM INSTR monitorenter ;
        arh arh2 = (arh)b.get(Integer.valueOf(i));
        arh arh1;
        arh1 = arh2;
        if (arh2 != null)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        if (a)
        {
            eev.b("Babel", String.format("Adding participant cache for %s - %d", new Object[] {
                aoa1.a(), Integer.valueOf(i)
            }));
        }
        arh1 = new arh(aoa1);
        b.put(Integer.valueOf(i), arh1);
        gz1;
        JVM INSTR monitorexit ;
        return arh1;
        aoa1;
        gz1;
        JVM INSTR monitorexit ;
        throw aoa1;
    }

    static 
    {
        hnc hnc = eev.d;
    }
}
