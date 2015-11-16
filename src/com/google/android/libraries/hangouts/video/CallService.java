// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.hangouts.video;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.IBinder;
import fwz;
import gbn;
import gce;
import gco;
import ges;
import get;
import gfd;
import gkc;
import java.io.FileDescriptor;
import java.io.PrintWriter;

// Referenced classes of package com.google.android.libraries.hangouts.video:
//            DecoderManager, EncoderManager

public class CallService extends Service
{

    private final gco a = new gco();
    private final gce b = new gce(this);
    private int c;
    private Context d;
    private gbn e;

    public CallService()
    {
        c = 0;
    }

    public static long a(Context context)
    {
        int i;
        try
        {
            i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new RuntimeException(context);
        }
        return (long)i;
    }

    public static gbn a(CallService callservice, gbn gbn1)
    {
        callservice.e = gbn1;
        return gbn1;
    }

    public static gco a(CallService callservice)
    {
        return callservice.a;
    }

    public static gbn b(CallService callservice)
    {
        return callservice.e;
    }

    public static String b(Context context)
    {
        return fwz.a(context.getContentResolver(), "babel_hangout_apiary_path", "https://www.googleapis.com/hangouts/v1android/");
    }

    public static Context c(CallService callservice)
    {
        return callservice.d;
    }

    public static int d(CallService callservice)
    {
        return callservice.c;
    }

    public gce a()
    {
        c = c + 1;
        int i = c;
        gkc.b("vclib", (new StringBuilder(37)).append("CallService clientCount = ").append(i).toString());
        return b;
    }

    protected void dump(FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        gfd.a().a(printwriter);
    }

    public IBinder onBind(Intent intent)
    {
        return a();
    }

    public void onCreate()
    {
        super.onCreate();
        d = getApplicationContext();
        if (a.a(d))
        {
            long l = a(d);
            int i = DecoderManager.a(d);
            int j = EncoderManager.a(d);
            String s = String.valueOf(d.getCacheDir());
            ges.a(new get("andr_babel", l, i, j, (new StringBuilder(String.valueOf(s).length() + 14)).append(s).append("/raw_call_logs").toString(), fwz.a(d.getContentResolver(), "babel_hangout_check_connectivity", 1), b(d)));
            return;
        } else
        {
            gkc.e("vclib", "Hangouts not supported by this device");
            return;
        }
    }

    public void onDestroy()
    {
        gkc.c("vclib", "CallService onDestroy");
        if (e != null)
        {
            e.a(30);
        }
        super.onDestroy();
    }

    public boolean onUnbind(Intent intent)
    {
        c = c - 1;
        int i = c;
        gkc.b("vclib", (new StringBuilder(37)).append("CallService clientCount = ").append(i).toString());
        if (c == 0)
        {
            if (e == null)
            {
                stopSelf();
            } else
            if (!e.a())
            {
                e.a(30);
                stopSelf();
            } else
            {
                gkc.c("vclib", "No clients are connected, but a call is active; not stopping");
            }
        }
        return false;
    }
}
