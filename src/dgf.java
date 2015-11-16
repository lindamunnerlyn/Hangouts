// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

final class dgf
    implements Runnable
{

    final long a;
    final dge b;

    dgf(dge dge1, long l)
    {
        b = dge1;
        a = l;
        super();
    }

    public void run()
    {
        int ai[] = dcn.f();
        int j = ai.length;
        for (int i = 0; i < j; i++)
        {
            aoa aoa = dcn.e(ai[i]);
            if (aoa != null)
            {
                RealTimeChatService.e(aoa);
            }
        }

        dge.a(b).postDelayed(this, a);
    }
}
