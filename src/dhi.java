// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.atomic.AtomicInteger;

public final class dhi
{

    private static final AtomicInteger a = new AtomicInteger(1);
    private final int b;

    private dhi(int i)
    {
        b = i;
    }

    public static dhi b()
    {
        return new dhi(a.getAndIncrement());
    }

    public int a()
    {
        return b;
    }

}
