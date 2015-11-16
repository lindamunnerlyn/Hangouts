// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.wearable;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import ccx;

// Referenced classes of package com.google.android.apps.hangouts.wearable:
//            WearableService

public class WearableReceiver extends BroadcastReceiver
{

    public WearableReceiver()
    {
    }

    boolean a(Context context)
    {
        return ccx.a(context);
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
        JVM INSTR lookupswitch 3: default 56
    //                   798292259: 100
    //                   1232336056: 85
    //                   1737074039: 115;
           goto _L3 _L4 _L5 _L6
_L3:
        byte0;
        JVM INSTR tableswitch 0 2: default 84
    //                   0 130
    //                   1 130
    //                   2 130;
           goto _L2 _L7 _L7 _L7
_L2:
        return;
_L5:
        if (s.equals("com.google.android.apps.hangouts.intent.action.ACTION_NOTIFY_DATASET_CHANGED"))
        {
            byte0 = 0;
        }
          goto _L3
_L4:
        if (s.equals("android.intent.action.BOOT_COMPLETED"))
        {
            byte0 = 1;
        }
          goto _L3
_L6:
        if (s.equals("android.intent.action.MY_PACKAGE_REPLACED"))
        {
            byte0 = 2;
        }
          goto _L3
_L7:
        Intent intent1 = new Intent(context, com/google/android/apps/hangouts/wearable/WearableService);
        intent1.setAction(intent.getAction());
        intent1.putExtras(intent);
        context.startService(intent1);
        return;
    }
}
