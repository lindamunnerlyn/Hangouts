// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ByteBuffer;
import org.chromium.net.CronetUrlRequest;

public final class lmm
    implements Runnable
{

    public ByteBuffer a;
    final CronetUrlRequest b;

    public lmm(CronetUrlRequest croneturlrequest)
    {
        b = croneturlrequest;
        super();
    }

    public void run()
    {
        if (b.a())
        {
            return;
        }
        synchronized (b.d)
        {
            if (b.a != 0L)
            {
                break MISSING_BLOCK_LABEL_51;
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw exception;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            CronetUrlRequest.a(b, ((Exception) (obj)));
        }
        return;
        b.c = true;
        obj;
        JVM INSTR monitorexit ;
        a = null;
        return;
    }
}
