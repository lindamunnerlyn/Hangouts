// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

final class geq extends BroadcastReceiver
{

    boolean a;
    final geg b;

    geq(geg geg1)
    {
        b = geg1;
        super();
        a = true;
    }

    public void onReceive(Context context, Intent intent)
    {
        g.v();
        break MISSING_BLOCK_LABEL_3;
        if ((NetworkInfo)intent.getParcelableExtra("networkInfo") != null && geg.i(b))
        {
            context = geg.j(b).getAllNetworkInfo();
            int j = context.length;
            int i = 0;
            boolean flag = false;
            for (; i < j; i++)
            {
                intent = context[i];
                if (gne.a())
                {
                    String s = String.valueOf(intent.getTypeName());
                    boolean flag1 = intent.isConnected();
                    gne.a(2, "vclib", (new StringBuilder(String.valueOf(s).length() + 27)).append("Network: ").append(s).append(", connected? ").append(flag1).toString());
                }
                if (intent.isConnected())
                {
                    flag = true;
                }
            }

            if (flag)
            {
                a = true;
                return;
            }
            if (a)
            {
                gne.a(4, "vclib", "We lost our connection. Give it some time to recover then  terminate the call if it can't.");
                a = false;
                g.a(new ger(this), 10000L);
                return;
            }
        }
        return;
    }
}
