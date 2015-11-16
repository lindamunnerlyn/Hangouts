// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.chromium.net.CronetUrlRequest;
import org.chromium.net.UrlRequestException;

public final class lmf
    implements Runnable
{

    final UrlRequestException a;
    final CronetUrlRequest b;

    public lmf(CronetUrlRequest croneturlrequest, UrlRequestException urlrequestexception)
    {
        b = croneturlrequest;
        a = urlrequestexception;
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
