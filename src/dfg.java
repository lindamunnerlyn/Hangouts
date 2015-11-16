// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class dfg
    implements Runnable
{

    final ani a;
    final cyz b;

    public dfg(ani ani, cyz cyz1)
    {
        a = ani;
        b = cyz1;
        super();
    }

    public void run()
    {
        for (Iterator iterator = RealTimeChatService.o().iterator(); iterator.hasNext(); ((dgp)iterator.next()).a(a, b.c, b.d, b.a)) { }
    }
}
