// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import android.content.Context;
import android.content.IntentFilter;
import lna;
import lnb;

public class ProxyChangeListener
{

    private static boolean a = true;
    private long b;
    private Context c;
    private lnb d;

    private ProxyChangeListener(Context context)
    {
        c = context;
    }

    public static void a(ProxyChangeListener proxychangelistener, lna lna1)
    {
label0:
        {
            if (a && proxychangelistener.b != 0L)
            {
                if (lna1 == null)
                {
                    break label0;
                }
                proxychangelistener.nativeProxySettingsChangedTo(proxychangelistener.b, lna1.a, lna1.b, lna1.c, lna1.d);
            }
            return;
        }
        proxychangelistener.nativeProxySettingsChanged(proxychangelistener.b);
    }

    public static ProxyChangeListener create(Context context)
    {
        return new ProxyChangeListener(context);
    }

    public static String getProperty(String s)
    {
        return System.getProperty(s);
    }

    private native void nativeProxySettingsChanged(long l);

    private native void nativeProxySettingsChangedTo(long l, String s, int i, String s1, String as[]);

    public void start(long l)
    {
        b = l;
        if (d == null)
        {
            IntentFilter intentfilter = new IntentFilter();
            intentfilter.addAction("android.intent.action.PROXY_CHANGE");
            d = new lnb(this);
            c.getApplicationContext().registerReceiver(d, intentfilter);
        }
    }

    public void stop()
    {
        b = 0L;
        if (d != null)
        {
            c.unregisterReceiver(d);
            d = null;
        }
    }

}
