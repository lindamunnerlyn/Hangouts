// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

final class doz
    implements enb
{

    final doy a;

    doz(doy doy1)
    {
        a = doy1;
        super();
    }

    public void a(int i)
    {
        eev.c("Babel", "Google API client disconnected.");
    }

    public void a_(Bundle bundle)
    {
label0:
        {
            synchronized (doy.a(a))
            {
                if (!doy.b(a))
                {
                    break label0;
                }
            }
            return;
        }
        eev.c("Babel", "Google API client connected.");
        fph.m.a(doy.c(a), doy.d(a), "gms_people_cache_account");
        doy.e(a);
        bundle;
        JVM INSTR monitorexit ;
        return;
        exception;
        bundle;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
