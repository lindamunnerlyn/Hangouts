// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class dfv
    implements Runnable
{

    final ani a;
    final cwq b;
    final RealTimeChatService c;

    public dfv(RealTimeChatService realtimechatservice, ani ani, cwq cwq)
    {
        c = realtimechatservice;
        a = ani;
        b = cwq;
        super();
    }

    public void run()
    {
        for (Iterator iterator = RealTimeChatService.o().iterator(); iterator.hasNext(); ((dgp)iterator.next()).a(a, b)) { }
    }
}
