// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.Process;

public final class hdg extends HandlerThread
    implements android.os.Handler.Callback
{

    private Handler a;

    public hdg()
    {
        super("ImageLoader");
    }

    public void a(hcv hcv1)
    {
        a.sendMessage(a.obtainMessage(0, hcv1));
    }

    public boolean handleMessage(Message message)
    {
        message = (hcv)message.obj;
        if (message.w() == 2 || message.w() == 4 || message.w() == 6)
        {
            message.c();
        }
        return true;
    }

    public void run()
    {
        Process.setThreadPriority(10);
        super.run();
    }

    public void start()
    {
        this;
        JVM INSTR monitorenter ;
        super.start();
        a = new Handler(getLooper(), this);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
