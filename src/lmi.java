// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.chromium.net.CronetUrlRequest;

public final class lmi
    implements Runnable
{

    final lmk a;
    final CronetUrlRequest b;

    public lmi(CronetUrlRequest croneturlrequest, lmk lmk)
    {
        b = croneturlrequest;
        a = lmk;
        super();
    }

    public void run()
    {
label0:
        {
            synchronized (b.d)
            {
                if (!b.a())
                {
                    break label0;
                }
            }
            return;
        }
        CronetUrlRequest.a(b);
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
