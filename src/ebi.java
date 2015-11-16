// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Handler;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class ebi extends dhy
{

    private ebk a;
    private final int b;
    private int c;
    private final Handler d = new Handler();
    private final Runnable e = new ebj(this);

    public ebi(int i, ebk ebk1)
    {
        c = -1;
        b = i;
        a = ebk1;
    }

    public void a(int i, aoa aoa, did did1)
    {
        boolean flag = true;
        if (c == i)
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
        if (c == i)
        {
            a(false);
        }
    }

    public void a(Context context)
    {
        c = RealTimeChatService.e(b);
        if (c < 0)
        {
            a(false);
            return;
        } else
        {
            int i = g.a(context, "babel_wifi_call_get_voice_account_info_request_timeout", 20000);
            d.postDelayed(e, i);
            RealTimeChatService.a(this);
            return;
        }
    }

    void a(boolean flag)
    {
label0:
        {
            RealTimeChatService.b(this);
            d.removeCallbacks(e);
            if (a != null)
            {
                if (!flag)
                {
                    break label0;
                }
                a.a();
            }
            return;
        }
        a.b();
    }

    public void d()
    {
        a = null;
        a(false);
    }
}
