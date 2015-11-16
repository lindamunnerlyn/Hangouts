// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.service;

import alw;
import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.text.TextUtils;
import ccl;
import ccm;
import ebw;
import hgx;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class NetworkConnectionCheckingService extends IntentService
{

    private static final boolean a = false;

    public NetworkConnectionCheckingService()
    {
        super(com/google/android/apps/hangouts/service/NetworkConnectionCheckingService.getName());
    }

    private static boolean a(Context context)
    {
        Object obj;
        Object obj1;
        Object obj2;
        obj2 = null;
        obj1 = null;
        obj = obj2;
        context = (alw)hgx.a(context, alw);
        obj = obj2;
        String s = context.a("babel_captive_portal_detection_host_name", "http://clients3.google.com/generate_204");
        obj = obj2;
        int i = context.a("babel_captive_portal_detection_time_out", 5000);
        obj = obj2;
        context = (HttpURLConnection)(new URL(s)).openConnection();
        context.setConnectTimeout(i);
        context.setReadTimeout(i);
        context.setUseCaches(false);
        context.setInstanceFollowRedirects(true);
        context.getInputStream();
        i = context.getResponseCode();
        if (i != 204)
        {
            if (context != null)
            {
                context.disconnect();
            }
            return true;
        }
        if (context != null)
        {
            context.disconnect();
        }
_L1:
        return false;
        obj;
        context = null;
_L5:
        ebw.d("Babel_NetworkConnectionCheckingService", "unexpected exception ", ((Throwable) (obj)));
        if (context != null)
        {
            context.disconnect();
        }
          goto _L1
        obj;
        context = ((Context) (obj1));
        obj1 = obj;
_L4:
        obj = context;
        ebw.d("Babel_NetworkConnectionCheckingService", "IO exceptions, probably not a captive portal ", ((Throwable) (obj1)));
        if (context != null)
        {
            context.disconnect();
        }
          goto _L1
        context;
_L3:
        if (obj != null)
        {
            ((HttpURLConnection) (obj)).disconnect();
        }
        throw context;
        obj1;
        obj = context;
        context = ((Context) (obj1));
        continue; /* Loop/switch isn't completed */
        obj1;
        obj = context;
        context = ((Context) (obj1));
        if (true) goto _L3; else goto _L2
_L2:
        obj1;
          goto _L4
        obj;
          goto _L5
    }

    protected void onHandleIntent(Intent intent)
    {
        ccm ccm1;
        String s;
        ccl ccl1;
        if (a)
        {
            ebw.b("Babel_NetworkConnectionCheckingService", "NetworkConnectionCheckingService onHandleIntent");
        }
        intent = intent.getExtras();
        s = intent.getString("update_type", null);
        ccm1 = (ccm)hgx.a(getApplicationContext(), ccm);
        ccl1 = ccm1.a();
        if (!TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!"initialize_connection_state".equals(s))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (ccl1 == ccl.a)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!a) goto _L1; else goto _L3
_L3:
        intent = String.valueOf(ccl1);
        ebw.b("Babel_NetworkConnectionCheckingService", (new StringBuilder(String.valueOf(intent).length() + 38)).append("connection state already initialized: ").append(intent).toString());
        return;
        if ("verify_connection_state".equals(s) && ccl1.a() == intent.getBoolean("expected_connectivity")) goto _L1; else goto _L4
_L4:
        intent = getApplicationContext();
        NetworkInfo networkinfo = ((ConnectivityManager)intent.getSystemService("connectivity")).getActiveNetworkInfo();
        if (networkinfo == null)
        {
            intent = ccl.b;
        } else
        if (!networkinfo.isConnected())
        {
            intent = ccl.b;
        } else
        if (a(intent))
        {
            intent = ccl.c;
        } else
        {
            intent = ccl.d;
        }
        ccm1.a(intent);
        return;
    }

    static 
    {
        hik hik = ebw.p;
    }
}
