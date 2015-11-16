// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

final class jsp extends jrz
    implements ScheduledFuture, jsj
{

    private final ScheduledFuture a;

    public jsp(jsj jsj1, ScheduledFuture scheduledfuture)
    {
        super(jsj1);
        a = scheduledfuture;
    }

    public boolean cancel(boolean flag)
    {
        boolean flag1 = super.cancel(flag);
        if (flag1)
        {
            a.cancel(flag);
        }
        return flag1;
    }

    public int compareTo(Object obj)
    {
        obj = (Delayed)obj;
        return a.compareTo(obj);
    }

    public long getDelay(TimeUnit timeunit)
    {
        return a.getDelay(timeunit);
    }
}
