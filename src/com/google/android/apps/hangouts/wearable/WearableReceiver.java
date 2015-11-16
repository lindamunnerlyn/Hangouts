// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.wearable;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import cec;

// Referenced classes of package com.google.android.apps.hangouts.wearable:
//            WearableService

public class WearableReceiver extends BroadcastReceiver
{

    public WearableReceiver()
    {
    }

    boolean a(Context context)
    {
        return cec.a(context);
    }

    public void onReceive(Context context, Intent intent)
    {
        if (!a(context)) goto _L2; else goto _L1
_L1:
        String s;
        byte byte0;
        s = intent.getAction();
        byte0 = -1;
        s.hashCode();
        JVM INSTR tableswitch 1232336056 1232336056: default 40
    //                   1232336056 61;
           goto _L3 _L4
_L3:
        byte0;
        JVM INSTR tableswitch 0 0: default 60
    //                   0 76;
           goto _L2 _L5
_L2:
        return;
_L4:
        if (s.equals("com.google.android.apps.hangouts.intent.action.ACTION_NOTIFY_DATASET_CHANGED"))
        {
            byte0 = 0;
        }
          goto _L3
_L5:
        Intent intent1 = new Intent(context, com/google/android/apps/hangouts/wearable/WearableService);
        intent1.setAction(intent.getAction());
        intent1.putExtras(intent);
        context.startService(intent1);
        return;
    }
}
