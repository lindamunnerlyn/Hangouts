// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

final class gcc extends BroadcastReceiver
{

    final gbs a;
    private boolean b;

    gcc(gbs gbs1)
    {
        a = gbs1;
        super();
        b = true;
    }

    static boolean a(gcc gcc1)
    {
        return gcc1.b;
    }

    public void onReceive(Context context, Intent intent)
    {
        g.w();
        break MISSING_BLOCK_LABEL_3;
        if ((NetworkInfo)intent.getParcelableExtra("networkInfo") != null && gbs.i(a))
        {
            context = gbs.j(a).getAllNetworkInfo();
            int j = context.length;
            int i = 0;
            boolean flag = false;
            for (; i < j; i++)
            {
                intent = context[i];
                if (gkc.b())
                {
                    String s = String.valueOf(intent.getTypeName());
                    boolean flag1 = intent.isConnected();
                    gkc.a("vclib", (new StringBuilder(String.valueOf(s).length() + 27)).append("Network: ").append(s).append(", connected? ").append(flag1).toString());
                }
                if (intent.isConnected())
                {
                    flag = true;
                }
            }

            if (flag)
            {
                b = true;
                return;
            }
            if (b)
            {
                gkc.c("vclib", "We lost our connection. Give it some time to recover then  terminate the call if it can't.");
                b = false;
                g.a(new gcd(this), 10000L);
                return;
            }
        }
        return;
    }
}
