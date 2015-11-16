// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.ContentObserver;
import android.os.Handler;
import java.util.HashMap;

final class fzf extends ContentObserver
{

    final fze a;

    fzf(fze fze1, Handler handler)
    {
        a = fze1;
        super(handler);
    }

    public void onChange(boolean flag)
    {
        fzd;
        JVM INSTR monitorenter ;
        fzd.a().clear();
        fzd.a(new Object());
        if (fzd.b().length > 0)
        {
            fzd.b(a.a, fzd.b());
        }
        fzd;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        fzd;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
