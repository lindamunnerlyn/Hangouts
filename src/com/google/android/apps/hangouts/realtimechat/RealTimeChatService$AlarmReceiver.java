// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.realtimechat;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import eev;

// Referenced classes of package com.google.android.apps.hangouts.realtimechat:
//            RealTimeChatService

public class  extends BroadcastReceiver
{

    public void onReceive(Context context, Intent intent)
    {
        if (RealTimeChatService.l())
        {
            context = String.valueOf(intent);
            String s = String.valueOf(intent.getAction());
            String s1 = String.valueOf(RealTimeChatService.g(intent.getIntExtra("op", 0)));
            eev.b("Babel", (new StringBuilder(String.valueOf(context).length() + 34 + String.valueOf(s).length() + String.valueOf(s1).length())).append("AlarmReceiver.onReceive ").append(context).append(" ").append(s).append(" opcode: ").append(s1).toString());
        }
        RealTimeChatService.e(intent);
    }

    public ()
    {
    }
}
