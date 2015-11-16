// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.notifications;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import cec;
import eev;

public class CompanionReplacedReceiver extends BroadcastReceiver
{

    private static final boolean a = false;

    public CompanionReplacedReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        if (a)
        {
            context = String.valueOf(intent);
            eev.b("Babel", (new StringBuilder(String.valueOf(context).length() + 26)).append("CompanionReplacedReceiver ").append(context).toString());
        }
        context = intent.getData().getSchemeSpecificPart();
        if ("com.google.android.wearable.app".equals(context) || "com.google.android.projection.gearhead".equals(context))
        {
            cec.a = false;
            cec.b = false;
        }
    }

    static 
    {
        hnc hnc = eev.j;
    }
}
