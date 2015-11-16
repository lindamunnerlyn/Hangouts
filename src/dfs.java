// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class dfs
    implements Runnable
{

    final ani a;
    final String b;
    final cey c;
    final String d;
    final long e;
    final boolean f;

    public dfs(ani ani, String s, cey cey, String s1, long l, boolean flag)
    {
        a = ani;
        b = s;
        c = cey;
        d = s1;
        e = l;
        f = flag;
        super();
    }

    public void run()
    {
        for (Iterator iterator = RealTimeChatService.o().iterator(); iterator.hasNext(); ((dgp)iterator.next()).a(a, b, c, d, e, f)) { }
    }
}
