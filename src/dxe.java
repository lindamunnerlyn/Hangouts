// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.Semaphore;

final class dxe extends dgp
{

    final int a;
    final cwe b[];
    final Semaphore c;
    final dxd d;

    dxe(dxd dxd, int i, cwe acwe[], Semaphore semaphore)
    {
        d = dxd;
        a = i;
        b = acwe;
        c = semaphore;
        super();
    }

    public void a(int i, ani ani, dgu dgu1)
    {
        if (a == i)
        {
            ani = (cwe)dgu1.c();
            if (ani != null)
            {
                b[0] = ani;
            } else
            {
                ebw.g("Babel_telephony", "TeleHangoutsService.getCallRateResponseBlocking, response could not be decoded");
            }
            c.release();
        }
    }
}
