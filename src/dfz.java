// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class dfz
    implements Runnable
{

    final cvs a;
    final RealTimeChatService b;

    public dfz(RealTimeChatService realtimechatservice, cvs cvs1)
    {
        b = realtimechatservice;
        a = cvs1;
        super();
    }

    public void run()
    {
        for (Iterator iterator = RealTimeChatService.o().iterator(); iterator.hasNext(); ((dgp)iterator.next()).d(a.k())) { }
    }
}
