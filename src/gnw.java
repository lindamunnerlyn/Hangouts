// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;
import android.content.Context;

final class gnw
{

    private static gnw a;
    private final gno b;
    private final gnr c;

    private gnw(gon gon, Application application, gny gny)
    {
        g.e(gon);
        g.e(application);
        b = new goa(new gnx(), gon, new gnp(), gny, application.getPackageName());
        c = new gnr(b, application);
    }

    static gnw a(gon gon, Application application, gny gny)
    {
        gnw;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = new gnw(gon, application, gny);
        }
        gon = a;
        gnw;
        JVM INSTR monitorexit ;
        return gon;
        gon;
        throw gon;
    }

    public void a()
    {
        c.a();
    }
}
