// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class dhk
    implements Runnable
{

    final cyo a;

    public dhk(cyo cyo1)
    {
        a = cyo1;
        super();
    }

    public void run()
    {
        dhy dhy1;
        for (Iterator iterator = RealTimeChatService.o().iterator(); iterator.hasNext(); dhy1.aa())
        {
            dhy1 = (dhy)iterator.next();
            a.b();
            a.k();
        }

    }
}
