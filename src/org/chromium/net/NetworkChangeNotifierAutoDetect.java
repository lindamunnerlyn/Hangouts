// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import gap;
import lmw;
import lmx;
import lmy;
import lmz;
import org.chromium.base.ApplicationStatus;

// Referenced classes of package org.chromium.net:
//            NetworkChangeNotifier

public class NetworkChangeNotifierAutoDetect extends BroadcastReceiver
    implements gap
{

    private final lmx a;
    private final Observer b;
    private final Context c;
    private lmw d;
    private lmz e;
    private boolean f;
    private final boolean g;
    private int h;
    private String i;
    private double j;

    public NetworkChangeNotifierAutoDetect(Observer observer, Context context, boolean flag)
    {
        b = observer;
        c = context.getApplicationContext();
        d = new lmw(context);
        e = new lmz(context);
        observer = d.a();
        h = a(observer);
        i = c(observer);
        j = b(observer);
        a = new lmx(e.c());
        if (flag)
        {
            e();
            g = false;
            return;
        } else
        {
            ApplicationStatus.a(this);
            a(b());
            g = true;
            return;
        }
    }

    private String c(lmy lmy1)
    {
        if (a(lmy1) != 2)
        {
            return "";
        } else
        {
            return e.a();
        }
    }

    private void d(lmy lmy1)
    {
        int k = a(lmy1);
        lmy1 = c(lmy1);
        if (k == h && lmy1.equals(i))
        {
            return;
        } else
        {
            h = k;
            i = lmy1;
            (new StringBuilder("Network connectivity changed, type is: ")).append(h);
            b.a(k);
            return;
        }
    }

    private void e()
    {
        if (!f)
        {
            f = true;
            c.registerReceiver(this, a);
        }
    }

    private void e(lmy lmy1)
    {
        double d1 = b(lmy1);
        if (d1 == j)
        {
            return;
        } else
        {
            j = d1;
            b.a(d1);
            return;
        }
    }

    private void f()
    {
        if (f)
        {
            f = false;
            c.unregisterReceiver(this);
        }
    }

    public int a(lmy lmy1)
    {
        byte byte1 = 5;
        if (lmy1.a()) goto _L2; else goto _L1
_L1:
        byte byte0 = 6;
_L4:
        return byte0;
_L2:
        byte0 = byte1;
        switch (lmy1.b())
        {
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 8: // '\b'
        default:
            return 0;

        case 6: // '\006'
            continue; /* Loop/switch isn't completed */

        case 9: // '\t'
            return 1;

        case 1: // '\001'
            return 2;

        case 7: // '\007'
            return 7;

        case 0: // '\0'
            byte0 = byte1;
            break;
        }
        switch (lmy1.c())
        {
        default:
            return 0;

        case 1: // '\001'
        case 2: // '\002'
        case 4: // '\004'
        case 7: // '\007'
        case 11: // '\013'
            return 3;

        case 3: // '\003'
        case 5: // '\005'
        case 6: // '\006'
        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
        case 12: // '\f'
        case 14: // '\016'
        case 15: // '\017'
            return 4;

        case 13: // '\r'
            break;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void a(int k)
    {
        lmy lmy1 = d();
        if (k == 1)
        {
            d(lmy1);
            e(lmy1);
            e();
        } else
        if (k == 2)
        {
            f();
            return;
        }
    }

    public double b(lmy lmy1)
    {
        byte byte1;
        byte1 = 30;
        if (a(lmy1) == 2)
        {
            int k = e.b();
            if (k != -1)
            {
                return (double)k;
            }
        }
        if (lmy1.a()) goto _L2; else goto _L1
_L1:
        byte byte0 = 31;
_L4:
        return NetworkChangeNotifier.a(byte0);
_L2:
        byte0 = byte1;
        switch (lmy1.b())
        {
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 8: // '\b'
        default:
            byte0 = byte1;
            continue; /* Loop/switch isn't completed */

        case 1: // '\001'
        case 6: // '\006'
        case 7: // '\007'
        case 9: // '\t'
            break;

        case 0: // '\0'
            switch (lmy1.c())
            {
            default:
                byte0 = byte1;
                break;

            case 1: // '\001'
                byte0 = 4;
                break;

            case 2: // '\002'
                byte0 = 5;
                break;

            case 4: // '\004'
                byte0 = 2;
                break;

            case 7: // '\007'
                byte0 = 3;
                break;

            case 11: // '\013'
                byte0 = 1;
                break;

            case 3: // '\003'
                byte0 = 6;
                break;

            case 5: // '\005'
                byte0 = 7;
                break;

            case 6: // '\006'
                byte0 = 8;
                break;

            case 8: // '\b'
                byte0 = 11;
                break;

            case 9: // '\t'
                byte0 = 12;
                break;

            case 10: // '\n'
                byte0 = 9;
                break;

            case 12: // '\f'
                byte0 = 10;
                break;

            case 14: // '\016'
                byte0 = 13;
                break;

            case 15: // '\017'
                byte0 = 14;
                break;

            case 13: // '\r'
                byte0 = 15;
                break;
            }
            break;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    int b()
    {
        return ApplicationStatus.c();
    }

    public void c()
    {
        if (g)
        {
            ApplicationStatus.b(this);
        }
        f();
    }

    public lmy d()
    {
        return d.a();
    }

    public void onReceive(Context context, Intent intent)
    {
        context = d();
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()))
        {
            d(context);
            e(context);
        } else
        if ("android.net.wifi.RSSI_CHANGED".equals(intent.getAction()))
        {
            e(context);
            return;
        }
    }

    private class Observer
    {

        public abstract void a(double d1);

        public abstract void a(int k);
    }

}
