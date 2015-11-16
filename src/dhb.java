// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class dhb
    implements Runnable
{

    final aoa a;
    final String b;
    final cgd c;
    final String d;
    final long e;
    final boolean f;

    public dhb(aoa aoa, String s, cgd cgd, String s1, long l, boolean flag)
    {
        a = aoa;
        b = s;
        c = cgd;
        d = s1;
        e = l;
        f = flag;
        super();
    }

    public void run()
    {
        for (Iterator iterator = RealTimeChatService.o().iterator(); iterator.hasNext(); ((dhy)iterator.next()).a(a, b, c, d, e, f)) { }
    }
}
