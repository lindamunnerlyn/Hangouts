// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public final class gom
{

    private final int a;
    private AtomicInteger b;
    private AtomicLong c;

    public gom(int i)
    {
        b = new AtomicInteger(0);
        c = new AtomicLong(0L);
        a = i;
    }

    public boolean a()
    {
        while (SystemClock.elapsedRealtime() - c.get() > 1000L || b.get() < a) 
        {
            return false;
        }
        return true;
    }

    public void b()
    {
        b.getAndIncrement();
        long l = SystemClock.elapsedRealtime();
        if (l - c.get() > 1000L)
        {
            b.set(0);
            c.set(l);
        }
    }
}
