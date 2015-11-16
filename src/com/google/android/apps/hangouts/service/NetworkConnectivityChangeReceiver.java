// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import cdr;
import hlp;

public final class NetworkConnectivityChangeReceiver extends BroadcastReceiver
{

    public NetworkConnectivityChangeReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE"))
        {
            ((cdr)hlp.a(context, cdr)).a(context, false);
        }
    }
}
