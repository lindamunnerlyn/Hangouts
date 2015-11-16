// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

final class dmf
    implements eka
{

    final dme a;

    dmf(dme dme1)
    {
        a = dme1;
        super();
    }

    public void a(int i)
    {
        ebw.c("Babel", "Google API client disconnected.");
    }

    public void a_(Bundle bundle)
    {
label0:
        {
            synchronized (dme.a(a))
            {
                if (!dme.b(a))
                {
                    break label0;
                }
            }
            return;
        }
        ebw.c("Babel", "Google API client connected.");
        fmn.m.a(dme.c(a), dme.d(a), "gms_people_cache_account", null, 8);
        dme.e(a);
        bundle;
        JVM INSTR monitorexit ;
        return;
        exception;
        bundle;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
