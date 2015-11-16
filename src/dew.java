// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

final class dew
    implements Runnable
{

    final long a;
    final dev b;

    dew(dev dev1, long l)
    {
        b = dev1;
        a = l;
        super();
    }

    public void run()
    {
        int ai[] = dbf.f();
        int j = ai.length;
        for (int i = 0; i < j; i++)
        {
            ani ani = dbf.e(ai[i]);
            if (ani != null)
            {
                RealTimeChatService.e(ani);
            }
        }

        dev.a(b).postDelayed(this, a);
    }
}
