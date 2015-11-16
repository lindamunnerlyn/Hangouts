// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class dfw
    implements Runnable
{

    final ani a;
    final cya b;
    final RealTimeChatService c;

    public dfw(RealTimeChatService realtimechatservice, ani ani, cya cya)
    {
        c = realtimechatservice;
        a = ani;
        b = cya;
        super();
    }

    public void run()
    {
        for (Iterator iterator = RealTimeChatService.o().iterator(); iterator.hasNext(); ((dgp)iterator.next()).Y()) { }
    }
}
