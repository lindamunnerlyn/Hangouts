// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class dyw extends dhy
{

    final dwy a;
    private dyy b;
    private final int c;
    private final String d;
    private final String e;
    private String f;
    private int g;
    private final Handler h = new Handler();
    private final Runnable i = new dyx(this);

    public dyw(int j, String s, String s1, dyy dyy1, dwy dwy1)
    {
        c = j;
        d = s;
        e = s1;
        b = dyy1;
        a = dwy1;
    }

    public void a(int j, aoa aoa, did did1)
    {
        if (g != 0 && g == j)
        {
            a.a(new int[] {
                202
            });
            aoa = did1.c();
            if (((cxr) (aoa)).c.b == 1)
            {
                aoa = ((cye)aoa).k();
                if (aoa != null)
                {
                    f = aoa.a();
                }
            }
            a(false);
        }
    }

    public void a(int j, aoa aoa, dmf dmf, dcx dcx)
    {
        if (g != 0 && g == j)
        {
            a.a(new int[] {
                203
            });
            aoa = String.valueOf(dcx);
            eev.e("Babel_telephony", (new StringBuilder(String.valueOf(aoa).length() + 50)).append("TeleProxyNumberHelper, internal error, exception: ").append(aoa).toString());
            a(false);
        }
    }

    void a(boolean flag)
    {
label0:
        {
            if (!flag)
            {
                RealTimeChatService.b(this);
                g = 0;
            }
            h.removeCallbacks(i);
            if (b != null)
            {
                if (f == null)
                {
                    break label0;
                }
                b.a(f);
            }
            return;
        }
        b.a();
    }

    public void d()
    {
        a.a(new int[] {
            201
        });
        g = RealTimeChatService.c(c, d, e);
        if (g == 0)
        {
            eev.e("Babel_telephony", "TeleProxyNumberHelper, invalid response.");
            a(false);
            return;
        } else
        {
            int j = g.a(g.nU, "babel_wifi_call_get_proxy_number_request_timeout", 5000);
            h.postDelayed(i, j);
            RealTimeChatService.a(this);
            return;
        }
    }

    public void e()
    {
        eev.e("Babel_telephony", "TeleProxyNumberHelper, request cancelled.");
        b = null;
        a(false);
    }
}
