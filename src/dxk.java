// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class dxk extends BroadcastReceiver
{

    private final dxh a;

    dxk(dxh dxh1)
    {
        a = dxh1;
    }

    public void onReceive(Context context, Intent intent)
    {
        context = String.valueOf(this);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(context).length() + 34)).append("HandoffBroadcastReceiver.onReceive").append(context).toString());
        if (dxh.b(a) != null && dxh.b(a).a() == a)
        {
            dxh.c(a);
        }
    }
}
