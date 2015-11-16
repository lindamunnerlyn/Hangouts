// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

final class gns
    implements gnm
{

    final gnr a;

    gns(gnr gnr1)
    {
        a = gnr1;
        super();
    }

    public void a()
    {
        a.a(2);
        a.a.schedule(new gnt(this), 10L, TimeUnit.SECONDS);
    }
}
