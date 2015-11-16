// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.iid.MessengerCompat;
import java.io.IOException;

public final class ffs extends Service
{

    static String a = "action";
    static String d = "CMD";
    private static String g = "google.com/iid";
    private static String h = "gcm.googleapis.com/refresh";
    MessengerCompat b;
    BroadcastReceiver c;
    int e;
    int f;

    private void a()
    {
        this;
        JVM INSTR monitorenter ;
        e = e - 1;
        if (e == 0)
        {
            stopSelf(f);
        }
        if (Log.isLoggable("InstanceID", 3))
        {
            (new StringBuilder("Stop ")).append(e).append(" ").append(f);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static void a(Context context, ffz ffz1)
    {
        ffz1.b();
        ffz1 = new Intent("com.google.android.gms.iid.InstanceID");
        ffz1.putExtra(d, "RST");
        ffz1.setPackage(context.getPackageName());
        context.startService(ffz1);
    }

    public IBinder onBind(Intent intent)
    {
        if (intent != null && "com.google.android.gms.iid.InstanceID".equals(intent.getAction()))
        {
            return b.a();
        } else
        {
            return null;
        }
    }

    public void onCreate()
    {
        IntentFilter intentfilter = new IntentFilter("com.google.android.c2dm.intent.REGISTRATION");
        intentfilter.addCategory(getPackageName());
        registerReceiver(c, intentfilter, "com.google.android.c2dm.permission.RECEIVE", null);
    }

    public void onDestroy()
    {
        unregisterReceiver(c);
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        this;
        JVM INSTR monitorenter ;
        e = e + 1;
        if (j > f)
        {
            f = j;
        }
        this;
        JVM INSTR monitorexit ;
        if (intent == null)
        {
            a();
            return 2;
        }
        break MISSING_BLOCK_LABEL_42;
        intent;
        this;
        JVM INSTR monitorexit ;
        throw intent;
        if (!"com.google.android.gms.iid.InstanceID".equals(intent.getAction())) goto _L2; else goto _L1
_L1:
        Object obj;
        if (android.os.Build.VERSION.SDK_INT > 18)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        obj = (Intent)intent.getParcelableExtra("GSF");
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        startService(((Intent) (obj)));
        a();
        return 1;
        String s = intent.getStringExtra("subtype");
        if (s != null) goto _L4; else goto _L3
_L3:
        obj = ffr.b(this);
_L7:
        Object obj1 = intent.getStringExtra(d);
        if (intent.getStringExtra("error") == null && intent.getStringExtra("registration_id") == null) goto _L6; else goto _L5
_L5:
        if (!Log.isLoggable("InstanceID", 3));
        ffr.c().a(intent);
_L2:
        a();
        if (intent.getStringExtra("from") != null)
        {
            fdm.a(intent);
        }
        return 2;
_L4:
        obj = new Bundle();
        ((Bundle) (obj)).putString("subtype", s);
        obj = ffr.a(this, ((Bundle) (obj)));
          goto _L7
_L6:
        if (Log.isLoggable("InstanceID", 3))
        {
            (new StringBuilder("Service command ")).append(s).append(" ").append(((String) (obj1))).append(" ").append(intent.getExtras());
        }
        if (intent.getStringExtra("unregistered") == null)
        {
            break MISSING_BLOCK_LABEL_299;
        }
        obj1 = ffr.b();
        obj = s;
        if (s == null)
        {
            obj = "";
        }
        ((ffz) (obj1)).d(((String) (obj)));
        ffr.c().a(intent);
          goto _L2
label0:
        {
            if (!h.equals(intent.getStringExtra("from")))
            {
                break label0;
            }
            ffr.b().d(s);
        }
          goto _L2
label1:
        {
            if (!"RST".equals(obj1))
            {
                break label1;
            }
            ((ffr) (obj)).a();
        }
          goto _L2
label2:
        {
            if (!"RST_FULL".equals(obj1))
            {
                break label2;
            }
            if (!ffr.b().a())
            {
                ffr.b().b();
            }
        }
          goto _L2
label3:
        {
            if (!"SYNC".equals(obj1))
            {
                break label3;
            }
            ffr.b().d(s);
        }
          goto _L2
        boolean flag = "PING".equals(obj1);
        if (flag)
        {
            try
            {
                fdn.a(this).a(g, ffu.a(), intent.getExtras());
            }
            catch (IOException ioexception) { }
            finally
            {
                a();
                throw intent;
            }
        }
          goto _L2
    }

}
