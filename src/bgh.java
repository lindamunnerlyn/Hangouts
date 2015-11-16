// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bgh extends dgp
{

    final bgg a;

    bgh(bgg bgg1)
    {
        a = bgg1;
        super();
    }

    public void a(int i, ani ani, dgu dgu1)
    {
        cvn cvn1 = dgu1.c();
        ani = ((ani) (a.c));
        ani;
        JVM INSTR monitorenter ;
        if (i != a.a || !a.f().isInstance(cvn1))
        {
            break MISSING_BLOCK_LABEL_68;
        }
        i = cvn1.c.b;
        if (i != 1 && i != 0)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        a.a(dgu1);
_L2:
        ani;
        JVM INSTR monitorexit ;
        return;
        a.a(new bgj());
        if (true) goto _L2; else goto _L1
_L1:
        dgu1;
        ani;
        JVM INSTR monitorexit ;
        throw dgu1;
    }

    public void a(int i, ani ani, dko dko, dbo dbo)
    {
        synchronized (a.c)
        {
            if (i == a.a && a.e().isInstance(dko))
            {
                a.a(dbo);
            }
        }
        return;
        dko;
        ani;
        JVM INSTR monitorexit ;
        throw dko;
    }
}
