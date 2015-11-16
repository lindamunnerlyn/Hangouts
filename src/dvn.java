// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class dvn extends dgp
{

    final dtq a;
    private dvp b;
    private final int c;
    private final String d;
    private final String e;
    private String f;
    private int g;
    private final Handler h = new Handler();
    private final Runnable i = new dvo(this);

    public dvn(int j, String s, String s1, dvp dvp1, dtq dtq1)
    {
        c = j;
        d = s;
        e = s1;
        b = dvp1;
        a = dtq1;
    }

    public void a(int j, ani ani, dgu dgu1)
    {
        if (g != 0 && g == j)
        {
            a.a(new int[] {
                202
            });
            ani = dgu1.c();
            if (((cvn) (ani)).c.b == 1)
            {
                ani = ((cwa)ani).k();
                if (ani != null)
                {
                    f = ani.a();
                }
            }
            a(false);
        }
    }

    public void a(int j, ani ani, dko dko, dbo dbo)
    {
        if (g != 0 && g == j)
        {
            a.a(new int[] {
                203
            });
            ani = String.valueOf(dbo);
            ebw.e("Babel_telephony", (new StringBuilder(String.valueOf(ani).length() + 50)).append("TeleProxyNumberHelper, internal error, exception: ").append(ani).toString());
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
            ebw.e("Babel_telephony", "TeleProxyNumberHelper, invalid response.");
            a(false);
            return;
        } else
        {
            int j = g.a(g.nS, "babel_wifi_call_get_proxy_number_request_timeout", 5000);
            h.postDelayed(i, j);
            RealTimeChatService.a(this);
            return;
        }
    }

    public void e()
    {
        ebw.e("Babel_telephony", "TeleProxyNumberHelper, request cancelled.");
        b = null;
        a(false);
    }
}
