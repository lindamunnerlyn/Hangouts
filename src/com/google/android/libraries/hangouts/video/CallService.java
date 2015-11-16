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
import fzd;
import geb;
import ges;
import gfg;
import ghs;
import ght;
import gic;
import gne;
import java.io.FileDescriptor;
import java.io.PrintWriter;

// Referenced classes of package com.google.android.libraries.hangouts.video:
//            DecoderManager, EncoderManager

public class CallService extends Service
{

    public final gfg a = new gfg();
    public int b;
    public Context c;
    public geb d;
    private final ges e = new ges(this);

    public CallService()
    {
        b = 0;
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

    public static String b(Context context)
    {
        return fzd.a(context.getContentResolver(), "babel_hangout_apiary_path", "https://www.googleapis.com/hangouts/v1android/");
    }

    public ges a()
    {
        b = b + 1;
        int i = b;
        gne.a(3, "vclib", (new StringBuilder(37)).append("CallService clientCount = ").append(i).toString());
        return e;
    }

    protected void dump(FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        gic.a().a(printwriter);
    }

    public IBinder onBind(Intent intent)
    {
        return a();
    }

    public void onCreate()
    {
        super.onCreate();
        c = getApplicationContext();
        stopForeground(true);
        if (a.a(c))
        {
            long l = a(c);
            int i = DecoderManager.a(c);
            int j = EncoderManager.a(c);
            String s = String.valueOf(c.getCacheDir());
            ghs.a(new ght(l, i, j, (new StringBuilder(String.valueOf(s).length() + 14)).append(s).append("/raw_call_logs").toString(), fzd.a(c.getContentResolver(), "babel_hangout_check_connectivity", 1), b(c)));
            return;
        } else
        {
            gne.a(6, "vclib", "Hangouts not supported by this device");
            return;
        }
    }

    public void onDestroy()
    {
        gne.a(4, "vclib", "CallService onDestroy");
        if (d != null)
        {
            d.a(30);
        }
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        onStart(intent, j);
        return 2;
    }

    public boolean onUnbind(Intent intent)
    {
        b = b - 1;
        int i = b;
        gne.a(3, "vclib", (new StringBuilder(37)).append("CallService clientCount = ").append(i).toString());
        if (b == 0)
        {
            if (d == null)
            {
                stopSelf();
            } else
            if (!d.c())
            {
                d.a(30);
                stopSelf();
            } else
            {
                gne.a(4, "vclib", "No clients are connected, but a call is active; not stopping");
            }
        }
        return false;
    }
}
