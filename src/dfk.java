// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class dfk
    implements Runnable
{

    final dko a;
    final ani b;
    final dbo c;

    public dfk(dko dko, ani ani, dbo dbo)
    {
        a = dko;
        b = ani;
        c = dbo;
        super();
    }

    public void run()
    {
        for (Iterator iterator = RealTimeChatService.p().iterator(); iterator.hasNext(); gbh.b())
        {
            iterator.next();
        }

    }
}
