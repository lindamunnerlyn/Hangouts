// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.ContentObserver;
import android.os.Handler;
import java.util.HashMap;

final class fxb extends ContentObserver
{

    final fxa a;

    fxb(fxa fxa1, Handler handler)
    {
        a = fxa1;
        super(handler);
    }

    public void onChange(boolean flag)
    {
        fwz;
        JVM INSTR monitorenter ;
        fwz.a().clear();
        fwz.a(new Object());
        if (fwz.b().length > 0)
        {
            fwz.b(a.a, fwz.b());
        }
        fwz;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        fwz;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
