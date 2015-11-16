// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class amt extends BroadcastReceiver
{

    final amr a;

    amt(amr amr)
    {
        a = amr;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        if (intent.getAction().equals("com.google.gservices.intent.action.GSERVICES_CHANGED"))
        {
            (new amu(this)).execute(new Void[0]);
        }
    }
}
