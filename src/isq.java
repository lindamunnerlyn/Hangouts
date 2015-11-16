// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Set;
import java.util.concurrent.ScheduledFuture;

final class isq
    implements Runnable
{

    final Set a;
    final isp b;

    isq(isp isp1, Set set)
    {
        b = isp1;
        a = set;
        super();
    }

    public void run()
    {
        iso.a(b.b).cancel(true);
        String s = String.valueOf(a);
        throw new RuntimeException((new StringBuilder(String.valueOf(s).length() + 19)).append("Disallowed thread! ").append(s).toString());
    }
}
