// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.chromium.net.CronetUploadDataStream;

public final class lmd
    implements Runnable
{

    final CronetUploadDataStream a;

    public lmd(CronetUploadDataStream cronetuploaddatastream)
    {
        a = cronetuploaddatastream;
        super();
    }

    public void run()
    {
label0:
        {
            synchronized (a.a)
            {
                if (a.b != 0L)
                {
                    break label0;
                }
            }
            return;
        }
        if (a.c)
        {
            throw new IllegalStateException("Unexpected rewind call. Already reading");
        }
        break MISSING_BLOCK_LABEL_50;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        if (a.d)
        {
            throw new IllegalStateException("Unexpected rewind call. Already rewinding");
        }
        a.d = true;
        obj;
        JVM INSTR monitorexit ;
    }
}
