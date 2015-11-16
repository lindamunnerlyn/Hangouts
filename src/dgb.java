// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class dgb
    implements Runnable
{

    final cwk a;
    final RealTimeChatService b;

    public dgb(RealTimeChatService realtimechatservice, cwk cwk1)
    {
        b = realtimechatservice;
        a = cwk1;
        super();
    }

    public void run()
    {
        dgp dgp1;
        for (Iterator iterator = RealTimeChatService.o().iterator(); iterator.hasNext(); dgp1.ab())
        {
            dgp1 = (dgp)iterator.next();
            a.b();
            a.k();
        }

    }
}
