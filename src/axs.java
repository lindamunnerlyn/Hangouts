// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

final class axs
    implements Runnable
{

    final axr a;

    axs(axr axr1)
    {
        a = axr1;
        super();
    }

    public void run()
    {
        ark ark1 = ave.o(a.a).a();
        if (ark1.a != null)
        {
            RealTimeChatService.m(ave.h(a.a), ark1.a);
        }
        if (ave.h(a.a) != null && dbq.f(ave.h(a.a).h()))
        {
            ave.H(a.a).postDelayed(this, ave.X());
        }
    }
}
