// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

public final class imr
    implements kxx
{

    private final kxx a;
    private final kxx b;

    public imr(kxx kxx1, kxx kxx2)
    {
        a = kxx1;
        b = kxx2;
    }

    public Object a()
    {
        return new imk((ScheduledExecutorService)a.a(), (Set)b.a());
    }
}
