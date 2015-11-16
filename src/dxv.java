// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Handler;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class dxv extends dgp
{

    private final Context a;
    private dxx b;
    private final int c;
    private int d;
    private final Handler e = new Handler();
    private final Runnable f = new dxw(this);

    public dxv(Context context, int i, dxx dxx1)
    {
        d = -1;
        a = context;
        c = i;
        b = dxx1;
    }

    public void a(int i, ani ani, dgu dgu1)
    {
        boolean flag = true;
        if (d == i)
        {
            if (dgu1.c().c.b != 1)
            {
                flag = false;
            }
            a(flag);
        }
    }

    public void a(int i, ani ani, dko dko, dbo dbo)
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
