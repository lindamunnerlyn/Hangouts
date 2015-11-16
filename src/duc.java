// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class duc extends BroadcastReceiver
{

    private final dtz a;

    duc(dtz dtz1)
    {
        a = dtz1;
    }

    public void onReceive(Context context, Intent intent)
    {
        ebw.e("Babel_telephony", "HandoffBroadcastReceiver.onReceive");
        if (dtz.b(a) != null && dtz.b(a).a() == a)
        {
            dtz.c(a);
        }
    }
}
