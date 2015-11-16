// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.hangout;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import gdv;

public class  extends BroadcastReceiver
    implements Runnable
{

    public void onReceive(Context context, Intent intent)
    {
        gdv.a(intent.getAction(), "com.google.android.libraries.hangouts.video.ACTION_NATIVE_CRASH");
        (new Handler()).postDelayed(this, 1000L);
    }

    public void run()
    {
        throw new RuntimeException("Native crash");
    }

    public ()
    {
    }
}
