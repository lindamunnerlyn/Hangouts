// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.sms;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import dbf;

// Referenced classes of package com.google.android.apps.hangouts.sms:
//            SmsReceiver

public final class AbortSmsReceiver extends BroadcastReceiver
{

    public AbortSmsReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        if (android.os.Build.VERSION.SDK_INT < 19 && dbf.j() && !SmsReceiver.a(intent))
        {
            abortBroadcast();
        }
    }
}
