// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class dfy
    implements Runnable
{

    final cwa a;
    final RealTimeChatService b;

    public dfy(RealTimeChatService realtimechatservice, cwa cwa1)
    {
        b = realtimechatservice;
        a = cwa1;
        super();
    }

    public void run()
    {
        dgp dgp1;
        for (Iterator iterator = RealTimeChatService.o().iterator(); iterator.hasNext(); dgp1.aa())
        {
            dgp1 = (dgp)iterator.next();
            a.b();
            a.k();
        }

    }
}
