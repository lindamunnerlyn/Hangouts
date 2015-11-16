// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.chromium.net.CronetUrlRequest;

public final class lmh
    implements Runnable
{

    final CronetUrlRequest a;

    public lmh(CronetUrlRequest croneturlrequest)
    {
        a = croneturlrequest;
        super();
    }

    public void run()
    {
label0:
        {
            synchronized (a.d)
            {
                if (!a.a())
                {
                    break label0;
                }
            }
            return;
        }
        a.c = true;
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
