// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.Semaphore;

final class eao extends dhy
{

    final int a;
    final cyi b[];
    final Semaphore c;
    final ean d;

    eao(ean ean, int i, cyi acyi[], Semaphore semaphore)
    {
        d = ean;
        a = i;
        b = acyi;
        c = semaphore;
        super();
    }

    public void a(int i, aoa aoa, did did1)
    {
        if (a == i)
        {
            aoa = (cyi)did1.c();
            if (aoa != null)
            {
                b[0] = aoa;
            } else
            {
                eev.g("Babel_telephony", "TeleHangoutsService.getCallRateResponseBlocking, response could not be decoded");
            }
            c.release();
        }
    }
}
