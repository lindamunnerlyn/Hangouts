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

public final class fcu extends Service
{

    static String a = "action";
    private static String f = "google.com/iid";
    private static String g = "CMD";
    private static String h = "gcm.googleapis.com/refresh";
    MessengerCompat b;
    BroadcastReceiver c;
    int d;
    int e;

    private void a()
    {
        this;
        JVM INSTR monitorenter ;
        d = d - 1;
        if (d == 0)
        {
            stopSelf(e);
        }
        if (Log.isLoggable("InstanceID", 3))
        {
            (new StringBuilder("Stop ")).append(d).append(" ").append(e);
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

    static void a(Context context)
    {
        Intent intent = new Intent("com.google.android.gms.iid.InstanceID");
        intent.setPackage(context.getPackageName());
        intent.putExtra(g, "SYNC");
        context.startService(intent);
    }

    static void a(Context context, fdb fdb1)
    {
        fdb1.b();
        fdb1 = new Intent("com.google.android.gms.iid.InstanceID");
        fdb1.putExtra(g, "RST");
        fdb1.setPackage(context.getPackageName());
        context.startService(fdb1);
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
        d = d + 1;
        if (j > e)
        {
            e = j;
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
        obj = fct.b(this);
_L7:
        Object obj1 = intent.getStringExtra(g);
        if (intent.getStringExtra("error") == null && intent.getStringExtra("registration_id") == null) goto _L6; else goto _L5
_L5:
        if (!Log.isLoggable("InstanceID", 3));
        fct.c().b(intent);
_L2:
        a();
        if (intent.getStringExtra("from") != null)
        {
            fao.a(intent);
        }
        return 2;
_L4:
        obj = new Bundle();
        ((Bundle) (obj)).putString("subtype", s);
        obj = fct.a(this, ((Bundle) (obj)));
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
        obj1 = fct.b();
        obj = s;
        if (s == null)
        {
            obj = "";
        }
        ((fdb) (obj1)).d(((String) (obj)));
        fct.c().b(intent);
          goto _L2
label0:
        {
            if (!h.equals(intent.getStringExtra("from")))
            {
                break label0;
            }
            fct.b().d(s);
        }
          goto _L2
label1:
        {
            if (!"RST".equals(obj1))
            {
                break label1;
            }
            ((fct) (obj)).a();
        }
          goto _L2
label2:
        {
            if (!"RST_FULL".equals(obj1))
            {
                break label2;
            }
            if (!fct.b().a())
            {
                fct.b().b();
            }
        }
          goto _L2
label3:
        {
            if (!"SYNC".equals(obj1))
            {
                break label3;
            }
            fct.b().d(s);
        }
          goto _L2
        boolean flag = "PING".equals(obj1);
        if (flag)
        {
            try
            {
                fap.a(this).a(f, fcw.a(), intent.getExtras());
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
