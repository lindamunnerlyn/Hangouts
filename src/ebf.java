// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Handler;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class ebf extends dhy
{

    private final Context a;
    private ebh b;
    private final int c;
    private int d;
    private final Handler e = new Handler();
    private final Runnable f = new ebg(this);

    public ebf(Context context, int i, ebh ebh1)
    {
        d = -1;
        a = context;
        c = i;
        b = ebh1;
    }

    public void a(int i, aoa aoa, did did1)
    {
        boolean flag = true;
        if (d == i)
        {
            if (did1.c().c.b != 1)
            {
                flag = false;
            }
            a(flag);
        }
    }

    public void a(int i, aoa aoa, dmf dmf, dcx dcx)
    {
        if (d == i)
        {
            a(false);
        }
    }

    void a(boolean flag)
    {
label0:
        {
            RealTimeChatService.b(this);
            e.removeCallbacks(f);
            if (b != null)
            {
                if (!flag)
                {
                    break label0;
                }
                b.a();
            }
            return;
        }
        b.b();
    }

    public void d()
    {
        d = RealTimeChatService.f(c);
        if (d < 0)
        {
            a(false);
            return;
        } else
        {
            int i = g.a(a, "babel_wifi_call_enable_voice_calling_request_timeout", 20000);
            e.postDelayed(f, i);
            RealTimeChatService.a(this);
            return;
        }
    }

    public void e()
    {
        b = null;
        a(false);
    }
}
