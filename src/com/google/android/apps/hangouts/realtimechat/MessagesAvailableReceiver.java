// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.realtimechat;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import fd;

// Referenced classes of package com.google.android.apps.hangouts.realtimechat:
//            GcmIntentService

public class MessagesAvailableReceiver extends fd
{

    public MessagesAvailableReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        intent.putExtra("timestamp", SystemClock.elapsedRealtime() * 1000L);
        intent.setClass(context, com/google/android/apps/hangouts/realtimechat/GcmIntentService);
        a(context, intent);
        setResultCode(-1);
    }
}
