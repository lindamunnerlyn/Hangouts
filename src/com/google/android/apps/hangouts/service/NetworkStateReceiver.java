// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.service;

import alw;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import ccm;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import com.google.android.apps.hangouts.requestwriter.RequestWriter;
import hgx;

public class NetworkStateReceiver extends BroadcastReceiver
{

    private static volatile boolean a = true;

    public NetworkStateReceiver()
    {
    }

    private static void a(boolean flag, Context context)
    {
        if (((alw)hgx.a(context, alw)).a("babel_gcm_change_notification", false) && flag != a)
        {
            RealTimeChatService.i();
            a = flag;
        }
    }

    public static boolean a()
    {
        return a;
    }

    public void onReceive(Context context, Intent intent)
    {
        intent = intent.getAction();
        if (!intent.equals("android.net.conn.CONNECTIVITY_CHANGE")) goto _L2; else goto _L1
_L1:
        ((ccm)hgx.a(context, ccm)).a(context, false);
_L4:
        if (intent.equals("android.intent.action.GTALK_CONNECTED") || intent.equals("com.google.android.gcm.CONNECTED"))
        {
            RequestWriter.j();
        }
        return;
_L2:
        if (intent.equals("com.google.android.gcm.CONNECTED"))
        {
            a(true, context);
        } else
        if (intent.equals("com.google.android.gcm.DISCONNECTED"))
        {
            a(false, context);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

}
