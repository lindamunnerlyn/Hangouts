// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bgt extends dhy
{

    final bgs a;

    bgt(bgs bgs1)
    {
        a = bgs1;
        super();
    }

    public void a(int i, aoa aoa, did did1)
    {
        cxr cxr1 = did1.c();
        aoa = ((aoa) (a.c));
        aoa;
        JVM INSTR monitorenter ;
        if (i != a.a || !a.f().isInstance(cxr1))
        {
            break MISSING_BLOCK_LABEL_68;
        }
        i = cxr1.c.b;
        if (i != 1 && i != 0)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        a.a(did1);
_L2:
        aoa;
        JVM INSTR monitorexit ;
        return;
        a.a(new bgv());
        if (true) goto _L2; else goto _L1
_L1:
        did1;
        aoa;
        JVM INSTR monitorexit ;
        throw did1;
    }

    public void a(int i, aoa aoa, dmf dmf, dcx dcx)
    {
        synchronized (a.c)
        {
            if (i == a.a && a.e().isInstance(dmf))
            {
                a.a(dcx);
            }
        }
        return;
        dmf;
        aoa;
        JVM INSTR monitorexit ;
        throw dmf;
    }
}
