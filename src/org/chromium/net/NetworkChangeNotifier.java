// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import llp;
import lmv;

// Referenced classes of package org.chromium.net:
//            NetworkChangeNotifierAutoDetect

public class NetworkChangeNotifier
{

    static NetworkChangeNotifier a;
    private final Context b;
    private final ArrayList c = new ArrayList();
    private final llp d = new llp();
    private NetworkChangeNotifierAutoDetect e;
    private int f;
    private double g;

    private NetworkChangeNotifier(Context context)
    {
        f = 0;
        g = (1.0D / 0.0D);
        b = context.getApplicationContext();
    }

    public static double a(int i)
    {
        return nativeGetMaxBandwidthForConnectionSubtype(i);
    }

    public static void forceConnectivityState(boolean flag)
    {
        int i = 0;
        a.a(false, false);
        NetworkChangeNotifier networkchangenotifier = a;
        boolean flag1;
        if (networkchangenotifier.f != 6)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1 != flag)
        {
            double d1;
            if (!flag)
            {
                i = 6;
            }
            networkchangenotifier.b(i);
            if (flag)
            {
                d1 = (1.0D / 0.0D);
            } else
            {
                d1 = 0.0D;
            }
            networkchangenotifier.a(d1);
        }
    }

    public static NetworkChangeNotifier init(Context context)
    {
        if (a == null)
        {
            a = new NetworkChangeNotifier(context);
        }
        return a;
    }

    private static native double nativeGetMaxBandwidthForConnectionSubtype(int i);

    private native void nativeNotifyConnectionTypeChanged(long l, int i);

    private native void nativeNotifyMaxBandwidthChanged(long l, double d1);

    public void a(double d1)
    {
        if (d1 == g)
        {
            return;
        } else
        {
            g = d1;
            b(d1);
            return;
        }
    }

    void a(boolean flag, boolean flag1)
    {
        if (flag)
        {
            if (e == null)
            {
                e = new NetworkChangeNotifierAutoDetect(new lmv(this), b, flag1);
                lmy lmy = e.d();
                b(e.a(lmy));
                a(e.b(lmy));
            }
        } else
        if (e != null)
        {
            e.c();
            e = null;
            return;
        }
    }

    public void addNativeObserver(long l)
    {
        c.add(Long.valueOf(l));
    }

    void b(double d1)
    {
        for (Iterator iterator = c.iterator(); iterator.hasNext(); nativeNotifyMaxBandwidthChanged(((Long)iterator.next()).longValue(), d1)) { }
    }

    public void b(int i)
    {
        f = i;
        c(i);
    }

    void c(int i)
    {
        for (Iterator iterator = c.iterator(); iterator.hasNext(); nativeNotifyConnectionTypeChanged(((Long)iterator.next()).longValue(), i)) { }
        for (Iterator iterator1 = d.iterator(); iterator1.hasNext(); iterator1.next()) { }
    }

    public int getCurrentConnectionType()
    {
        return f;
    }

    public double getCurrentMaxBandwidthInMbps()
    {
        return g;
    }

    public void removeNativeObserver(long l)
    {
        c.remove(Long.valueOf(l));
    }
}
