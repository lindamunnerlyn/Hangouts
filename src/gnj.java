// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

public final class gnj
{

    private static Random a = null;
    private static final AtomicLong b = new AtomicLong(0x1ed8b55fac9decL);

    public gnj()
    {
        if (a == null)
        {
            a = new Random(System.nanoTime() ^ b());
        }
    }

    public static String a()
    {
        return String.valueOf(a.nextLong() & 0x7fffffffffffffffL);
    }

    private static long b()
    {
        long l;
        long l1;
        do
        {
            l = b.get();
            l1 = 0x106689d45497fdb5L * l;
        } while (!b.compareAndSet(l, l1));
        return l1;
    }

}
