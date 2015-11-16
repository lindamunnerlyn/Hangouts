// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.SystemClock;
import com.google.android.apps.hangouts.requestwriter.RequestWriter;

public final class dlr extends BroadcastReceiver
    implements Runnable
{

    private final dtx a = new dtx();
    private long b;
    private volatile long c;
    private final RequestWriter d;
    private final hlp e;

    public dlr(hlp hlp1, RequestWriter requestwriter)
    {
        b = 0L;
        d = requestwriter;
        e = hlp1;
        c = ((amo)e.a(amo)).a("babel_retry_on_network_connectivity_ms", 0x493e0L);
        g.a(g.nU).a(this);
    }

    public void onReceive(Context context, Intent intent)
    {
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) goto _L2; else goto _L1
_L1:
        return;
_L2:
        ConnectivityManager connectivitymanager;
        int i;
        connectivitymanager = (ConnectivityManager)context.getSystemService("connectivity");
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            i = intent.getIntExtra("networkType", -1);
        } else
        {
            NetworkInfo networkinfo = (NetworkInfo)intent.getParcelableExtra("networkInfo");
            if (networkinfo != null)
            {
                i = networkinfo.getType();
            } else
            {
                i = -1;
            }
        }
        if (i != 2)
        {
            continue; /* Loop/switch isn't completed */
        }
        synchronized (dtv.a())
        {
            if (dtv.a().a > 0)
            {
                break MISSING_BLOCK_LABEL_108;
            }
            eev.e("Babel_SMS", "MmsSendReceiveManager: no sender, skip checking");
        }
        return;
        context;
        intent;
        JVM INSTR monitorexit ;
        throw context;
        intent;
        JVM INSTR monitorexit ;
        intent = connectivitymanager.getNetworkInfo(2);
        if (intent == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        String s = String.valueOf(intent);
        eev.e("Babel_SMS", (new StringBuilder(String.valueOf(s).length() + 47)).append("MmsSendReceiveManager: MMS connectivity change ").append(s).toString());
        if (!"2GVoiceCallEnded".equals(intent.getReason()))
        {
            break MISSING_BLOCK_LABEL_233;
        }
        synchronized (dtv.a())
        {
            dtv.c(context);
        }
        return;
        context;
        intent;
        JVM INSTR monitorexit ;
        try
        {
            throw context;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context = String.valueOf(context);
        }
        eev.g("Babel_SMS", (new StringBuilder(String.valueOf(context).length() + 53)).append("MmsSendReceiveManager.ConnectivityBroadcastReceiver: ").append(context).toString());
        return;
        if (intent.getState() == android.net.NetworkInfo.State.CONNECTED)
        {
            intent = dvc.a(context, intent.getExtraInfo());
            if (intent.b())
            {
                synchronized (dtv.a())
                {
                    dtv.a();
                    dty.a(true, null);
                    dtv.a().d = intent;
                }
                return;
            }
        } else
        {
            if (intent.getState() == android.net.NetworkInfo.State.DISCONNECTED && !dtv.a(connectivitymanager))
            {
                synchronized (dtv.a())
                {
                    dtv.a();
                    dty.a(false, new dtu(123, "Mobile data is disabled and can not connect MMS"));
                    dtv.a().d = null;
                }
                return;
            }
            continue; /* Loop/switch isn't completed */
        }
        continue; /* Loop/switch isn't completed */
        intent;
        context;
        JVM INSTR monitorexit ;
        throw intent;
        intent;
        context;
        JVM INSTR monitorexit ;
        throw intent;
        if (!intent.isAvailable()) goto _L1; else goto _L3
_L3:
        synchronized (dtv.a())
        {
            dtv.c(context);
        }
        return;
        context;
        intent;
        JVM INSTR monitorexit ;
        try
        {
            throw context;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context = String.valueOf(context);
        }
        eev.g("Babel_SMS", (new StringBuilder(String.valueOf(context).length() + 53)).append("MmsSendReceiveManager.ConnectivityBroadcastReceiver: ").append(context).toString());
        return;
        if (b + c >= SystemClock.elapsedRealtime()) goto _L1; else goto _L4
_L4:
        context = (NetworkInfo)intent.getParcelableExtra("networkInfo");
        if (context.isConnected())
        {
            context = String.valueOf(context.getDetailedState());
            (new StringBuilder(String.valueOf(context).length() + 43)).append("Connected Type: ").append(i).append(" detailedState: ").append(context);
            d.a(500L);
            b = SystemClock.elapsedRealtime();
            return;
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    public void run()
    {
        c = ((amo)e.a(amo)).a("babel_retry_on_network_connectivity_ms", 0x493e0L);
    }
}
