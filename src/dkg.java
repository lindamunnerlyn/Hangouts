// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Looper;
import com.google.android.apps.hangouts.requestwriter.RequestWriter;

public final class dkg extends Thread
{

    public Handler a;
    final RequestWriter b;
    private final Object c = new Object();

    public dkg(RequestWriter requestwriter)
    {
        b = requestwriter;
        super();
    }

    public void run()
    {
        Looper.prepare();
        dkh dkh1 = new dkh(b);
        synchronized (c)
        {
            a = dkh1;
            c.notify();
        }
        Looper.loop();
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void start()
    {
        super.start();
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
_L3:
        Handler handler = a;
        if (handler != null) goto _L2; else goto _L1
_L1:
        Exception exception;
        try
        {
            c.wait();
        }
        catch (InterruptedException interruptedexception) { }
        finally { }
        if (true) goto _L3; else goto _L2
_L2:
        obj;
        JVM INSTR monitorexit ;
        return;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
