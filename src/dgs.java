// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class dgs
    implements Runnable
{

    final dmf a;
    final aoa b;
    final dcx c;

    public dgs(dmf dmf1, aoa aoa, dcx dcx)
    {
        a = dmf1;
        b = aoa;
        c = dcx;
        super();
    }

    public void run()
    {
        for (Iterator iterator = RealTimeChatService.o().iterator(); iterator.hasNext(); ((dhy)iterator.next()).a(a.k(), b, a, c)) { }
        RealTimeChatService.a(b, c);
    }
}
