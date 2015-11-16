// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;

public class fvv extends Service
    implements fuu, fvb, fvl
{

    private volatile int a;
    private IBinder b;
    String r;
    Handler s;
    Object t;
    boolean u;

    public fvv()
    {
        a = -1;
        t = new Object();
    }

    static void a(fvv fvv1)
    {
label0:
        {
            int i = Binder.getCallingUid();
            if (i != fvv1.a)
            {
                if (!emo.a(fvv1, i))
                {
                    break label0;
                }
                fvv1.a = i;
            }
            return;
        }
        throw new SecurityException("Caller is not GooglePlayServices");
    }

    public void a(fve fve)
    {
    }

    public void a(fvn fvn)
    {
    }

    public final IBinder onBind(Intent intent)
    {
        if ("com.google.android.gms.wearable.BIND_LISTENER".equals(intent.getAction()))
        {
            return b;
        } else
        {
            return null;
        }
    }

    public void onCreate()
    {
        super.onCreate();
        if (Log.isLoggable("WearableLS", 3))
        {
            (new StringBuilder("onCreate: ")).append(getPackageName());
        }
        r = getPackageName();
        HandlerThread handlerthread = new HandlerThread("WearableListenerService");
        handlerthread.start();
        s = new Handler(handlerthread.getLooper());
        b = new fvw(this);
    }

    public void onDestroy()
    {
        Object obj = t;
        obj;
        JVM INSTR monitorenter ;
        u = true;
        if (s == null)
        {
            throw new IllegalStateException("onDestroy: mServiceHandler not set, did you override onCreate() but forget to call super.onCreate()?");
        }
        break MISSING_BLOCK_LABEL_34;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        s.getLooper().quit();
        obj;
        JVM INSTR monitorexit ;
        super.onDestroy();
        return;
    }
}
