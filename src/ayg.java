// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

final class ayg
    implements Runnable
{

    final ayf a;

    ayg(ayf ayf1)
    {
        a = ayf1;
        super();
    }

    public void run()
    {
        asa asa1 = avv.m(a.a).a();
        if (asa1.a != null)
        {
            RealTimeChatService.m(avv.h(a.a), asa1.a);
        }
        if (avv.h(a.a) != null && dcz.f(avv.h(a.a).h()))
        {
            avv.G(a.a).postDelayed(this, avv.X());
        }
    }
}
