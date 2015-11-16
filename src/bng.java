// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;

final class bng extends BroadcastReceiver
{

    final bne a;

    bng(bne bne1)
    {
        a = bne1;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        if (bne.a(a) != null)
        {
            if ("android.intent.action.BATTERY_LOW".equals(intent.getAction()))
            {
                bne.a(a).a(bnf.a);
                return;
            }
            if ("android.intent.action.BATTERY_OKAY".equals(intent.getAction()))
            {
                bne.a(a).a(bnf.b);
                return;
            }
            if (android.os.Build.VERSION.SDK_INT >= 21 && "android.os.action.POWER_SAVE_MODE_CHANGED".equals(intent.getAction()))
            {
                if (((PowerManager)context.getSystemService("power")).isPowerSaveMode())
                {
                    bne.a(a).a(bnf.c);
                    return;
                } else
                {
                    bne.a(a).a(bnf.d);
                    return;
                }
            }
        }
    }
}
