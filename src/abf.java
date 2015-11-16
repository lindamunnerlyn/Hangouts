// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

final class abf extends BroadcastReceiver
{

    final abe a;

    abf(abe abe1)
    {
        a = abe1;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        context = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (context == null || !context.isConnected())
        {
            a.as = false;
        } else
        if (!a.as && !a.t())
        {
            if (!a.ar)
            {
                a.getLoaderManager().b(2, null, a);
            }
            a.getLoaderManager().b(3, null, a);
            a.as = true;
            a.ak.a(0);
            return;
        }
    }
}
