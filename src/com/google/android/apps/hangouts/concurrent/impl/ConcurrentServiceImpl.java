// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.concurrent.impl;

import alz;
import amc;
import amg;
import ami;
import amk;
import aml;
import amm;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.SystemClock;
import efh;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kat;

public class ConcurrentServiceImpl extends Service
{

    private static final int c = Runtime.getRuntime().availableProcessors();
    private static final efh d = efh.a("concurrent");
    private static final android.os.StrictMode.ThreadPolicy g = (new android.os.StrictMode.ThreadPolicy.Builder()).detectCustomSlowCalls().penaltyLog().build();
    ExecutorService a;
    Context b;
    private final Handler e = new Handler(Looper.getMainLooper());
    private final amm f = new amm();

    public ConcurrentServiceImpl()
    {
        a = Executors.newScheduledThreadPool(c, (new kat()).a().a("Hangouts Concurrent Service Thread %d").a(new ami(this)).b());
    }

    public static android.os.StrictMode.ThreadPolicy a()
    {
        return g;
    }

    public static void a(ConcurrentServiceImpl concurrentserviceimpl)
    {
        concurrentserviceimpl.b();
    }

    private void b()
    {
        a.submit(new amg(b, f));
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onCreate()
    {
        super.onCreate();
        b = getApplicationContext();
        f.a(b);
    }

    public void onDestroy()
    {
        super.onDestroy();
        f.b();
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        if (intent == null)
        {
            b();
        } else
        {
            i = intent.getIntExtra("concurrent_service_command_key", -1);
            alz alz1;
            switch (aml.a[amc.a()[i] - 1])
            {
            default:
                throw new IllegalArgumentException((new StringBuilder(28)).append("Unknown command: ").append(i).toString());

            case 1: // '\001'
                b();
                return 2;

            case 2: // '\002'
                alz1 = (alz)intent.getParcelableExtra("concurrent_process_data_key");
                break;
            }
            if (alz1 != null)
            {
                efh efh1 = d;
                intent = String.valueOf("SCHEDULE_");
                String s = String.valueOf(alz1.a());
                long l;
                if (s.length() != 0)
                {
                    intent = intent.concat(s);
                } else
                {
                    intent = new String(intent);
                }
                efh1.c(intent);
                f.a(alz1);
                l = alz1.d - SystemClock.elapsedRealtime();
                if (l <= 0L)
                {
                    b();
                    return 2;
                } else
                {
                    e.postDelayed(new amk(this), l);
                    return 2;
                }
            }
        }
        return 2;
    }

}
