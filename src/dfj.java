// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class dfj
    implements Runnable
{

    final dko a;
    final ani b;
    final dbo c;

    public dfj(dko dko1, ani ani, dbo dbo)
    {
        a = dko1;
        b = ani;
        c = dbo;
        super();
    }

    public void run()
    {
        for (Iterator iterator = RealTimeChatService.o().iterator(); iterator.hasNext(); ((dgp)iterator.next()).a(a.l(), b, a, c)) { }
        RealTimeChatService.a(b, c);
    }
}
