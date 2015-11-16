// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class dgx
    implements Runnable
{

    final aoa a;
    final String b;
    final Runnable c;

    public dgx(aoa aoa, String s, Runnable runnable)
    {
        a = aoa;
        b = s;
        c = runnable;
        super();
    }

    public void run()
    {
        for (Iterator iterator = RealTimeChatService.o().iterator(); iterator.hasNext(); ((dhy)iterator.next()).a(a, b, c)) { }
    }
}
