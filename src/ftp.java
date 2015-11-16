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

public class ftp extends Service
    implements fsn, fsv, ftf
{

    private volatile int a;
    private String b;
    private Handler c;
    private IBinder d;
    private Object e;
    private boolean f;

    public ftp()
    {
        a = -1;
        e = new Object();
    }

    static String a(ftp ftp1)
    {
        return ftp1.b;
    }

    static void b(ftp ftp1)
    {
label0:
        {
            int i = Binder.getCallingUid();
            if (i != ftp1.a)
            {
                if (!ejn.a(ftp1, i))
                {
                    break label0;
                }
                ftp1.a = i;
            }
            return;
        }
        throw new SecurityException("Caller is not GooglePlayServices");
    }

    static Object c(ftp ftp1)
    {
        return ftp1.e;
    }

    static boolean d(ftp ftp1)
    {
        return ftp1.f;
    }

    static Handler e(ftp ftp1)
    {
        return ftp1.c;
    }

    public void a(fsy fsy)
    {
    }

    public void a(fth fth)
    {
    }

    public final IBinder onBind(Intent intent)
    {
        if ("com.google.android.gms.wearable.BIND_LISTENER".equals(intent.getAction()))
        {
            return d;
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
        b = getPackageName();
        HandlerThread handlerthread = new HandlerThread("WearableListenerService");
        handlerthread.start();
        c = new Handler(handlerthread.getLooper());
        d = new ftq(this);
    }

    public void onDestroy()
    {
        Object obj = e;
        obj;
        JVM INSTR monitorenter ;
        f = true;
        if (c == null)
        {
            throw new IllegalStateException("onDestroy: mServiceHandler not set, did you override onCreate() but forget to call super.onCreate()?");
        }
        break MISSING_BLOCK_LABEL_34;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        c.getLooper().quit();
        obj;
        JVM INSTR monitorexit ;
        super.onDestroy();
        return;
    }
}
