// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class dhg
    implements Runnable
{

    final cyt a;

    public dhg(cyt cyt1)
    {
        a = cyt1;
        super();
    }

    public void run()
    {
        dhy dhy1;
        for (Iterator iterator = RealTimeChatService.o().iterator(); iterator.hasNext(); dhy1.Y())
        {
            dhy1 = (dhy)iterator.next();
            a.b();
            a.k();
        }

    }
}
