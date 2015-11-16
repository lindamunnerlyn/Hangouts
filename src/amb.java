// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class amb extends BroadcastReceiver
{

    final alz a;

    amb(alz alz)
    {
        a = alz;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        if (intent.getAction().equals("com.google.gservices.intent.action.GSERVICES_CHANGED"))
        {
            (new amc(this)).execute(new Void[0]);
        }
    }
}
